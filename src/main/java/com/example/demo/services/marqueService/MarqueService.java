package com.example.demo.services.marqueService;

import com.example.demo.entity.MarqueEntity;

import java.util.List;
import java.util.Optional;

public interface MarqueService {

    public Iterable<MarqueEntity> getAllMarque();

    Optional<MarqueEntity> getMarqueById(int id);
}
