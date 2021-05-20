package com.microservices.microservices.configuration;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
	
	public static final Contact DEFAULT_CONTACT = new Contact("Rakesh Kumar Sahoo", "www.raka.com", "rockzraka@gmail.com");

	public static final ApiInfo DEFAULT = new ApiInfo("", "Api Documentation for Microservices Example", "1.0", "urn:tos",
			DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<>());
	public static final Set<String>  PRODUCES = new HashSet<String>(); 
	public static final Set<String>  CONSUMES = new HashSet<String>(); 
	static
	{
		PRODUCES.add("application/json");
		PRODUCES.add("application/xml");
		CONSUMES.add("application/json");
		CONSUMES.add("application/xml");
	}
	@Bean
	public Docket api()
	{
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(DEFAULT).produces(PRODUCES).consumes(CONSUMES)  ; 
	}
	
	
}
