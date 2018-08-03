package com.bembaIT.denis.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bembaIT.denis.model.Cliente;

public interface Clientes extends MongoRepository<Cliente, String>{

}
