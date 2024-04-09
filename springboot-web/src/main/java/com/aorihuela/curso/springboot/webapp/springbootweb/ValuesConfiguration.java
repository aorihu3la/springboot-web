package com.aorihuela.curso.springboot.webapp.springbootweb;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;


@Configuration
@PropertySources(@PropertySource(value="values.properties", encoding = "UTF-8"))
public class ValuesConfiguration {

}
