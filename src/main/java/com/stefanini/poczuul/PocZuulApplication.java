package com.stefanini.poczuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class PocZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocZuulApplication.class, args);
	}
}
