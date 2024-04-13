package org.example.repositories;

import org.example.entities.Transport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TransportRepo extends JpaRepository<Transport, Integer> {
}
