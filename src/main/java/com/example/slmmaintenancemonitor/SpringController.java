package com.example.slmmaintenancemonitor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

    @RequestMapping("/api/message")
    public String read_current_status(){
        return "Everything works as expected";
    }
}
