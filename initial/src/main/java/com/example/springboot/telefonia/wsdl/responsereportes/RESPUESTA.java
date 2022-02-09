package com.example.springboot.telefonia.wsdl.responsereportes;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "RESPUESTA")
public class RESPUESTA {

    @JacksonXmlProperty(localName = "ERROR")
    public ERROR ERROR;
    @JacksonXmlProperty(localName = "REGISTROS")
    public REGISTROS REGISTROS;

    public com.example.springboot.telefonia.wsdl.responsereportes.ERROR getERROR() {
        return ERROR;
    }

    public void setERROR(com.example.springboot.telefonia.wsdl.responsereportes.ERROR ERROR) {
        this.ERROR = ERROR;
    }

    public com.example.springboot.telefonia.wsdl.responsereportes.REGISTROS getREGISTROS() {
        return REGISTROS;
    }

    public void setREGISTROS(com.example.springboot.telefonia.wsdl.responsereportes.REGISTROS REGISTROS) {
        this.REGISTROS = REGISTROS;
    }
}
