package com.example.review.list;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Column
    private Integer rating;

    @Column(length = 200)
    private String place;

    @Column
    private Integer price;

    private LocalDateTime createDate;
}
