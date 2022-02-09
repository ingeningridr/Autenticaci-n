package com.example.springboot.telefonia.wsdl.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;


@JacksonXmlRootElement(localName = "item")
public class Item extends ItemReferencia{

    @JacksonXmlProperty(isAttribute = true, localName = "Imprime")
    private Boolean imprime;
    @JacksonXmlProperty(isAttribute = true, localName = "Visible")
    private Boolean visible;
    @JacksonXmlProperty(isAttribute = true, localName = "Tipo")
    private String tipo;
    @JacksonXmlProperty(isAttribute = true, localName = "nitem")
    private String nitem;
    @JacksonXmlProperty(localName = "ICPPresentacion")
    private String ICPPresentacion;
    @JacksonXmlProperty(localName = "ICPPresentacion2")
    private String ICPPresentacion2;
    @JacksonXmlProperty(localName = "ICPDescripcion")
    private String ICPDescripcion;
    @JacksonXmlProperty(localName = "ICPCadena")
    private String ICPCadena;
    @JacksonXmlProperty(localName = "ICPLetra")
    private String Icpletra;

    public String getICPPresentacion() {
        return ICPPresentacion;
    }

    public void setICPPresentacion(String ICPPresentacion) {
        this.ICPPresentacion = ICPPresentacion;
    }

    public String getICPDescripcion() {
        return ICPDescripcion;
    }

    public void setICPDescripcion(String ICPDescripcion) {
        this.ICPDescripcion = ICPDescripcion;
    }

    public String getICPCadena() {
        return ICPCadena;
    }

    public void setICPCadena(String ICPCadena) {
        this.ICPCadena = ICPCadena;
    }

    public String getIcpletra() {
        return Icpletra;
    }

    public void setIcpletra(String icpletra) {
        Icpletra = icpletra;
    }

    public Boolean getImprime() {
        return imprime;
    }

    public void setImprime(Boolean imprime) {
        this.imprime = imprime;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNitem() {
        return nitem;
    }

    public void setNitem(String nitem) {
        this.nitem = nitem;
    }

    public String getICPPresentacion2() {
        return ICPPresentacion2;
    }

    public void setICPPresentacion2(String ICPPresentacion2) {
        this.ICPPresentacion2 = ICPPresentacion2;
    }
}