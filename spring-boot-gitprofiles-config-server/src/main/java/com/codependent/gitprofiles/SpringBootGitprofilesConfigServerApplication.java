package com.codependent.gitprofiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringBootGitprofilesConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGitprofilesConfigServerApplication.class, args);
	}
}
