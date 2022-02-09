package com.example.springboot.telefonia.wsdl.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;


@JacksonXmlRootElement(localName = "detalle")
public class Detalle {

    @JacksonXmlProperty(localName = "items")
    private Items items;

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }
}
