package com.api.library.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Locatario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    private String sexo;

    @NotBlank
    private String telefone;

    @NotBlank
    @Column(unique = true)
    private String email;

    @NotBlank
    private LocalDate dataNascimento;

    @NotBlank
    @Column(unique = true)
    private String cpf;

}
