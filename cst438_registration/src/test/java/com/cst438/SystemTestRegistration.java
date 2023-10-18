package com.cst438;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SystemTestRegistration {
    public static final String CHROME_STRING_FILE_LOCATION = "/Users/edgarhernandez/Downloads/chromedriver-mac-arm64";
    public static final String URL = "http://localhost:3000";
    public static final String ALIAS_NAME = "test";
    public static final int SLEEP_DURATION = 1000;

    WebDriver driver;

    @BeforeEach
    public void setup() throws Exception {
        System.setProperty("webdriver.chrome.driver", CHROME_STRING_FILE_LOCATION);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get(URL);
        Thread.sleep(SLEEP_DURATION);
    }

    @Test
    public void addStudent() throws Exception {
        WebElement submit = driver.findElement(By.id("Add"));
        WebElement name = driver.findElement(By.name("name"));
        WebElement email = driver.findElement(By.name("email"));

        name.sendKeys("Edgar Hernandez");
        email.sendKeys("this@email.com");
        Thread.sleep(SLEEP_DURATION);

        submit.click();
        Thread.sleep(SLEEP_DURATION);
    }

    @AfterEach
    public void cleanup() throws Exception {
        if(driver != null) {
            driver.close();
            driver.quit();
            driver = null;
        }
    }

}
