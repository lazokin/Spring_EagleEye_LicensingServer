package com.lazokin.eagleeye.licensing;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.lazokin.eagleeye.licensing.models.License;
import com.lazokin.eagleeye.licensing.repository.LicenseRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
    public CommandLineRunner demoData(LicenseRepository repo) {
        return args -> { 
            repo.save(new License("ID1", "ORG1", "PROD1"));
            repo.save(new License("ID2", "ORG1", "PROD2"));
            repo.save(new License("ID3", "ORG1", "PROD3"));
            repo.save(new License("ID4", "ORG2", "PROD4"));
            repo.save(new License("ID5", "ORG2", "PROD5"));
            repo.save(new License("ID6", "ORG2", "PROD6"));
        };
    }
}
