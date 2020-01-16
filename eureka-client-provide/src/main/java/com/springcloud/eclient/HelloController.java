package com.springcloud.eclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/hello")
    public String hello() {
	System.out.println("hello world!");
        return "hello world!";
    }
    
    @GetMapping("/say/{name}")
    public String say(@PathVariable String name) {
	System.out.println("hello "+name);
        return "hello "+name;
    }
}
