package com.aritra.module1_Introduction.impl;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import com.aritra.module1_Introduction.NotificationService;

@Component
@ConditionalOnProperty(name = "notification.type", havingValue = "sms")
public class SmsNotification implements NotificationService{

    @Override
    public void send(String message) {
        System.out.println("Sms sending...."+message);
    }
    
}
