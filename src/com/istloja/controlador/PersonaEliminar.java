/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class PersonaEliminar {
    
    public boolean eliminarPersona(Persona persona) {
        boolean registrar = false;

        Connection con = null;
        Statement stm = null;

        String sql = "DELETE FROM persona WHERE idpersona="+ String.valueOf(persona.getIdPersona());
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
