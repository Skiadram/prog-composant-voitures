package com.example.demo.services.voitureService;

import com.example.demo.entity.AdresseEntity;
import com.example.demo.entity.VoitureEntity;
import com.example.demo.repository.AdresseRepository;
import com.example.demo.repository.VoitureRepository;
import com.example.demo.services.adresseService.AdresseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public class VoitureServiceImplement implements VoitureService {
    @Autowired
    VoitureRepository voitureRepository;

    @Override
    public Iterable<VoitureEntity> getAllVoiture() {
        return this.voitureRepository.findAllVoiture();
    }
}
