package com.github.ajdhefley.rideit.services.review.model;

import javax.persistence.*;

@Entity
@Table(name="users")
public class ReviewAuthor {
    @Id
    @Column(name="userid", nullable=false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer userId;

    @Column(name="username", nullable = false)
    private String username;

    public Integer getUserId() {
        return this.userId;
    }

    public String getUsername() {
        return this.username;
    }

}