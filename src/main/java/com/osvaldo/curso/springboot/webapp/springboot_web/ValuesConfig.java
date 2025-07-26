package com.osvaldo.curso.springboot.webapp.springboot_web;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({

	// The encoding attribute is optional and can be used to specify the character encoding of the properties file
	@PropertySource(value = "classpath:values.properties", encoding = "UTF-8"),

})
public class ValuesConfig {

}
