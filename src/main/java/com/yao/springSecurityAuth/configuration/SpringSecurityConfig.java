package com.yao.springSecurityAuth.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig {

	
	//modeliseer la chaine de filtre
	// permet de construire la chaine de filtre de securite qui est une implementation de SecurityFilterChain avec une config minimal  
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		return http.build(); 		
	}
}
