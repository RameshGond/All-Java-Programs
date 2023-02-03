package com.xworkz.ott.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontControllerConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer {

	
	Class<?>[] rootConfigClasses = {SpringConfiguration.class};
	String[] mapping={"*.do"};
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("rootConfigClasses" +rootConfigClasses.toString());
		return rootConfigClasses;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("mapping" +mapping.toString());
		return mapping;
	}

}
