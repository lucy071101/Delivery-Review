package com.example.review;

import java.time.LocalDateTime;

import com.example.review.list.Review;
import com.example.review.list.ReviewRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ReviewApplicationTests {

    @Autowired
    private ReviewRepository reviewRepository;

    @Test
    void testJpa() {
        Review q1 = new Review();
        q1.setName("젠마릴");
        q1.setContent("초코 생크림 딸기 타르트가 맛있음.");
        q1.setCreateDate(LocalDateTime.now());
        q1.setPlace("서울특별시 영등포구");
        q1.setPrice(22400);
        q1.setRating(4);
        this.reviewRepository.save(q1);  // 첫번째 리뷰 저장
    }

}
