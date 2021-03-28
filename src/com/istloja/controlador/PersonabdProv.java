package com.istloja.controlador;

import com.istloja.conexion.BaseDatos;
import com.istloja.modelo.Persona_Prov;
import com.istloja.utilidad.Utilidades;
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
    Utilidades utilidades;

    public PersonabdProv() {
        utilidades = new Utilidades();
    }
//Método para insertar, crear o guardar una persona
    public boolean crearPersona(Persona_Prov persona_p) {
        boolean registrar = false;
        String sql;
        if (persona_p.getFecha_vencimiento_deuda() == null) {
            sql = "INSERT INTO `bdejercicio1`.`proveedores` (`id_proveedores`,`ruc`, `razon_social`, `tipo_actividad`, `nombre_representante_legal`, `apellido_representante_legal`, `telefono`, `correo`, `direccion`, `fecha_registro`) VALUES ('"
                    + String.valueOf(persona_p.getIdprov()) + "', '"
                    + persona_p.getRuc() + "', '"
                    + persona_p.getRazon_social() + "', '"
                    + persona_p.getTipo_actividad() + "', '"
                    + persona_p.getNombre_representante() + "', '"
                    + persona_p.getApellido_representante() + "','"
                    + persona_p.getTelefono() + "','"
                    + persona_p.getCorreo() + "','"
                    + persona_p.getDireccion() + "','"
                    + utilidades.formatoDate(persona_p.getFecha_registro()) + "');";
        } else {
            sql = "INSERT INTO `bdejercicio1`.`proveedores` (`id_proveedores`,`ruc`, `razon_social`, `tipo_actividad`, `nombre_representante_legal`, `apellido_representante_legal`, `telefono`, `correo`, `direccion`, `fecha_registro`,`fecha_vencimiento_deuda`) VALUES ('"
                    + String.valueOf(persona_p.getIdprov()) + "', '"
                    + persona_p.getRuc() + "', '"
                    + persona_p.getRazon_social() + "', '"
                    + persona_p.getTipo_actividad() + "', '"
                    + persona_p.getNombre_representante() + "', '"
                    + persona_p.getApellido_representante() + "','"
                    + persona_p.getTelefono() + "','"
                    + persona_p.getCorreo() + "','"
                    + persona_p.getDireccion() + "','"
                    + utilidades.formatoDate(persona_p.getFecha_registro()) + "','"
                    + utilidades.formatoDate(persona_p.getFecha_vencimiento_deuda()) + "');";
        }
        try {
            BaseDatos conexion = new BaseDatos();
            con = conexion.conexion();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en guardar (PersonabdProv)" + e.getMessage());
        }
        return registrar;
    }
    //Método para buscar y traer a un proveedor a partir de su codigo

    public Persona_Prov BuscarCodigo(String ruc) {

        Persona_Prov c = null;
        String sql = "SELECT * FROM bdejercicio1.proveedores WHERE ruc LIKE " + ruc + ";";
        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                c = new Persona_Prov();
                c.setIdprov(rs.getInt(1));
                c.setRuc(rs.getString(2));
                c.setRazon_social(rs.getString(3));
                c.setTipo_actividad(rs.getString(4));
                c.setNombre_representante(rs.getString(5));
                c.setApellido_representante(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setCorreo(rs.getString(8));
                c.setDireccion(rs.getString(9));
                c.setFecha_registro(rs.getDate(10));
                c.setFecha_actualización(rs.getDate(11));
                c.setFecha_vencimiento_deuda(rs.getDate(12));

            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al buscar el código:" + e.getMessage());
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
                p.setRuc(rs.getString(2));
                p.setRazon_social(rs.getString(3));
                p.setTipo_actividad(rs.getString(4));
                p.setNombre_representante(rs.getString(5));
                p.setApellido_representante(rs.getString(6));
                p.setTelefono(rs.getString(7));
                p.setCorreo(rs.getString(8));
                p.setDireccion(rs.getString(9));
                p.setFecha_registro(rs.getDate(10));
                p.setFecha_actualización(rs.getDate(11));
                p.setFecha_vencimiento_deuda(rs.getDate(12));
                listapersona.add(p);
            }
            stm.close();
            rs.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Error al mostrar" + e.getMessage());

        }
        return listapersona;
    }
    //Método para actualizar, modificar o editar una persona

    public boolean actualizarPersona(Persona_Prov persona) {
        boolean registrar = false;

        String sql = "UPDATE proveedores SET ruc = '" + persona.getRuc() 
                + "', razon_social = '" + persona.getRazon_social() 
                + "',tipo_actividad = '" + persona.getTipo_actividad() 
                + "', nombre_representante_legal= '" + persona.getNombre_representante() 
                + "', apellido_representante_legal = '" + persona.getApellido_representante() 
                + "', telefono = '" + persona.getTelefono() 
                + "', correo = '" + persona.getCorreo() 
                + "', direccion = '" + persona.getDireccion()
                + "', fecha_registro = '" + utilidades.formatoDate(persona.getFecha_registro())
                + "', fecha_actualizacion = '" + utilidades.formatoDate(persona.getFecha_actualización())
                + "', fecha_vencimiento_deuda = '" + utilidades.formatoDate(persona.getFecha_vencimiento_deuda())
                + "'WHERE id_proveedores =" + String.valueOf(persona.getIdprov());
        try {
            BaseDatos conexion = new BaseDatos();
            con = conexion.conexion();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en actualizar (PersonabdProv)" + e.getMessage());
        }
        return registrar;
    }

    //Método para quitar o eliminar una persona
    public boolean eliminarPersona(Persona_Prov persona) {
        boolean registrar = false;

        String sql = "DELETE FROM proveedores WHERE id_proveedores=" + String.valueOf(persona.getIdprov());
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

    public List<Persona_Prov> getProveedorCodigo(String ruc) {

        List<Persona_Prov> proveedoresEncontrados = new ArrayList<>();
        String sql = "SELECT * FROM bdejercicio1.proveedores WHERE ruc LIKE \"%" + ruc + "%\"";
        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona_Prov c = new Persona_Prov();
                c.setIdprov(rs.getInt(1));
                c.setRuc(rs.getString(2));
                c.setRazon_social(rs.getString(3));
                c.setTipo_actividad(rs.getString(4));
                c.setNombre_representante(rs.getString(5));
                c.setApellido_representante(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setCorreo(rs.getString(8));
                c.setDireccion(rs.getString(9));
                c.setFecha_registro(rs.getDate(10));
                c.setFecha_actualización(rs.getDate(11));
                c.setFecha_vencimiento_deuda(rs.getDate(12));
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
        String sql = "SELECT * FROM bdejercicio1.proveedores WHERE nombre_representante_legal LIKE \"%" + nombre + "%\"";
        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona_Prov c = new Persona_Prov();
                c.setIdprov(rs.getInt(1));
                c.setRuc(rs.getString(2));
                c.setRazon_social(rs.getString(3));
                c.setTipo_actividad(rs.getString(4));
                c.setNombre_representante(rs.getString(5));
                c.setApellido_representante(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setCorreo(rs.getString(8));
                c.setDireccion(rs.getString(9));
                c.setFecha_registro(rs.getDate(10));
                c.setFecha_actualización(rs.getDate(11));
                c.setFecha_vencimiento_deuda(rs.getDate(12));
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
        String sql = "SELECT * FROM bdejercicio1.proveedores WHERE apellido_representante_legal LIKE \"%" + apellido + "%\"";
        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona_Prov c = new Persona_Prov();
                c.setIdprov(rs.getInt(1));
                c.setRuc(rs.getString(2));
                c.setRazon_social(rs.getString(3));
                c.setTipo_actividad(rs.getString(4));
                c.setNombre_representante(rs.getString(5));
                c.setApellido_representante(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setCorreo(rs.getString(8));
                c.setDireccion(rs.getString(9));
                c.setFecha_registro(rs.getDate(10));
                c.setFecha_actualización(rs.getDate(11));
                c.setFecha_vencimiento_deuda(rs.getDate(12));
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
                c.setRuc(rs.getString(2));
                c.setRazon_social(rs.getString(3));
                c.setTipo_actividad(rs.getString(4));
                c.setNombre_representante(rs.getString(5));
                c.setApellido_representante(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setCorreo(rs.getString(8));
                c.setDireccion(rs.getString(9));
                c.setFecha_registro(rs.getDate(10));
                c.setFecha_actualización(rs.getDate(11));
                c.setFecha_vencimiento_deuda(rs.getDate(12));
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
                c.setRuc(rs.getString(2));
                c.setRazon_social(rs.getString(3));
                c.setTipo_actividad(rs.getString(4));
                c.setNombre_representante(rs.getString(5));
                c.setApellido_representante(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setCorreo(rs.getString(8));
                c.setDireccion(rs.getString(9));
                c.setFecha_registro(rs.getDate(10));
                c.setFecha_actualización(rs.getDate(11));
                c.setFecha_vencimiento_deuda(rs.getDate(12));
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
                c.setRuc(rs.getString(2));
                c.setRazon_social(rs.getString(3));
                c.setTipo_actividad(rs.getString(4));
                c.setNombre_representante(rs.getString(5));
                c.setApellido_representante(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setCorreo(rs.getString(8));
                c.setDireccion(rs.getString(9));
                c.setFecha_registro(rs.getDate(10));
                c.setFecha_actualización(rs.getDate(11));
                c.setFecha_vencimiento_deuda(rs.getDate(12));
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
        String sql = "SELECT * FROM bdejercicio1.proveedores WHERE razon_social LIKE \"%" + servicio + "%\"";
        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona_Prov c = new Persona_Prov();
                c.setIdprov(rs.getInt(1));
                c.setRuc(rs.getString(2));
                c.setRazon_social(rs.getString(3));
                c.setTipo_actividad(rs.getString(4));
                c.setNombre_representante(rs.getString(5));
                c.setApellido_representante(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setCorreo(rs.getString(8));
                c.setDireccion(rs.getString(9));
                c.setFecha_registro(rs.getDate(10));
                c.setFecha_actualización(rs.getDate(11));
                c.setFecha_vencimiento_deuda(rs.getDate(12));
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
