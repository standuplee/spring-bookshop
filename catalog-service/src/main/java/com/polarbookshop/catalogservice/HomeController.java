package com.polarbookshop.catalogservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


// RestController : REST/HTTP 엔드포인트를 위한 핸들러를 정의하는 클래스로 인식
@RestController
public class HomeController {

    // 루트 엔드포인트로 GET 요청 처리
    @GetMapping("/")
    public String getGreeting() {
        return "Welcome to the book catalog!";
    }

}