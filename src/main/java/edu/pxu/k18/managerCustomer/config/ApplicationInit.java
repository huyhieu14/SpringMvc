package edu.pxu.k18.managerCustomer.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class[] {
				ApplicationContex.class
				
		};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[] {
				ApplicationConfig.class
		};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {
				"/"
		};
	}

}
