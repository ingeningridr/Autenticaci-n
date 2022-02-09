package com.example.springboot.telefonia.wsdl.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;


@JacksonXmlRootElement(localName = "encabezado")
public class Encabezado {

    @JacksonXmlProperty(localName = "ENCDescripcion")
    private String ENCDescripcion;
    @JacksonXmlProperty(localName = "GMVCodigo")
    private String GMVCodigo;
    @JacksonXmlProperty(localName = "MOVCodigo")
    private String MOVCodigo;
    @JacksonXmlProperty(localName = "movimiento")
    private String movimiento;
    @JacksonXmlProperty(localName = "USUCodigo")
    private String USUCodigo;
    @JacksonXmlProperty(localName = "CAJCodigo")
    private String CAJCodigo;
    @JacksonXmlProperty(localName = "IDEMP")
    private String IDEMP;
    @JacksonXmlProperty(localName = "ALMCodigo")
    private String ALMCodigo;
    @JacksonXmlProperty(localName = "ALMNombre")
    private String ALMNombre;
    @JacksonXmlProperty(localName = "MONCodigo")
    private String MONCodigo;
    @JacksonXmlProperty(localName = "ENCFechaTrx")
    private String ENCFechaTrx;
    @JacksonXmlProperty(localName = "ENCHoraTrx")
    private String ENCHoraTrx;
    @JacksonXmlProperty(localName = "ENCModo")
    private String ENCModo;
    @JacksonXmlProperty(localName = "ENCTipoProc")
    private String ENCTipoProc;
    @JacksonXmlProperty(localName = "ENCConsTrx")
    private String ENCConsTrx;
    @JacksonXmlProperty(localName = "ENCTasaConversion")
    private String ENCTasaConversion;
    @JacksonXmlProperty(localName = "ENCTotalReferencias")
    private String ENCTotalReferencias;
    @JacksonXmlProperty(localName = "ENCBruto")
    private String ENCBruto;
    @JacksonXmlProperty(localName = "ENCDescuento")
    private String ENCDescuento;
    @JacksonXmlProperty(localName = "ENCPagNoVenta")
    private String ENCPagNoVenta;
    @JacksonXmlProperty(localName = "ENCVenta")
    private String ENCVenta;
    @JacksonXmlProperty(localName = "ENCImpuestos")
    private String ENCImpuestos;
    @JacksonXmlProperty(localName = "ENCComision")
    private String ENCComision;
    @JacksonXmlProperty(localName = "ENCNeto")
    private String ENCNeto;
    @JacksonXmlProperty(localName = "ENCRecaudo")
    private String ENCRecaudo;
    @JacksonXmlProperty(localName = "ENCImpuestoAsumido")
    private String ENCImpuestoAsumido;
    @JacksonXmlProperty(localName = "ENCPuntos")
    private String ENCPuntos;
    @JacksonXmlProperty(localName = "ENCEstadoLinea")
    private String ENCEstadoLinea;
    @JacksonXmlProperty(localName = "ENCRespuesta")
    private String ENCRespuesta;
    @JacksonXmlProperty(localName = "ENCDescRespuesta")
    private String ENCDescRespuesta;

    public String getENCDescripcion() {

        return ENCDescripcion;
    }

    public void setENCDescripcion(String ENCDescripcion) {

        this.ENCDescripcion = ENCDescripcion;
    }

    public String getGMVCodigo() {
        return GMVCodigo;
    }

    public void setGMVCodigo(String GMVCodigo) {
        this.GMVCodigo = GMVCodigo;
    }

    public String getMOVCodigo() {
        return MOVCodigo;
    }

