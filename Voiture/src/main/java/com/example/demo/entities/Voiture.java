package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Transient;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Voiture {



    @Id
    @GeneratedValue
    private Long Id;
    private String marque;
    
    private String matricule;
    
    private String model;
    
    private Long id_client;
    
    @Transient
    @ManyToOne(cascade = CascadeType.ALL)
    private Client client;

	public Voiture(Long id, String marque, String matricule, String model, Long id_client, Client client) {
		super();
		Id = id;
		this.marque = marque;
		this.matricule = matricule;
		this.model = model;
		this.id_client = id_client;
		this.client = client;
	}
    
    




}