package com.aritra.module1_Introduction.impl;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.aritra.module1_Introduction.NotificationService;

//@Primary
@Component
@ConditionalOnProperty(name = "notification.type", havingValue = "email")
public class EmailNotification implements NotificationService{

    @Override
    public void send(String message) {
        System.out.println("Email sending..."+message);
    }
    
}
