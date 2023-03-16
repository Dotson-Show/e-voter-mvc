package com.project.evotermvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("pageTitle", "Landing Page - E-Voter");
        return "index";
    }
}
