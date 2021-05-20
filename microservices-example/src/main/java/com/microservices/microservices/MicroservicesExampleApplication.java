package com.microservices.microservices;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class MicroservicesExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesExampleApplication.class, args);
	}
	
	/*
	 * @Bean public LocaleResolver localResolver() { SessionLocaleResolver slr = new
	 * SessionLocaleResolver(); slr.setDefaultLocale(Locale.US); return slr; }
	 */
	/*
	 * @Bean public ResourceBundleMessageSource bundleMessageSource() {
	 * ResourceBundleMessageSource src = new ResourceBundleMessageSource();
	 * src.setBasename("messages"); return src;
	 * 
	 * }
	 */

}
