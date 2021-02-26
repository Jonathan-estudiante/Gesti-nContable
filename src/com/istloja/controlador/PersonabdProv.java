package com.istloja.controlador;

import com.istloja.conexion.BaseDatos;
import com.istloja.modelo.Persona_Prov;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PersonabdProv {

    PreparedStatement ps = null;
    //Interfaz de acceso a la base de datos
    Statement stm = null;
    //Conexion con la base de datos.
    Connection con = null;
    //Sentencia de JDBC para obtener valores de la base de datos.
    ResultSet rs = null;

//Método para insertar, crear o guardar una persona
    public boolean crearPersona(Persona_Prov persona_p) {
        boolean registrar = false;

        String sql = "INSERT INTO bdejercicio1.proveedores (idproveedores, codigo, nombre, apellido, direccion, telefono, correo, servicio) VALUES('"
                + String.valueOf(persona_p.getIdprov()) + "', '" + persona_p.getCodigo() + "', '" + persona_p.getNombre()
                + "', '" + persona_p.getApellido() + "', '" + persona_p.getDireccion() + "', '" + persona_p.getTelefono()
                + "','" + persona_p.getCorreo() + "','" + persona_p.getServicio() + "')";
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
    //Método para buscar y traer a un proveedor a partir de su codigo

    public Persona_Prov BuscarCodigo(String codigo) {

        Persona_Prov c = null;
        String sql = "SELECT * FROM bdejercicio1.proveedores WHERE codigo LIKE " + codigo + ";";
        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                c = new Persona_Prov();
                c.setIdprov(rs.getInt(1));
                c.setCodigo(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setTelefono(rs.getString(6));
                c.setCorreo(rs.getString(7));
                c.setServicio(rs.getString(8));
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return c;
    }

    public List<Persona_Prov> obtenerPersonap() {

        String sql = "SELECT * FROM bdejercicio1.proveedores;";

        List<Persona_Prov> listapersona = new ArrayList<>();

        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona_Prov p = new Persona_Prov();
                p.setIdprov(rs.getInt(1));
                p.setCodigo(rs.getString(2));
                p.setNombre(rs.getString(3));
                p.setApellido(rs.getString(4));
                p.setDireccion(rs.getString(5));
                p.setTelefono(rs.getString(6));
                p.setCorreo(rs.getString(7));
                p.setServicio(rs.getString(8));
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
    //Método para actualizar, modificar o editar una persona

    public boolean actualizarPersona(Persona_Prov persona) {
        boolean registrar = false;

        String sql = "UPDATE proveedores SET codigo = '" + persona.getCodigo() + "', nombre = '" + persona.getNombre()
                + "',apellido = '" + persona.getApellido() + "', direccion= '" + persona.getDireccion() + "', telefono = '"
                + persona.getTelefono() + "', correo = '" + persona.getCorreo() + "', servicio = '" + persona.getServicio()
                + "'WHERE idproveedores =" + String.valueOf(persona.getIdprov());
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
    public boolean eliminarPersona(Persona_Prov persona) {
        boolean registrar = false;

        String sql = "DELETE FROM proveedores WHERE idproveedores=" + String.valueOf(persona.getIdprov());
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

    public List<Persona_Prov> getProveedorCodigo(String codigo) {

        List<Persona_Prov> proveedoresEncontrados = new ArrayList<>();
        String sql = "SELECT * FROM bdejercicio1.proveedores WHERE codigo LIKE \"%" + codigo + "%\"";
        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona_Prov c = new Persona_Prov();
                c.setIdprov(rs.getInt(1));
                c.setCodigo(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setTelefono(rs.getString(6));
                c.setCorreo(rs.getString(7));
                c.setServicio(rs.getString(8));
                proveedoresEncontrados.add(c);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return proveedoresEncontrados;
    }

    public List<Persona_Prov> getProveedorNombre(String nombre) {

        List<Persona_Prov> proveedoresEncontrados = new ArrayList<>();
        String sql = "SELECT * FROM bdejercicio1.proveedores WHERE nombre LIKE \"%" + nombre + "%\"";
        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona_Prov c = new Persona_Prov();
                c.setIdprov(rs.getInt(1));
                c.setCodigo(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setTelefono(rs.getString(6));
                c.setCorreo(rs.getString(7));
                c.setServicio(rs.getString(8));
                proveedoresEncontrados.add(c);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return proveedoresEncontrados;
    }

    public List<Persona_Prov> getProveedorApellido(String apellido) {

        List<Persona_Prov> proveedoresEncontrados = new ArrayList<>();
        String sql = "SELECT * FROM bdejercicio1.proveedores WHERE apellido LIKE \"%" + apellido + "%\"";
        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona_Prov c = new Persona_Prov();
                c.setIdprov(rs.getInt(1));
                c.setCodigo(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setTelefono(rs.getString(6));
                c.setCorreo(rs.getString(7));
                c.setServicio(rs.getString(8));
                proveedoresEncontrados.add(c);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return proveedoresEncontrados;
    }

    public List<Persona_Prov> getProveedorDireccion(String direccion) {

        List<Persona_Prov> proveedoresEncontrados = new ArrayList<>();
        String sql = "SELECT * FROM bdejercicio1.proveedores WHERE direccion LIKE \"%" + direccion + "%\"";
        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona_Prov c = new Persona_Prov();
                c.setIdprov(rs.getInt(1));
                c.setCodigo(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setTelefono(rs.getString(6));
                c.setCorreo(rs.getString(7));
                c.setServicio(rs.getString(8));
                proveedoresEncontrados.add(c);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return proveedoresEncontrados;
    }

    public List<Persona_Prov> getProveedorTelefono(String telefono) {

        List<Persona_Prov> proveedoresEncontrados = new ArrayList<>();
        String sql = "SELECT * FROM bdejercicio1.proveedores WHERE telefono LIKE \"%" + telefono + "%\"";
        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona_Prov c = new Persona_Prov();
                c.setIdprov(rs.getInt(1));
                c.setCodigo(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setTelefono(rs.getString(6));
                c.setCorreo(rs.getString(7));
                c.setServicio(rs.getString(8));
                proveedoresEncontrados.add(c);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return proveedoresEncontrados;
    }

    public List<Persona_Prov> getProveedorCorreo(String correo) {

        List<Persona_Prov> proveedoresEncontrados = new ArrayList<>();
        String sql = "SELECT * FROM bdejercicio1.proveedores WHERE correo LIKE \"%" + correo + "%\"";
        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona_Prov c = new Persona_Prov();
                c.setIdprov(rs.getInt(1));
                c.setCodigo(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setTelefono(rs.getString(6));
                c.setCorreo(rs.getString(7));
                c.setServicio(rs.getString(8));
                proveedoresEncontrados.add(c);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return proveedoresEncontrados;
    }

    public List<Persona_Prov> getProveedorServicio(String servicio) {

        List<Persona_Prov> proveedoresEncontrados = new ArrayList<>();
        String sql = "SELECT * FROM bdejercicio1.proveedores WHERE servicio LIKE \"%" + servicio + "%\"";
        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona_Prov c = new Persona_Prov();
                c.setIdprov(rs.getInt(1));
                c.setCodigo(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setTelefono(rs.getString(6));
                c.setCorreo(rs.getString(7));
                c.setServicio(rs.getString(8));
                proveedoresEncontrados.add(c);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return proveedoresEncontrados;
    }
}
