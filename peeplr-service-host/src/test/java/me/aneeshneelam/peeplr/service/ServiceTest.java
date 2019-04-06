package me.aneeshneelam.peeplr.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ServiceTest {
    private static final Logger logger = LogManager.getLogger();

    @Autowired
    private MockMvc mvc;

    @BeforeAll
    public static void prepare() {

    }

    @AfterAll
    public static void cleanup() {

    }

    @Test
    @DisplayName("Test Spring Service Startup")
    public void testServiceStartup() {

    }

    @Test
    @DisplayName("Test Spring @Autowired Integration")
    public void testApiIndex() throws Exception {
        this.mvc.perform(get("/api")).andExpect(status().isOk())
                .andExpect(content().string("Hello!"));
    }
}
