package com.LiterAlura.Challenge;

import com.LiterAlura.Challenge.principal.Principal;
import com.LiterAlura.Challenge.repository.AutorRepository;
import com.LiterAlura.Challenge.repository.LibroRepository;
import com.LiterAlura.Challenge.service.ConsumoAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeApplication{
	@Autowired
	private AutorRepository autorRepository;

	@Autowired
	private LibroRepository libroRepository;

	public static void main(String[] args) {
		SpringApplication.run(ChallengeApplication.class, args);
	}

	public void run(String... args) throws Exception {
		Principal principal = new Principal(libroRepository, autorRepository);
		principal.muestraMenu();
	}

}
