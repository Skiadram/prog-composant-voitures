package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class MarqueEntity {

    @Id
    private int id_marque;
    private String nom;

    public MarqueEntity(){}
}
