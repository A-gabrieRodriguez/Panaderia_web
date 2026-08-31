package org.example.bakery_api.repository;

import org.example.bakery_api.models.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CustomerRespository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByEmail(UUID id);
    Optional<Customer> findById(UUID id);
}
