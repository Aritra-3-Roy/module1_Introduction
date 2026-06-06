package com.aritra.module1_Introduction;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class PaymentService {
    public void pay(){
        System.out.println("Payment Sucessfull....");
    }

    @PostConstruct
    public void afterInitial(){
        System.out.println("Before paying...");
    }

    @PreDestroy
    public void beforeDestroy(){
        System.out.println("After payment done...");
    }
}
