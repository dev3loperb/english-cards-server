package com.github.ipergenitsa.engcards.controller.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class WordApiController {
    @PostMapping("/add-word")
    public String addWord(@RequestBody String request) {
        return "success";
    }
}
