package com.kach.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
/**
 *
 * @author misha
 */
@Configuration
public class ControllersConfig extends WebMvcConfigurerAdapter{
    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/map").setViewName("map");
        registry.addViewController("/path").setViewName("path");
    }
    
}
