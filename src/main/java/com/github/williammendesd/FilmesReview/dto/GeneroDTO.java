package com.github.williammendesd.FilmesReview.dto;

import com.github.williammendesd.FilmesReview.model.Filme;
import com.github.williammendesd.FilmesReview.model.Genero;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class GeneroDTO {

    private Long id;

    @NotBlank(message = "Campo requerido")
    @Size(min = 5, message = "O nome deve ter no mínimo 5 caractéres")
    private String nome;

//    private List<FilmeDTO> filmes = new ArrayList<>();

    public GeneroDTO(Genero entity) {
        this.nome = entity.getNome();
        this.id = entity.getId();
//        entity.getFilmes().forEach(filme -> filmes.add(new FilmeDTO(filme)));
    }
}
