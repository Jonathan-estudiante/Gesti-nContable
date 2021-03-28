package com.istloja.vistas;

import com.istloja.modelo.Inventario;
import com.istloja.utilidad.Utilidades;
import com.toedter.calendar.JDateChooser;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GestionInventario {

    private JTextField text_co;
    private JTextField text_can;
    private JTextField text_des;
    private JTextField text_pcsi;
    private JTextField text_pcci;
    private JTextField text_pm;
    private JTextField text_pcf;
    private JTextField text_pcn;
    private JDateChooser text_f_c;
    private Utilidades utilidades;
    private JFrame frameGestionContable;

    public GestionInventario(JTextField text_co, JTextField text_can, JTextField text_des, JTextField text_pcsi, JTextField text_pcci, JTextField text_pm, JTextField text_pcf, JTextField text_pcn, JDateChooser text_f_c, Utilidades utilidades, JFrame frameGestionContable) {
        this.text_co = text_co;
        this.text_can = text_can;
        this.text_des = text_des;
        this.text_pcsi = text_pcsi;
        this.text_pcci = text_pcci;
        this.text_pm = text_pm;
        this.text_pcf = text_pcf;
        this.text_pcn = text_pcn;
        this.text_f_c = text_f_c;
        this.utilidades = utilidades;
        this.frameGestionContable = frameGestionContable;
    }

    public JTextField getText_co() {
        return text_co;
    }

    public void setText_co(JTextField text_co) {
        this.text_co = text_co;
    }

    public JTextField getText_can() {
        return text_can;
    }

    public void setText_can(JTextField text_can) {
        this.text_can = text_can;
    }

    public JTextField getText_des() {
        return text_des;
    }

    public void setText_des(JTextField text_des) {
        this.text_des = text_des;
    }

    public JTextField getText_pcsi() {
        return text_pcsi;
    }

    public void setText_pcsi(JTextField text_pcsi) {
        this.text_pcsi = text_pcsi;
    }

    public JTextField getText_pcci() {
        return text_pcci;
    }

    public void setText_pcci(JTextField text_pcci) {
        this.text_pcci = text_pcci;
    }

    public JTextField getText_pm() {
        return text_pm;
    }

    public void setText_pm(JTextField text_pm) {
        this.text_pm = text_pm;
    }

    public JTextField getText_pcf() {
        return text_pcf;
    }

    public void setText_pcf(JTextField text_pcf) {
        this.text_pcf = text_pcf;
    }

    public JTextField getText_pcn() {
        return text_pcn;
    }

    public void setText_pcn(JTextField text_pcn) {
        this.text_pcn = text_pcn;
    }

    public JDateChooser getText_f_c() {
        return text_f_c;
    }

    public void setText_f_c(JDateChooser text_f_c) {
        this.text_f_c = text_f_c;
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
        text_can.setText("");
        text_des.setText("");
        text_pcsi.setText("");
        text_pcci.setText("");
        text_pm.setText("");
        text_pcf.setText("");
        text_pcn.setText("");
        text_f_c.setCalendar(null);
        
    }

    public Inventario guardarEditarInvenario(boolean isEditar) {
        if (text_co.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo código no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            text_co.requestFocus();
            return null;
        }
        if (text_can.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo cantidad no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            text_co.requestFocus();
            return null;
        }
        if (text_des.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo descripción no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            text_des.requestFocus();
            return null;
        }
        if (text_pcsi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo precio cliente sin iva no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            text_pcsi.requestFocus();
            return null;
        }
        if (text_pcci.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo precio cliente con iva no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            text_pcci.requestFocus();
            return null;
        }
        if (text_pm.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo precio venta no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            text_co.requestFocus();
            return null;
        }
        if (text_pcf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo precio venta no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            text_co.requestFocus();
            return null;
        }
        if (text_pcn.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo cantidad no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            text_co.requestFocus();
            return null;
        }
        Inventario inventario = new Inventario();
        inventario.setCodigo_pro(text_co.getText());
        inventario.setDescripcion(text_des.getText());
        inventario.setPrecios_compra_sin_iva(Double.parseDouble(text_pcsi.getText()));
        inventario.setPrecios_compra_con_iva(Double.parseDouble(text_pcci.getText()));
        inventario.setPrecio_mayorista(Double.parseDouble(text_pm.getText()));
        inventario.setPrecio_cliente_fijo(Double.parseDouble(text_pcf.getText()));
        inventario.setPrecio_cliente_normal(Double.parseDouble(text_pcn.getText()));
        inventario.setFecha_caducidad(new Date());
        if (isEditar) {
            inventario.setFecha_actualizacion(new Date());
        } else {
            inventario.setFecha_registro(new Date());
        }
        return inventario;
    }
}
