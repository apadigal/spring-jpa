package net.sony.app.pmdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class PmdbServicesApplication extends SpringBootServletInitializer {

    @Override
   	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
   		return application.sources(PmdbServicesApplication.class);
   	}

	public static void main(String[] args) {
		SpringApplication.run(PmdbServicesApplication.class, args);
	}
}
