package com.github.williammendesd.FilmesReview.dto;

import com.github.williammendesd.FilmesReview.model.Filme;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.List;

public class GeneroDTO {

    private Long id;

    @NotBlank(message = "Campo requerido")
    @Size(min = 5, message = "O nome deve ter no mínimo 5 caractéres")
    private String nome;

    public GeneroDTO(String nome, List<Filme> filmes) {
        this.nome = nome;
    }
}
