package com.aplicacionmovil.gestion.dto;

public class DatosBancariosDTO {

    Integer codigo;
    String cccActual;
    String ibamActual;
    Integer valor_solicitado;
    String solicitud;

    public DatosBancariosDTO() {
        super();
    }

    public DatosBancariosDTO(Integer codigo, String cccActual, String ibamActual, Integer valor_solicitado, String solicitud) {
        this.codigo = codigo;
        this.cccActual = cccActual;
        this.ibamActual = ibamActual;
        this.valor_solicitado = valor_solicitado;
        this.solicitud = solicitud;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCccActual() {
        return cccActual;
    }

    public void setCccActual(String cccActual) {
        this.cccActual = cccActual;
    }

    public String getIbamActual() {
        return ibamActual;
    }

    public void setIbamActual(String ibamActual) {
        this.ibamActual = ibamActual;
    }

    public Integer getValor_solicitado() {
        return valor_solicitado;
    }

    public void setValor_solicitado(Integer valor_solicitado) {
        this.valor_solicitado = valor_solicitado;
    }

    public String getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(String solicitud) {
        this.solicitud = solicitud;
    }
}
