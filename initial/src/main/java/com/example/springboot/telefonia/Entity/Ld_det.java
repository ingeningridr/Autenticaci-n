package com.example.springboot.telefonia.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.Column;

import java.io.Serializable;

@Entity
public class Ld_det implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String ld_domain;
    private String ld_site;
    private String ld_loc;
    private String ld_qty_oh;
    private String ld_part;


    protected Ld_det() {
    }

    public Ld_det(String ld_domain, String ld_site, String ld_loc, String ld_qty_oh) {

        this.ld_domain = ld_domain;
        this.ld_site = ld_site;
        this.ld_loc = ld_loc;
        this.ld_qty_oh = ld_qty_oh;
    }

    @Override
    //This toString method print outs the Ld_det properties.
    public String toString() {
        return String.format("Ld_det[ld_domain=%d, ld_site='%s', ld_loc ='%s', ld_qty_oh ='%s']",
                ld_domain, ld_site, ld_loc, ld_qty_oh);
    }


    public String getLd_part() {
        return ld_part;
    }

    public void setLd_part(String ld_part) {
        this.ld_part = ld_part;
    }

    public String getLd_domain() {
        return ld_domain;
    }

    public void setLd_domain(String ld_domain) {
        this.ld_domain = ld_domain;
    }

    public String getLd_site() {
        return ld_site;
    }

    public void setLd_site(String ld_site) {
        this.ld_site = ld_site;
    }

    public String getLd_loc() {
        return ld_loc;
    }

    public void setLd_loc(String ld_loc) {
        this.ld_loc = ld_loc;
    }

    public String getLd_qty_oh() {
        return ld_qty_oh;
    }

    public void setLd_qty_oh(String ld_qty_oh) {
        this.ld_qty_oh = ld_qty_oh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



 }