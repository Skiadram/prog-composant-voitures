package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
public class AdresseEntity {
    @Id
    private int id_adresse;
    private String libelle;
    private int co_id;

    public AdresseEntity(){}

    public int getId_adresse() {
        return id_adresse;
    }

    public void setId_adresse(int id_adresse) {
        this.id_adresse = id_adresse;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getCo_id() {
        return co_id;
    }

    public void setCo_id(int co_id) {
        this.co_id = co_id;
    }
}
