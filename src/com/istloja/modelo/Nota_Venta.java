package com.istloja.modelo;

import java.util.Date;

public class Nota_Venta {
  private int  id_nota_venta;
  private String numero_nota_ventas;
  private int persona_id_persona;
  private Date fecha_venta;
  private double sub_total;
  private double iva;
  private double total;
  private int tipo_pago;

    public Nota_Venta(int id_nota_venta, String numero_nota_ventas, int persona_id_persona, Date fecha_venta, double sub_total, double iva, double total, int tipo_pago) {
        this.id_nota_venta = id_nota_venta;
        this.numero_nota_ventas = numero_nota_ventas;
        this.persona_id_persona = persona_id_persona;
        this.fecha_venta = fecha_venta;
        this.sub_total = sub_total;
        this.iva = iva;
        this.total = total;
        this.tipo_pago = tipo_pago;
    }

    public int getId_nota_venta() {
        return id_nota_venta;
    }

    public void setId_nota_venta(int id_nota_venta) {
        this.id_nota_venta = id_nota_venta;
    }

    public String getNumero_nota_ventas() {
        return numero_nota_ventas;
    }

    public void setNumero_nota_ventas(String numero_nota_ventas) {
        this.numero_nota_ventas = numero_nota_ventas;
    }

    public int getPersona_id_persona() {
        return persona_id_persona;
    }

    public void setPersona_id_persona(int persona_id_persona) {
        this.persona_id_persona = persona_id_persona;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public double getSub_total() {
        return sub_total;
    }

    public void setSub_total(double sub_total) {
        this.sub_total = sub_total;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(int tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    @Override
    public String toString() {
        return "Nota_Venta{" + "id_nota_venta=" + id_nota_venta + ", numero_nota_ventas=" + numero_nota_ventas + ", persona_id_persona=" + persona_id_persona + ", fecha_venta=" + fecha_venta + ", sub_total=" + sub_total + ", iva=" + iva + ", total=" + total + ", tipo_pago=" + tipo_pago + '}';
    }
  
}
