package com.gustavo.Entity;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 *
 * @author Gustavo
 */
public class Moeda {
    @Id
    private Long id;

    @Column(name = "moeda")
    private String moeda;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }
    
}
