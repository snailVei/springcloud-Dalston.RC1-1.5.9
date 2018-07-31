package com.forezp;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient           //这个地方一定是 @EnableDiscoveryClient ，和@EnableEuraka 不可以通用
@RestController
public class ConsulMiyaApplication {

	@RequestMapping("/hi")
	public String home() {
		return "hi ,i'm miya";
	}

	public static void main(String[] args) {
		new SpringApplicationBuilder(ConsulMiyaApplication.class).web(true).run(args);
	}
}
