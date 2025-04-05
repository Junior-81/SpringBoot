package dio.web.api.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("Título da API")
                .description("Descrição da API com Swagger + Spring Boot 3")
                .version("1.0")
                .termsOfService("https://www.exemplo.com/termos")
                .contact(new Contact()
                    .name("Seu Nome")
                    .url("https://www.exemplo.com")
                    .email("voce@exemplo.com"))
                .license(new License()
                    .name("Licença - Sua Empresa")
                    .url("https://www.exemplo.com/licenca"))
            );
    }
}
