package com.example.demo.controller;

import com.example.demo.entity.ClientEntity;
import com.example.demo.services.clientService.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/client")
    public ClientEntity addClient(@RequestBody ClientEntity clientEntity){
        return this.clientService.addClient(clientEntity);
    }
}
