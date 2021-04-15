package com.istloja.controlador;

import com.istloja.conexion.BaseDatos;
import com.istloja.modelo.Nota_Venta;
import com.istloja.utilidad.Utilidades;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Nota_Venta_bd {

    PreparedStatement ps = null;
    //Interfaz de acceso a la base de datos
    Statement stm = null;
    //Conexion con la base de datos.
    Connection con = null;
    //Sentencia de JDBC para obtener valores de la base de datos.
    ResultSet rs = null;

    Utilidades utilidades;

    public Nota_Venta_bd() {
        utilidades = new Utilidades();
    }

    //Método para insertar, crear o guardar una persona**************************************************************************
    public boolean crearPersona(Nota_Venta nota) {
        boolean registrar = false;
        String sql = "INSERT INTO `bdejercicio1`.`nota_venta` (`id_nota_venta`, `numero_nota_ventas`, `persona_id_persona`, `fecha_venta`, `cantidad`, `sub_total`, `iva`, `total`, `tipo_pago`) VALUES ('"
                + nota.getId_nota_venta() + "', '"
                + nota.getNumero_nota_ventas() + "', '"
                + nota.getPersona_id_persona() + "', '"
                + utilidades.formatoDateTime(nota.getFecha_venta()) + "', '"
                + nota.getCantidad() + "', '"
                + nota.getSub_total() + "', '"
                + nota.getIva() + "', '"
                + nota.getTotal() + "', '"
                + nota.getTipo_pago() + "');";

        try {
            BaseDatos conexion = new BaseDatos();
            con = conexion.conexion();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar (Personabd)" + e.getMessage());
        }
        return registrar;
    }
        public List<Nota_Venta> obtenerPersona() {

        String sql = "SELECT * FROM bdejercicio1.persona;";

        List<Nota_Venta> listapersona = new ArrayList<>();

        try {
            con = new BaseDatos().conexion();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Nota_Venta p = new Nota_Venta();
                p.setId_nota_venta(rs.getInt(1));
                p.setNumero_nota_ventas(rs.getString(2));
                p.setPersona_id_persona(rs.getInt(3));
                p.setFecha_venta(rs.getDate(4));
                p.setCantidad(rs.getInt(5));
                p.setSub_total(rs.getDouble(6));
                p.setIva(rs.getDouble(7));
                p.setTotal(rs.getDouble(8));
                p.setTipo_pago(rs.getInt(9));
                p.setDescripcion(rs.getString(10));
                listapersona.add(p);
            }
            stm.close();
            rs.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Error al mostrar " + e.getMessage());

        }
        return listapersona;
    }

}
