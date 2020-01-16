package com.springcloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("provide1")
public interface HelloService {
    
    @GetMapping("/say/{name}")
    String sayHello(@PathVariable String name) ;
}
