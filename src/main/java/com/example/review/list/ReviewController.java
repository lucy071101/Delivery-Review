package com.example.review.list;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequestMapping("/review")
@RequiredArgsConstructor
@Controller
public class ReviewController {

    private final ReviewService reviewService;

    @GetMapping("/list")
    public String list(Model model) {
        List<Review> reviewList = this.reviewService.getList();
        model.addAttribute("reviewList", reviewList);
        return "review_list";
    }

    @GetMapping(value = "/detail/{id}")
    public String detail(Model model, @PathVariable("id") Integer id) {
        Review review = this.reviewService.getReview(id);
        model.addAttribute("review", review);
        return "review_detail";
    }
}
