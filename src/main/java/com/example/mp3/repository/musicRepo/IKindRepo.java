package com.example.mp3.repository.musicRepo;

import com.example.mp3.model.music.Kind;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IKindRepo extends JpaRepository<Kind, Long> {
    Kind findByKindName(String kindName);
}
