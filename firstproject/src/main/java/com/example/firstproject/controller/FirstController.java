// greetings.mustache 뷰페이지를 볼 수 있게 연결시키는 Controller 코드
package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;  //컨트롤러 선언 어노테이션하면 자동으로 임포트 됨
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 컨트롤러임을 선언
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "홍길동");  // 모델의 속성
        return "greetings"; // templates/greetings.mustache 를 브라우저로 전송하게 됨
    }
}
