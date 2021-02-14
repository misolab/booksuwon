package com.misolab.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class IndexController {

    //  리스트
    @GetMapping({"/", "/review"})
    public String index(Model model) {
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
