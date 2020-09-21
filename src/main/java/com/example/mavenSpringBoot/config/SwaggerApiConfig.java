package com.example.mavenSpringBoot.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerApiConfig {
	
	@Bean
    public Docket produceApi(){
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example.mavenSpringBoot.rest"))
				.paths(paths())
				.build();
	}

	private ApiInfo apiInfo() {
	    return new ApiInfoBuilder()
	    		.title("Movie Service")
	    		.description("Movie service using spring boot microservice")
	    		.version("1.0")
	    		.contact(new Contact("Dushmanta Tanty", "http://127.0.0.1:8000/api/v1/movies/", "dusmanta.tanty@gmail.com"))
	    		.build();
	}

	@SuppressWarnings("unchecked")
	private Predicate<String> paths() { 
	    return Predicates.and(
	    		PathSelectors.regex("/api/v1/movies.*")
	    );
    } 

}