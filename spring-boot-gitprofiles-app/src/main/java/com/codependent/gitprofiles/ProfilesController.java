package com.codependent.gitprofiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProfilesController {

	@Autowired
	private Environment env;
	
	@RequestMapping("/profiles")
	public String[] getProfiles(){
		return env.getActiveProfiles();
	}
	
}
