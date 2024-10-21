package com.github.williammendesd.FilmesReview.dto.userDTO;

import com.github.williammendesd.FilmesReview.model.Review;
import com.github.williammendesd.FilmesReview.model.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

public class UserDTO {

    private Long id;

    @NotBlank(message = "Campo requerido")
    @Size(min = 5, message = "O nome deve ter no mínimo 5 caractéres")
    private String name;

    @NotBlank(message = "Campo requerido")
    @Email()
    private String email;

    @NotBlank(message = "Campo requerido")
    @Size(min = 5, message = "A senha deve ter no mínimo 5 caractéres")
    private String password;

    private List<Review> reviews = new ArrayList<>();

    public UserDTO(User entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.email = entity.getEmail();
        this.password = entity.getPassword();
//        entity.getReviews().forEach(review -> reviews.add(new UserDtoComReviews(review)));
    }
}
