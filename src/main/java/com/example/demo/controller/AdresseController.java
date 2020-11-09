package com.example.demo.controller;

import com.example.demo.entity.AdresseEntity;
import com.example.demo.services.adresseService.AdresseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Slice;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
@RequestMapping(path = "/api")
public class AdresseController {

    @Autowired
    AdresseService adresseService;

    @GetMapping("/adresse")
    public Iterable<AdresseEntity> getAllAdresseParam(@RequestParam(value = "id_adresse", required = false) List<String> id_adresse,
                                                   @RequestParam(value = "libelle", required = false)List<String> libelle,
                                                   @RequestParam(value = "id_concessionaire", required = false)List<String> id_concessionaire){
        return this.adresseService.getAllAdresseParam(id_adresse, libelle, id_concessionaire);
    }

    @GetMapping("/adresse/{id}")
    public Optional<AdresseEntity>getAdresseById(@PathVariable("id") int id){
    return this.adresseService.getAdresseById(id);
    }

    @PostMapping("/adresse")
    public AdresseEntity addAdresseById(@RequestBody AdresseEntity adresseEntity) {
        return this.adresseService.addAdresse(adresseEntity);
    }
}
