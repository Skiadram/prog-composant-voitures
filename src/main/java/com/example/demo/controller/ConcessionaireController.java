package com.example.demo.controller;

import com.example.demo.entity.ConcessionaireEntity;
import com.example.demo.services.concessionaireService.ConcessionaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class ConcessionaireController {

    @Autowired
    ConcessionaireService concessionaireService;

    @GetMapping("/concessionaire")
    public Iterable<ConcessionaireEntity>getAllConcessionaire(){ return this.concessionaireService.getAllConcessionaire(); }

    @GetMapping("/concessionaire/{co_id}")
    public Optional<ConcessionaireEntity> getConcessionaireById(@PathVariable("co_id")int co_id){
        return this.concessionaireService.getConcessionaireById(co_id);
    }
}