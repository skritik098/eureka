package com.inkdrop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

//import brave.context.log4j2.ThreadContextScopeDecorator;
//import brave.propagation.CurrentTraceContextScopeDecorator;

@EnableAutoConfiguration
@EnableEurekaServer
@PropertySource("classpath:properties/db.properties")

public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
