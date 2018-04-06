package com.cgi.cns.refapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RefappStatisticsJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RefappStatisticsJavaApplication.class, args);
	}
}
