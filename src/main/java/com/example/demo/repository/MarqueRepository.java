package com.example.demo.repository;

import com.example.demo.entity.MarqueEntity;
import com.example.demo.entity.VoitureEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MarqueRepository extends JpaRepository <MarqueEntity, Integer>{

    @Query(value = "select m.id_marque, m.nom from marque as m", nativeQuery = true)
    List<MarqueEntity>findAllMarque();
}
