/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.controlador;

import com.istloja.conexion.BaseDatos;
import com.istloja.modelo.Inventario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Personal
 */
public class Inventariobd {

    PreparedStatement ps = null;
    //Interfaz de acceso a la base de datos
    Statement stm = null;
    //Conexion con la base de datos.
    Connection con = null;
    //Sentencia de JDBC para obtener valores de la base de datos.
    ResultSet rs = null;

    //Método para insertar, crear o guardar una persona**************************************************************************
    public boolean crearInventario(Inventario inventario) {
        boolean registrar = false;
        String sql = "INSERT INTO bdejercicio1.inventario (id_inventario, código_pro, descripcion, precios_compra, precio_venta, can_productos) VALUES('"
                + inventario.getId_inventario() + "', '" + inventario.getCódigo_pro() + "', '" + inventario.getDescripcion()
                + "', '" + inventario.getPrecios_compra() + "', '" + inventario.getPrecios_venta() + "', '" + inventario.getCan_productos() + "')";
        try {
            BaseDatos conexion = new BaseDatos();
            con = conexion.conexion();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" +"Aquiiiiiii"+ e.getMessage());
        }
        return registrar;
    }

    //Método traer a todas las personas******************************************************************************************
    public List<Inventario> obtenerInventario() {

        String sql = "SELECT * FROM bdejercicio1.inventario;";

        List<Inventario> listainventario = new ArrayList<>();

        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Inventario i = new Inventario();
                i.setId_inventario(rs.getInt(1));
                i.setCódigo_pro(rs.getString(2));
                i.setDescripcion(rs.getString(3));
                i.setPrecios_compra(rs.getString(4));
                i.setPrecios_venta(rs.getString(5));
                i.setCan_productos(rs.getString(6));
                listainventario.add(i);
            }
            stm.close();
            rs.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Error" + e.getMessage());

        }
        return listainventario;
    }
    //Método para actualizar, modificar o editar una persona***************************************************************

    public boolean actualizarInventario(Inventario inventario) {
        boolean registrar = false;

        String sql = "UPDATE inventario SET código_pro = '" + inventario.getCódigo_pro() + "', descripcion = '" + inventario.getDescripcion()
                + "',precios_compra = '" + inventario.getPrecios_compra() + "', precio_venta= '" + inventario.getPrecios_venta() + "', can_productos = '"
                + inventario.getCan_productos() + "'WHERE id_inventario ="
                + inventario.getId_inventario();
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
    public boolean eliminarInventario(Inventario inventario) {
        boolean registrar = false;

        String sql = "DELETE FROM inventario WHERE id_inventario=" + inventario.getId_inventario();
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

    public List<Inventario> getInventarioCodigo(String codigo) {

        List<Inventario> inventarioEncontradas = new ArrayList<>();
        String sql = "SELECT * FROM bdejercicio1.inventario WHERE código_pro LIKE \"%" + codigo + "%\"";
        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Inventario i = new Inventario();
                i.setId_inventario(rs.getInt(1));
                i.setCódigo_pro(rs.getString(2));
                i.setDescripcion(rs.getString(3));
                i.setPrecios_compra(rs.getString(4));
                i.setPrecios_venta(rs.getString(5));
                i.setCan_productos(rs.getString(6));
                inventarioEncontradas.add(i);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return inventarioEncontradas;
    }

    public List<Inventario> getInventarioDescripcion(String descripcion) {

        List<Inventario> inventarioEncontradas = new ArrayList<>();
        String sql = "SELECT * FROM bdejercicio1.inventario WHERE descripcion LIKE \"%" + descripcion + "%\"";
        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Inventario i = new Inventario();
                i.setId_inventario(rs.getInt(1));
                i.setCódigo_pro(rs.getString(2));
                i.setDescripcion(rs.getString(3));
                i.setPrecios_compra(rs.getString(4));
                i.setPrecios_venta(rs.getString(5));
                i.setCan_productos(rs.getString(6));
                inventarioEncontradas.add(i);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return inventarioEncontradas;
    }

    public List<Inventario> getInventarioPreciosCompra(String precios_compra) {

        List<Inventario> inventarioEncontradas = new ArrayList<>();
        String sql = "SELECT * FROM bdejercicio1.inventario WHERE precios_compra LIKE \"%" + precios_compra + "%\"";
        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Inventario i = new Inventario();
                i.setId_inventario(rs.getInt(1));
                i.setCódigo_pro(rs.getString(2));
                i.setDescripcion(rs.getString(3));
                i.setPrecios_compra(rs.getString(4));
                i.setPrecios_venta(rs.getString(5));
                i.setCan_productos(rs.getString(6));
                inventarioEncontradas.add(i);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return inventarioEncontradas;
    }

    public List<Inventario> getInventarioPreciosVentas(String precios_venta) {

        List<Inventario> inventarioEncontradas = new ArrayList<>();
        String sql = "SELECT * FROM bdejercicio1.inventario WHERE precio_venta LIKE \"%" + precios_venta + "%\"";
        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Inventario i = new Inventario();
                i.setId_inventario(rs.getInt(1));
                i.setCódigo_pro(rs.getString(2));
                i.setDescripcion(rs.getString(3));
                i.setPrecios_compra(rs.getString(4));
                i.setPrecios_venta(rs.getString(5));
                i.setCan_productos(rs.getString(6));
                inventarioEncontradas.add(i);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return inventarioEncontradas;
    }

    public List<Inventario> getInventarioCantidad(String cantidad) {

        List<Inventario> inventarioEncontradas = new ArrayList<>();
        String sql = "SELECT * FROM bdejercicio1.inventario WHERE can_productos LIKE \"%" + cantidad + "%\"";
        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Inventario i = new Inventario();
                i.setId_inventario(rs.getInt(1));
                i.setCódigo_pro(rs.getString(2));
                i.setDescripcion(rs.getString(3));
                i.setPrecios_compra(rs.getString(4));
                i.setPrecios_venta(rs.getString(5));
                i.setCan_productos(rs.getString(6));
                inventarioEncontradas.add(i);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return inventarioEncontradas;
    }
}
