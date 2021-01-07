package com.everis.persons.app.config;

import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

public class SwaggerConfig {
  
  @Bean
  public Docket api() {
      return changeGlobalResponses(new Docket(DocumentationType.SWAGGER_2)
              .select()
              .apis(RequestHandlerSelectors.basePackage("com.everis.persons.app"))
              .paths(PathSelectors.any())
              .build()
              .apiInfo(metaData()));
  }
  @Bean
  public ApiInfo metaData() {
      return new ApiInfoBuilder()
              .title("API REST PERSONS")
              .description("\"API REST RESPUESTA CLIENTE INFO\"")
              .version("1.0.0")
              .license("Apache License Version 2.0")
              .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"")
              .contact(new Contact("Joel Barranzuela", "https://github.com/JoelBarranzuela", "joejoel0512@gmail.com"))
              .build();
  }

  private Docket changeGlobalResponses(Docket docket){
      docket=docket.useDefaultResponseMessages(false);
      return docket;
  }

}