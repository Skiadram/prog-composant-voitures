package com.example.demo.repository;

import com.example.demo.entity.VoitureEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface VoitureRepository extends JpaRepository<VoitureEntity, Integer> {

    @Query(value = "select v.id, v.marque, v.modele from voiture as v", nativeQuery = true)
    List<VoitureEntity> findAll();

    @Query(value = "SELECT v.id, v.marque, v.modele FROM voiture as v where v.marque = ?1", nativeQuery = true)
    Iterable<VoitureEntity> findVoitureByMarque(String type);
}
