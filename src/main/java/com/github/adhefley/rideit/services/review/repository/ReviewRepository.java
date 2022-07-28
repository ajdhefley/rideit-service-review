package com.github.ajdhefley.rideit.services.review.repository;

import com.github.ajdhefley.rideit.services.review.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Integer> {

    @Query("SELECT r FROM Review r WHERE r.coaster.url=:url")
    public List<Review> findByUrl(@Param("url") String coasterUrl);

}