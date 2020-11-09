package com.example.demo.controller;

import com.example.demo.entity.MarqueEntity;
import com.example.demo.services.marqueService.MarqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class MarqueController {

    @Autowired
    MarqueService marqueService;

    @GetMapping("/marque")
    public Iterable<MarqueEntity>getAllMarque(){
        return marqueService.getAllMarque();
    }

    @GetMapping("/marque/{id}")
    public Optional<MarqueEntity>getMarqueById(@PathVariable("id") int id){
        return this.marqueService.getMarqueById(id);
    }
}
