package com.istloja.vistas;

import com.istloja.controlador.Personabd;
import com.istloja.modelo.Persona;
import com.istloja.utilidad.Utilidades;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;

public class GestionPersonaV1 extends javax.swing.JFrame {

    private Utilidades utilidades;
    private Personabd controladorPersona;
    private Persona personaEditar;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public GestionPersonaV1() {
        super("VENTANA DE PERSONAS");
        initComponents();
        utilidades = new Utilidades();
        controladorPersona = new Personabd();

        limpiar();
    }

    void limpiar() {
        txt_cedula.setText("");
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_direccion.setText("");
        txt_correo.setText("");
        txt_telefono.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bt_guardar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        ultimo_registro = new javax.swing.JButton();
        txt_cedula = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        buscarcedula = new javax.swing.JButton();
        buscar_telefono = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        jLabel9.setText("jLabel9");

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("REGISTRO DE PERSONAS");

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText(" CÉDULA:");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText(" NOMBRES: ");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(204, 204, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText(" APELLIDOS: ");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        jLabel4.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(204, 204, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText(" DIRECCIÓN: ");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        jLabel6.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(204, 204, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText(" CORREO: ");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        jLabel7.setOpaque(true);

        jLabel8.setBackground(new java.awt.Color(204, 204, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText(" TELÉFONO: ");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        jLabel8.setOpaque(true);

        bt_guardar.setBackground(new java.awt.Color(204, 255, 255));
        bt_guardar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bt_guardar.setText("GUARDAR");
        bt_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guardarActionPerformed(evt);
            }
        });

        editar.setBackground(new java.awt.Color(204, 255, 255));
        editar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        editar.setText("EDITAR");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        eliminar.setBackground(new java.awt.Color(204, 255, 255));
        eliminar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        eliminar.setText("ELIMINAR");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        ultimo_registro.setBackground(new java.awt.Color(204, 255, 255));
        ultimo_registro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ultimo_registro.setText("ÚLTIMO REGISTRO");
        ultimo_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimo_registroActionPerformed(evt);
            }
        });

