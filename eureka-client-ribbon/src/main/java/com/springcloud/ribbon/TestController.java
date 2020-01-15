package com.springcloud.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
    
    @Autowired
    public RestTemplate restTemplate;
    
    @GetMapping("/test2")
    public String test2() {
	String str = restTemplate.getForObject("http://provide1/hello", String.class);
        return "test2"+str;
    }
}
