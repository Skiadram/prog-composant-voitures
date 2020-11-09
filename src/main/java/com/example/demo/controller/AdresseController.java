package com.example.demo.controller;

import com.example.demo.entity.AdresseEntity;
import com.example.demo.services.adresseService.AdresseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


@RestController
@RequestMapping(path = "/api")
public class AdresseController {

    @Autowired
    AdresseService adresseService;

    @GetMapping("/adresse")
    public Iterable<AdresseEntity>getAllAdresse(){ return this.adresseService.getAllAdresse(); }

    @GetMapping("/adresse/{id}")
    public Optional<AdresseEntity>getAdresseById(@PathVariable("id") int id){
    return this.adresseService.getAdresseById(id);
    }

    @PostMapping("/adresse")
    public AdresseEntity addAdresseById(@RequestBody AdresseEntity adresseEntity) {
        return this.adresseService.addAdresse(adresseEntity);
    }
}
