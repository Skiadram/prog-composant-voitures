package com.example.demo.repository;

import com.example.demo.entity.VoitureEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VoitureRepository extends JpaRepository<VoitureEntity, Integer> {
    @Query(value = "select * from Voiture", nativeQuery = true)
    Iterable<VoitureEntity> findAllVoiture();
}
