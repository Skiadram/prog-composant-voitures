package com.example.demo.Services;

import com.example.demo.entity.VoitureEntity;
import com.example.demo.repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public class VoitureServiceImplement implements VoitureService {

    @Autowired
    VoitureRepository voitureRepository;


    @Override
    public Iterable<VoitureEntity> getAllVoiture() {
        return this.voitureRepository.findAll();
    }

    @Override
    public Iterable<VoitureEntity> getVoitureByMarque(String marque) {
        return voitureRepository.findVoitureByMarque(marque);
    }
}
