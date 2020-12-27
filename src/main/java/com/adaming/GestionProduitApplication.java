package com.adaming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class GestionProduitApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionProduitApplication.class, args);
	}
	
	@Bean
	@Primary
	public BCryptPasswordEncoder getPass()
	{
		return new BCryptPasswordEncoder();
	}

}
