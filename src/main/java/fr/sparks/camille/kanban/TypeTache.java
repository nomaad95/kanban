package fr.sparks.camille.kanban;

import javax.persistence.*;

@Entity
@Table(name = "TYPE_TACHE")
public class TypeTache {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "COULEUR")
    private String couleur;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "NOM")
    private String nom;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCouleur() {
        return this.couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
