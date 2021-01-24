package com.pkr.mvc.servlet.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * This is acting as calculator-servlet.xml
 * And this is being called in CalculatorServletInitializer
 * Now calculator-servlet.xml is obsolete because this class does everything what the xml file was doing earlier
 * @author pkrpr
 *
 */
@Configuration
@ComponentScan({"com.pkr"})
public class CalculatorConfig {

}
