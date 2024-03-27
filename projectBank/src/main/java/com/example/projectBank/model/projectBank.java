package com.example.projectBank.model;

import jakarta.persistence.GeneratedValue;

import java.lang.reflect.Member;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@SuppressWarnings("unused")
@Entity
public class projectBank {
    @id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;

    
    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public projectBank(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }


    public List<Member> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

}