package com.myticket.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan //(basePackages = { "com.myticket.models", "com.myticket.models.movies", "com.myticket.servicebeans","com.myticket.database" })
public class RootConfiguration {


}
