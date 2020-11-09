package com.example.demo.controller;

import com.example.demo.entity.VoitureEntity;
import com.example.demo.services.voitureService.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/voiture")
    public VoitureEntity addVoiture(@RequestBody VoitureEntity voitureEntity){
        return this.voitureService.addVoiture(voitureEntity);
    }
}
