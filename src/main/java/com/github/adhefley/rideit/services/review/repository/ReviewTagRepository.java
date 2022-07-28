package com.github.ajdhefley.rideit.services.review.repository;

import com.github.ajdhefley.rideit.services.review.model.ReviewTag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReviewTagRepository extends JpaRepository<ReviewTag, Integer> {

    @Query("SELECT rt FROM ReviewTag rt WHERE rt.review.reviewId=:reviewId")
    public List<ReviewTag> findByReviewId(@Param("reviewId") int reviewId);

}