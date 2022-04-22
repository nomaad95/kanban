package fr.sparks.camille.kanban;

import javax.persistence.*;

@Entity
@Table(name = "DEVELOPPEUR")
public class Developpeur {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "DATE_NAISSANCE")
    private java.sql.Date dateNaissance;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "NOM")
    private String nom;

    @Column(name = "PRENOM")
    private String prenom;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public java.sql.Date getDateNaissance() {
        return this.dateNaissance;
    }

    public void setDateNaissance(java.sql.Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
