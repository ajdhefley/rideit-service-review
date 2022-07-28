package com.github.ajdhefley.rideit.services.review.model;

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
