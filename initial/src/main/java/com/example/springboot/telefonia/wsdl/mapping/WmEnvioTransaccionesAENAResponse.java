//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.01.19 a las 06:36:41 PM COT 
//


package com.example.springboot.telefonia.wsdl.mapping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wm_EnvioTransaccionesAENAResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "wmEnvioTransaccionesAENAResult"
})
@XmlRootElement(name = "wm_EnvioTransaccionesAENAResponse")
public class WmEnvioTransaccionesAENAResponse {

    @XmlElement(name = "wm_EnvioTransaccionesAENAResult")
    protected boolean wmEnvioTransaccionesAENAResult;

    /**
     * Obtiene el valor de la propiedad wmEnvioTransaccionesAENAResult.
     * 
     */
    public boolean isWmEnvioTransaccionesAENAResult() {
        return wmEnvioTransaccionesAENAResult;
    }

    /**
     * Define el valor de la propiedad wmEnvioTransaccionesAENAResult.
     * 
     */
    public void setWmEnvioTransaccionesAENAResult(boolean value) {
        this.wmEnvioTransaccionesAENAResult = value;
    }

}