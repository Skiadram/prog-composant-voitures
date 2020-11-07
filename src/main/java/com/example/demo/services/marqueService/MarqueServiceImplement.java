package com.example.demo.services.marqueService;

import com.example.demo.entity.MarqueEntity;
import com.example.demo.repository.MarqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public class MarqueServiceImplement implements MarqueService{

    @Autowired
    MarqueRepository marqueRepository;

    @Override
    public Iterable<MarqueEntity> getAllMarque() {
        return this.marqueRepository.findAllMarque();
    }
}
