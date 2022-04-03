package com.cpc.ghcms.security;

import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;

public class WebSecurityConfig{

	 public static JwtDecoder JWT_DECODER = null;
	
	
	@Bean
    public JwtDecoder customDecoder(OAuth2ResourceServerProperties properties) {
        NimbusJwtDecoder jwtDecoder = NimbusJwtDecoder.withJwkSetUri("https://cognito-idp.us-east-2.amazonaws.com/us-east-2_aApA3SCsB/.well-known/jwks.json").build();
        JWT_DECODER = jwtDecoder;
        return jwtDecoder;
    } 
}
