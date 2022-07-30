package com.github.ajdhefley.rideit.services.review.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name="reviewtags")
public class ReviewTag {

    @Id
    @Column(name="reviewtagid", nullable=false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer reviewTagId;

    @Column(name="tag")
    private String tag;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name="reviewid")
    public Review review;

    public Integer getReviewTagId() {
        return this.reviewTagId;
    }

    public String getTag() {
        return this.tag;
    }

}
