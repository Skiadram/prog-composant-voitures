package com.example.demo.controller;

import com.example.demo.services.VoitureService;
import com.example.demo.entity.VoitureEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class VoitureController {

    @Autowired
    VoitureService voitureService;


    @GetMapping("/voiture/")
    public Iterable<VoitureEntity> getAllVoiture(){
        return voitureService.getAllVoiture();
    }

    @GetMapping("/{marqueVoiture}")
    public Iterable<VoitureEntity>getBoissonByMarque(@PathVariable("marqueVoiture")String marque){
        return voitureService.getVoitureByMarque(marque);
    }

    /*@GetMapping("/voiture")
    public Iterable<VoitureEntity>*/
}
