package com.istloja.controlador;

import com.istloja.conexion.BaseDatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import com.istloja.modelo.Tipo_de_Usuario;

public class Tipo_usuario_bd {

    PreparedStatement ps = null;
    //Interfaz de acceso a la base de datos
    Statement stm = null;
    //Conexion con la base de datos.
    Connection con = null;
    //Sentencia de JDBC para obtener valores de la base de datos.
    ResultSet rs = null;

//Método para insertar, crear o guardar una persona   
    public boolean crearPersona(Tipo_de_Usuario tdu) {
        boolean registrar = false;

        String sql = "INSERT INTO bdejercicio1.tipos_usuario (tipo_usuario_sistema, id_persona_sistema, contraseña) VALUES('"
                + String.valueOf(tdu.getTipo_usuario_sistema())
                + "', '" + tdu.getId_persona_sistema()
                + "', '" + tdu.getContraseña() + "')";
        try {
            BaseDatos conexion = new BaseDatos();
            con = conexion.conexion();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en guardar (Tipo_usuario_bd)" + e.getMessage());
        }
        return registrar;
    }
    //Método para actualizar, modificar o editar una persona

    public boolean actualizarPersona(Tipo_de_Usuario tdu) {
        boolean registrar = false;

        String sql = "UPDATE tipos_usuario SET tipo_usuario_sistema = '" + tdu.getTipo_usuario_sistema()
                + "', id_persona_sistema = '" + tdu.getId_persona_sistema()
                + "',contraseña = '" + tdu.getContraseña()
                + "'WHERE tipo_usuario =" + String.valueOf(tdu.getTipo_usuario());
        try {
            BaseDatos conexion = new BaseDatos();
            con = conexion.conexion();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en actualizar (Tipo_usuario_bd)" + e.getMessage());
        }
        return registrar;
    }

    //Método para quitar o eliminar una persona
    public boolean eliminarPersona(Tipo_de_Usuario tdu) {
        boolean registrar = false;

        String sql = "DELETE FROM tipos_usuario WHERE tipo_usuario=" + String.valueOf(tdu.getTipo_usuario());
        try {
            BaseDatos conexion = new BaseDatos();
            con = conexion.conexion();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en eliminar (Tipo_usuario_bd)" + e.getMessage());
        }
        return registrar;
    }
}
