package com.github.ajdhefley.rideit.services.review.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="reviews")
public class Review {

    @Id
    @Column(name="reviewid", nullable=false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer reviewId;

    @Column(name="userid")
    private Integer userId;

    @Column(name="title")
    private String title;

    @Column(name="body")
    private String body;

    @Column(name="rating")
    private Float rating;

    @Column(name="timestamp")
    private Date timestamp;

    @ManyToOne
    @JoinColumn(name="coasterid")
    private Coaster coaster;

    @JsonManagedReference
    @OneToMany(cascade=CascadeType.ALL, mappedBy="review")
    private List<ReviewTag> reviewTags;

    public Integer getReviewId() {
        return this.reviewId;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getBody() {
        return this.body;
    }

    public Float getRating() {
        return this.rating;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public List<ReviewTag> getReviewTags() {
        return this.reviewTags;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Author author = (Author) o;
//
//        return id.equals(author.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return id.hashCode();
//    }
//
//    @Override
//    public String toString() {
//        return "Author{" +
//                "id=" + id +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                '}';
//    }
}