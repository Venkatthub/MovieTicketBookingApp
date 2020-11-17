package com.myticket.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletContainerConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {

		return new Class[] { RootConfiguration.class };

	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		return new Class[] { DispatcherServletConfiguration.class };

	}

	@Override
	protected String[] getServletMappings() {

		return new String[] { "/" };

	}

}
