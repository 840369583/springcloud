package com.springcloud.feign;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceFallback implements HelloService {

    @Override
    public String sayHello(String name) {
	return "接口不通"+name;
    }

}
