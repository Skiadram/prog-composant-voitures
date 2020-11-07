package com.example.demo.repository;

import com.example.demo.entity.AdresseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdresseRepository extends JpaRepository<AdresseEntity, Integer> {

    @Query(value = "select * from adresse", nativeQuery = true)
    Iterable<AdresseEntity> findAllAdresse();
}
