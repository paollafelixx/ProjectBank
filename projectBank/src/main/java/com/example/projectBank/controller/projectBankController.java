package com.example.projectBank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectBank.model.projectBank;

import java.lang.reflect.Member;
import java.util.List;

@RestController
public class projectBankController {

    @Autowired
    private projectBank memberRepository;

    @GetMapping("/")
    public String getProjectInfo() {
        List<Member> members = memberRepository.findAll();
        StringBuilder response = new StringBuilder();
        response.append("Nome do projeto: Projeto Banco\n");
        response.append("Membros da equipe: Paolla e Matheus\n");
        for (Member member : members) {
            response.append(member.getName()).append("\n");
        }
        return response.toString();
    }
}
