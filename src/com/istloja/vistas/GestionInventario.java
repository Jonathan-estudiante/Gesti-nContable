package com.istloja.vistas;

import com.istloja.modelo.Inventario;
import com.istloja.modelo.Persona;
import com.istloja.utilidad.Utilidades;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GestionInventario {

    private JTextField text_co;
    private JTextField text_des;
    private JTextField text_pc;
    private JTextField text_pv;
    private JTextField text_can;
    private Utilidades utilidades;
    private JFrame frameGestionContable;

    public GestionInventario(JTextField text_co, JTextField text_des, JTextField text_pc, JTextField text_pv, JTextField text_can, Utilidades utilidades, JFrame frameGestionContable) {
        this.text_co = text_co;
        this.text_des = text_des;
        this.text_pc = text_pc;
        this.text_pv = text_pv;
        this.text_can = text_can;
        this.utilidades = utilidades;
        this.frameGestionContable = frameGestionContable;
    }

    public JTextField getText_co() {
        return text_co;
    }

    public void setText_co(JTextField text_co) {
        this.text_co = text_co;
    }

    public JTextField getText_des() {
        return text_des;
    }

    public void setText_des(JTextField text_des) {
        this.text_des = text_des;
    }

    public JTextField getText_pc() {
        return text_pc;
    }

    public void setText_pc(JTextField text_pc) {
        this.text_pc = text_pc;
    }

    public JTextField getText_pv() {
        return text_pv;
    }

    public void setText_pv(JTextField text_pv) {
        this.text_pv = text_pv;
    }

    public JTextField getText_can() {
        return text_can;
    }

    public void setText_can(JTextField text_can) {
        this.text_can = text_can;
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

    public void limpiarInventario() {
        text_co.setText("");
        text_des.setText("");
        text_pc.setText("");
        text_pv.setText("");
        text_can.setText("");
    }

    public Inventario guardarEditarInvenario() {
        if (text_co.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo código no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            text_co.requestFocus();
            return null;
        }
        if (!utilidades.validarCodigo(text_co.getText())) {
            JOptionPane.showMessageDialog(frameGestionContable, "El código ingresado no es válido", "ERROR", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        if (text_des.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo descripción no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            text_co.requestFocus();
            return null;
        }
        if (text_pc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo precion compra no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            text_co.requestFocus();
            return null;
        }
        if (text_pv.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo precio venta no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            text_co.requestFocus();
            return null;
        }
        if (text_can.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo cantidad no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            text_co.requestFocus();
            return null;
        }
        Inventario inventario = new Inventario();
        inventario.setCódigo_pro(text_co.getText());
        inventario.setDescripcion(text_des.getText());
        inventario.setPrecios_compra(text_pc.getText());
        inventario.setPrecios_venta(text_pv.getText());
        inventario.setCan_productos(text_can.getText());
        return inventario;
    }
}
