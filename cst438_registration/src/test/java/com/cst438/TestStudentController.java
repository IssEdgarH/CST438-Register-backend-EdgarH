package com.cst438;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@AutoConfigureMockMvc
public class TestStudentController {
    @Autowired
    MockMvc mvc;

    MockHttpServletResponse response;

    @Test
    public void addStudent() throws Exception {
        response = mvc.perform(MockMvcRequestBuilders.post("/student").contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)).andReturn().getResponse();
        assertEquals(200, response.getStatus());
    }

    @Test
    public void deleteStudent() throws Exception {
        response = mvc.perform(MockMvcRequestBuilders.post("/student/{student_id}").contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)).andReturn().getResponse();
        assertEquals(200, response.getStatus());
    }

    @Test
    public void updateStudent() throws Exception {
        response = mvc.perform(MockMvcRequestBuilders.post("/student/{student_id}").contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)).andReturn().getResponse();
        assertEquals(200, response.getStatus());
    }

    @Test
    public void getStudents() throws Exception {
        response = mvc.perform(MockMvcRequestBuilders.post("/students").contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)).andReturn().getResponse();
        assertEquals(200, response.getStatus());
    }
}
