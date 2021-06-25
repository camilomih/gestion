package com.aplicacionmovil.gestion.dto;

import java.util.Date;

public class DatosPersonalesDTO {

    Integer identificación;
    String primerNombre;
    String segundoNombre;
    String primerApellido;
    String segundoApellido;
    String estadoCivil;
    String sexo;
    String telefono;
    String email;
    Date fechaNacimiento;

    public DatosPersonalesDTO() {
        super();
    }

    public DatosPersonalesDTO(Integer identificación, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String estadoCivil, String sexo, String telefono, String email, Date fechaNacimiento) {
        this.identificación = identificación;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.estadoCivil = estadoCivil;
        this.sexo = sexo;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getIdentificación() {
        return identificación;
    }

    public void setIdentificación(Integer identificación) {
        this.identificación = identificación;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
