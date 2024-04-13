package org.example.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Table(name= "transport")
@Entity
public class Transport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;
    private String localisation;
    private Long nbDePlaces;
    @DateTimeFormat
    private Date durée;

    public Transport() {
    }

    public Transport(Integer id, String localisation, Long nbDePlaces, Date durée) {
        id = id;
        this.localisation = localisation;
        this.nbDePlaces = nbDePlaces;
        this.durée = durée;
    }

    public Integer getid() {
        return id;
    }

    public void setid(Integer tid) {
        id = tid;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public Long getNbDePlaces() {
        return nbDePlaces;
    }

    public void setNbDePlaces(Long nbDePlaces) {
        this.nbDePlaces = nbDePlaces;
    }

    public Date getDurée() {
        return durée;
    }

    public void setDurée(Date durée) {
        this.durée = durée;
    }
}
