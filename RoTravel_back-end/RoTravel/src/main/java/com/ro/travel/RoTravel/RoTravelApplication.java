package com.ro.travel.RoTravel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.AsyncConfigurerSupport;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@SpringBootApplication
@EnableAsync
public class RoTravelApplication extends AsyncConfigurerSupport {

	public static void main(String[] args) {
		SpringApplication.run(RoTravelApplication.class, args);
	}


	@Override
	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(2);
		executor.setQueueCapacity(500);
		executor.setThreadNamePrefix("send-mailer-");
		executor.initialize();
		return executor;
	}
}