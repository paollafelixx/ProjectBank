package com.example.projectBank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projectBank.model.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {
    
}
