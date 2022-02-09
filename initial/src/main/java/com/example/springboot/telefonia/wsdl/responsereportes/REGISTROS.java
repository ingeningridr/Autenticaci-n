package com.example.springboot.telefonia.wsdl.responsereportes;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "REGISTROS")
public class REGISTROS {

    @JacksonXmlProperty(localName = "REGISTRO")
    public String REGISTRO;

    public String getREGISTRO() {
        return REGISTRO;
    }

    public void setREGISTRO(String REGISTRO) {
        this.REGISTRO = REGISTRO;
    }
}
