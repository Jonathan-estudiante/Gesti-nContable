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
    //Interfaz de acceso a la base de datos
    Statement stm = null;
    //Conexion con la base de datos.
    Connection con = null;
    //Sentencia de JDBC para obtener valores de la base de datos.
    ResultSet rs = null;

    //Método para insertar, crear o guardar una persona**************************************************************************
    public boolean crearPersona(Persona persona) {
        boolean registrar = false;
        String sql = "INSERT INTO persona (idpersona, cedula, nombres, apellidos, direccion, correo, telefono, fecha_registro, genero) VALUES('"
                + String.valueOf(persona.getIdPersona()) + "', '" + persona.getCedula() + "', '" + persona.getNombres()
                + "', '" + persona.getApellidos() + "', '" + persona.getDireccion() + "', '" + persona.getCorreo() + "','"
                + persona.getTelefono() + "', '" + persona.getFecha_registro()+ "', '" + persona.getGenero()+"')";
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
        }
        return registrar;
    }

    //Método traer a todas las personas******************************************************************************************
    public List<Persona> obtenerPersona() {

        String sql = "SELECT * FROM bdejercicio1.persona;";

        List<Persona> listapersona = new ArrayList<>();

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
                p.setFecha_registro(rs.getDate(8));
                p.setGenero(rs.getInt(9));
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

    //Método para actualizar, modificar o editar una persona***************************************************************
    public boolean actualizarPersona(Persona persona) {
        boolean registrar = false;

        String sql = "UPDATE persona SET cedula = '" + persona.getCedula() + "', nombres = '" + persona.getNombres()
                + "',apellidos = '" + persona.getApellidos() + "', direccion= '" + persona.getDireccion() + "', correo = '"
                + persona.getCorreo() + "', telefono = '" + persona.getTelefono() +"', fecha_registro = '" 
                + persona.getFecha_registro()+"', genero = '" + persona.getGenero()+ "'WHERE idpersona ="
                + String.valueOf(persona.getIdPersona());
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
        }
        return registrar;
    }

    //Método para quitar o eliminar una persona
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
        }
        return registrar;
    }
//MÉTODOS PARA BUSCAR

    public List<Persona> getPersonaCedula(String cedula) {

        List<Persona> personasEncontradas = new ArrayList<>();
        String sql = "SELECT * FROM bdejercicio1.persona WHERE cedula LIKE \"%" + cedula + "%\"";
        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona c = new Persona();
                c.setIdPersona(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombres(rs.getString(3));
                c.setApellidos(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setFecha_registro(rs.getDate(8));
                c.setGenero(rs.getInt(9));
                personasEncontradas.add(c);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return personasEncontradas;
    }

    public List<Persona> getPersonaNombre(String nombre) {

        List<Persona> personasEncontradas = new ArrayList<>();
        String sql = "SELECT * FROM bdejercicio1.persona WHERE nombres LIKE \"%" + nombre + "%\"";
        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona c = new Persona();
                c.setIdPersona(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombres(rs.getString(3));
                c.setApellidos(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setFecha_registro(rs.getDate(8));
                c.setGenero(rs.getInt(9));
                personasEncontradas.add(c);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return personasEncontradas;
    }

    public List<Persona> getPersonaApellido(String apellidos) {

        List<Persona> personasEncontradas = new ArrayList<>();
        String sql = "SELECT * FROM bdejercicio1.persona WHERE apellidos LIKE \"%" + apellidos + "%\"";
        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona c = new Persona();
                c.setIdPersona(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombres(rs.getString(3));
                c.setApellidos(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setFecha_registro(rs.getDate(8));
                c.setGenero(rs.getInt(9));
                personasEncontradas.add(c);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return personasEncontradas;
    }

    public List<Persona> getPersonaDireccion(String direccion) {

        List<Persona> personasEncontradas = new ArrayList<>();
        String sql = "SELECT * FROM bdejercicio1.persona WHERE direccion LIKE \"%" + direccion + "%\"";
        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona c = new Persona();
                c.setIdPersona(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombres(rs.getString(3));
                c.setApellidos(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setFecha_registro(rs.getDate(8));
                c.setGenero(rs.getInt(9));
                personasEncontradas.add(c);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return personasEncontradas;
    }

    public List<Persona> getPersonaCorreo(String correo) {
        
        List<Persona> personasEncontradas = new ArrayList<>();
        String sql = "SELECT * FROM bdejercicio1.persona WHERE correo LIKE \"%" + correo + "%\"";
        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona c = new Persona();
                c.setIdPersona(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombres(rs.getString(3));
                c.setApellidos(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setFecha_registro(rs.getDate(8));
                c.setGenero(rs.getInt(9));
                personasEncontradas.add(c);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return personasEncontradas;
    }

    public List<Persona> getPersonaTelefono(String telefono) {
        List<Persona> personasEncontradas = new ArrayList<>();
        String sql = "SELECT * FROM bdejercicio1.persona WHERE telefono LIKE \"%" + telefono + "%\"";
        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona c = new Persona();
                c.setIdPersona(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombres(rs.getString(3));
                c.setApellidos(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setFecha_registro(rs.getDate(8));
                c.setGenero(rs.getInt(9));
                personasEncontradas.add(c);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return personasEncontradas;
    }
//MÉTODOS PARA BUSCAR POR SEPARADO
    public Persona buscarCedula(String cedula) {
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
                c.setFecha_registro(rs.getDate(8));
                c.setGenero(rs.getInt(9));
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return c;
    }

    public Persona buscarTelefono(String telefono) {

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
                c.setFecha_registro(rs.getDate(8));
                c.setGenero(rs.getInt(9));
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
