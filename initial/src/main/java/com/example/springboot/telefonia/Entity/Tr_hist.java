package com.example.springboot.telefonia.Entity;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;

import java.io.Serializable;

@Entity
public class Tr_hist implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id   
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String id;
    private String tr_domain;
    private String tr_part;
    private String tr_site;
    private String tr_loc;
    private Date tr_effdate;
    private String tr_qty_oh;
    private String tr_nbr;
    private String tr_tmbr;
 
    protected Tr_hist(){}

    public Tr_hist(String tr_domain, String tr_part, String tr_site, String tr_loc, Date tr_effdate, String tr_qty_oh, String tr_nbr, String  tr_tmbr) {
    
    this.tr_domain = tr_domain;
    this.tr_part = tr_part;
    this.tr_site = tr_site;
    this.tr_loc = tr_loc;
    this.tr_effdate = tr_effdate;
    this.tr_qty_oh = tr_qty_oh;
    this.tr_nbr = tr_nbr;
    this.tr_tmbr = tr_tmbr;
}

@Override
public String toString(){
  return String.format("Pt_mstr[tr_domain='%s', tr_part='%s', tr_site ='%s', tr_loc ='%s',tr_effdate = '%s, tr_qty_oh = '%s', tr_nbr = '%s', tr_tmbr='%s']",
  tr_domain, tr_part, tr_site, tr_loc, tr_effdate, tr_qty_oh, tr_nbr, tr_tmbr);
}

    public String getTr_domain(){
       return tr_domain;
    }

    public void setTr_domain(String tr_domain){
        this.tr_domain = tr_domain;
    } 

    public String getTr_part() {
        return tr_part;
    }
    
    public void setTr_part(String tr_part) {
        this.tr_part = tr_part;
    }
    
    public String getTr_site() {
        return tr_site;
    }
    
    public void setTr_site(String tr_site) {
        this.tr_site = tr_site;
    }

    public String getTr_loc() {
        return tr_loc;
    }

    public void setTr_loc(String tr_loc) {
        this.tr_loc = tr_loc;
    }

    public Date getTr_effdate() {
        return tr_effdate;
    }
    public void setTr_effdate(Date tr_effdate) {
        this.tr_effdate = tr_effdate;
    }
    public String getTr_qty_oh() {
        return tr_qty_oh;
    }
    public void setTr_qty_oh(String tr_qty_oh) {
        this.tr_qty_oh = tr_qty_oh;
    }

    public String getTr_nbr() {
        return tr_nbr;
    }
    public void setTr_nbr(String tr_nbr) {
        this.tr_nbr = tr_nbr;
    }
    
    public String getTr_tmbr() {
        return tr_tmbr;
    }
    public void setTr_tmbr(String tr_tmbr) {
        this.tr_tmbr = tr_tmbr;
    }

    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
   
}