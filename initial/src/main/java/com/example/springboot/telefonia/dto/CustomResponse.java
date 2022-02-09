package com.example.springboot.telefonia.dto;

public class CustomResponse {
    private String dIni;
    private String dFin;
    private String service;
    private String pt_domain;
    private String pt_part;
    private String pt_article;
    private String pt_desc1;
    private String pt_desc2;
    private String pt_status;
    private String e_ld_domain;
    private String e_ld_site;
    private String e_ld_loc;
    private String e_ld_qty_oh;

    public CustomResponse(String dIni, String dFin, String service, String pt_domain, String pt_part, String pt_article, String pt_desc1, String pt_desc2, String pt_status, String e_ld_domain, String e_ld_site, String e_ld_loc, String e_ld_qty_oh) {
        this.setDIni(dIni);
        this.setDFin(dFin);
        this.setService(service);
        this.setPt_domain(pt_domain);
        this.setPt_part(pt_part);
        this.setPt_article(pt_article);
        this.setPt_desc1(pt_desc1);
        this.setPt_desc2(pt_desc2);
        this.setPt_status(pt_status);
        this.setE_ld_domain(e_ld_domain);
        this.setE_ld_site(e_ld_site);
        this.setE_ld_loc(e_ld_loc);
        this.setE_ld_qty_oh(e_ld_qty_oh);
    }

    public String getDIni() {

        return dIni;
    }

    public void setDIni(String dIni) {

        this.dIni = dIni;
    }

    public String getDFin() {

        return dFin;
    }

    public void setDFin(String dFin) {

        this.dFin = dFin;
    }

    public String getService() {

        return service;
    }

    public void setService(String service) {

        this.service = service;
    }

    public String getPt_domain() {

        return pt_domain;
    }

    public void setPt_domain(String pt_domain) {

        this.pt_domain = pt_domain;
    }

    public String getPt_part() {

        return pt_part;
    }

    public void setPt_part(String pt_part) {

        this.pt_part = pt_part;
    }

    public String getPt_article() {

        return pt_article;
    }

    public void setPt_article(String pt_article) {

        this.pt_article = pt_article;
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

    public String getE_ld_domain() {

        return e_ld_domain;
    }

    public void setE_ld_domain(String e_ld_domain) {

        this.e_ld_domain = e_ld_domain;
    }

    public String getE_ld_site() {

        return e_ld_site;
    }

    public void setE_ld_site(String e_ld_site) {

        this.e_ld_site = e_ld_site;
    }

    public String getE_ld_loc() {

        return e_ld_loc;
    }

    public void setE_ld_loc(String e_ld_loc) {

        this.e_ld_loc = e_ld_loc;
    }

    public String getE_ld_qty_oh() {

        return e_ld_qty_oh;
    }

    public void setE_ld_qty_oh(String e_ld_qty_oh) {

        this.e_ld_qty_oh = e_ld_qty_oh;
    }

}