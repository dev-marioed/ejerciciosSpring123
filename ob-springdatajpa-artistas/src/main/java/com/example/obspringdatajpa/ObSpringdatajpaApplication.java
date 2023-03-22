package com.example.obspringdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringdatajpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObSpringdatajpaApplication.class, args);

		ApplicationContext context = SpringApplication.run(ObSpringdatajpaApplication.class, args);

		ArtistRepository repository = context.getBean(ArtistRepository.class);

		System.out.println("El num de artistas en base de datos es: " + repository.count());

		// crear y almacenar un coche en base de datos
		Artist bMarley = new Artist(null, "Bob Marley", "Reggae", 10);
		repository.save(bMarley);

		Artist shaggy = new Artist(null, "Shaggy", "nu Regggae", 4);
		repository.save(shaggy);

		System.out.println("El num de artistas en base de datos es: " + repository.count());

		// recuperar todos
		System.out.println(repository.findById(2L));
	}

}
