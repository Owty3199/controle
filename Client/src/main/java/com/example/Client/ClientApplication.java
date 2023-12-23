package com.example.Client;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.example.Client.entities.Client;
import com.example.repositories.ClientRepository;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

	@Bean
	CommandLineRunner initialiserBaseH2(ClientRepository clientRepository) {
		return args -> {
		    clientRepository.save(new Client(Long.parseLong("1"), "Aresmouk El Mokhtar", Float.parseFloat("25")));
			clientRepository.save(new Client(Long.parseLong("2"), "amin amin", Float.parseFloat("20")));


		};
	}

}
