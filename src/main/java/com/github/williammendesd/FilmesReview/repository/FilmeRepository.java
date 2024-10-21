package com.github.williammendesd.FilmesReview.repository;

import com.github.williammendesd.FilmesReview.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {

}
