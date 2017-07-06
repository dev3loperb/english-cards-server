package com.github.ipergenitsa.engcards.controller.api;

import com.github.ipergenitsa.engcards.entity.Word;
import com.github.ipergenitsa.engcards.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.plugin.dom.exception.InvalidStateException;

import java.util.Collection;

@RestController
@RequestMapping("api")
public class WordApiController {
    @Autowired
    private WordRepository wordRepository;

    @PostMapping("/add-word")
    public String addWord(@RequestBody RestWord restWord) {
        // TODO check restWord has data
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

    private static class RestWord {
        private String original;
        private String translation;

        public RestWord() {}

        public RestWord(String original, String translation) {
            this.original = original;
            this.translation = translation;
        }

        public String getOriginal() {
            return original;
        }

        public String getTranslation() {
            return translation;
        }

        public void setOriginal(String original) {
            this.original = original;
        }

        public void setTranslation(String translation) {
            this.translation = translation;
        }
    }
}
