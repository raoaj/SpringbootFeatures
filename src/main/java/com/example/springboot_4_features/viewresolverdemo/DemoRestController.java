package com.example.springboot_4_features.viewresolverdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoRestController {

    @GetMapping("/")
    public String home(){
        return "homepage";
    }
}
