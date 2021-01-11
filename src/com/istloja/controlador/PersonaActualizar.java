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
public class PersonaActualizar {
        public boolean actualizarPersona(Persona persona) {
        boolean registrar = false;

        
        Connection con = null;
        Statement stm = null;

        String sql = "UPDATE persona SET cedula = '" + persona.getCedula() + "', nombres = '" + persona.getNombres() + "',apellidos = '" + persona.getApellidos() + "', direccion= '" + persona.getDireccion() + "', correo = '" + persona.getCorreo() + "', telefono = '" + persona.getTelefono() + "'WHERE idpersona =" +String.valueOf(persona.getIdPersona());
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
