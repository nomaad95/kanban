package fr.sparks.camille.kanban;

import javax.persistence.*;

@Entity
@Table(name = "PROJET")
public class Projet {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "CODE")
    private String code;

    @Column(name = "DATE_HEURE_CREATION")
    private null dateHeureCreation;

    @Column(name = "DATE_HEURE_LIVRAISON")
    private null dateHeureLivraison;

    @Column(name = "NOM")
    private String nom;

    @Column(name = "CLIENT_ID")
    private Long clientId;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public null getDateHeureCreation() {
        return this.dateHeureCreation;
    }

    public void setDateHeureCreation(null dateHeureCreation) {
        this.dateHeureCreation = dateHeureCreation;
    }

    public null getDateHeureLivraison() {
        return this.dateHeureLivraison;
    }

    public void setDateHeureLivraison(null dateHeureLivraison) {
        this.dateHeureLivraison = dateHeureLivraison;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getClientId() {
        return this.clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }
}
