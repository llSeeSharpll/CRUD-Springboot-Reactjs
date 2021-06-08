package com.example.CRUDSpringbootReactjs.repositories;

import com.example.CRUDSpringbootReactjs.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
