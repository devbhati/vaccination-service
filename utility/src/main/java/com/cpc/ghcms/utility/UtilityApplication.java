package com.cpc.ghcms.utility;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cpc.ghcms.annotations.ValidateAccess;
import com.cpc.ghcms.enums.UserRole;

@SpringBootApplication
public class UtilityApplication {
	
	@ValidateAccess(role = {UserRole.CITIZEN,UserRole.HEALTH_MINISTRY_OFFICIAL})
	public static void main(String[] args) {
		SpringApplication.run(UtilityApplication.class, args);
	}

}
