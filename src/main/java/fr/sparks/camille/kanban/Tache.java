package fr.sparks.camille.kanban;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TACHE")
public class Tache {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "DATE_CREATION")
    private Date dateCreation;

    @Column(name = "INTITULE")
    private String intitule;

    @Column(name = "NB_HEURES_EFFECTIVES")
    private int nbHeuresEffectives;

    @Column(name = "NB_HEURES_PREVUES")
    private int nbHeuresPrevues;

    @Column(name = "COLONNE_ACTUELLE_ID")
    private Long colonneActuelleId;

    @Column(name = "DEVELOPPEUR_ID")
    private Long developpeurId;

    @Column(name = "PROJET_ID")
    private Long projetId;

    @Column(name = "TYPE_TACHE_ID")
    private Long typeTacheId;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateCreation() {
        return this.dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getIntitule() {
        return this.intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public int getNbHeuresEffectives() {
        return this.nbHeuresEffectives;
    }

    public void setNbHeuresEffectives(int nbHeuresEffectives) {
        this.nbHeuresEffectives = nbHeuresEffectives;
    }

    public int getNbHeuresPrevues() {
        return this.nbHeuresPrevues;
    }

    public void setNbHeuresPrevues(int nbHeuresPrevues) {
        this.nbHeuresPrevues = nbHeuresPrevues;
    }

    public Long getColonneActuelleId() {
        return this.colonneActuelleId;
    }

    public void setColonneActuelleId(Long colonneActuelleId) {
        this.colonneActuelleId = colonneActuelleId;
    }

    public Long getDeveloppeurId() {
        return this.developpeurId;
    }

    public void setDeveloppeurId(Long developpeurId) {
        this.developpeurId = developpeurId;
    }

    public Long getProjetId() {
        return this.projetId;
    }

    public void setProjetId(Long projetId) {
        this.projetId = projetId;
    }

    public Long getTypeTacheId() {
        return this.typeTacheId;
    }

    public void setTypeTacheId(Long typeTacheId) {
        this.typeTacheId = typeTacheId;
    }
}