        txt_cedula.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txt_nombre.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txt_apellido.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txt_direccion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txt_correo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txt_telefono.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        buscarcedula.setBackground(new java.awt.Color(204, 255, 255));
        buscarcedula.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buscarcedula.setText("BUSCAR");
        buscarcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarcedulaActionPerformed(evt);
            }
        });

        buscar_telefono.setBackground(new java.awt.Color(204, 255, 255));
        buscar_telefono.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buscar_telefono.setText("BUSCAR");
        buscar_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_telefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(txt_correo)
                            .addComponent(txt_telefono)
                            .addComponent(txt_nombre)
                            .addComponent(txt_cedula)
                            .addComponent(txt_apellido))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buscarcedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buscar_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(bt_guardar)
                        .addGap(45, 45, 45)
                        .addComponent(editar)
                        .addGap(54, 54, 54)
                        .addComponent(eliminar)
                        .addGap(58, 58, 58)
                        .addComponent(ultimo_registro)))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cedula)
                    .addComponent(buscarcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editar)
                    .addComponent(eliminar)
                    .addComponent(ultimo_registro)
                    .addComponent(bt_guardar))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_guardarActionPerformed

        if (controladorPersona.BuscarCedula(txt_cedula.getText()) != null) {
            JOptionPane.showMessageDialog(rootPane, "La persona con ese número de cédula ya se encuentra registrada en el sistema.");
        } else {
            Persona personaGuardar = guardarEditar();
            if (personaGuardar != null) {
                if (controladorPersona.crearPersona(personaGuardar)) {
                    JOptionPane.showMessageDialog(rootPane, "Persona registrada en el sistema.");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se puede guardar la persona", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_bt_guardarActionPerformed

    private void ultimo_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimo_registroActionPerformed

        List<Persona> obtper = controladorPersona.obtenerPersona();
        Persona persona = obtper.get(obtper.size() - 1);
        System.out.println(persona);
        txt_cedula.setText(persona.getCedula());
        txt_nombre.setText(persona.getNombres());
        txt_apellido.setText(persona.getApellidos());
        txt_direccion.setText(persona.getDireccion());
        txt_correo.setText(persona.getCorreo());
        txt_telefono.setText(persona.getTelefono());

    }//GEN-LAST:event_ultimo_registroActionPerformed
    public Persona guardarEditar() {
        if (txt_cedula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo cédula no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_cedula.requestFocus();
            return null;
        }
        if (!utilidades.validadorDeCedula(txt_cedula.getText())) {
            JOptionPane.showMessageDialog(rootPane, "La cédula ingresada no es válida", "ERROR", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        if (txt_nombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo nombres no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_nombre.requestFocus();
            return null;
        }
        if (txt_apellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo apellidos no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_apellido.requestFocus();
            return null;
        }
        if (txt_direccion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo direccion no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_direccion.requestFocus();
            return null;
        }
        if (txt_correo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo correo no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_correo.requestFocus();
            return null;
        }
        if (!utilidades.checkEmail(txt_correo.getText())) {
            JOptionPane.showMessageDialog(rootPane, "El correo ingresado no es válido", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_correo.requestFocus();
            return null;
        }
        if (txt_telefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo teléfono no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_telefono.requestFocus();
            return null;

        }
        if (!utilidades.validarNumeros(txt_telefono.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Los datos ingresados en el telefono no son validos.", "ERROR", JOptionPane.ERROR_MESSAGE);
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
        return persona;
    }
    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        personaEditar = controladorPersona.BuscarCedula(txt_cedula.getText() );
        personaEditar = controladorPersona.BuscarPorTelefono(txt_telefono.getText() );
        if (personaEditar == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay una persona seleccionada para editar", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Persona personaEditarLocal = guardarEditar();
        if (personaEditarLocal != null ) {
            personaEditarLocal.setIdPersona(personaEditar.getIdPersona());
            if (controladorPersona.actualizarPersona(personaEditarLocal)) {
                JOptionPane.showMessageDialog(rootPane, "Persona editada con exito del sitema.");
                limpiar();
                personaEditar = null;
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se puede editar la persona", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_editarActionPerformed

    private void buscarcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarcedulaActionPerformed
        Persona persona = controladorPersona.BuscarCedula(txt_cedula.getText());
        if (persona != null ) {
            txt_cedula.setText(persona.getCedula());
            txt_nombre.setText(persona.getNombres());
            txt_apellido.setText(persona.getApellidos());
            txt_direccion.setText(persona.getDireccion());
            txt_correo.setText(persona.getCorreo());
            txt_telefono.setText(persona.getTelefono());

        } else {
            JOptionPane.showMessageDialog(rootPane, "No se encontró la persona con ese número de cédula", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_cedula.setText("");
            txt_cedula.requestFocus();

        }
    }//GEN-LAST:event_buscarcedulaActionPerformed

    private void buscar_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_telefonoActionPerformed
        Persona persona = controladorPersona.BuscarPorTelefono(txt_telefono.getText());
        if (persona != null) {
            txt_cedula.setText(persona.getCedula());
            txt_nombre.setText(persona.getNombres());
            txt_apellido.setText(persona.getApellidos());
            txt_direccion.setText(persona.getDireccion());
            txt_correo.setText(persona.getCorreo());
            txt_telefono.setText(persona.getTelefono());

        } else {
            JOptionPane.showMessageDialog(rootPane, "No se encontró la persona con es número de teléfono", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_telefono.setText("");
            txt_telefono.requestFocus();

        }
    }//GEN-LAST:event_buscar_telefonoActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        personaEditar = controladorPersona.BuscarCedula(txt_cedula.getText() );
        
        if (personaEditar == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay una persona seleccionada para eliminar", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (personaEditar != null) {
            personaEditar.setIdPersona(personaEditar.getIdPersona());
            if (controladorPersona.eliminarPersona(personaEditar)) {
                JOptionPane.showMessageDialog(rootPane, "Persona eliminada con exito del sitema.");
                limpiar();
                personaEditar = null;
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se puede eliminar a la persona", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_eliminarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionPersonaV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionPersonaV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionPersonaV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionPersonaV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionPersonaV1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_guardar;
    private javax.swing.JButton buscar_telefono;
    private javax.swing.JButton buscarcedula;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JButton ultimo_registro;
    // End of variables declaration//GEN-END:variables
}
