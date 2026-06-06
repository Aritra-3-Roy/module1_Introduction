package com.aritra.module1_Introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    
    @Bean
    public PaymentService paymentService(){
        //return more logic
        return new PaymentService();
    }    
}
