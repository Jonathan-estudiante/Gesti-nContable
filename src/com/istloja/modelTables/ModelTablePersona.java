package com.istloja.modelTables;

import com.istloja.modelo.Persona;
import com.istloja.vistas.GestionContable;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModelTablePersona extends AbstractTableModel {

    //Arreglo con el nombre de las columnas
    public String[] m_colNames = {"CÉDULA", "NOMBRES", "APELLIDOS", "DIRECCIÓN", "CORREO", "TELÉFONO", "GÉNERO", "FECHA DE NACIMIENTO"};
    public List<Persona> personas;
    private final GestionContable gestionContable;

    public ModelTablePersona(List<Persona> personas, GestionContable gestionContable) {
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
        Persona persona = personas.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return persona.getCedula();
            case 1:
                return persona.getNombres();
            case 2:
                return persona.getApellidos();
            case 3:
                return persona.getDireccion();
            case 4:
                return persona.getCorreo();
            case 5:
                return persona.getTelefono();
            case 6:
                return persona.getGenero();
            case 7:
                return persona.getFechaNacimiento();
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
        gestionContable.clickPersona(personas.get(rowIndex));
        return super.isCellEditable(rowIndex, columnIndex);//To change body of generated methods, choose Tools | Templates.
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

}
