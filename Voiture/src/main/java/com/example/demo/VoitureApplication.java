package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import com.example.demo.entities.*;
import com.example.demo.repositories.VoitureRepository;
import com.example.services.ClientService;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class VoitureApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoitureApplication.class, args);
	}
	
	@Bean
	CommandLineRunner initialiserBaseH2(VoitureRepository voitureRepository, ClientService clientService){

		return args -> {
			Client c1 = clientService.clientById(2L);
			Client c2 = clientService.clientById(1L);
			System.out.println("**************************");
			System.out.println("Id est :" + c2);
			System.out.println("**************************");
			System.out.println("**************************");
			System.out.println("Id est :" + c1);
			System.out.println("**************************");
			voitureRepository.save(new Voiture(Long.parseLong("1"), "Toyota", "A 25 333", "Corolla", 1L, c2));
			voitureRepository.save(new Voiture(Long.parseLong("2"), "Renault", "B 6 3456", "Megane", 1L, c2));
			voitureRepository.save(new Voiture(Long.parseLong("3"), "Peugeot", "A 55 4444", "301", 2L, c1));
		};
	}

}
