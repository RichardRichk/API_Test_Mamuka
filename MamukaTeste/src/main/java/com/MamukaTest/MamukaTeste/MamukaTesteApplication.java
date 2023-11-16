package com.MamukaTest.MamukaTeste;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "API Mamuka", version = "1.0.1", description = "Api para acesso dos dados do API-TestMamuka"))
public class MamukaTesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MamukaTesteApplication.class, args);
	}

}
