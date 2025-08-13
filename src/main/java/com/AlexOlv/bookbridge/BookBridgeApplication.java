package com.AlexOlv.bookbridge;

import com.AlexOlv.bookbridge.principal.Principal;
import com.AlexOlv.bookbridge.repository.AutorRepository;
import com.AlexOlv.bookbridge.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookBridgeApplication implements CommandLineRunner {
	@Autowired
	private LivroRepository livroRepository;
	@Autowired
	private AutorRepository autorRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookBridgeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(autorRepository, livroRepository);
		principal.exibeMenu();
	}
}
