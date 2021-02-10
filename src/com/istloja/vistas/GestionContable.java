package com.istloja.vistas;

import com.istloja.controlador.Personabd;
import com.istloja.modelTables.ModelTablePersona;
import com.istloja.modelo.Persona;
import com.istloja.utilidad.Utilidades;
import java.util.List;
import javax.swing.JOptionPane;

public class GestionContable extends javax.swing.JFrame {

    private Utilidades utilidades;
    private Personabd controladorPersona;
    private Persona personaEditar;
    private GestiónPersona gestionPersona;
    private ModelTablePersona modelTablePersona;

    public GestionContable() {
        super("VENTANA DE PERSONAS");
        controladorPersona = new Personabd();
        modelTablePersona = new ModelTablePersona(controladorPersona.obtenerPersona());
        initComponents();
        utilidades = new Utilidades();
        gestionPersona = new GestiónPersona(txt_cedula, txt_nombre, txt_apellido, txt_direccion, txt_correo, txt_telefono, utilidades, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jMenu1 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
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
        bucarPorCedula = new javax.swing.JButton();
        buscarPorTelefono = new javax.swing.JButton();
        btton_limpiar_registro = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuSalir = new javax.swing.JMenuItem();
        accionPersona = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        buscarTelefono = new javax.swing.JCheckBoxMenuItem();
        BuscarCedula = new javax.swing.JCheckBoxMenuItem();
        accionPersonaGuardar = new javax.swing.JCheckBoxMenuItem();
        accionPersonaEditar = new javax.swing.JRadioButtonMenuItem();
        accionPersonaEliminar = new javax.swing.JRadioButtonMenuItem();
        accionPersonaUltimoRegistro = new javax.swing.JRadioButtonMenuItem();
        accionPersonaLimpiar = new javax.swing.JRadioButtonMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        jLabel5.setText("jLabel5");

        jLabel9.setText("jLabel9");

        jLabel10.setText("jLabel10");

        jMenu1.setText("jMenu1");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("REGISTRO DE PERSONAS");

        jLabel2.setBackground(new java.awt.Color(102, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText(" CÉDULA:");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(102, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText(" NOMBRES: ");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(102, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText(" APELLIDOS: ");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jLabel4.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(102, 255, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText(" DIRECCIÓN: ");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jLabel6.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(102, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText(" CORREO: ");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jLabel7.setOpaque(true);

        jLabel8.setBackground(new java.awt.Color(102, 255, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText(" TELÉFONO: ");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jLabel8.setOpaque(true);

        bt_guardar.setBackground(new java.awt.Color(204, 255, 255));
        bt_guardar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bt_guardar.setText("GUARDAR");
        bt_guardar.setToolTipText("Botón guardar persona");
        bt_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guardarActionPerformed(evt);
            }
        });

        editar.setBackground(new java.awt.Color(204, 255, 255));
        editar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        editar.setText("EDITAR");
        editar.setToolTipText("Botón editar persona");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        eliminar.setBackground(new java.awt.Color(204, 255, 255));
        eliminar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        eliminar.setText("ELIMINAR");
        eliminar.setToolTipText("Botón elimianar persona");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        ultimo_registro.setBackground(new java.awt.Color(204, 255, 255));
        ultimo_registro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ultimo_registro.setText("ÚLTIMO REGISTRO");
        ultimo_registro.setToolTipText("Buscar ultimo registro");
        ultimo_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimo_registroActionPerformed(evt);
            }
        });

        txt_cedula.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_cedula.setToolTipText("Ingrese un número de cédula correcto");
        txt_cedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));

        txt_nombre.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_nombre.setToolTipText("Ingrese sus nombres");
        txt_nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));

