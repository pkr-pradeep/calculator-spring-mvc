package com.pkr.mvc.servlet.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.pkr.mvc.servlet.config.CalculatorConfig;

/**
 * This class used for <servlet> and <servlet-mapping> tags in web.xml
 * You can find commented lines in web.xml
 * @author pkrpr
 *
 */
public class CalculatorServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {CalculatorConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
