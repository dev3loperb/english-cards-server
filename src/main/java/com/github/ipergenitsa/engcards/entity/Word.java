package com.github.ipergenitsa.engcards.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Word {
    @Id
    private Long id;
    private String original;
    private String translation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }
}
