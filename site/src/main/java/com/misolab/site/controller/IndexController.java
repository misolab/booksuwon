package com.misolab.site.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class IndexController {

    @Getter
    @Builder
    static class Review {
        int id;
        String title;
        String text;
        String updated;
        String book;
        int bookId;
        String favorite;
    }

    @ModelAttribute
    public void common(Model model) {

        List<Review> popular = IntStream.range(1, 3)
                                .mapToObj(i -> Review.builder()
                                .id(i)
                                .title("Even the all-powerful Pointing has no control")
                                .updated("June 28, 2019")
                                .build())
                                .collect(Collectors.toList());
        model.addAttribute("popular", popular);
    }

    // 리스트
    @GetMapping({"/", "/review"})
    public String index(Model model) {
        List<Review> list = IntStream.range(1, 50)
        .mapToObj(i -> Review.builder()
        .id(i)
        .title("독후감 제목")
        .text("독후감 주저리~ 독후감 주저리~ 독후감 주저리~ 독후감 주저리~ 독후감 주저리~ 독후감 주저리~ 독후감 주저리~ 독후감 주저리~ 독후감 주저리~ 독후감 주저리~ 독후감 주저리~ 독후감 주저리~ 독후감 주저리~ 독후감 주저리~ 독후감 주저리~ 독후감 주저리~ ")
        .book("책제목 / 출판사")
        .bookId(100)
        .updated("June 28, 2019")
        .build())
        .collect(Collectors.toList());

        model.addAttribute("list", list);
        return "index";
    }

    //  보기
    // @GetMapping("/{postId}")
    // public String post(Model model, @PathVariable long postId) {
    //     return "post";
    // }
    
    //  작성창 (진입)
    // @GetMapping("/write")
    // public String write(Model model, @PathVariable long postId) {
    //     return "write";
    // }

    //  작성창 (등록)
    // @PostMapping("/write")
    // public String upload(Model model, @PathVariable long postId) {
    //     return "write";
    // }

}
