package com.istloja.vistas;

import com.istloja.modelo.Persona;
import com.istloja.utilidad.Utilidades;
import com.toedter.calendar.JDateChooser;import java.util.Date;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GestiónPersona {

    private JTextField txt_cedula;
    private JTextField txt_nombre;
    private JTextField txt_apellido;
    private JTextField txt_direccion;
    private JTextField txt_correo;
    private JTextField txt_telefono;
    private JComboBox txt_genero;
    private JDateChooser JDateFechaNacimiento;
    private Utilidades utilidades;
    private JFrame frameGestionContable;

    public GestiónPersona(JTextField txt_cedula, JTextField txt_nombre, JTextField txt_apellido, JTextField txt_direccion, JTextField txt_correo, JTextField txt_telefono, JComboBox txt_genero, JDateChooser JDateFechaNacimiento, Utilidades utilidades, JFrame frameGestionContable) {
        this.txt_cedula = txt_cedula;
        this.txt_nombre = txt_nombre;
        this.txt_apellido = txt_apellido;
        this.txt_direccion = txt_direccion;
        this.txt_correo = txt_correo;
        this.txt_telefono = txt_telefono;
        this.txt_genero = txt_genero;
        this.JDateFechaNacimiento = JDateFechaNacimiento;
        this.utilidades = utilidades;
        this.frameGestionContable = frameGestionContable;
    }

    public JTextField getTxt_cedula() {
        return txt_cedula;
    }

    public void setTxt_cedula(JTextField txt_cedula) {
        this.txt_cedula = txt_cedula;
    }

    public JTextField getTxt_nombre() {
        return txt_nombre;
    }

    public void setTxt_nombre(JTextField txt_nombre) {
        this.txt_nombre = txt_nombre;
    }

    public JTextField getTxt_apellido() {
        return txt_apellido;
    }

    public void setTxt_apellido(JTextField txt_apellido) {
        this.txt_apellido = txt_apellido;
    }

    public JTextField getTxt_direccion() {
        return txt_direccion;
    }

    public void setTxt_direccion(JTextField txt_direccion) {
        this.txt_direccion = txt_direccion;
    }

    public JTextField getTxt_correo() {
        return txt_correo;
    }

    public void setTxt_correo(JTextField txt_correo) {
        this.txt_correo = txt_correo;
    }

    public JTextField getTxt_telefono() {
        return txt_telefono;
    }

    public void setTxt_telefono(JTextField txt_telefono) {
        this.txt_telefono = txt_telefono;
    }

    public JComboBox getTxt_genero() {
        return txt_genero;
    }

    public void setTxt_genero(JComboBox txt_genero) {
        this.txt_genero = txt_genero;
    }

    public JDateChooser getJDateFechaNacimiento() {
        return JDateFechaNacimiento;
    }

    public void setJDateFechaNacimiento(JDateChooser JDateFechaNacimiento) {
        this.JDateFechaNacimiento = JDateFechaNacimiento;
    }

    public Utilidades getUtilidades() {
        return utilidades;
    }

    public void setUtilidades(Utilidades utilidades) {
        this.utilidades = utilidades;
    }

    public JFrame getFrameGestionContable() {
        return frameGestionContable;
    }

    public void setFrameGestionContable(JFrame frameGestionContable) {
        this.frameGestionContable = frameGestionContable;
    }



    public void limpiar() {
        txt_cedula.setText("");
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_direccion.setText("");
        txt_correo.setText("");
        txt_telefono.setText("");
        txt_genero.setSelectedIndex(0);
        JDateFechaNacimiento.setCalendar(null);
    }

    public Persona guardarEditar(boolean isEditar) {
        if (txt_nombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo nombres no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_nombre.requestFocus();
            return null;
        }
        if (txt_apellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo apellidos no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_apellido.requestFocus();
            return null;
        }
        if (txt_direccion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo direccion no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_direccion.requestFocus();
            return null;
        }
        if (txt_correo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo correo no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_correo.requestFocus();
            return null;
        }
        if (!utilidades.checkEmail(txt_correo.getText())) {
            JOptionPane.showMessageDialog(frameGestionContable, "El correo ingresado no es válido", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_correo.requestFocus();
            return null;
        }
        if (txt_telefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo teléfono no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_telefono.requestFocus();
            return null;

        }
        if (!utilidades.validarNumeros(txt_telefono.getText())) {
            JOptionPane.showMessageDialog(frameGestionContable, "Los datos ingresados en el telefono no son validos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_telefono.requestFocus();
            return null;
        }

        Persona persona = new Persona();
        persona.setCedula(txt_cedula.getText());
        persona.setNombres(txt_nombre.getText());
        persona.setApellidos(txt_apellido.getText());
        persona.setDireccion(txt_direccion.getText());
        persona.setCorreo(txt_correo.getText());
        persona.setTelefono(txt_telefono.getText());
        persona.setGenero(txt_genero.getSelectedIndex());
        if (isEditar) {
            persona.setFechaActualizacion(new Date());
        } else {
            persona.setFecha_registro(new Date());
        }
        persona.setFechaNacimiento(new Date());
        return persona;
    }
}
