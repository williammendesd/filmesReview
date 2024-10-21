package com.github.williammendesd.FilmesReview.dto;


import com.github.williammendesd.FilmesReview.model.Genero;
import com.github.williammendesd.FilmesReview.model.Review;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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


public class FilmeDTO {
    private Long id;

    @NotBlank(message = "Campo requerido")
    @Size(min = 5, message = "O titulo deve ter no mínimo 5 caractéres")
    private String titulo;

    @NotNull(message = "Campo requerido")
    private Integer ano;

    private List<Review> reviews = new ArrayList<>();

    @NotBlank(message = "Campo requerido")
    private Genero genero;
}
