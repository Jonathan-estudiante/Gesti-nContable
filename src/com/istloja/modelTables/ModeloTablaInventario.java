/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.modelTables;

import com.istloja.modelo.Inventario;
import com.istloja.vistas.GestionContable;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaInventario extends AbstractTableModel{
    public String[] m_colNames = {"CÓDIGO", "DESCRIPCIÓN", "PRECIO COMPRA", "PRECIO VENTA", "CANTIDAD"};
    public List<Inventario> inventarios;
    private final GestionContable gestionContable;

    public ModeloTablaInventario(List<Inventario> inventarios, GestionContable gestionContable) {
        this.inventarios = inventarios;
        this.gestionContable = gestionContable;
    }

    //Determina el número de filas que tengo en mi tabla
    @Override
    public int getRowCount() {
        return inventarios.size();
    }

    //Determina el número de columnas que tengo en mi tabla
    @Override
    public int getColumnCount() {
        return m_colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Inventario inventario = inventarios.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return inventario.getCódigo_pro();
            case 1:
                return inventario.getDescripcion();
            case 2:
                return inventario.getPrecios_compra();
            case 3:
                return inventario.getPrecios_venta();
            case 4:
                return inventario.getCan_productos();

        }
        return new String();
    }

    //Este método sirve para definir los nombres de las columnas
    @Override
    public String getColumnName(int column) {
        return m_colNames[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        gestionContable.clickInventario(inventarios.get(rowIndex));
        return super.isCellEditable(rowIndex, columnIndex);//To change body of generated methods, choose Tools | Templates.
    }

    public List<Inventario> getPersonas() {
        return inventarios;
    }

    public void setPersonas(List<Inventario> personas) {
        this.inventarios = personas;
    }
}
