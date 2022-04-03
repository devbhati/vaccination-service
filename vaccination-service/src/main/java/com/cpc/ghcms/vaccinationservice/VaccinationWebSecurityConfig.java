package com.cpc.ghcms.vaccinationservice;

import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class VaccinationWebSecurityConfig extends WebSecurityConfigurerAdapter {

	 public static JwtDecoder JWT_DECODER = null;
	
	 private static final String[] PATTERNS_PUBLIC = {"/api/**"
		};
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors().and().csrf().disable().authorizeRequests().antMatchers(HttpMethod.OPTIONS, "**").permitAll()
				.antMatchers(PATTERNS_PUBLIC).permitAll()
				// JWT auth for the rest
				.and().authorizeRequests().anyRequest().authenticated().and().oauth2ResourceServer().jwt();
	      http.headers()
        .httpStrictTransportSecurity()
		.includeSubDomains(true)
		.maxAgeInSeconds(31536000);
    }
	
	@Bean
    public JwtDecoder customDecoder(OAuth2ResourceServerProperties properties) {
        NimbusJwtDecoder jwtDecoder = NimbusJwtDecoder.withJwkSetUri("https://cognito-idp.us-east-2.amazonaws.com/us-east-2_aApA3SCsB/.well-known/jwks.json").build();
        JWT_DECODER = jwtDecoder;
        return jwtDecoder;
    } 
}
