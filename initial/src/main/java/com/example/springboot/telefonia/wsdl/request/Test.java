package com.example.springboot.telefonia.wsdl.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JacksonXmlRootElement(localName = "transaccion")
public class Test{

    @JacksonXmlProperty(localName = "USUARIO")
    private String usuario;
    @JacksonXmlProperty(localName = "CLAVE")
    private String clase;
}