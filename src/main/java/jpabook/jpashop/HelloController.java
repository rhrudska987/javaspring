package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){ //model에 data 값을 줘서 template뷰로 넘길 수 있음
        model.addAttribute("data", "hello!!");
        return "hello"; //hello.html로 이동
    }
}