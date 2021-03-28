package com.istloja.modelo;

import java.util.Date;

public class Persona_Prov {
    private int idprov;
    private String ruc;
    private String razon_social;
    private String tipo_actividad;
    private String nombre_representante;
    private String apellido_representante;
    private String telefono;
    private String correo;
    private String direccion;
    private Date fecha_vencimiento_deuda;
    private Date fecha_registro;
    private Date fecha_actualización;

    public Persona_Prov(int idprov, String ruc, String razon_social, String tipo_actividad, String nombre_representante, String apellido_representante, String telefono, String correo, String direccion, Date fecha_vencimiento_deuda, Date fecha_registro, Date fecha_actualización) {
        this.idprov = idprov;
        this.ruc = ruc;
        this.razon_social = razon_social;
        this.tipo_actividad = tipo_actividad;
        this.nombre_representante = nombre_representante;
        this.apellido_representante = apellido_representante;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.fecha_vencimiento_deuda = fecha_vencimiento_deuda;
        this.fecha_registro = fecha_registro;
        this.fecha_actualización = fecha_actualización;
    }

    public Persona_Prov() {
    }

    public int getIdprov() {
        return idprov;
    }

    public void setIdprov(int idprov) {
        this.idprov = idprov;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getTipo_actividad() {
        return tipo_actividad;
    }

    public void setTipo_actividad(String tipo_actividad) {
        this.tipo_actividad = tipo_actividad;
    }

    public String getNombre_representante() {
        return nombre_representante;
    }

    public void setNombre_representante(String nombre_representante) {
        this.nombre_representante = nombre_representante;
    }

    public String getApellido_representante() {
        return apellido_representante;
    }

    public void setApellido_representante(String apellido_representante) {
        this.apellido_representante = apellido_representante;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFecha_vencimiento_deuda() {
        return fecha_vencimiento_deuda;
    }

    public void setFecha_vencimiento_deuda(Date fecha_vencimiento_deuda) {
        this.fecha_vencimiento_deuda = fecha_vencimiento_deuda;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public Date getFecha_actualización() {
        return fecha_actualización;
    }

    public void setFecha_actualización(Date fecha_actualización) {
        this.fecha_actualización = fecha_actualización;
    }

    @Override
    public String toString() {
        return "Persona_Prov{" + "idprov=" + idprov + ", ruc=" + ruc + ", razon_social=" + razon_social + ", tipo_actividad=" + tipo_actividad + ", nombre_representante=" + nombre_representante + ", apellido_representante=" + apellido_representante + ", telefono=" + telefono + ", correo=" + correo + ", direccion=" + direccion + ", fecha_vencimiento_deuda=" + fecha_vencimiento_deuda + ", fecha_registro=" + fecha_registro + ", fecha_actualizaci\u00f3n=" + fecha_actualización + '}';
    }

}
