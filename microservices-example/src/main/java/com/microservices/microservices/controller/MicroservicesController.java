package com.microservices.microservices.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.microservices.bean.HelloWorld;

@RestController
public class MicroservicesController {
	
	@Autowired
	public MessageSource messageSource;
	
	@RequestMapping("/hello-world")
	public String helloWorld()
	{
		return "Hello word !";
	}

	@RequestMapping("/hello-world-bean")
	public HelloWorld getHelloWorldBean()
	{
		return new HelloWorld("Testing The Rest Call");
	}
	
	@RequestMapping("/hello-world-bean/{name}")
	public HelloWorld getHelloWorldBean(@PathVariable("name") String name)
	{
		return new HelloWorld("Hello "+name);
	}
	
	@GetMapping("/get-message")
	public String getMessage(@RequestHeader(name="Accept-Language",required = false ) Locale locale)
	{
		return messageSource.getMessage("goodmorning.message", null, locale);
	}
	
	
}
