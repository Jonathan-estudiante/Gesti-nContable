package com.istloja.modelTables;

import com.istloja.modelo.Nota_Venta;
import com.istloja.modelo.ProductoVenta;
import com.istloja.vistas.GestionContable;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModelTablaVenta extends AbstractTableModel{
    //Arreglo con el nombre de las columnas
    public String[] m_colNames = {"CANTIDAD", "DESCRIPCIÓN", "SUBTOTAL", "TOTAL"};
    public List<ProductoVenta> personas;
    private final GestionContable gestionContable;

    public ModelTablaVenta(List<ProductoVenta> personas, GestionContable gestionContable) {
        this.personas = personas;
        this.gestionContable = gestionContable;
    }
    //Determina el número de filas que tengo en mi tabla
    @Override
    public int getRowCount() {
        return personas.size();
    }

    //Determina el número de columnas que tengo en mi tabla
    @Override
    public int getColumnCount() {
        return m_colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ProductoVenta persona = personas.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                return persona.getCantidad();
            case 1:
                return persona.getDescripcion();
            case 2:
                return persona.getSubTotal();
            case 3:
                return persona.getTotal();
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
        gestionContable.clickProductoVender(personas.get(rowIndex));
        return super.isCellEditable(rowIndex, columnIndex);
    }

    public List<ProductoVenta> getPersonas() {
        return personas;
    }

    public void setPersonas(List<ProductoVenta> persona) {
        this.personas = persona;
    }
}
