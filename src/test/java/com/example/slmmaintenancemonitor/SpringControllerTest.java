package com.example.slmmaintenancemonitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpringControllerTest {

    @Test
    void inital_message(){
        SpringController controller = new SpringController();
        String result = controller.read_current_status();
        assertEquals("Everything works as expected",result);
    }
}