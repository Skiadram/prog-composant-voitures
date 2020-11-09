package com.example.demo.services.adresseService;

import com.example.demo.entity.AdresseEntity;
import com.example.demo.repository.AdresseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public class AdresseServiceImplement implements AdresseService{
    @Autowired
    AdresseRepository adresseRepository;

    @Override
    public Iterable<AdresseEntity> getAllAdresse() {
        return this.adresseRepository.findAllAdresse();
    }

    @Override
    public Optional<AdresseEntity> getAdresseById(int id) {
        return this.adresseRepository.findById(id);
    }
}
