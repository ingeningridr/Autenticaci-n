package com.example.springboot.telefonia.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Column;

import java.io.Serializable;

@Entity
public class Pt_mstr implements Serializable {

    private static final long serialVersionUID = 1L;
  
    @Id   
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String id;
    private String pt_domain;
    private String pt_part;
    private String pt_desc1;
    private String pt_desc2;
    private String pt_status;
    private String pt_article;
  
  protected Pt_mstr() {}

public Pt_mstr(String pt_domain, String pt_part, String pt_desc1, String pt_desc2, String pt_status, 
String pt_article) {

  this.pt_domain = pt_domain;
  this.pt_part = pt_part;
  this.pt_desc1 = pt_desc1;
  this.pt_desc2 = pt_desc2;
  this.pt_status = pt_status;
  this.pt_article = pt_article;
}

@Override
public String toString(){
  return String.format("Pt_mstr[pt_domain='%s', pt_part='%s', pt_desc1 ='%s', pt_desc2 ='%s',pt_status = '%s',pt_article='%s']",
  pt_domain, pt_part, pt_desc1, pt_desc2, pt_status, pt_article);
}

    public String getPt_domain(){
        return pt_domain;
    }

    public void setPt_domain(String pt_domain){
        this.pt_domain = pt_domain;
    } 

    public String getPt_part() {
        return pt_part;
    }
    
    public void setPt_part(String pt_part) {
        this.pt_part = pt_part;
    }
    
    public String getPt_desc1() {
        return pt_desc1;
    }
    
    public void setPt_desc1(String pt_desc1) {
        this.pt_desc1 = pt_desc1;
    }

    public String getPt_desc2() {
        return pt_desc2;
    }

    public void setPt_desc2(String pt_desc2) {
        this.pt_desc2 = pt_desc2;
    }

    public String getPt_status() {
        return pt_status;
    }
    public void setPt_status(String pt_status) {
        this.pt_status = pt_status;
    }
    public String getPt_article() {
        return pt_article;
    }
    public void setPt_article(String pt_article) {
        this.pt_article = pt_article;
    }

    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
  }