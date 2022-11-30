package com.swagger.example.SwaggerExample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.method.RequestMappingInfoHandlerMapping;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.spring.web.readers.operation.HandlerMethodResolver;

import javax.servlet.ServletContext;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class SwaggerConfig {

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.swagger.example.SwaggerExample.controller1")).build();
    }

}
