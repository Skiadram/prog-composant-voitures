package com.example.demo.controller;

import com.example.demo.entity.AdresseEntity;
import com.example.demo.entity.ConcessionaireEntity;
import com.example.demo.entity.MarqueEntity;
import com.example.demo.services.adresseService.AdresseService;
import com.example.demo.services.concessionaireService.ConcessionaireService;
import com.example.demo.services.marqueService.MarqueService;
import com.example.demo.services.voitureService.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class MyController {

    @Autowired
    VoitureService voitureService;
    @Autowired
    MarqueService marqueService;
    @Autowired
    AdresseService adresseService;
    @Autowired
    ConcessionaireService concessionaireService;


    @GetMapping("/marque")
    public Iterable<MarqueEntity>getAllMarque(){
        return marqueService.getAllMarque();
    }

    @GetMapping("/adresse")
    public Iterable<AdresseEntity>getAllAdresse(){ return this.adresseService.getAllAdresse(); }

    @GetMapping("/concessionaire")
    public Iterable<ConcessionaireEntity>getAllConcessionaire(){ return this.concessionaireService.getAllConcessionaire(); }


   /* @GetMapping("/voiture/")
    public Iterable<VoitureEntity> getAllVoiture(){
        return voitureService.getAllVoiture();
    }

    @GetMapping("/{marqueVoiture}")
    public Iterable<VoitureEntity>getBoissonByMarque(@PathVariable("marqueVoiture")String marque){
        return voitureService.getVoitureByMarque(marque);
    }*/

    /*@GetMapping("/voiture")
    public Iterable<VoitureEntity>*/
}
