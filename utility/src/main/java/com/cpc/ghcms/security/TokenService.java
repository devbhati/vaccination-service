package com.cpc.ghcms.security;

import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.JwtException;

import lombok.Getter;
import lombok.Setter;

@Service
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
@Getter
@Setter
public class TokenService {
private String accessToken;
	
	private String idtoken;
	
	private Map<String, Object> idTokenClaims;
	
	public Map<String, Object> getDecodedIdTokenClaims() throws JwtException {
		Jwt jwt = WebSecurityConfig.JWT_DECODER.decode(this.idtoken);
		return jwt.getClaims();
	}
	
	public Map<String, Object> getDecodedAccessTokenClaims() throws JwtException {
		Jwt jwt = WebSecurityConfig.JWT_DECODER.decode(this.accessToken);
		return jwt.getClaims();
	}
}