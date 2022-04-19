package com.jpaex;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpaex.model.Cliente;
import com.jpaex.repository.ClienteRepository;

@SpringBootApplication
public class JpaexApplication implements CommandLineRunner {
	
	@Autowired
	private ClienteRepository rep;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaexApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<Cliente> clientes = rep.findAll();
		clientes.forEach(System.out :: println);
		
	}

}