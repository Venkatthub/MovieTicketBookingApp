package com.myticket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.myticket.interceptors.LoginCheckInterceptor;
import com.myticket.interceptors.SignUpCheckInterceptor;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.myticket.controllers", "com.myticket.interceptors" })
public class DispatcherServletConfiguration implements WebMvcConfigurer {

	@Bean
	public ViewResolver internalResourceViewResolver() {

		InternalResourceViewResolver bean = new InternalResourceViewResolver();
		bean.setViewClass(JstlView.class);
		bean.setPrefix("WEB-INF/Views/");
		bean.setSuffix(".jsp");
		return bean;
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {

		registry.addInterceptor(new LoginCheckInterceptor()).addPathPatterns("/home");
		registry.addInterceptor(new SignUpCheckInterceptor()).addPathPatterns("/sign-up/user");

	}

}
