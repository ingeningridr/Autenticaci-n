package com.example.springboot.telefonia.wsdl.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;


@JacksonXmlRootElement(localName = "transaccion")
public class Transaction {

    @JacksonXmlProperty(localName = "USUARIO")
    private String usuario;
    @JacksonXmlProperty(localName = "CLAVE")
    private String clave;

    @JacksonXmlProperty(localName = "encabezado")
    private Encabezado encabezado;

    @JacksonXmlProperty(localName = "detalle")
    private Detalle detalle;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Encabezado getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(Encabezado encabezado) {
        this.encabezado = encabezado;
    }

    public Detalle getDetalle() {
        return detalle;
    }

    public void setDetalle(Detalle detalle) {
        this.detalle = detalle;
    }
}