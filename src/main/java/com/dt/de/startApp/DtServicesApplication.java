package com.dt.de.startApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={
"com.dt.de"})
@EntityScan("com.dt.de.model")
@EnableJpaRepositories("com.dt.de.jpa.repository")
public class DtServicesApplication extends SpringBootServletInitializer{
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DtServicesApplication.class);
    }
	public static void main(String[] args) {
		SpringApplication.run(DtServicesApplication.class, args);
	}

}

