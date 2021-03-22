package com.istloja.modelo;

public class Tipo_de_Usuario {
    private int tipo_usuario;
    private int tipo_usuario_sistema;
    private int id_persona_sistema;
    private String contraseña;

    public Tipo_de_Usuario(int tipo_usuario, int tipo_usuario_sistema, int id_persona_sistema, String contraseña) {
        this.tipo_usuario = tipo_usuario;
        this.tipo_usuario_sistema = tipo_usuario_sistema;
        this.id_persona_sistema = id_persona_sistema;
        this.contraseña = contraseña;
    }

    public Tipo_de_Usuario() {
    }

    public int getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(int tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public int getTipo_usuario_sistema() {
        return tipo_usuario_sistema;
    }

    public void setTipo_usuario_sistema(int tipo_usuario_sistema) {
        this.tipo_usuario_sistema = tipo_usuario_sistema;
    }

    public int getId_persona_sistema() {
        return id_persona_sistema;
    }

    public void setId_persona_sistema(int id_persona_sistema) {
        this.id_persona_sistema = id_persona_sistema;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Tipo_de_Usuario{" + "tipo_usuario=" + tipo_usuario + ", tipo_usuario_sistema=" + tipo_usuario_sistema + ", id_persona_sistema=" + id_persona_sistema + ", contrase\u00f1a=" + contraseña + '}';
    }  
}
