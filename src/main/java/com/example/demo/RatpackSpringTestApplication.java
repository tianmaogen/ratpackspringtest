package com.example.demo;

import java.nio.file.Paths;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ratpack.server.ServerConfig;
import ratpack.spring.config.EnableRatpack;

@SpringBootApplication
@EnableRatpack
public class RatpackSpringTestApplication {

	@Bean
	public ServerConfig ratpackServerConfig() {
		return ServerConfig
				.builder()
				.baseDir(Paths.get("src", "main", "java", "resource").toAbsolutePath())
				.port(20008)
				.maxInitialLineLength(8192)
				//config SO_BACKLOG
				.connectQueueSize(1024)
				.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(RatpackSpringTestApplication.class, args);
	}
}
