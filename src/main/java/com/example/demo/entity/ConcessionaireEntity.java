package com.example.demo.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(exclude = "marques")

@NoArgsConstructor
@Entity
@Table(name = "concessionaire")
public class ConcessionaireEntity{
    @Id
    private int id_concessionaire;
    private String nom;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_concessionaire", referencedColumnName = "id_concessionaire", updatable = false, insertable = false)
    private Set<AdresseEntity> listAdresses = new HashSet<AdresseEntity>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "mar_co",
            joinColumns = @JoinColumn(name = "id_concessionaire", referencedColumnName = "id_concessionaire"),
            inverseJoinColumns = @JoinColumn(name = "id_marque", referencedColumnName = "id_marque"))
    private Set<MarqueEntity> marques;

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

    public Set<MarqueEntity> getListMarque() {
        return marques;
    }

    public void setListMarque(Set<MarqueEntity> marques) {
        this.marques = marques;
    }
}
