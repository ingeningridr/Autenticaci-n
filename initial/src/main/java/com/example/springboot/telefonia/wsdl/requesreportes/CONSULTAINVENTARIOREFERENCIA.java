package com.example.springboot.telefonia.wsdl.requesreportes;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "CONSULTAINVENTARIOREFERENCIA")
public class CONSULTAINVENTARIOREFERENCIA {
    @JacksonXmlProperty(localName = "REFCODIGO")
    public String REFCODIGO;
    @JacksonXmlProperty(localName = "ALMCODIGO")
    public String ALMCODIGO;

    public String getREFCODIGO() {
        return REFCODIGO;
    }

    public void setREFCODIGO(String REFCODIGO) {
        this.REFCODIGO = REFCODIGO;
    }

    public String getALMCODIGO() {
        return ALMCODIGO;
    }

    public void setALMCODIGO(String ALMCODIGO) {
        this.ALMCODIGO = ALMCODIGO;
    }
}
