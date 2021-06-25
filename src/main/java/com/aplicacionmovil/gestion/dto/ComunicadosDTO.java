package com.aplicacionmovil.gestion.dto;

import java.util.Date;

public class ComunicadosDTO {
    Integer codigo;
    String estado;
    String asunto;
    Date fechaSolicitada;
    Date fechaValidacion;
    String validadoPor;
    String referencia;

    public ComunicadosDTO() {
        super();
    }

    public ComunicadosDTO(Integer codigo, String estado, String asunto, Date fechaSolicitada, Date fechaValidacion, String validadoPor, String referencia) {
        this.codigo = codigo;
        this.estado = estado;
        this.asunto = asunto;
        this.fechaSolicitada = fechaSolicitada;
        this.fechaValidacion = fechaValidacion;
        this.validadoPor = validadoPor;
        this.referencia = referencia;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public Date getFechaSolicitada() {
        return fechaSolicitada;
    }

    public void setFechaSolicitada(Date fechaSolicitada) {
        this.fechaSolicitada = fechaSolicitada;
    }

    public Date getFechaValidacion() {
        return fechaValidacion;
    }

    public void setFechaValidacion(Date fechaValidacion) {
        this.fechaValidacion = fechaValidacion;
    }

    public String getValidadoPor() {
        return validadoPor;
    }

    public void setValidadoPor(String validadoPor) {
        this.validadoPor = validadoPor;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}
