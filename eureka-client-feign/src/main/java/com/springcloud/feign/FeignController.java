package com.springcloud.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class FeignController {
    
    @Autowired
    private HelloService helloService;
    
    @GetMapping("/hello")
    public String hello() {
        return "hello world!";
    }
    
    @GetMapping("/say/{name}")
    public String sayHello(@PathVariable String name) {
	return helloService.sayHello(name);
    }

}
