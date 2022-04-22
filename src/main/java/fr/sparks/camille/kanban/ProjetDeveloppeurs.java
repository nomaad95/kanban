package fr.sparks.camille.kanban;

import javax.persistence.*;

@Entity
@Table(name = "PROJET_DEVELOPPEURS")
public class ProjetDeveloppeurs {
    @Column(name = "PROJETS_ID")
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long projetsId;

    @Column(name = "DEVELOPPEURS_ID")
    private Long developpeursId;

    public Long getProjetsId() {
        return this.projetsId;
    }

    public void setProjetsId(Long projetsId) {
        this.projetsId = projetsId;
    }

    public Long getDeveloppeursId() {
        return this.developpeursId;
    }

    public void setDeveloppeursId(Long developpeursId) {
        this.developpeursId = developpeursId;
    }
}
