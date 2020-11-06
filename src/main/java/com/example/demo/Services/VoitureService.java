package com.example.demo.Services;

import com.example.demo.entity.VoitureEntity;

import java.util.Optional;

public interface VoitureService {

    public Iterable<VoitureEntity> getAllVoiture();

    public Iterable<VoitureEntity>getVoitureByMarque(String type);

}
