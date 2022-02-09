/**package com.example.springboot.telefonia.Entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class DateParams {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String dIni;
    private String dFin;
    private String service;
    private String dateParams;

    protected void DateParams() {

    }

    public void DateParams(String dIni, String dFin, String service) {

        this.dIni = dIni;
        this.dFin = dFin;
        this.service = service;

    }

    public String getDIni() {
        return dIni;
    }

    public void setDIni(String dIni) {
        this.dIni = dIni;
    }

    public String getDFini() {
        return dFin;
    }

    public void setDFin(String dFin) {
        this.dFin = dFin;
    }

    public String getService() {
        return service;
    }

}

*/