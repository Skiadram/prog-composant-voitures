package com.example.demo.services.clientService;

import com.example.demo.entity.ClientEntity;
import com.example.demo.entity.ConcessionaireEntity;
import com.example.demo.repository.ClientRepository;
import com.example.demo.repository.ConcessionaireRepository;
import com.example.demo.services.concessionaireService.ConcessionaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public class ClientServiceImplement implements ClientService {
    @Autowired
    ClientRepository clientRepository;

    @Override
    public Iterable<ClientEntity> getAllClient() {
        return this.clientRepository.findAll();
    }

    @Override
    public Optional<ClientEntity> getClientById(int id) {
        return this.clientRepository.findById(id);
    }
}
