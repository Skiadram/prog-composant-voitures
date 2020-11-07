package com.example.demo.services.concessionaireService;

import com.example.demo.entity.ConcessionaireEntity;
import com.example.demo.repository.ConcessionaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public class ConcessionaireServiceImplement implements ConcessionaireService {
    @Autowired
    ConcessionaireRepository concessionaireRepository;

    @Override
    public Iterable<ConcessionaireEntity> getAllConcessionaire() {
        return this.concessionaireRepository.findAll();
    }
}
