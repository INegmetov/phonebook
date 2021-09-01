package com.example.phonebook;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public Docket userApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.phonebook.api")).build()
                .apiInfo(apiInfo())
                .useDefaultResponseMessages(false);

    }

    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("PhoneBookApp")
                .description("Сервис PhoneBookApp")
                .license("License")
                .licenseUrl("http://unlicense.org")
                .termsOfServiceUrl("")
                .version(getClass().getPackage().getImplementationVersion())
                .build();
    }
}
