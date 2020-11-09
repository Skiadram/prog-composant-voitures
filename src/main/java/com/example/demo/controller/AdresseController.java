package com.example.demo.controller;

import com.example.demo.entity.AdresseEntity;
import com.example.demo.services.adresseService.AdresseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
