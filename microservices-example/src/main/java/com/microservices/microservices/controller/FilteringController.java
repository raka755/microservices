package com.microservices.microservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.microservices.bean.FilteringBean;

@RestController
public class FilteringController {

	@GetMapping("/filtering")
	public FilteringBean getFilterBean()
	{
		return new FilteringBean("Rakesh Ku sahoo", 12, "Bhubaneswar");
	}
	
}
