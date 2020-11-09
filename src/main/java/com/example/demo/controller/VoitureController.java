package com.example.demo.controller;

import com.example.demo.entity.VoitureEntity;
import com.example.demo.services.voitureService.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class VoitureController {

    @Autowired
    VoitureService voitureService;


    @GetMapping("/voiture")
    public Iterable<VoitureEntity>getAllVoiture(){ return this.voitureService.getAllVoiture(); }

    @GetMapping("/voiture/{id}")
    public Optional<VoitureEntity>getVoitureById(@PathVariable("id")int id){
        return this.voitureService.getVoitureById(id);
    }
}
