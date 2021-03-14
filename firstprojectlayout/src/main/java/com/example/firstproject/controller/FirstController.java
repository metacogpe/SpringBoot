package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // 콘트롤러 선언
public class FirstController {

    @GetMapping("/hi")   // 요청하기 위한 정의 (hi로 불러서 사용하기)
    public String niceToMeetYou(Model model) {
        model.addAttribute("username","song");
        return "greetings"; // templeates/greetings.mustache --> 브라우저로 전송!

    }

    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("nickname","홍길동");
        return "goodbye";
    }
}
