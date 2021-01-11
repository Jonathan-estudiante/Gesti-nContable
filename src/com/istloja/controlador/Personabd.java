package com.istloja.controlador;

import com.istloja.conexion.BaseDatos;
import com.istloja.modelo.Persona;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Personal
 */
public class Personabd {

    public boolean crearPersona(Persona persona) {
        boolean registrar = false;

        
        Connection con = null;
        Statement stm = null;

        String sql = "INSERT INTO persona (idpersona, cedula, nombres, apellidos, direccion, correo, telefono) VALUES('" + String.valueOf(persona.getIdPersona()) + "', '" + persona.getCedula() + "', '" + persona.getNombres() + "', '" + persona.getApellidos() + "', '" + persona.getDireccion() + "', '" + persona.getCorreo() + "','" + persona.getTelefono() + "')";
        try {
            BaseDatos conexion = new BaseDatos();
            con = conexion.conexion();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
            e.printStackTrace();
        }
        return registrar;
    }
}
