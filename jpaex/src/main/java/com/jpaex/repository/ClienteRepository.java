package com.jpaex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpaex.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	
}
