package com.example.springboot_4_features.confipropertiesdemo.service;

import com.example.springboot_4_features.confipropertiesdemo.config.EmailNotificationProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceWithValue {
private static final Logger log = LoggerFactory.getLogger(NotificationServiceWithValue.class);
@Autowired
EmailNotificationProperties emailNotificationProperties;
@Value("${spring.application.name}")
private String appName;
@Value("${spring.application.environment}")
private String environment;
@Value("${notification.email.enabled}")
private boolean emailEnabled;


public String sentTestNotification(){
    log.info("app name: {} | Environment: {} ", appName,environment);  //with @Value
    log.info("Email enabled: {}",emailNotificationProperties.isEnabled()); // with configuration properties class
if(!emailEnabled){
    return "No channel is enabled , Cannot send Notification";
}

String Channel = emailEnabled? "EMAIL" : "SMSx";
return "Channel enabled : "+ Channel;
}


}
