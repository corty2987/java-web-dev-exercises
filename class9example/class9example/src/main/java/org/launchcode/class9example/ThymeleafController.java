package org.launchcode.class9example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {
    @GetMapping
    public String home(Model model) {
        model.addAttribute("kiwi", "Test");
        return "home";
    }

}
