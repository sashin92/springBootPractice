package com.github.sashin92.hellospring.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class SpringdocConfig {

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("springdoc-openapi")
						.version("1.0")
						.description("springdoc swagger화면"));
	}
	
	@Bean
	public GroupedOpenApi api() {
		String[] paths = {"/api/v1/**"};
		String[] packagesToScan = {"com.github.sashin92"};
		return GroupedOpenApi.builder().group("springdoc-openapcc")
				.pathsToMatch(paths)
				.packagesToScan(packagesToScan)
				.build();
	}
}
