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
        String sql = "INSERT INTO bdejercicio1.inventario (id_inventario, código_pro, can_productos, descripcion, precio_compra_sin_iva, precio_compra_con_iva,precio_mayorista,precio_cliente_fijo,precio_cliente_normal,fecha_caducidad,fecha_registro, fecha_actualizacion) VALUES('"
                + inventario.getId_inventario() + "', '" + inventario.getCodigo_pro() + "', '" + inventario.getCan_productos()+ "', '" + inventario.getDescripcion()+ "', '" + inventario.getPrecios_compra_sin_iva()+ "', '" + inventario.getPrecios_compra_con_iva()+"', '"
                + inventario.getPrecio_mayorista()+ "', '" + inventario.getPrecio_cliente_fijo()+ "', '" + inventario.getPrecio_cliente_normal()+ "', '" + inventario.getFecha_caducidad()+"', '"+inventario.getFecha_registro()+ "', '" + inventario.getFecha_actualizacion()+  "')";
        try {
            BaseDatos conexion = new BaseDatos();
            con = conexion.conexion();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en crearIventario (Iventariobd)" + e.getMessage());
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
                i.setCodigo_pro(rs.getString(2));
                i.setCan_productos(rs.getInt(3));
                i.setDescripcion(rs.getString(4));
                i.setPrecios_compra_sin_iva(rs.getDouble(5));
                i.setPrecios_compra_con_iva(rs.getDouble(6));
                i.setPrecio_mayorista(rs.getDouble(7));
                i.setPrecio_cliente_fijo(rs.getDouble(8));
                i.setPrecio_cliente_normal(rs.getDouble(9));
                i.setFecha_caducidad(rs.getDate(10));
                i.setFecha_registro(rs.getDate(11));
                i.setFecha_actualizacion(rs.getDate(12));
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

        String sql = "UPDATE inventario SET código_pro = '" + inventario.getCodigo_pro() + "', can_productos = '" + inventario.getCan_productos()+ "',descripcion = '" + inventario.getDescripcion()
                + "', precio_compra_sin_iva= '" + inventario.getPrecios_compra_sin_iva()+ "', precio_compra_con_iva = '" + inventario.getPrecios_compra_con_iva()+ "', precio_mayorista = '"
                + inventario.getPrecio_mayorista()+ "', precio_cliente_fijo= '" + inventario.getPrecio_cliente_fijo()+ "', precio_cliente_normal = '" + inventario.getPrecio_cliente_normal()
                + "', fecha_caducidad = '" + inventario.getFecha_caducidad()+ "', fecha_registro= '" + inventario.getFecha_registro()+ "', fecha_actualizacion = '" 
                + inventario.getFecha_actualizacion()+ "'WHERE id_inventario =" + inventario.getId_inventario();
        try {
            BaseDatos conexion = new BaseDatos();
            con = conexion.conexion();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en actualizar (Inventariobd)" + e.getMessage());
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
                i.setCodigo_pro(rs.getString(2));
                i.setCan_productos(rs.getInt(3));
                i.setDescripcion(rs.getString(4));
                i.setPrecios_compra_sin_iva(rs.getDouble(5));
                i.setPrecios_compra_con_iva(rs.getDouble(6));
                i.setPrecio_mayorista(rs.getDouble(7));
                i.setPrecio_cliente_fijo(rs.getDouble(8));
                i.setPrecio_cliente_normal(rs.getDouble(9));
                i.setFecha_caducidad(rs.getDate(10));
                i.setFecha_registro(rs.getDate(11));
                i.setFecha_actualizacion(rs.getDate(12));
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
                i.setCodigo_pro(rs.getString(2));
                i.setCan_productos(rs.getInt(3));
                i.setDescripcion(rs.getString(4));
                i.setPrecios_compra_sin_iva(rs.getDouble(5));
                i.setPrecios_compra_con_iva(rs.getDouble(6));
                i.setPrecio_mayorista(rs.getDouble(7));
                i.setPrecio_cliente_fijo(rs.getDouble(8));
                i.setPrecio_cliente_normal(rs.getDouble(9));
                i.setFecha_caducidad(rs.getDate(10));
                i.setFecha_registro(rs.getDate(11));
                i.setFecha_actualizacion(rs.getDate(12));
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

    public List<Inventario> getInventarioPreciosComprasSinIva(String precios_compra_sin_iva) {

        List<Inventario> inventarioEncontradas = new ArrayList<>();
        String sql = "SELECT * FROM bdejercicio1.inventario WHERE precio_compra_sin_iva LIKE \"%" + precios_compra_sin_iva + "%\"";
        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Inventario i = new Inventario();
                i.setId_inventario(rs.getInt(1));
                i.setCodigo_pro(rs.getString(2));
                i.setCan_productos(rs.getInt(3));
                i.setDescripcion(rs.getString(4));
                i.setPrecios_compra_sin_iva(rs.getDouble(5));
                i.setPrecios_compra_con_iva(rs.getDouble(6));
                i.setPrecio_mayorista(rs.getDouble(7));
                i.setPrecio_cliente_fijo(rs.getDouble(8));
                i.setPrecio_cliente_normal(rs.getDouble(9));
                i.setFecha_caducidad(rs.getDate(10));
                i.setFecha_registro(rs.getDate(11));
                i.setFecha_actualizacion(rs.getDate(12));
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

    public List<Inventario> getInventarioPreciosComprasConIva(String precios_compra_con_iva) {

        List<Inventario> inventarioEncontradas = new ArrayList<>();
        String sql = "SELECT * FROM bdejercicio1.inventario WHERE precios_compra_con_iva LIKE \"%" + precios_compra_con_iva + "%\"";
        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Inventario i = new Inventario();
                i.setId_inventario(rs.getInt(1));
                i.setCodigo_pro(rs.getString(2));
                i.setCan_productos(rs.getInt(3));
                i.setDescripcion(rs.getString(4));
                i.setPrecios_compra_sin_iva(rs.getDouble(5));
                i.setPrecios_compra_con_iva(rs.getDouble(6));
                i.setPrecio_mayorista(rs.getDouble(7));
                i.setPrecio_cliente_fijo(rs.getDouble(8));
                i.setPrecio_cliente_normal(rs.getDouble(9));
                i.setFecha_caducidad(rs.getDate(10));
                i.setFecha_registro(rs.getDate(11));
                i.setFecha_actualizacion(rs.getDate(12));
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
                i.setCodigo_pro(rs.getString(2));
                i.setCan_productos(rs.getInt(3));
                i.setDescripcion(rs.getString(4));
                i.setPrecios_compra_sin_iva(rs.getDouble(5));
                i.setPrecios_compra_con_iva(rs.getDouble(6));
                i.setPrecio_mayorista(rs.getDouble(7));
                i.setPrecio_cliente_fijo(rs.getDouble(8));
                i.setPrecio_cliente_normal(rs.getDouble(9));
                i.setFecha_caducidad(rs.getDate(10));
                i.setFecha_registro(rs.getDate(11));
                i.setFecha_actualizacion(rs.getDate(12));
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
