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

    private JTextField txt_ruc;
    private JTextField txt_r_s;
    private JTextField txt_t_a;
    private JTextField txt_n_r_l;
    private JTextField txt_a_r_l;
    private JTextField txt_te;
    private JTextField txt_cor;
    private JTextField txt_di;
    private Utilidades utilidades;
    private JFrame frameGestionContable;

    public GestionContableProv(JTextField txt_ruc, JTextField txt_r_s, JTextField txt_t_a, JTextField txt_n_r_l, JTextField txt_a_r_l, JTextField txt_te, JTextField txt_cor, JTextField txt_di, Utilidades utilidades, JFrame frameGestionContable) {
        this.txt_ruc = txt_ruc;
        this.txt_r_s = txt_r_s;
        this.txt_t_a = txt_t_a;
        this.txt_n_r_l = txt_n_r_l;
        this.txt_a_r_l = txt_a_r_l;
        this.txt_te = txt_te;
        this.txt_cor = txt_cor;
        this.txt_di = txt_di;
        this.utilidades = utilidades;
        this.frameGestionContable = frameGestionContable;
    }

    public JTextField getTxt_ruc() {
        return txt_ruc;
    }

    public void setTxt_ruc(JTextField txt_ruc) {
        this.txt_ruc = txt_ruc;
    }

    public JTextField getTxt_r_s() {
        return txt_r_s;
    }

    public void setTxt_r_s(JTextField txt_r_s) {
        this.txt_r_s = txt_r_s;
    }

    public JTextField getTxt_t_a() {
        return txt_t_a;
    }

    public void setTxt_t_a(JTextField txt_t_a) {
        this.txt_t_a = txt_t_a;
    }

    public JTextField getTxt_n_r_l() {
        return txt_n_r_l;
    }

    public void setTxt_n_r_l(JTextField txt_n_r_l) {
        this.txt_n_r_l = txt_n_r_l;
    }

    public JTextField getTxt_a_r_l() {
        return txt_a_r_l;
    }

    public void setTxt_a_r_l(JTextField txt_a_r_l) {
        this.txt_a_r_l = txt_a_r_l;
    }

    public JTextField getTxt_te() {
        return txt_te;
    }

    public void setTxt_te(JTextField txt_te) {
        this.txt_te = txt_te;
    }

    public JTextField getTxt_cor() {
        return txt_cor;
    }

    public void setTxt_cor(JTextField txt_cor) {
        this.txt_cor = txt_cor;
    }

    public JTextField getTxt_di() {
        return txt_di;
    }

    public void setTxt_di(JTextField txt_di) {
        this.txt_di = txt_di;
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
        txt_ruc.setText("");
        txt_r_s.setText("");
        txt_t_a.setText("");
        txt_n_r_l.setText("");
        txt_a_r_l.setText("");
        txt_te.setText("");
        txt_cor.setText("");
        txt_di.setText("");
    }

    public Persona_Prov guardarEditar() {
        if (txt_ruc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo ruc no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_ruc.requestFocus();
            return null;
        }
        if (txt_r_s.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo razón social no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_n_r_l.requestFocus();
            return null;
        }
        if (txt_t_a.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo tipo de actividad no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_n_r_l.requestFocus();
            return null;
        }
        if (txt_n_r_l.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Nombre de Representante Legal no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_n_r_l.requestFocus();
            return null;
        }
        if (txt_a_r_l.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo Apellido de Representante Legal no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_a_r_l.requestFocus();
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

        if (txt_cor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo correo no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_cor.requestFocus();
            return null;

        }
        if (!utilidades.checkEmail(txt_cor.getText())) {
            JOptionPane.showMessageDialog(frameGestionContable, "El correo ingresado no es válido", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_cor.requestFocus();
            return null;
        }
        if (txt_di.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo dirección no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_di.requestFocus();
            return null;
        }

        Persona_Prov persona = new Persona_Prov();
        persona.setRuc(txt_ruc.getText());
        persona.setRazon_social(txt_r_s.getText());
        persona.setTipo_actividad(txt_t_a.getText());
        persona.setNombre_representante(txt_n_r_l.getText());
        persona.setApellido_representante(txt_a_r_l.getText());
        persona.setTelefono(txt_te.getText());
        persona.setCorreo(txt_cor.getText());
        persona.setDireccion(txt_di.getText());
        return persona;
    }
}
