package fr.sparks.camille.kanban;

import javax.persistence.*;

@Entity
@Table(name = "COLONNE")
public class Colonne {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOM")
    private String nom;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
