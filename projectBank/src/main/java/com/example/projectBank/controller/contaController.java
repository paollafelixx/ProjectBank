package com.example.projectBank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectBank.model.Conta;
import com.example.projectBank.repository.ContaRepository;

@RestController
public class contaController {

    @Autowired
    private ContaRepository contaRepository;

    @PostMapping("/contas")
    public Conta criarConta(@RequestBody Conta conta) {
        return contaRepository.save(conta);
    }
}
