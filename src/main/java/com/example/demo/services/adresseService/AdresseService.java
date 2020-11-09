package com.example.demo.services.adresseService;

import com.example.demo.entity.AdresseEntity;

import java.util.Optional;

public interface AdresseService {

    public Iterable<AdresseEntity>getAllAdresse();


    Optional<AdresseEntity> getAdresseById(int id);

    void deleteAdresseById(int id);

    AdresseEntity addAdresse(AdresseEntity adresseEntity);
}
