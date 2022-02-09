package com.example.springboot.telefonia.wsdl.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;


@JacksonXmlRootElement(localName = "itemReferencia")
public class ItemReferencia {

    @JacksonXmlProperty(localName = "REFCodClasificacion")
    private String REFCodClasificacion;
    @JacksonXmlProperty(localName = "REFCodigo1")
    private String REFCodigo1;
    @JacksonXmlProperty(localName = "REFCodigo2")
    private String REFCodigo2;
    @JacksonXmlProperty(localName = "REFNombreCorto")
    private String REFNombreCorto;
    @JacksonXmlProperty(localName = "REFNombreLargo")
    private String REFNombreLargo;
    @JacksonXmlProperty(localName = "CARCodigo1")
    private String CARCodigo1;
    @JacksonXmlProperty(localName = "REFPrecioLista")
    private String REFPrecioLista;
    @JacksonXmlProperty(localName = "IRFBruto")
    private String IRFBruto;
    @JacksonXmlProperty(localName = "IRFDescuento")
    private String IRFDescuento;
    @JacksonXmlProperty(localName = "IRFPago")
    private String IRFPago;
    @JacksonXmlProperty(localName = "IRFCantidad")
    private String IRFCantidad;
    @JacksonXmlProperty(localName = "IRFValorImpuesto")
    private String IRFValorImpuesto;
    @JacksonXmlProperty(localName = "IRFImpuesto")
    private String IRFImpuesto;
    @JacksonXmlProperty(localName = "REFEsCombo")
    private String REFEsCombo;
    @JacksonXmlProperty(localName = "REFUltimoCosto")
    private String REFUltimoCosto;
    @JacksonXmlProperty(localName = "PRVCodigo")
    private String PRVCodigo;
    @JacksonXmlProperty(localName = "REFManejaLotes")
    private String REFManejaLotes;
    @JacksonXmlProperty(localName = "REFFactorConversion")
    private String REFFactorConversion;
    @JacksonXmlProperty(localName = "REFInventario")
    private String REFInventario;
    @JacksonXmlProperty(localName = "REFEsParaVenta")
    private String REFEsParaVenta;
    @JacksonXmlProperty(localName = "estado")
    private String estado;
    @JacksonXmlProperty(localName = "IRFPagNoVenta")
    private String IRFPagNoVenta;
    @JacksonXmlProperty(localName = "IRFVenta")
    private String IRFVenta;
    @JacksonXmlProperty(localName = "IRFValorImpuestoNeto")
    private String IRFValorImpuestoNeto;
    @JacksonXmlProperty(localName = "IRFComision")
    private String IRFComision;
    @JacksonXmlProperty(localName = "IRFNeto")
    private String IRFNeto;
    @JacksonXmlProperty(localName = "REFCodigoIngresado")
    private String REFCodigoIngresado;
    @JacksonXmlProperty(localName = "RREFPuntos")
    private String RREFPuntos;
    @JacksonXmlProperty(localName = "ICPPresentacion")
    private String ICPpresentacion;
    @JacksonXmlProperty(localName = "ICPDescripcion")
    private String ICPdescripcion;
    @JacksonXmlProperty(localName = "ICPCadena")
    private String ICPcadena;
    @JacksonXmlProperty(localName = "ICPLetra")
    private String ICPletra;

    public String getREFCodClasificacion() {
        return REFCodClasificacion;
    }

    public void setREFCodClasificacion(String REFCodClasificacion) {
        this.REFCodClasificacion = REFCodClasificacion;
    }

    public String getREFCodigo1() {
        return REFCodigo1;
    }

    public void setREFCodigo1(String REFCodigo1) {
        this.REFCodigo1 = REFCodigo1;
    }

    public String getREFCodigo2() {
        return REFCodigo2;
    }

    public void setREFCodigo2(String REFCodigo2) {
        this.REFCodigo2 = REFCodigo2;
    }

    public String getREFNombreCorto() {
        return REFNombreCorto;
    }

    public void setREFNombreCorto(String REFNombreCorto) {
        this.REFNombreCorto = REFNombreCorto;
    }

    public String getREFNombreLargo() {
        return REFNombreLargo;
    }

    public void setREFNombreLargo(String REFNombreLargo) {
        this.REFNombreLargo = REFNombreLargo;
    }

    public String getCARCodigo1() {
        return CARCodigo1;
    }

    public void setCARCodigo1(String CARCodigo1) {
        this.CARCodigo1 = CARCodigo1;
    }

    public String getREFPrecioLista() {
        return REFPrecioLista;
    }

    public void setREFPrecioLista(String REFPrecioLista) {
        this.REFPrecioLista = REFPrecioLista;
    }

