package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Entity
public class ConcessionaireEntity {
    @Id
    private int id_concessionaire;
    private String nom;
    @OneToMany
    @JoinColumn(name = "co_id")
    private Set<AdresseEntity> listAdresses = new HashSet<AdresseEntity>();

    public int getId_concessionaire() {
        return id_concessionaire;
    }

    public void setId_concessionaire(int id_concessionaire) {
        this.id_concessionaire = id_concessionaire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Set<AdresseEntity> getListAdresses() {
        return listAdresses;
    }

    public void setListAdresses(Set<AdresseEntity> listAdresses) {
        this.listAdresses = listAdresses;
    }
}
