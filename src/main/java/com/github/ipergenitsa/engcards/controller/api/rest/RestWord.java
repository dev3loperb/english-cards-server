package com.github.ipergenitsa.engcards.controller.api.rest;

import org.hibernate.validator.constraints.NotEmpty;

public class RestWord {
    @NotEmpty
    private String original;
    @NotEmpty
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
