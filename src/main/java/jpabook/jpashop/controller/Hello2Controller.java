package jpabook.jpashop.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello2Controller {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "helloooooooo");
        return "hello";
    }
}
