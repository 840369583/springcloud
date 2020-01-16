package com.springcloud.eclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/hello")
    public String hello() {
        return "hello world!";
    }
    
    @GetMapping("/say")
    public String say(String name) {
        return "hello "+name;
    }
}
