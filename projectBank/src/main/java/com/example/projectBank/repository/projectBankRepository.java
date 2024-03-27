package com.example.projectBank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface projectBankRepository<Project> extends JpaRepository<Project, Long>

{
    
}