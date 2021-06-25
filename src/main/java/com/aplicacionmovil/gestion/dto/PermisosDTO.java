package com.aplicacionmovil.gestion.dto;

import java.util.Date;

public class PermisosDTO {
   Integer codigo;
   String estado;
   String respuesta;
   String observaciones;
   String tipoDePermiso;
   Date fechaDesde;
   Date hastaFecha;
   String referencia;

    public PermisosDTO() {
        super();
    }

    public PermisosDTO(Integer codigo, String estado, String respuesta, String observaciones, String tipoDePermiso, Date fechaDesde, Date hastaFecha, String referencia) {
        this.codigo = codigo;
        this.estado = estado;
        this.respuesta = respuesta;
        this.observaciones = observaciones;
        this.tipoDePermiso = tipoDePermiso;
        this.fechaDesde = fechaDesde;
        this.hastaFecha = hastaFecha;
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

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getTipoDePermiso() {
        return tipoDePermiso;
    }

    public void setTipoDePermiso(String tipoDePermiso) {
        this.tipoDePermiso = tipoDePermiso;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getHastaFecha() {
        return hastaFecha;
    }

    public void setHastaFecha(Date hastaFecha) {
        this.hastaFecha = hastaFecha;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}
