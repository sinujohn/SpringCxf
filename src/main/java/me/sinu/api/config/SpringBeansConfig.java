package me.sinu.api.config;

import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperFactoryBean;

/**
 * Created by sinuj on 12/31/2015.
 */
@Configuration
public class SpringBeansConfig {

    /*
    *
    * Convenient place for putting your extra Java configs
    * Example:
    *
    * Override the default jackson provider:
    * @Bean(name = "jsonProvider")
    public JacksonJaxbJsonProvider getJacksonJaxbJsonProvider() {
        Jackson2ObjectMapperFactoryBean objectMapperFactoryBean = new Jackson2ObjectMapperFactoryBean();
        objectMapperFactoryBean.setAnnotationIntrospector(new JaxbAnnotationIntrospector(TypeFactory.defaultInstance()));
        return new JacksonJaxbJsonProvider(objectMapperFactoryBean.getObject(), null);
    }

    *  */


}
