package com.github.ajdhefley.rideit.services.review.repository;

import com.github.ajdhefley.rideit.services.review.model.ReviewAuthor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewAuthorRepository extends JpaRepository<ReviewAuthor, Integer> {

}