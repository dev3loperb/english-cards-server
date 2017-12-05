package com.github.ipergenitsa.engcards.repository;

import com.github.ipergenitsa.engcards.entity.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepository extends JpaRepository<Word, Long> {
    @Query(value = "SELECT * FROM word ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Word findRandom();
}
