package com.example.springboot_4_features.confipropertiesdemo.controller;

import com.example.springboot_4_features.confipropertiesdemo.service.NotificationServiceWithValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Map;
@RestController
public class ValueDemoController {

    NotificationServiceWithValue notificationServiceWithValue;

    ValueDemoController(NotificationServiceWithValue notificationServiceWithValue){
        this.notificationServiceWithValue = notificationServiceWithValue;
    }
    @Value("${notification.email.from-address}")
    private String emailFromInController;


    @GetMapping("/value-demo/config")
    public Map<String, Object> showRawConfig(){
        return Map.of("emailFromController", emailFromInController);
    }

    @GetMapping("/value-demo/send")
    public String sendNotification(){
        return notificationServiceWithValue.sentTestNotification();
    }

}
