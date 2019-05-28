package com.angular.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
//@EnableOAuth2Sso
@EnableZuulProxy
@EnableDiscoveryClient
public class InfytelZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfytelZuulApplication.class, args);
	}

}
