package com.example.review.list;

import java.util.List;

import java.util.Optional;
import com.example.review.DataNotFoundException;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;

    public List<Review> getList() {
        return this.reviewRepository.findAll();
    }

    public Review getReview(Integer id) {
        Optional<Review> review = this.reviewRepository.findById(id);
        if (review.isPresent()) {
            return review.get();
        }
        else {
            throw new DataNotFoundException("review not found");
        }
    }

    public void create(String name, Integer rating) {
        Review r = new Review();
        r.setName(name);
        r.setRating(rating);
        r.setCreateDate(LocalDateTime.now());
        this.reviewRepository.save(r);
    }
}
