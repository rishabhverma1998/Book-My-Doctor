package com.capg.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DoctorsAppointmentApplication {

	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Bean
	public FilterRegistrationBean jwtFilter() {
		final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter(new com.capg.App.config.JwtFilter());
		registrationBean.addUrlPatterns("/secure/*");

		return registrationBean;
	}
	public static void main(String[] args) {
		SpringApplication.run(DoctorsAppointmentApplication.class, args);
	}

}
