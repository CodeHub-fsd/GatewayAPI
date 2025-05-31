package com.allstate.Employees.Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CustomerBean {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
