package com.humourv.administration.controller;

/**
 * @Author Ron
 * @create 2020-10-28 14:12
 */
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${hello}")
    private String name;

    @RequestMapping("/tell-me-your-name")
    public String tellName() {
        return this.name;
    }
}
