package com.coderhouse.ClienteApiRestPungitore.repository;

import com.coderhouse.ClienteApiRestPungitore.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}

