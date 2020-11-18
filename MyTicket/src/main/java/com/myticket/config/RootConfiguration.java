package com.myticket.config;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.myticket.models" })
public class RootConfiguration {

	@Bean
	public Map<String, Boolean> getMap() {
		return new LinkedHashMap<>();
	}

	@Bean
	public Set<String> getSet() {
		return new HashSet<String>();
	}

}
