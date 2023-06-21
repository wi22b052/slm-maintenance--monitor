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
    @Test
    void edit_message_return_value(){
        SpringController controller = new SpringController();
        String result = controller.edit_status("This is a new test status.");
        assertEquals("ok",result);
    }
    @Test
    void edit_message_new_status(){
        SpringController controller = new SpringController();
        controller.edit_status("This is a new test status.");
        String result = controller.read_current_status();
        assertEquals("This is a new test status.",result);
    }
}