package com.example.projectBank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
import lombok.Data;

@Entity
@Data
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numero;
    private String agencia;
    private String nomeTitular;
    private String cpfTitular;
    private LocalDate dataAbertura;
    private double saldoInicial;
    private boolean ativa;
    private String tipo;
}
