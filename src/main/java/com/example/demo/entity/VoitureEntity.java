package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class VoitureEntity {
    @Id
    private int id;
    private String marque;
    private String modele;

    public VoitureEntity(){}

}
