package com.sins.ash.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @Value("${apps.version}")
    private String appVersion;


    @GetMapping
    @RequestMapping("/")
    public Map getStatus(){

        Map m= new HashMap<String,String>();
        m.put("apps.version",appVersion);
        return m;

    }

}
