package com.github.williammendesd.FilmesReview.repository;

import com.github.williammendesd.FilmesReview.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
