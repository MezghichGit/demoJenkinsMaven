package com.sip.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoMavenJunit2024Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoMavenJunit2024Application.class, args);
		System.out.println(Utilitaire.display("Ynov"));
		System.out.println(Utilitaire.racineCarre(16));
	}

}
