package com.example.demo.controller;

import com.example.demo.entity.ClientEntity;
import com.example.demo.services.clientService.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("/client")
    public Iterable<ClientEntity>getAllCLient(){ return  this.clientService.getAllClient(); }

    @GetMapping("/client/{id}")
    public Optional<ClientEntity>getClientById(@PathVariable("id") int id){
        return this.clientService.getClientById(id);
    }
}
