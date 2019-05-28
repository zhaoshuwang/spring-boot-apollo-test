package com.zhao.config.client.controller;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableApolloConfig
public class ClientController {

    @Value("${name:aaa}")
    private String name;

    @Value("${addr:shenzhen}")
    private String addr;

    @GetMapping("/getinfo")
    public String getInfo(){
        return name+"-"+addr;
    }
}
