package com.springcloud.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
    
    @Autowired
    public RestTemplate restTemplate;
    
    @GetMapping("/test1")
    public String test1() {
	RestTemplate restTemplate =new RestTemplate();
	String str = restTemplate.getForObject("http://server1:8701/hello", String.class);
        return "test1"+str;
    }
    
    @GetMapping("/test2")
    public String test2() {
	String str = restTemplate.getForObject("http://provide1/hello", String.class);
        return str;
    }
    
    @GetMapping("/test3")
    public String test3() {
	String str = restTemplate.getForObject("http://provide2/hello", String.class);
        return str;
    }
}
