package com.microservice.loans;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title ="Loans Microservice Rest API Documentation",
				description = "Loans MIcroservice Rest Api documentation",
				version = "v1",
				contact = @Contact(
						name = "Tahmid Hassan",
						email = "abcd@gmail.com",
						url = "https://www.tahmidhasanridoy.com"
				),
				license = @License(
						name ="Apache 2.0",
						url = "https://www.tahmidhasanridoy.com"
				)

		),
		externalDocs = @ExternalDocumentation(
				description = "Loans microservice Rest Api Documentation",
				url = "https://www.tahmidhasanridoy.com"
		)

)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}

}
