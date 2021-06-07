package io.github.diorodro;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.github.diorodro.models.entity.Cliente;
import io.github.diorodro.models.repositories.ClienteRepository;

@SpringBootApplication
public class ClienteApplication {
	
	@Bean
	public CommandLineRunner run(@Autowired ClienteRepository repository) {
		return args ->{
			Cliente cliente = new Cliente("rumario", "invalidado",LocalDate.of(2020, 10, 20));
			repository.save(cliente);
		};
		
	}

	public static void main(String[] args) {
		SpringApplication.run(ClienteApplication.class, args);
	}
}
