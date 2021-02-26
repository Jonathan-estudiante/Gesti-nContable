package com.istloja.modelo;

public class Inventario {
    private int id_inventario;
    private String código_pro;
    private String descripcion;
    private String precios_compra;
    private String precios_venta;
    private String can_productos;

   
    public int getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(int id_inventario) {
        this.id_inventario = id_inventario;
    }

    public String getCódigo_pro() {
        return código_pro;
    }

    public void setCódigo_pro(String código_pro) {
        this.código_pro = código_pro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecios_compra() {
        return precios_compra;
    }

    public void setPrecios_compra(String precios_compra) {
        this.precios_compra = precios_compra;
    }

    public String getPrecios_venta() {
        return precios_venta;
    }

    public void setPrecios_venta(String precios_venta) {
        this.precios_venta = precios_venta;
    }

    public String getCan_productos() {
        return can_productos;
    }

    public void setCan_productos(String can_productos) {
        this.can_productos = can_productos;
    }



    @Override
    public String toString() {
        return "Inventario{" + "id_inventario=" + id_inventario + ", c\u00f3digo_pro=" + código_pro + ", descripcion=" + descripcion + ", precios_compra=" + precios_compra + ", precios_venta=" + precios_venta + ", can_productos=" + can_productos + '}';
    }
    
}