    public String getIRFBruto() {
        return IRFBruto;
    }

    public void setIRFBruto(String IRFBruto) {
        this.IRFBruto = IRFBruto;
    }

    public String getIRFDescuento() {
        return IRFDescuento;
    }

    public void setIRFDescuento(String IRFDescuento) {
        this.IRFDescuento = IRFDescuento;
    }

    public String getIRFPago() {
        return IRFPago;
    }

    public void setIRFPago(String IRFPago) {
        this.IRFPago = IRFPago;
    }

    public String getIRFCantidad() {
        return IRFCantidad;
    }

    public void setIRFCantidad(String IRFCantidad) {
        this.IRFCantidad = IRFCantidad;
    }

    public String getIRFValorImpuesto() {
        return IRFValorImpuesto;
    }

    public void setIRFValorImpuesto(String IRFValorImpuesto) {
        this.IRFValorImpuesto = IRFValorImpuesto;
    }

    public String getIRFImpuesto() {
        return IRFImpuesto;
    }

    public void setIRFImpuesto(String IRFImpuesto) {
        this.IRFImpuesto = IRFImpuesto;
    }

    public String getREFEsCombo() {
        return REFEsCombo;
    }

    public void setREFEsCombo(String REFEsCombo) {
        this.REFEsCombo = REFEsCombo;
    }

    public String getREFUltimoCosto() {
        return REFUltimoCosto;
    }

    public void setREFUltimoCosto(String REFUltimoCosto) {
        this.REFUltimoCosto = REFUltimoCosto;
    }

    public String getPRVCodigo() {
        return PRVCodigo;
    }

    public void setPRVCodigo(String PRVCodigo) {
        this.PRVCodigo = PRVCodigo;
    }

    public String getREFManejaLotes() {
        return REFManejaLotes;
    }

    public void setREFManejaLotes(String REFManejaLotes) {
        this.REFManejaLotes = REFManejaLotes;
    }

    public String getREFFactorConversion() {
        return REFFactorConversion;
    }

    public void setREFFactorConversion(String REFFactorConversion) {
        this.REFFactorConversion = REFFactorConversion;
    }

    public String getREFInventario() {
        return REFInventario;
    }

    public void setREFInventario(String REFInventario) {
        this.REFInventario = REFInventario;
    }

    public String getREFEsParaVenta() {
        return REFEsParaVenta;
    }

    public void setREFEsParaVenta(String REFEsParaVenta) {
        this.REFEsParaVenta = REFEsParaVenta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIRFPagNoVenta() {
        return IRFPagNoVenta;
    }

    public void setIRFPagNoVenta(String IRFPagNoVenta) {
        this.IRFPagNoVenta = IRFPagNoVenta;
    }

    public String getIRFVenta() {
        return IRFVenta;
    }

    public void setIRFVenta(String IRFVenta) {
        this.IRFVenta = IRFVenta;
    }

    public String getIRFValorImpuestoNeto() {
        return IRFValorImpuestoNeto;
    }

    public void setIRFValorImpuestoNeto(String IRFValorImpuestoNeto) {
        this.IRFValorImpuestoNeto = IRFValorImpuestoNeto;
    }

    public String getIRFComision() {
        return IRFComision;
    }

    public void setIRFComision(String IRFComision) {
        this.IRFComision = IRFComision;
    }

    public String getIRFNeto() {
        return IRFNeto;
    }

    public void setIRFNeto(String IRFNeto) {
        this.IRFNeto = IRFNeto;
    }

    public String getREFCodigoIngresado() {
        return REFCodigoIngresado;
    }

    public void setREFCodigoIngresado(String REFCodigoIngresado) {
        this.REFCodigoIngresado = REFCodigoIngresado;
    }

    public String getRREFPuntos() {
        return RREFPuntos;
    }

    public void setRREFPuntos(String RREFPuntos) {
        this.RREFPuntos = RREFPuntos;
    }

    public String getICPpresentacion() {
        return ICPpresentacion;
    }

    public void setICPpresentacion(String ICPpresentacion) {
        this.ICPpresentacion = ICPpresentacion;
    }

    public String getICPdescripcion() {
        return ICPdescripcion;
    }

    public void setICPdescripcion(String ICPdescripcion) {
        this.ICPdescripcion = ICPdescripcion;
    }

    public String getICPcadena() {
        return ICPcadena;
    }

    public void setICPcadena(String ICPcadena) {
        this.ICPcadena = ICPcadena;
    }

    public String getICPletra() {
        return ICPletra;
    }

    public void setICPletra(String ICPletra) {
        this.ICPletra = ICPletra;
    }
}