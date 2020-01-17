package com.springcloud.feign;

import org.springframework.cloud.openfeign.FeignClient;

import feign.Param;
import feign.RequestLine;

@FeignClient(name="provide1",configuration=MyFeignClientsConfiguration.class)
public interface HelloService {
    
    @RequestLine("GET /say/{name}")
    String sayHello(@Param(value = "name") String name) ;
}
