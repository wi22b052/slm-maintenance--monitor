package com.example.slmmaintenancemonitor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

    public String status = "Everything works as expected";

    @RequestMapping("/api/message")
    public String read_current_status(){
        return status;
    }

    @RequestMapping("/api/message/set")
    public String edit_status(@RequestParam String m){
        status = m;
        return "ok";
    }
}
