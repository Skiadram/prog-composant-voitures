package com.example.demo.services;

import com.example.demo.entity.VoitureEntity;

public interface VoitureService {

    public Iterable<VoitureEntity> getAllVoiture();

    public Iterable<VoitureEntity>getVoitureByMarque(String marque);

}
