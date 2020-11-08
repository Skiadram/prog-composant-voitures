package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "marque")
public class MarqueEntity {

    @Id
    private int id_marque;
    private String nom;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_marque", referencedColumnName = "id_marque", updatable = false, insertable = false)
    private Set<VoitureEntity> listVoiture = new HashSet<VoitureEntity>();

    public MarqueEntity(){}

    public int getId_marque() {
        return id_marque;
    }

    public void setId_marque(int id_marque) {
        this.id_marque = id_marque;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Set<VoitureEntity> getListVoiture() {
        return listVoiture;
    }

    public void setListVoiture(Set<VoitureEntity> listVoiture) {
        this.listVoiture = listVoiture;
    }
}
