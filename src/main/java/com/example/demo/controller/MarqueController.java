package com.example.demo.controller;

import com.example.demo.entity.MarqueEntity;
import com.example.demo.services.marqueService.MarqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/marque")
    public MarqueEntity addMarque(@RequestBody MarqueEntity marqueEntity){
        return this.marqueService.addMarque(marqueEntity);
    }
}
