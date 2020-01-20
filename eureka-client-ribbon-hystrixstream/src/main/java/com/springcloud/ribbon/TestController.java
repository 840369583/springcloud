package com.springcloud.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class TestController {
    
    @Autowired
    public RestTemplate restTemplate;

    @GetMapping("/test2")
    @HystrixCommand(defaultFallback="test2Fallback")
    public String test2() {
	String str = restTemplate.getForObject("http://provide1/hello", String.class);
        return str;
    }
    
    @GetMapping("/test3")
    @HystrixCommand(defaultFallback="test3Fallback")
    public String test3() {
	String str = restTemplate.getForObject("http://provide2/hello", String.class);
        return str;
    }
    
    public String test2Fallback() {
	return "接口不通";
    }
    public String test3Fallback() {
   	return "接口不通";
       }
}
