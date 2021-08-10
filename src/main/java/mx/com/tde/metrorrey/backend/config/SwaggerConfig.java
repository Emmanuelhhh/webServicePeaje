package mx.com.tde.metrorrey.backend.config;

import mx.com.tde.metrorrey.backend.uitls.VersionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private final VersionUtils versionUtils;

    @Autowired
    public SwaggerConfig(VersionUtils versionUtils){
        this.versionUtils = versionUtils;
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("mx.com.tde.metrorrey.backend.controller"))
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(false)
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo(){
        Contact contact = new Contact("SFINX SA DE CV", "https://sfinx.com.mx", "aescobar@sfinx.com.mx");

        return new ApiInfo("Integration AFC - Metrorrey", "Api para integración de sistema AFC y Metrorrey",
                "v"+versionUtils.version(), "terms_url", contact,
                "LICENSE", "API LICENSE URL", new ArrayList<>());
    }

}
