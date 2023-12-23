package com.example.services;
import org.springframework.cloud.openfeign.FeignClient;
import com.example.demo.entities.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "service-client")
public interface ClientService {

	@GetMapping("/clients/{clientId}")
    Client clientById(@PathVariable("clientId") Long clientId);
}
