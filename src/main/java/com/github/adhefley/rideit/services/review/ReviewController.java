package com.github.ajdhefley.rideit.services.review;

import com.github.ajdhefley.rideit.services.review.model.Review;
import com.github.ajdhefley.rideit.services.review.repository.ReviewRepository;
import com.github.ajdhefley.rideit.services.review.model.ReviewTag;
import com.github.ajdhefley.rideit.services.review.repository.ReviewTagRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReviewController {

    @Autowired
    ReviewRepository reviewRepository;

    @Autowired
    ReviewTagRepository reviewTagRepository;

    @GetMapping("/reviews/{coasterUrl}")
    public ResponseEntity<List<Review>> getReviewsByCoasterUrl(@PathVariable("coasterUrl") String coasterUrl) {
        return new ResponseEntity<>(this.reviewRepository.findByUrl(coasterUrl), HttpStatus.OK);
    }

    @GetMapping("/review/{reviewId}/tags")
    public ResponseEntity<List<ReviewTag>> getReviewTagsByCoasterUrl(@PathVariable("reviewId") int reviewId) {
        return new ResponseEntity<>(this.reviewTagRepository.findByReviewId(reviewId), HttpStatus.OK);
    }

}
