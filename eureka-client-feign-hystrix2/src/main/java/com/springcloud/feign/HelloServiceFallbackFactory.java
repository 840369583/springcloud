package com.springcloud.feign;

import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

@Component
public class HelloServiceFallbackFactory implements FallbackFactory<HelloService> {

    @Override
    public HelloService create(Throwable cause) {
	return new HelloService() {
	    @Override
	    public String sayHello(String name) {
		return name +"   "+cause.getMessage();
	    }
	};
    }

}
