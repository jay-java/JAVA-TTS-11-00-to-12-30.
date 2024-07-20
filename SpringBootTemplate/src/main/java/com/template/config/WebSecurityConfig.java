package com.template.config;

import java.util.List;

import org.antlr.v4.runtime.atn.SemanticContext.AND;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true,securedEnabled = true)
public class WebSecurityConfig {
	
	private static final String[] whiteList= {
			"/",
			"/register",
			"/login",
			"/about",
			
//		    "/assets/css/***"
//			"/assets/images/***"
//			"/assets/fonts/***"
//			"/assets/js/***"
			
	};
	
	@Bean
	public static PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity security) throws Exception {
		security
		.authorizeRequests()
		.requestMatchers(whiteList)
		.permitAll()
		.anyRequest()
		.authenticated()
		.and()
		.formLogin()
		.loginPage("/login")
		.loginProcessingUrl("/login")
		.usernameParameter("emailString")
		.passwordParameter("passwordString")
		.defaultSuccessUrl("/",true)
		.failureUrl("/login?error")
		.permitAll()
		.and()
		.logout()
		.logoutUrl("logout")
		.logoutSuccessUrl("/logout?success")
		.and()
		.httpBasic();
		return security.build();
	}
	
}
