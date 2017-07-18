package com.github.ipergenitsa.engcards.controller.api;

import com.github.ipergenitsa.engcards.controller.api.rest.RestWord;
import com.github.ipergenitsa.engcards.entity.Word;
import com.github.ipergenitsa.engcards.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.plugin.dom.exception.InvalidStateException;

import javax.validation.Valid;
import java.util.Collection;

@RestController
@RequestMapping("api")
public class WordApiController {
    @Autowired
    private WordRepository wordRepository;

    @PostMapping("/add-word")
    public String addWord(@Valid @RequestBody RestWord restWord) {
        final Word wordToSave = new Word();
        wordToSave.setOriginal(restWord.getOriginal());
        wordToSave.setTranslation(restWord.getTranslation());
        if (wordRepository.save(wordToSave) != null) {
            return "success";
        }
        throw new InvalidStateException("Cannot save word to database");
    }

    @GetMapping("/word-all")
    public Collection<Word> getAll() {
        return wordRepository.findAll();
    }
}
