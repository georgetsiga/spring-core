package com.pluralsight.conferencedemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class ConferenceConfig implements WebMvcConfigurer {

    private String WEB_INF_PATH = "/WEB-INF/";
    private String JSP_PATH = WEB_INF_PATH + "jsp/";
    private String PDF_RESOURCE_PATH = WEB_INF_PATH + "pdf/";
    private String SUFFIX = ".jsp";
    private String FILES_WILD_CARD = "/files/**";


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(FILES_WILD_CARD)
                .addResourceLocations(PDF_RESOURCE_PATH);
    }

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setPrefix(JSP_PATH);
        bean.setSuffix(SUFFIX);
        bean.setOrder(0);
        return bean;
    }
}

