package com.cpc.ghcms.aspect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.cpc.ghcms.annotations.ValidateAccess;
import com.cpc.ghcms.enums.UserRole;
import com.cpc.ghcms.exception.model.AccessForbiddenException;
import com.cpc.ghcms.security.TokenService;

@Aspect
@Configuration
public class AccessRestrictionAspect {

	@Autowired
	private TokenService tokenService;
	
	@Before("@annotation(validateAccess)")
    public void validateUserRoleAdvice(JoinPoint joinPoint, ValidateAccess validateAccess) throws Throwable {
		UserRole[] userRoles = validateAccess.role();
		String userRole = (String) tokenService.getDecodedIdTokenClaims().get("role");
 		List<String> roles = Arrays.asList(userRoles).stream().map(role -> role.getRole()).collect(Collectors.toList());
 		if(roles.indexOf(userRole) == -1) {
			throw new AccessForbiddenException("You dont have sufficient access rights to access the api.");
		}

    }
}
