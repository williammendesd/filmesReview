package com.github.williammendesd.FilmesReview.dto;

import com.github.williammendesd.FilmesReview.model.Filme;
import com.github.williammendesd.FilmesReview.model.Review;
import com.github.williammendesd.FilmesReview.model.User;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ReviewDTO {

    private Long id;

    @NotBlank(message = "Campo requerido")
    @Size(min = 5, message = "O texto deve ter no mínimo 5 caractéres")
    private String texto;

    @NotBlank(message = "Campo requerido")
    private User user;

    @NotBlank(message = "Campo requerido")
    private Filme filme;

    public ReviewDTO(Review entity) {
        this.texto = entity.getTexto();
        this.user = entity.getUser();
        this.filme = entity.getFilme();
    }

}
