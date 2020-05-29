package com.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
//		auth.inMemoryAuthentication()
//			.withUser("tom").password("{noop}hello").authorities("ROLE_USER")
//			.and()
//			.withUser("mark").password("{bcrypt}$2a$10$CIJKxJuxyXsfolNhJEtRiuq8ACgXdUOkyb/GsAlCn9HP2gQ.ER596").authorities("ROLE_ADMIN");
		
		
		auth.jdbcAuthentication().
		dataSource(dataSource)
		.passwordEncoder(new BCryptPasswordEncoder());
		
	}
	
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/user*").hasRole("USER")
			.antMatchers("/admin*").hasRole("ADMIN")
			.antMatchers("/", "/home").permitAll()
			.and()
			.formLogin();
//			.loginPage("/url");
	}
}
