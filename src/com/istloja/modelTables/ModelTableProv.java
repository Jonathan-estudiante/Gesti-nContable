package com.istloja.modelTables;

import com.istloja.modelo.Persona_Prov;
import com.istloja.vistas.GestionContable;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModelTableProv extends AbstractTableModel {

    //Arreglo con el nombre de las columnas
    public String[] m_colNames = {"RUC", "RAZÓN SOCIAL","TIPO DE ACTIVIDAD", "NOMBRE REPRESENTANTE", "APELLIDO REPRESENTANTE", "TELEFONO", "CORREO", "DIRECCION"};
    public List<Persona_Prov> personas;

    private ComunicacionPersona comunicacionPersona;
    private GestionContable gestionContable;

    public ModelTableProv(List<Persona_Prov> personas, GestionContable gestionContable) {
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
        Persona_Prov persona = personas.get(rowIndex);
        switch (columnIndex) {

            case 0:
                return persona.getRuc();
            case 1:
                return persona.getRazon_social();
            case 2:
                return persona.getTipo_actividad();
            case 3:
                return persona.getNombre_representante();
            case 4:
                return persona.getApellido_representante();
            case 5:
                return persona.getTelefono();
            case 6:
                return persona.getCorreo();
            case 7:
                return persona.getDireccion();

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
        gestionContable.clickPersonap(personas.get(rowIndex));
        return super.isCellEditable(rowIndex, columnIndex);//To change body of generated methods, choose Tools | Templates.
    }

    public List<Persona_Prov> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona_Prov> personas) {
        this.personas = personas;
    }
}
