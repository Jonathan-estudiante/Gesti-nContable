/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.vistas;

import com.istloja.modelo.Persona_Prov;
import com.istloja.utilidad.Utilidades;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Personal
 */
public class GestionContableProv {

    private JTextField txt_co;
    private JTextField txt_no;
    private JTextField txt_ap;
    private JTextField txt_di;
    private JTextField txt_te;
    private JTextField txt_cr;
    private JTextField txt_se;
    private Utilidades utilidades;
    private JFrame frameGestionContable;

    public GestionContableProv(JTextField txt_co, JTextField txt_no, JTextField txt_ap, JTextField txt_di, JTextField txt_te, JTextField txt_cr, JTextField txt_se, Utilidades utilidades, JFrame frameGestionContable) {
        this.txt_co = txt_co;
        this.txt_no = txt_no;
        this.txt_ap = txt_ap;
        this.txt_di = txt_di;
        this.txt_te = txt_te;
        this.txt_cr = txt_cr;
        this.txt_se = txt_se;
        this.utilidades = utilidades;
        this.frameGestionContable = frameGestionContable;
    }

    public JTextField getTxt_co() {
        return txt_co;
    }

    public void setTxt_co(JTextField txt_co) {
        this.txt_co = txt_co;
    }

    public JTextField getTxt_no() {
        return txt_no;
    }

    public void setTxt_no(JTextField txt_no) {
        this.txt_no = txt_no;
    }

    public JTextField getTxt_ap() {
        return txt_ap;
    }

    public void setTxt_ap(JTextField txt_ap) {
        this.txt_ap = txt_ap;
    }

    public JTextField getTxt_di() {
        return txt_di;
    }

    public void setTxt_di(JTextField txt_di) {
        this.txt_di = txt_di;
    }

    public JTextField getTxt_te() {
        return txt_te;
    }

    public void setTxt_te(JTextField txt_te) {
        this.txt_te = txt_te;
    }

    public JTextField getTxt_cr() {
        return txt_cr;
    }

    public void setTxt_cr(JTextField txt_cr) {
        this.txt_cr = txt_cr;
    }

    public JTextField getTxt_se() {
        return txt_se;
    }

    public void setTxt_se(JTextField txt_se) {
        this.txt_se = txt_se;
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

    public void limpiarProv() {
        txt_co.setText("");
        txt_no.setText("");
        txt_ap.setText("");
        txt_di.setText("");
        txt_te.setText("");
        txt_cr.setText("");
        txt_se.setText("");
    }

    public Persona_Prov guardarEditar() {
        if (txt_co.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo código no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_co.requestFocus();
            return null;
        }
        if (txt_no.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo nombre no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_no.requestFocus();
            return null;
        }
        if (txt_ap.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo apellido no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_ap.requestFocus();
            return null;
        }
        if (txt_di.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo dirección no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_di.requestFocus();
            return null;
        }
        if (txt_te.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo teléfono no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_te.requestFocus();
            return null;
        }
        if (!utilidades.validarNumeros(txt_te.getText())) {
            JOptionPane.showMessageDialog(frameGestionContable, "Los datos ingresados en el teléfono no son validos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_te.requestFocus();
            return null;
        }

        if (txt_cr.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo correo no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_cr.requestFocus();
            return null;

        }
        if (!utilidades.checkEmail(txt_cr.getText())) {
            JOptionPane.showMessageDialog(frameGestionContable, "El correo ingresado no es válido", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_cr.requestFocus();
            return null;
        }
        if (txt_se.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo servicio no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_se.requestFocus();
            return null;

        }

        Persona_Prov persona = new Persona_Prov();
        persona.setCodigo(txt_co.getText());
        persona.setNombre(txt_no.getText());
        persona.setApellido(txt_ap.getText());
        persona.setDireccion(txt_di.getText());
        persona.setTelefono(txt_te.getText());
        persona.setCorreo(txt_cr.getText());
        persona.setServicio(txt_se.getText());
        return persona;
    }
}
