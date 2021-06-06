package io.github.diorodro.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.diorodro.models.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
