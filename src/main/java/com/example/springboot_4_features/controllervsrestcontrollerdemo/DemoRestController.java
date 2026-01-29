package com.example.springboot_4_features.controllervsrestcontrollerdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DemoRestController {

    @GetMapping("/")
    public String home(){
        return "homepage";
    }
}
