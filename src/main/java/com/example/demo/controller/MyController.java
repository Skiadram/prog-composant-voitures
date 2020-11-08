package com.example.demo.controller;

import com.example.demo.entity.*;
import com.example.demo.services.adresseService.AdresseService;
import com.example.demo.services.clientService.ClientService;
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
    MarqueService marqueService;
    @Autowired
    AdresseService adresseService;
    @Autowired
    ConcessionaireService concessionaireService;
    @Autowired
    ClientService clientService;
    @Autowired
    VoitureService voitureService;


    @GetMapping("/marque")
    public Iterable<MarqueEntity>getAllMarque(){
        return marqueService.getAllMarque();
    }

    @GetMapping("/adresse")
    public Iterable<AdresseEntity>getAllAdresse(){ return this.adresseService.getAllAdresse(); }

    @GetMapping("/concessionaire")
    public Iterable<ConcessionaireEntity>getAllConcessionaire(){ return this.concessionaireService.getAllConcessionaire(); }

    @GetMapping("/client")
    public Iterable<ClientEntity>getAllCLient(){ return  this.clientService.getAllClient(); }

    @GetMapping("/voiture")
    public Iterable<VoitureEntity>getAllVoiture(){ return this.voitureService.getAllVoiture(); }

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
