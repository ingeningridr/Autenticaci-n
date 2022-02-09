package com.example.springboot.telefonia.wsdl.requesreportes;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "CONSULTADETALLEPROCESO")
public class CONSULTADETALLEPROCESO {
    @JacksonXmlProperty(localName = "TPRCODIGO")
    public String TPRCODIGO;
    @JacksonXmlProperty(localName = "CLICODIGO")
    public String CLICODIGO;
    @JacksonXmlProperty(localName = "PRCCODIGO")
    public String PRCCODIGO;
    @JacksonXmlProperty(localName = "DATOSTRX")
    public String DATOSTRX;

    public String getTPRCODIGO() {
        return TPRCODIGO;
    }

    public void setTPRCODIGO(String TPRCODIGO) {
        this.TPRCODIGO = TPRCODIGO;
    }

    public String getCLICODIGO() {
        return CLICODIGO;
    }

    public void setCLICODIGO(String CLICODIGO) {
        this.CLICODIGO = CLICODIGO;
    }

    public String getPRCCODIGO() {
        return PRCCODIGO;
    }

    public void setPRCCODIGO(String PRCCODIGO) {
        this.PRCCODIGO = PRCCODIGO;
    }

    public String getDATOSTRX() {
        return DATOSTRX;
    }

    public void setDATOSTRX(String DATOSTRX) {
        this.DATOSTRX = DATOSTRX;
    }
}
