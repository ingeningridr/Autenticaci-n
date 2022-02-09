package com.example.springboot.telefonia.wsdl.responsereportes;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "ERROR")
public class ERROR {

    @JacksonXmlProperty(localName = "CODIGO")
    public int CODIGO;
    @JacksonXmlProperty(localName = "DESCRIPCION")
    public String DESCRIPCION;

    public int getCODIGO() {
        return CODIGO;
    }

    public void setCODIGO(int CODIGO) {
        this.CODIGO = CODIGO;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }
}
