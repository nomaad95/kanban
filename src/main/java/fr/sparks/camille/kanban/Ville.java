package fr.sparks.camille.kanban;

import javax.persistence.*;

@Entity
@Table(name = "VILLE")
public class Ville {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "CODE_INSEE")
    private String codeInsee;

    @Column(name = "CODE_POSTAL")
    private String codePostal;

    @Column(name = "COMPLEMENT")
    private String complement;

    @Column(name = "LATITUDE")
    private null latitude;

    @Column(name = "LONGITUDE")
    private null longitude;

    @Column(name = "NOM")
    private String nom;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeInsee() {
        return this.codeInsee;
    }

    public void setCodeInsee(String codeInsee) {
        this.codeInsee = codeInsee;
    }

    public String getCodePostal() {
        return this.codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getComplement() {
        return this.complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public null getLatitude() {
        return this.latitude;
    }

    public void setLatitude(null latitude) {
        this.latitude = latitude;
    }

    public null getLongitude() {
        return this.longitude;
    }

    public void setLongitude(null longitude) {
        this.longitude = longitude;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