        txt_apellido.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_apellido.setToolTipText("Ingrese sus apellidos");
        txt_apellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));

        txt_direccion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_direccion.setToolTipText("Ingrese su dirección");
        txt_direccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));

        txt_correo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_correo.setToolTipText("Ingrese su correo electrónico");
        txt_correo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));

        txt_telefono.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_telefono.setToolTipText("Ingrese su número de teléfono");
        txt_telefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));

        bucarPorCedula.setBackground(new java.awt.Color(204, 255, 255));
        bucarPorCedula.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bucarPorCedula.setText("BUSCAR");
        bucarPorCedula.setToolTipText("Buscar persona por cédula");
        bucarPorCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bucarPorCedulaActionPerformed(evt);
            }
        });

        buscarPorTelefono.setBackground(new java.awt.Color(204, 255, 255));
        buscarPorTelefono.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buscarPorTelefono.setText("BUSCAR");
        buscarPorTelefono.setToolTipText("Buscar persona por teléfono");
        buscarPorTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPorTelefonoActionPerformed(evt);
            }
        });

        btton_limpiar_registro.setBackground(new java.awt.Color(204, 255, 255));
        btton_limpiar_registro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btton_limpiar_registro.setText("LIMPIAR");
        btton_limpiar_registro.setToolTipText("Limpiar los campos de registro");
        btton_limpiar_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btton_limpiar_registroActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(102, 255, 255));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("BUSCAR PERSONA");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jLabel11.setOpaque(true);

        jComboBox1.setBackground(new java.awt.Color(204, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cédula", "Teléfono" }));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("BUSCAR");

        jPanel5.setBackground(new java.awt.Color(0, 255, 255));

        jTable1.setBackground(new java.awt.Color(0, 255, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTable1.setModel(modelTablePersona);
        jTable1.setToolTipText("Registros");
        jTable1.setAlignmentY(1.0F);
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(204, 255, 255));
        jTable1.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1230, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
        );

        jSeparator1.setBackground(new java.awt.Color(0, 255, 255));
        jSeparator1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_direccion)
                                    .addComponent(txt_correo)
                                    .addComponent(txt_telefono)
                                    .addComponent(txt_nombre)
                                    .addComponent(txt_cedula)
                                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bucarPorCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buscarPorTelefono))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bt_guardar)
                                .addGap(45, 45, 45)
                                .addComponent(editar)
                                .addGap(54, 54, 54)
                                .addComponent(eliminar)
                                .addGap(58, 58, 58)
                                .addComponent(ultimo_registro)
                                .addGap(59, 59, 59)
                                .addComponent(btton_limpiar_registro)))
                        .addGap(264, 264, 264))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(486, 486, 486))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cedula)
                    .addComponent(bucarPorCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
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
                    .addComponent(jLabel7)
                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarPorTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editar)
                    .addComponent(eliminar)
                    .addComponent(ultimo_registro)
                    .addComponent(bt_guardar)
                    .addComponent(btton_limpiar_registro))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        jTabbedPane1.addTab("Clientes", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1311, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 755, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Proveedores", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1311, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 755, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Inventario", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1311, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 755, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Venta", jPanel4);

        jMenuBar1.setBackground(new java.awt.Color(0, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255)));
        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        menuArchivo.setBackground(new java.awt.Color(0, 255, 255));
        menuArchivo.setText("Archivo");

        menuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuSalir);

        accionPersona.setText("Acciones Persona");

        jMenu6.setText("Buscar");

        buscarTelefono.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        buscarTelefono.setSelected(true);
        buscarTelefono.setText("Buscar Por Teléfono");
        buscarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarTelefonoActionPerformed(evt);
            }
        });
        jMenu6.add(buscarTelefono);

        BuscarCedula.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        BuscarCedula.setSelected(true);
        BuscarCedula.setText("Buscar Por Cédula");
        BuscarCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCedulaActionPerformed(evt);
            }
        });
        jMenu6.add(BuscarCedula);

        accionPersona.add(jMenu6);

        accionPersonaGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        accionPersonaGuardar.setSelected(true);
        accionPersonaGuardar.setText("Guardar");
        accionPersonaGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accionPersonaGuardarActionPerformed(evt);
            }
        });
        accionPersona.add(accionPersonaGuardar);

        accionPersonaEditar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        accionPersonaEditar.setSelected(true);
        accionPersonaEditar.setText("Editar");
        accionPersonaEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accionPersonaEditarActionPerformed(evt);
            }
        });
        accionPersona.add(accionPersonaEditar);

        accionPersonaEliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        accionPersonaEliminar.setSelected(true);
        accionPersonaEliminar.setText("Eliminar");
        accionPersonaEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accionPersonaEliminarActionPerformed(evt);
            }
        });
        accionPersona.add(accionPersonaEliminar);

        accionPersonaUltimoRegistro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        accionPersonaUltimoRegistro.setSelected(true);
        accionPersonaUltimoRegistro.setText("Último Registro");
        accionPersonaUltimoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accionPersonaUltimoRegistroActionPerformed(evt);
            }
        });
        accionPersona.add(accionPersonaUltimoRegistro);

        accionPersonaLimpiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        accionPersonaLimpiar.setSelected(true);
        accionPersonaLimpiar.setText("Limpiar Campos");
        accionPersonaLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accionPersonaLimpiarActionPerformed(evt);
            }
        });
        accionPersona.add(accionPersonaLimpiar);

        menuArchivo.add(accionPersona);

        jMenuBar1.add(menuArchivo);

        jMenu2.setBackground(new java.awt.Color(0, 255, 255));
        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

        jMenu5.setBackground(new java.awt.Color(0, 255, 255));
        jMenu5.setText("Acerca de");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //MÉTODOS*************************************************************************************************************************

    public void guardarPersona() {
        if (controladorPersona.BuscarCedula(txt_cedula.getText()) != null) {
            JOptionPane.showMessageDialog(rootPane, "La persona con ese número de cédula ya se encuentra registrada en el sistema.");
        } else {
            Persona personaGuardar = gestionPersona.guardarEditar();
            if (personaGuardar != null) {
                if (controladorPersona.crearPersona(personaGuardar)) {
                    JOptionPane.showMessageDialog(rootPane, "Persona registrada en el sistema.");
                    gestionPersona.limpiar();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se puede guardar la persona", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public void ultimaPersona() {
        List<Persona> obtper = controladorPersona.obtenerPersona();
        Persona persona = obtper.get(obtper.size() - 1);
        System.out.println(persona);
        txt_cedula.setText(persona.getCedula());
        txt_nombre.setText(persona.getNombres());
        txt_apellido.setText(persona.getApellidos());
        txt_direccion.setText(persona.getDireccion());
        txt_correo.setText(persona.getCorreo());
        txt_telefono.setText(persona.getTelefono());
    }

    public void editarPersona() {
        personaEditar = controladorPersona.BuscarCedula(txt_cedula.getText());
        personaEditar = controladorPersona.BuscarPorTelefono(txt_telefono.getText());
        if (personaEditar == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay una persona seleccionada para editar", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Persona personaEditarLocal = gestionPersona.guardarEditar();
        if (personaEditarLocal != null) {
            personaEditarLocal.setIdPersona(personaEditar.getIdPersona());
            if (controladorPersona.actualizarPersona(personaEditarLocal)) {
                JOptionPane.showMessageDialog(rootPane, "Persona editada con exito del sitema.");
                gestionPersona.limpiar();
                personaEditar = null;
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se puede editar la persona", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void buscarCedulaPersona() {
        if (txt_cedula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "No hay un número de cédula colocado para buscar", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_cedula.requestFocus();
        } else {
            Persona persona = controladorPersona.BuscarCedula(txt_cedula.getText());
            if (persona != null) {
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
        }
    }

    public void buscarTelefonoPersona() {

        if (txt_telefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "No hay un número de teléfono colocado para buscar", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_telefono.requestFocus();
        } else {
            Persona persona = controladorPersona.BuscarPorTelefono(txt_telefono.getText());
            if (persona != null) {
                txt_cedula.setText(persona.getCedula());
                txt_nombre.setText(persona.getNombres());
                txt_apellido.setText(persona.getApellidos());
                txt_direccion.setText(persona.getDireccion());
                txt_correo.setText(persona.getCorreo());
                txt_telefono.setText(persona.getTelefono());

            } else {
                JOptionPane.showMessageDialog(rootPane, "No se encontró la persona con ese número de teléfono", "ERROR", JOptionPane.ERROR_MESSAGE);
                txt_telefono.setText("");
                txt_telefono.requestFocus();

            }
        }
    }

    public void eliminarPersona() {
        personaEditar = controladorPersona.BuscarCedula(txt_cedula.getText());

        if (personaEditar == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay una persona seleccionada para eliminar", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (personaEditar != null) {
            personaEditar.setIdPersona(personaEditar.getIdPersona());
            if (controladorPersona.eliminarPersona(personaEditar)) {
                JOptionPane.showMessageDialog(rootPane, "Persona eliminada con exito del sitema.");
                gestionPersona.limpiar();
                personaEditar = null;
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se puede eliminar a la persona", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    //MENÚS************************************************************************
    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSalirActionPerformed

    private void accionPersonaUltimoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accionPersonaUltimoRegistroActionPerformed
        ultimaPersona();
    }//GEN-LAST:event_accionPersonaUltimoRegistroActionPerformed

    private void accionPersonaGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accionPersonaGuardarActionPerformed
        guardarPersona();
    }//GEN-LAST:event_accionPersonaGuardarActionPerformed

    private void accionPersonaEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accionPersonaEditarActionPerformed
        editarPersona();
    }//GEN-LAST:event_accionPersonaEditarActionPerformed

    private void accionPersonaEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accionPersonaEliminarActionPerformed
        eliminarPersona();
    }//GEN-LAST:event_accionPersonaEliminarActionPerformed

    private void accionPersonaLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accionPersonaLimpiarActionPerformed
        gestionPersona.limpiar();
    }//GEN-LAST:event_accionPersonaLimpiarActionPerformed

    private void buscarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarTelefonoActionPerformed
        buscarTelefonoPersona();
    }//GEN-LAST:event_buscarTelefonoActionPerformed

    private void BuscarCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCedulaActionPerformed
        buscarCedulaPersona();
    }//GEN-LAST:event_BuscarCedulaActionPerformed

    private void btton_limpiar_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btton_limpiar_registroActionPerformed
        gestionPersona.limpiar();
    }//GEN-LAST:event_btton_limpiar_registroActionPerformed

    private void buscarPorTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPorTelefonoActionPerformed
        buscarTelefonoPersona();
    }//GEN-LAST:event_buscarPorTelefonoActionPerformed

    private void bucarPorCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bucarPorCedulaActionPerformed
        buscarCedulaPersona();
    }//GEN-LAST:event_bucarPorCedulaActionPerformed

    private void ultimo_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimo_registroActionPerformed
        ultimaPersona();
    }//GEN-LAST:event_ultimo_registroActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        eliminarPersona();
    }//GEN-LAST:event_eliminarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        editarPersona();
    }//GEN-LAST:event_editarActionPerformed

    //BOTONES**********************************************************************
    private void bt_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_guardarActionPerformed
        guardarPersona();
    }//GEN-LAST:event_bt_guardarActionPerformed
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
            java.util.logging.Logger.getLogger(GestionContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionContable().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem BuscarCedula;
    private javax.swing.JMenu accionPersona;
    private javax.swing.JRadioButtonMenuItem accionPersonaEditar;
    private javax.swing.JRadioButtonMenuItem accionPersonaEliminar;
    private javax.swing.JCheckBoxMenuItem accionPersonaGuardar;
    private javax.swing.JRadioButtonMenuItem accionPersonaLimpiar;
    private javax.swing.JRadioButtonMenuItem accionPersonaUltimoRegistro;
    private javax.swing.JButton bt_guardar;
    private javax.swing.JButton btton_limpiar_registro;
    private javax.swing.JButton bucarPorCedula;
    private javax.swing.JButton buscarPorTelefono;
    private javax.swing.JCheckBoxMenuItem buscarTelefono;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JButton ultimo_registro;
    // End of variables declaration//GEN-END:variables
}
