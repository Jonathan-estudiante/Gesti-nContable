package com.istloja.controlador;

import com.istloja.conexion.BaseDatos;
import com.istloja.modelo.Persona;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Lista {

    public List<Persona> obtenerPersona() {
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM bdejercicio1.persona;";

        List<Persona> listapersona = new ArrayList<Persona>();

        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona p = new Persona();
                p.setIdPersona(rs.getInt(1));
                p.setCedula(rs.getString(2));
                p.setNombres(rs.getString(3));
                p.setApellidos(rs.getString(4));
                p.setDireccion(rs.getString(5));
                p.setCorreo(rs.getString(6));
                p.setTelefono(rs.getString(7));
                listapersona.add(p);
            }
            stm.close();
            rs.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Error" + e.getMessage());
      
        }
        return listapersona;
    }
}
