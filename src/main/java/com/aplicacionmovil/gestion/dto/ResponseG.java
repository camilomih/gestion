package com.aplicacionmovil.gestion.dto;

public class ResponseG {

    private boolean success;
    private String mensaje;
    private Object object;

    public ResponseG() {
        super();
    }

    public ResponseG(boolean success, String mensaje, Object object) {
        this.success = success;
        this.mensaje = mensaje;
        this.object = object;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
