package com.dasiu.springpresentation;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {
	public String greet() {
		return "hello world";
	}
}