    public void setMOVCodigo(String MOVCodigo) {
        this.MOVCodigo = MOVCodigo;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    public String getUSUCodigo() {
        return USUCodigo;
    }

    public void setUSUCodigo(String USUCodigo) {
        this.USUCodigo = USUCodigo;
    }

    public String getCAJCodigo() {
        return CAJCodigo;
    }

    public void setCAJCodigo(String CAJCodigo) {
        this.CAJCodigo = CAJCodigo;
    }

    public String getIDEMP() {
        return IDEMP;
    }

    public void setIDEMP(String IDEMP) {
        this.IDEMP = IDEMP;
    }

    public String getALMCodigo() {
        return ALMCodigo;
    }

    public void setALMCodigo(String ALMCodigo) {
        this.ALMCodigo = ALMCodigo;
    }

    public String getALMNombre() {
        return ALMNombre;
    }

    public void setALMNombre(String ALMNombre) {
        this.ALMNombre = ALMNombre;
    }

    public String getMONCodigo() {
        return MONCodigo;
    }

    public void setMONCodigo(String MONCodigo) {
        this.MONCodigo = MONCodigo;
    }

    public String getENCFechaTrx() {
        return ENCFechaTrx;
    }

    public void setENCFechaTrx(String ENCFechaTrx) {
        this.ENCFechaTrx = ENCFechaTrx;
    }

    public String getENCHoraTrx() {
        return ENCHoraTrx;
    }

    public void setENCHoraTrx(String ENCHoraTrx) {
        this.ENCHoraTrx = ENCHoraTrx;
    }

    public String getENCModo() {
        return ENCModo;
    }

    public void setENCModo(String ENCModo) {
        this.ENCModo = ENCModo;
    }

    public String getENCTipoProc() {
        return ENCTipoProc;
    }

    public void setENCTipoProc(String ENCTipoProc) {
        this.ENCTipoProc = ENCTipoProc;
    }

    public String getENCConsTrx() {
        return ENCConsTrx;
    }

    public void setENCConsTrx(String ENCConsTrx) {
        this.ENCConsTrx = ENCConsTrx;
    }

    public String getENCTasaConversion() {
        return ENCTasaConversion;
    }

    public void setENCTasaConversion(String ENCTasaConversion) {
        this.ENCTasaConversion = ENCTasaConversion;
    }

    public String getENCTotalReferencias() {
        return ENCTotalReferencias;
    }

    public void setENCTotalReferencias(String ENCTotalReferencias) {
        this.ENCTotalReferencias = ENCTotalReferencias;
    }

    public String getENCBruto() {
        return ENCBruto;
    }

    public void setENCBruto(String ENCBruto) {
        this.ENCBruto = ENCBruto;
    }

    public String getENCDescuento() {
        return ENCDescuento;
    }

    public void setENCDescuento(String ENCDescuento) {
        this.ENCDescuento = ENCDescuento;
    }

    public String getENCPagNoVenta() {
        return ENCPagNoVenta;
    }

    public void setENCPagNoVenta(String ENCPagNoVenta) {
        this.ENCPagNoVenta = ENCPagNoVenta;
    }

    public String getENCVenta() {
        return ENCVenta;
    }

    public void setENCVenta(String ENCVenta) {
        this.ENCVenta = ENCVenta;
    }

    public String getENCImpuestos() {
        return ENCImpuestos;
    }

    public void setENCImpuestos(String ENCImpuestos) {
        this.ENCImpuestos = ENCImpuestos;
    }

    public String getENCComision() {
        return ENCComision;
    }

    public void setENCComision(String ENCComision) {
        this.ENCComision = ENCComision;
    }

    public String getENCNeto() {
        return ENCNeto;
    }

    public void setENCNeto(String ENCNeto) {
        this.ENCNeto = ENCNeto;
    }

    public String getENCRecaudo() {
        return ENCRecaudo;
    }

    public void setENCRecaudo(String ENCRecaudo) {
        this.ENCRecaudo = ENCRecaudo;
    }

    public String getENCImpuestoAsumido() {
        return ENCImpuestoAsumido;
    }

    public void setENCImpuestoAsumido(String ENCImpuestoAsumido) {
        this.ENCImpuestoAsumido = ENCImpuestoAsumido;
    }

    public String getENCPuntos() {
        return ENCPuntos;
    }

    public void setENCPuntos(String ENCPuntos) {
        this.ENCPuntos = ENCPuntos;
    }

    public String getENCEstadoLinea() {
        return ENCEstadoLinea;
    }

    public void setENCEstadoLinea(String ENCEstadoLinea) {
        this.ENCEstadoLinea = ENCEstadoLinea;
    }

    public String getENCRespuesta() {
        return ENCRespuesta;
    }

    public void setENCRespuesta(String ENCRespuesta) {
        this.ENCRespuesta = ENCRespuesta;
    }

    public String getENCDescRespuesta() {
        return ENCDescRespuesta;
    }

    public void setENCDescRespuesta(String ENCDescRespuesta) {
        this.ENCDescRespuesta = ENCDescRespuesta;
    }
}
    