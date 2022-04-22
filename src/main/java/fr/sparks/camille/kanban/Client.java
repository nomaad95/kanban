package fr.sparks.camille.kanban;

import javax.persistence.*;

@Entity
@Table(name = "CLIENT")
public class Client {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOM")
    private String nom;

    @Column(name = "VILLE_ID")
    private Long villeId;

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

    public Long getVilleId() {
        return this.villeId;
    }

    public void setVilleId(Long villeId) {
        this.villeId = villeId;
    }
}
