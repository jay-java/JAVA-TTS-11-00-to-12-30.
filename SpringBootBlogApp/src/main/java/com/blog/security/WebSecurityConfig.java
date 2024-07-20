package com.blog.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
@Configuration
public class WebSecurityConfig extends WebSecurityConfiguration{
    private static final String[] WHITELIST = {
            "/",
            "/login",
            "/register",
            "/css/**",
            "/fonts/**",
            "/images/**",
            "/js/**"
    };


    @Bean
    public static PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
        		
                .headers().frameOptions().sameOrigin()
                .and()
                .authorizeHttpRequests()
                .requestMatchers(WHITELIST).permitAll()
                .requestMatchers("/profile/**").authenticated()
                .requestMatchers("/admin/**").hasRole("ADMIN")
                .requestMatchers("/editor/**").hasAnyRole("ADMIN", "EDITOR")
                .and()
                .formLogin()
                .loginPage("/login").loginProcessingUrl("/login")
                .usernameParameter("email").passwordParameter("password")
                .defaultSuccessUrl("/", true).failureUrl("/login?error")
                .permitAll()
                .and()
                .logout().logoutUrl("/logout")
                .logoutSuccessUrl("/")
                .and()
                .httpBasic()
                .disable();

//        http.csrf().disable();
//        http.headers().frameOptions().disable();

        return http.build();
    }

}


