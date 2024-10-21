package com.github.williammendesd.FilmesReview.repository;

import com.github.williammendesd.FilmesReview.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
