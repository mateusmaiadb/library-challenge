package com.api.library.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    private String sexo;

    @NotBlank
    private LocalDate anoNascimento;

    @NotBlank
    @Column(unique = true)
    private String cpf;

    @ManyToMany(mappedBy = "autores")
    private Set<Livro> livros = new HashSet<>();
}
