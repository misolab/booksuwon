package com.misolab.api.controller;

import lombok.RequiredArgsConstructor;
import com.misolab.common.util.DateTimeUtils;
import com.misolab.webapp.vo.ApiResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class IndexController {

    @GetMapping
    public ResponseEntity<Object> index() {
        ApiResponse response = ApiResponse.of()
                .add("message", "This is api module")
                .add("current", DateTimeUtils.toString(System.currentTimeMillis(), "yyyy-MM-dd HH:mm:ss"));
        return response.toResponseEntity();
    }
}

