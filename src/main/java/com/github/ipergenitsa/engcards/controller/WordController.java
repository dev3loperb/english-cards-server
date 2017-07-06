package com.github.ipergenitsa.engcards.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WordController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("appName", "Word cards");
        return "index";
    }

    @GetMapping("/words")
    public String allWords() {
        return "words";
    }
}
