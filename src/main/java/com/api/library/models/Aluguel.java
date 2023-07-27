package com.api.library.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Aluguel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "locatario_id")
    private Locatario locatario;

    @ManyToMany
    @JoinTable(
            name = "aluguel_livro",
            joinColumns = @JoinColumn(name = "aluguel_id"),
            inverseJoinColumns = @JoinColumn(name = "livro_id")
    )
    private Set<Livro> livros = new HashSet<>();

    private LocalDate dataRetirada;

    private LocalDate dataDevolucao;

}
