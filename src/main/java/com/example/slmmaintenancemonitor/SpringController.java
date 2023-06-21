package com.example.slmmaintenancemonitor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

    public String status = "Everything works as expected";

    @RequestMapping("/api/message")
    public String read_current_status(){
        return status;
    }

    @RequestMapping("/api/message/set")
    public String edit_status(String newStatus){
        status = newStatus;
        return "ok";
    }

    @RequestMapping("/api/message/reset")
    public String reset_Status(){
        status = "Everything works as expected";
        return "ok";
    }
}
