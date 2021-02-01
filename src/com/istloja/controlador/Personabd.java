package com.istloja.controlador;

import com.istloja.conexion.BaseDatos;
import com.istloja.modelo.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Personabd {

    PreparedStatement ps = null;
    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;

    public boolean crearPersona(Persona persona) {
        boolean registrar = false;

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

    public boolean actualizarPersona(Persona persona) {
        boolean registrar = false;

        String sql = "UPDATE persona SET cedula = '" + persona.getCedula() + "', nombres = '" + persona.getNombres() + "',apellidos = '" + persona.getApellidos() + "', direccion= '" + persona.getDireccion() + "', correo = '" + persona.getCorreo() + "', telefono = '" + persona.getTelefono() + "'WHERE idpersona =" + String.valueOf(persona.getIdPersona());
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

    public boolean eliminarPersona(Persona persona) {
        boolean registrar = false;

        String sql = "DELETE FROM persona WHERE idpersona=" + String.valueOf(persona.getIdPersona());
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

    public List<Persona> obtenerPersona() {

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

    public Persona BuscarCedula(String cedula) {

        Persona c = null;
        String sql = "SELECT * FROM bdejercicio1.persona WHERE cedula LIKE " + cedula + ";";
        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                c = new Persona();
                c.setIdPersona(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombres(rs.getString(3));
                c.setApellidos(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return c;
    }
        public Persona BuscarPorTelefono(String telefono) {
        Persona c = null;
        String sql = "SELECT * FROM bdejercicio1.persona WHERE telefono = " + telefono + ";";
        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                c = new Persona();
                c.setIdPersona(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombres(rs.getString(3));
                c.setApellidos(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return c;
    }
}
