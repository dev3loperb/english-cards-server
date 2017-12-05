package com.github.ipergenitsa.engcards.controller.api;

import java.util.Collection;
import javax.validation.Valid;

import com.github.ipergenitsa.engcards.controller.api.rest.RestWord;
import com.github.ipergenitsa.engcards.entity.Word;
import com.github.ipergenitsa.engcards.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.plugin.dom.exception.InvalidStateException;

@RestController
@RequestMapping("api/word")
public class WordApiController {
    private WordRepository wordRepository;

    @Autowired
    public WordApiController(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    @PostMapping("/add")
    public String addWord(@Valid @RequestBody RestWord restWord) {
        final Word wordToSave = new Word();
        wordToSave.setOriginal(restWord.getOriginal());
        wordToSave.setTranslation(restWord.getTranslation());
        if (wordRepository.save(wordToSave) != null) {
            return "success";
        }
        throw new InvalidStateException("Cannot save word to database");
    }

    @GetMapping("/random")
    public Word getRandomWord() {
        return wordRepository.findRandom();
    }

    @GetMapping("/all")
    public Collection<Word> getAll() {
        return wordRepository.findAll();
    }
}
