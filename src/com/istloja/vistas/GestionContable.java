package com.istloja.vistas;

import com.istloja.controlador.Inventariobd;
import com.istloja.controlador.Personabd;
import com.istloja.controlador.PersonabdProv;
import com.istloja.modelTables.ComunicacionPersona;
import com.istloja.modelTables.ModelTablePersona;
import com.istloja.modelTables.ModelTableProv;
import com.istloja.modelTables.ModeloTablaInventario;
import com.istloja.modelo.Inventario;
import com.istloja.modelo.Persona;
import com.istloja.modelo.Persona_Prov;
import com.istloja.utilidad.Utilidades;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.util.List;
import javax.swing.JOptionPane;

public class GestionContable extends javax.swing.JFrame implements ComunicacionPersona {

    private final Utilidades utilidades;
    private final Personabd controladorPersona;
    private Persona personaEditar;
    private final GestiónPersona gestionPersona;
    private final ModelTablePersona modelTablePersona;

    private final GestionContableProv gestionprov;
    private final PersonabdProv controladorProv;
    private Persona_Prov personaEditarProv;
    private final ModelTableProv modelProv;

    private Inventario inventario;
    private final Inventariobd controladorInventario;
    private final ModeloTablaInventario modelInventario;
    private final GestionInventario gestionInventario;

    public GestionContable() {
        super("VENTANA DE PERSONAS");
        controladorPersona = new Personabd();
        controladorProv = new PersonabdProv();
        controladorInventario = new Inventariobd();
        modelInventario = new ModeloTablaInventario(controladorInventario.obtenerInventario(), this);
        modelProv = new ModelTableProv(controladorProv.obtenerPersonap(), this);
        modelTablePersona = new ModelTablePersona(controladorPersona.obtenerPersona(), this);

        initComponents();
        rBtton_cedula.setSelected(true);
        utilidades = new Utilidades();

        gestionPersona = new GestiónPersona(txt_cedula, txt_nombre, txt_apellido, txt_direccion, txt_correo, txt_telefono, txt_genero, JDateFechaNacimiento, utilidades, this);
        gestionprov = new GestionContableProv(txt_ruc, txt_r_s, txt_t_a, txt_n_r_l, txt_a_r_l, txt_te, txt_cor, txt_di, JDateFechaVencimientoDeuda, utilidades, this);
        gestionInventario = new GestionInventario(text_co, text_can, text_des, text_pcsi, text_pcci, text_pm, text_pcf, text_pcn, text_f_c, utilidades, this);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        btton_limpiar_registro = new javax.swing.JButton();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        text1 = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        text3 = new javax.swing.JLabel();
        text4 = new javax.swing.JLabel();
        text5 = new javax.swing.JLabel();
        texto6 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txt_genero = new javax.swing.JComboBox<>();
        rBtton_cedula = new javax.swing.JRadioButton();
        rBtton_pasaporte = new javax.swing.JRadioButton();
        jLabel36 = new javax.swing.JLabel();
        JDateFechaNacimiento = new com.toedter.calendar.JDateChooser();
        txtParametroBusqueda = new javax.swing.JTextField();
        comboBuscar = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_ruc = new javax.swing.JTextField();
        txt_n_r_l = new javax.swing.JTextField();
        txt_a_r_l = new javax.swing.JTextField();
        txt_r_s = new javax.swing.JTextField();
        txt_t_a = new javax.swing.JTextField();
        txt_te = new javax.swing.JTextField();
        txt_cor = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        e_prov = new javax.swing.JButton();
        ur_prov = new javax.swing.JButton();
        lc_prov = new javax.swing.JButton();
        g_prov = new javax.swing.JButton();
        ed_prov = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txt_di = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        JDateFechaVencimientoDeuda = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        comboBuscarProveedor = new javax.swing.JComboBox<>();
        txtParametroBuscarProv = new javax.swing.JTextField();
        btn_buscar_proveedor = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        text_co = new javax.swing.JTextField();
        text_des = new javax.swing.JTextField();
        text_pcsi = new javax.swing.JTextField();
        text_pcci = new javax.swing.JTextField();
        text_can = new javax.swing.JTextField();
        guardar_inventario = new javax.swing.JButton();
        editar_inventario = new javax.swing.JButton();
        eliminar_inventario = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        text_pm = new javax.swing.JTextField();
        text_pcf = new javax.swing.JTextField();
        text_pcn = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        text_f_c = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        buscarInventario = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        textParametroBusquedaInventario = new javax.swing.JTextField();
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

        jTabbedPane1.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/registro (1).png"))); // NOI18N
        jLabel1.setText("REGISTRO DE PERSONAS");

        jTable1.setModel(modelTablePersona);
        jScrollPane1.setViewportView(jTable1);

        jPanel7.setBackground(new java.awt.Color(153, 255, 255));
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btton_limpiar_registro.setBackground(new java.awt.Color(204, 255, 255));
        btton_limpiar_registro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btton_limpiar_registro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/icons8-clear-formatting-24.png"))); // NOI18N
        btton_limpiar_registro.setText("LIMPIAR");
        btton_limpiar_registro.setToolTipText("Limpiar los campos de registro");
        btton_limpiar_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btton_limpiar_registroActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(102, 255, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText(" TELÉFONO: ");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jLabel8.setOpaque(true);

        bt_guardar.setBackground(new java.awt.Color(204, 255, 255));
        bt_guardar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bt_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/icons8-save-all-24.png"))); // NOI18N
        bt_guardar.setText("GUARDAR");
        bt_guardar.setToolTipText("Botón guardar persona");
        bt_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guardarActionPerformed(evt);
            }
        });

        editar.setBackground(new java.awt.Color(204, 255, 255));
        editar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/icons8-edit-user-24.png"))); // NOI18N
        editar.setText("EDITAR");
        editar.setToolTipText("Botón editar persona");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        eliminar.setBackground(new java.awt.Color(204, 255, 255));
        eliminar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/icons8-delete-user-male-24.png"))); // NOI18N
        eliminar.setText("ELIMINAR");
        eliminar.setToolTipText("Botón elimianar persona");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        ultimo_registro.setBackground(new java.awt.Color(204, 255, 255));
        ultimo_registro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ultimo_registro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/registro (4).png"))); // NOI18N
        ultimo_registro.setText("ÚLTIMO REGISTRO");
        ultimo_registro.setToolTipText("Buscar ultimo registro");
        ultimo_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimo_registroActionPerformed(evt);
            }
        });

        txt_cedula.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_cedula.setForeground(new java.awt.Color(102, 102, 102));
        txt_cedula.setToolTipText("Ingrese un número de cédula correcto");
        txt_cedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        txt_cedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_cedulaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_cedulaFocusLost(evt);
            }
        });

        txt_nombre.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(102, 102, 102));
        txt_nombre.setToolTipText("Ingrese sus nombres");
        txt_nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        txt_nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_nombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_nombreFocusLost(evt);
            }
        });

        txt_apellido.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_apellido.setForeground(new java.awt.Color(102, 102, 102));
        txt_apellido.setToolTipText("Ingrese sus apellidos");
        txt_apellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        txt_apellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_apellidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_apellidoFocusLost(evt);
            }
        });

        txt_direccion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_direccion.setForeground(new java.awt.Color(102, 102, 102));
        txt_direccion.setToolTipText("Ingrese su dirección");
        txt_direccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        txt_direccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_direccionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_direccionFocusLost(evt);
            }
        });

        txt_correo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_correo.setForeground(new java.awt.Color(102, 102, 102));
        txt_correo.setToolTipText("Ingrese su correo electrónico");
        txt_correo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        txt_correo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_correoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_correoFocusLost(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(102, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText(" DNI: ");
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

        txt_telefono.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(102, 102, 102));
        txt_telefono.setToolTipText("Ingrese su número de teléfono");
        txt_telefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        txt_telefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_telefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_telefonoFocusLost(evt);
            }
        });

        text1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N

        text2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N

        text3.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N

        text4.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N

        text5.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N

        texto6.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N

        jLabel31.setBackground(new java.awt.Color(102, 255, 255));
        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel31.setText(" GÉNERO:");
        jLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jLabel31.setOpaque(true);

        txt_genero.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No definido", "Femenino", "Masculino" }));

        rBtton_cedula.setText("Cédula");
        rBtton_cedula.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rBtton_cedulaItemStateChanged(evt);
            }
        });

        rBtton_pasaporte.setText("Pasaporte");
        rBtton_pasaporte.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rBtton_pasaporteItemStateChanged(evt);
            }
        });

        jLabel36.setBackground(new java.awt.Color(102, 255, 255));
        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel36.setText(" FECHA NACIMIENTO: ");
        jLabel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jLabel36.setOpaque(true);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(bt_guardar)
                        .addGap(45, 45, 45)
                        .addComponent(editar)
                        .addGap(54, 54, 54)
                        .addComponent(eliminar)
                        .addGap(58, 58, 58)
                        .addComponent(ultimo_registro)
                        .addGap(36, 36, 36)
                        .addComponent(btton_limpiar_registro))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rBtton_cedula)
                                .addGap(18, 18, 18)
                                .addComponent(rBtton_pasaporte)
                                .addGap(29, 29, 29)
                                .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel36)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JDateFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(54, 54, 54)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt_correo)
                                            .addComponent(txt_direccion, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_apellido, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_nombre, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_genero, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(text5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(texto6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_cedula)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel29)
                        .addComponent(rBtton_cedula)
                        .addComponent(rBtton_pasaporte)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_nombre))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(text4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texto6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_genero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(JDateFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editar)
                    .addComponent(eliminar)
                    .addComponent(ultimo_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_guardar)
                    .addComponent(btton_limpiar_registro))
                .addGap(21, 21, 21))
        );

        txtParametroBusqueda.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtParametroBusqueda.setToolTipText("Ingrese datos de acuerdo a el itém seleccionado");
        txtParametroBusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        txtParametroBusqueda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtParametroBusquedaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtParametroBusquedaFocusLost(evt);
            }
        });
        txtParametroBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtParametroBusquedaKeyTyped(evt);
            }
        });

        comboBuscar.setBackground(new java.awt.Color(204, 255, 255));
        comboBuscar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        comboBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cédula", "Nombres", "Apellidos", "Dirección", "Correo", "Teléfono" }));
        comboBuscar.setToolTipText("Filtro de búsqueda");

        jLabel11.setBackground(new java.awt.Color(102, 255, 255));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("BUSCADOR:");
        jLabel11.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(279, 279, 279))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(txtParametroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(comboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 934, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1069, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtParametroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jTabbedPane1.addTab("Clientes", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/registro (1).png"))); // NOI18N
        jLabel12.setText("REGISTRO DE PROVEEDORES");

        jPanel5.setBackground(new java.awt.Color(153, 255, 255));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setBackground(new java.awt.Color(102, 255, 255));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText(" RUC");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jLabel13.setOpaque(true);

        jLabel14.setBackground(new java.awt.Color(102, 255, 255));
        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText(" NOMBRE R. L.");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jLabel14.setOpaque(true);

        jLabel15.setBackground(new java.awt.Color(102, 255, 255));
        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText(" APELLIDO R. L ");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jLabel15.setOpaque(true);

        jLabel16.setBackground(new java.awt.Color(102, 255, 255));
        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setText("RAZÓN SOCIAL");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jLabel16.setOpaque(true);

        jLabel17.setBackground(new java.awt.Color(102, 255, 255));
        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setText("CORREO");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jLabel17.setOpaque(true);

        jLabel18.setBackground(new java.awt.Color(102, 255, 255));
        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setText("TIPO DE ACTIVIDAD");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jLabel18.setOpaque(true);

        jLabel19.setBackground(new java.awt.Color(102, 255, 255));
        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setText("TELÉFONO");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jLabel19.setOpaque(true);

        txt_ruc.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_ruc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txt_n_r_l.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_n_r_l.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txt_a_r_l.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_a_r_l.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txt_r_s.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_r_s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txt_t_a.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_t_a.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txt_te.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_te.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txt_cor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_cor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel6.setBackground(new java.awt.Color(204, 255, 255));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        e_prov.setBackground(new java.awt.Color(153, 255, 255));
        e_prov.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        e_prov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/icons8-delete-user-male-24.png"))); // NOI18N
        e_prov.setText("ELIMINAR");
        e_prov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e_provActionPerformed(evt);
            }
        });

        ur_prov.setBackground(new java.awt.Color(153, 255, 255));
        ur_prov.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ur_prov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/registro (4).png"))); // NOI18N
        ur_prov.setText("ÚLTIMO REGISTRO");
        ur_prov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ur_provActionPerformed(evt);
            }
        });

        lc_prov.setBackground(new java.awt.Color(153, 255, 255));
        lc_prov.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lc_prov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/icons8-clear-formatting-24.png"))); // NOI18N
        lc_prov.setText("LIMPIAR CAMPOS");
        lc_prov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lc_provActionPerformed(evt);
            }
        });

        g_prov.setBackground(new java.awt.Color(153, 255, 255));
        g_prov.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        g_prov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/icons8-save-all-24.png"))); // NOI18N
        g_prov.setText("GUARDAR");
        g_prov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g_provActionPerformed(evt);
            }
        });

        ed_prov.setBackground(new java.awt.Color(153, 255, 255));
        ed_prov.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ed_prov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/icons8-edit-user-24.png"))); // NOI18N
        ed_prov.setText("EDITAR");
        ed_prov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ed_provActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel20.setText("ACCIONES");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ur_prov, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e_prov, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lc_prov, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ed_prov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(g_prov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(72, 72, 72))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(g_prov)
                .addGap(18, 18, 18)
                .addComponent(ed_prov)
                .addGap(18, 18, 18)
                .addComponent(e_prov)
                .addGap(18, 18, 18)
                .addComponent(ur_prov)
                .addGap(18, 18, 18)
                .addComponent(lc_prov)
                .addGap(41, 41, 41))
        );

        jLabel30.setBackground(new java.awt.Color(102, 255, 255));
        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel30.setText(" DIRECCIÓN:");
        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jLabel30.setOpaque(true);

        txt_di.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_di.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel37.setBackground(new java.awt.Color(102, 255, 255));
        jLabel37.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel37.setText("FECHA VENCIMIENTO DEUDA");
        jLabel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jLabel37.setOpaque(true);

        JDateFechaVencimientoDeuda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_t_a)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_te)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addComponent(txt_di))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(0, 3, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_cor)))
                            .addComponent(JDateFechaVencimientoDeuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txt_n_r_l, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_a_r_l))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_ruc)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_r_s)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(102, 102, 102)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel16))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_ruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_r_s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_a_r_l, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_n_r_l, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addGap(15, 15, 15)
                        .addComponent(txt_t_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_te, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(jLabel37)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_di)
                    .addComponent(JDateFechaVencimientoDeuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTable2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable2.setModel(modelProv);
        jScrollPane2.setViewportView(jTable2);

        jLabel21.setBackground(new java.awt.Color(102, 255, 255));
        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel21.setText("FILTRO DE BÚSQUEDA");
        jLabel21.setOpaque(true);

        comboBuscarProveedor.setBackground(new java.awt.Color(204, 255, 255));
        comboBuscarProveedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboBuscarProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ruc", "Nombre", "Apellido", "Dirección", "Teléfono", "Correo", "Razón social", " " }));
        comboBuscarProveedor.setToolTipText("Filtro de búsqueda");
        comboBuscarProveedor.setBorder(null);

        txtParametroBuscarProv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtParametroBuscarProv.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtParametroBuscarProv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtParametroBuscarProvFocusGained(evt);
            }
        });
        txtParametroBuscarProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtParametroBuscarProvKeyTyped(evt);
            }
        });

        btn_buscar_proveedor.setBackground(new java.awt.Color(153, 255, 255));
        btn_buscar_proveedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_buscar_proveedor.setText("BUSCAR");
        btn_buscar_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_proveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(373, 373, 373)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel21)
                                .addGap(18, 18, 18)
                                .addComponent(comboBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtParametroBuscarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_buscar_proveedor))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1043, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel12)
                .addGap(28, 28, 28)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_buscar_proveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtParametroBuscarProv)
                    .addComponent(comboBuscarProveedor)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        jTabbedPane1.addTab("Proveedores", jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));

        jPanel8.setBackground(new java.awt.Color(153, 255, 255));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel23.setBackground(new java.awt.Color(102, 255, 255));
        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel23.setText(" CÓDIGO: ");
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jLabel23.setOpaque(true);

        jLabel24.setBackground(new java.awt.Color(102, 255, 255));
        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel24.setText(" DESCRIPCIÓN: ");
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jLabel24.setOpaque(true);

        jLabel25.setBackground(new java.awt.Color(102, 255, 255));
        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel25.setText(" PRECIO COMPRA SIN IVA");
        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jLabel25.setOpaque(true);

        jLabel26.setBackground(new java.awt.Color(102, 255, 255));
        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel26.setText(" PRECIO COMPRA CON IVA ");
        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jLabel26.setOpaque(true);

        jLabel27.setBackground(new java.awt.Color(102, 255, 255));
        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel27.setText(" CANTIDAD: ");
        jLabel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jLabel27.setOpaque(true);

        text_co.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        text_co.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        text_co.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                text_coFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_coFocusLost(evt);
            }
        });

        text_des.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        text_des.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        text_pcsi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        text_pcsi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        text_pcci.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        text_pcci.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        text_can.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        text_can.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        guardar_inventario.setBackground(new java.awt.Color(153, 255, 255));
        guardar_inventario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        guardar_inventario.setText("Guardar");
        guardar_inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_inventarioActionPerformed(evt);
            }
        });

        editar_inventario.setBackground(new java.awt.Color(153, 255, 255));
        editar_inventario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        editar_inventario.setText("Editar");
        editar_inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_inventarioActionPerformed(evt);
            }
        });

        eliminar_inventario.setBackground(new java.awt.Color(153, 255, 255));
        eliminar_inventario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        eliminar_inventario.setText("Eliminar");
        eliminar_inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_inventarioActionPerformed(evt);
            }
        });

        jLabel32.setBackground(new java.awt.Color(102, 255, 255));
        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel32.setText(" PRECIO MAYORISTA:");
        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jLabel32.setOpaque(true);

        jLabel33.setBackground(new java.awt.Color(102, 255, 255));
        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel33.setText(" PRECIO CLIENTE FIJO:");
        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jLabel33.setOpaque(true);

        jLabel34.setBackground(new java.awt.Color(102, 255, 255));
        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel34.setText(" PRECIO CLIENTE NORMAL:");
        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jLabel34.setOpaque(true);

        text_pm.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        text_pm.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        text_pcf.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        text_pcf.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        text_pcn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        text_pcn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        text_pcn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_pcnActionPerformed(evt);
            }
        });

        jLabel35.setBackground(new java.awt.Color(102, 255, 255));
        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel35.setText("FECHA CADUCIDAD:");
        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jLabel35.setOpaque(true);

        text_f_c.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        text_f_c.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        text_f_c.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                text_f_cFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_f_cFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardar_inventario)
                .addGap(47, 47, 47)
                .addComponent(editar_inventario)
                .addGap(61, 61, 61)
                .addComponent(eliminar_inventario)
                .addGap(48, 48, 48))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(text_f_c))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(text_co)
                                    .addComponent(text_can, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(text_des, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(48, 48, 48)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text_pcsi)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text_pcci)
                    .addComponent(text_pcf)
                    .addComponent(text_pm)
                    .addComponent(text_pcn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(text_co, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel25))
                                .addGap(29, 29, 29)
                                .addComponent(text_pcsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel27)
                                    .addComponent(text_can, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel32))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_des, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35)
                            .addComponent(text_f_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_pcn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel26)
                        .addGap(29, 29, 29)
                        .addComponent(text_pcci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(text_pm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(text_pcf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar_inventario)
                    .addComponent(editar_inventario)
                    .addComponent(eliminar_inventario))
                .addGap(35, 35, 35))
        );

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel22.setText("REGISTRO DE INVENTARIO");

        buscarInventario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Descripción" }));

        jLabel28.setBackground(new java.awt.Color(102, 255, 255));
        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel28.setText(" BÚSQUEDA: ");

        jTable3.setModel(modelInventario);
        jScrollPane3.setViewportView(jTable3);

        textParametroBusquedaInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textParametroBusquedaInventarioActionPerformed(evt);
            }
        });
        textParametroBusquedaInventario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textParametroBusquedaInventarioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textParametroBusquedaInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(410, 410, 410)
                                .addComponent(jLabel22))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel22)
                .addGap(44, 44, 44)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(textParametroBusquedaInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jTabbedPane1.addTab("Inventario", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1248, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 793, Short.MAX_VALUE)
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
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //MÉTODOS*************************************************************************************************************************

    public void guardarPersona() {
        if (controladorPersona.buscarCedula(txt_cedula.getText()) != null) {
            JOptionPane.showMessageDialog(rootPane, "La persona con ese número de cédula ya se encuentra registrada en el sistema.");
        } else {
            Persona PesonaGuardar = gestionPersona.guardarEditar(false);
            if (JDateFechaNacimiento.getDate() != null) {
                PesonaGuardar.setFechaNacimiento(JDateFechaNacimiento.getDate());
            }
            if (PesonaGuardar != null) {
                if (controladorPersona.crearPersona(PesonaGuardar)) {
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
        txt_genero.setSelectedIndex(persona.getGenero());
        JDateFechaNacimiento.setDate(persona.getFechaNacimiento());
    }

    public void editarPersona() {

        Persona personaEditarLocal = gestionPersona.guardarEditar(true);
        if (personaEditarLocal != null) {
            personaEditarLocal.setFecha_registro(personaEditar.getFecha_registro());
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
            Persona persona = controladorPersona.buscarCedula(txt_cedula.getText());
            if (persona != null) {
                txt_cedula.setText(persona.getCedula());
                txt_nombre.setText(persona.getNombres());
                txt_apellido.setText(persona.getApellidos());
                txt_direccion.setText(persona.getDireccion());
                txt_correo.setText(persona.getCorreo());
                txt_telefono.setText(persona.getTelefono());
                txt_genero.setSelectedIndex(persona.getGenero());

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
            Persona persona = controladorPersona.buscarTelefono(txt_telefono.getText());
            if (persona != null) {
                txt_cedula.setText(persona.getCedula());
                txt_nombre.setText(persona.getNombres());
                txt_apellido.setText(persona.getApellidos());
                txt_direccion.setText(persona.getDireccion());
                txt_correo.setText(persona.getCorreo());
                txt_telefono.setText(persona.getTelefono());
                txt_genero.setSelectedIndex(persona.getGenero());

            } else {
                JOptionPane.showMessageDialog(rootPane, "No se encontró la persona con ese número de teléfono", "ERROR", JOptionPane.ERROR_MESSAGE);
                txt_telefono.setText("");
                txt_telefono.requestFocus();
            }
        }
    }

    public void eliminarPersona() {

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

    public void buscarCliente() {

        if (comboBuscar.getSelectedItem().equals("Cédula")) {
            List<Persona> personaCedula = controladorPersona.getPersonaCedula(txtParametroBusqueda.getText());
            modelTablePersona.setPersonas(personaCedula);
            modelTablePersona.fireTableDataChanged();
        } else if (comboBuscar.getSelectedIndex() == 1) {
            List<Persona> personaNombre = controladorPersona.getPersonaNombre(txtParametroBusqueda.getText());
            modelTablePersona.setPersonas(personaNombre);
            modelTablePersona.fireTableDataChanged();
        } else if (comboBuscar.getSelectedIndex() == 2) {
            List<Persona> personaApellido = controladorPersona.getPersonaApellido(txtParametroBusqueda.getText());
            modelTablePersona.setPersonas(personaApellido);
            modelTablePersona.fireTableDataChanged();
        } else if (comboBuscar.getSelectedIndex() == 3) {
            List<Persona> personaDireccion = controladorPersona.getPersonaDireccion(txtParametroBusqueda.getText());
            modelTablePersona.setPersonas(personaDireccion);
            modelTablePersona.fireTableDataChanged();
        } else if (comboBuscar.getSelectedIndex() == 4) {
            List<Persona> personaNombre = controladorPersona.getPersonaCorreo(txtParametroBusqueda.getText());
            modelTablePersona.setPersonas(personaNombre);
            modelTablePersona.fireTableDataChanged();
        } else if (comboBuscar.getSelectedItem().equals("Teléfono")) {
            List<Persona> personaNombre = controladorPersona.getPersonaTelefono(txtParametroBusqueda.getText());
            modelTablePersona.setPersonas(personaNombre);
            modelTablePersona.fireTableDataChanged();
        }
    }

    void actualizar() {
        List<Persona> personaNombre = (List<Persona>) controladorPersona.obtenerPersona();
        modelTablePersona.setPersonas(personaNombre);
        modelTablePersona.fireTableDataChanged();
    }

    //METODOS PROVEEDOR***************************************************************************************
    public void guardarPersonaProv() {
        if (controladorProv.BuscarCodigo(txt_ruc.getText()) != null) {
            JOptionPane.showMessageDialog(rootPane, "La persona con este código ya se encuentra registrada en el sistema.");
        } else {
            Persona_Prov personaGuardar = gestionprov.guardarEditar();
            if (JDateFechaVencimientoDeuda.getDate() != null) {
                personaGuardar.setFecha_vencimiento_deuda(JDateFechaVencimientoDeuda.getDate());
            }
            if (personaGuardar != null) {
                if (controladorProv.crearPersona(personaGuardar)) {
                    JOptionPane.showMessageDialog(rootPane, "Proveedor registrada en el sistema.");
                    gestionprov.limpiarProv();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se puede guardar este Proveedor", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public void editarPersonaProv() {
        if (personaEditarProv == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay una persona seleccionada para editar", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Persona_Prov personaEditarLocal = gestionprov.guardarEditar();
        if (personaEditarLocal != null) {
            personaEditarLocal.setIdprov(personaEditarProv.getIdprov());
            if (controladorProv.actualizarPersona(personaEditarLocal)) {
                JOptionPane.showMessageDialog(rootPane, "Persona editada con exito del sitema.");
                gestionprov.limpiarProv();
                personaEditarProv = null;
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se puede editar la persona", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void buscarProveedor() {

        if (comboBuscarProveedor.getSelectedItem().equals("Ruc")) {
            List<Persona_Prov> personaCodigo = controladorProv.getProveedorCodigo(txtParametroBuscarProv.getText());
            modelProv.setPersonas(personaCodigo);
            modelProv.fireTableDataChanged();
        } else if (comboBuscarProveedor.getSelectedIndex() == 1) {
            List<Persona_Prov> personaNombre = controladorProv.getProveedorNombre(txtParametroBuscarProv.getText());
            modelProv.setPersonas(personaNombre);
            modelProv.fireTableDataChanged();
        } else if (comboBuscarProveedor.getSelectedIndex() == 2) {
            List<Persona_Prov> personaApellido = controladorProv.getProveedorApellido(txtParametroBuscarProv.getText());
            modelProv.setPersonas(personaApellido);
            modelProv.fireTableDataChanged();
        } else if (comboBuscarProveedor.getSelectedIndex() == 3) {
            List<Persona_Prov> personaDireccion = controladorProv.getProveedorDireccion(txtParametroBuscarProv.getText());
            modelProv.setPersonas(personaDireccion);
            modelProv.fireTableDataChanged();
        } else if (comboBuscarProveedor.getSelectedItem().equals("Teléfono")) {
            List<Persona_Prov> personaTelefono = controladorProv.getProveedorTelefono(txtParametroBuscarProv.getText());
            modelProv.setPersonas(personaTelefono);
            modelProv.fireTableDataChanged();
        } else if (comboBuscarProveedor.getSelectedIndex() == 5) {
            List<Persona_Prov> personaCorreo = controladorProv.getProveedorCorreo(txtParametroBuscarProv.getText());
            modelProv.setPersonas(personaCorreo);
            modelProv.fireTableDataChanged();

        } else if (comboBuscarProveedor.getSelectedIndex() == 6) {
            List<Persona_Prov> personaServicio = controladorProv.getProveedorServicio(txtParametroBuscarProv.getText());
            modelProv.setPersonas(personaServicio);
            modelProv.fireTableDataChanged();
        }
    }

    void actualizarProv() {
        List<Persona_Prov> personaNombre = controladorProv.obtenerPersonap();
        modelProv.setPersonas(personaNombre);
        modelProv.fireTableDataChanged();
    }

    public void ultimaPersonap() {
        List<Persona_Prov> obtper = controladorProv.obtenerPersonap();
        Persona_Prov persona = obtper.get(obtper.size() - 1);
        System.out.println(persona);
        txt_ruc.setText(persona.getRuc());
        txt_r_s.setText(persona.getRazon_social());
        txt_t_a.setText(persona.getTipo_actividad());
        txt_n_r_l.setText(persona.getNombre_representante());
        txt_a_r_l.setText(persona.getApellido_representante());
        txt_te.setText(persona.getTelefono());
        txt_cor.setText(persona.getCorreo());
        txt_di.setText(persona.getDireccion());
        JDateFechaVencimientoDeuda.setDate(persona.getFecha_vencimiento_deuda());

    }

    public void eliminarPersonap() {

        if (personaEditarProv != null) {
            personaEditarProv.setIdprov(personaEditarProv.getIdprov());
            if (controladorProv.eliminarPersona(personaEditarProv)) {
                JOptionPane.showMessageDialog(rootPane, "Persona eliminada con exito del sitema.");
                gestionprov.limpiarProv();
                personaEditarProv = null;
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se puede eliminar a la persona", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    //METODOS DE INVENTARIO
    public void guardarInventario() {
        Inventario inventariog = gestionInventario.guardarEditarInvenario();
        if (inventariog != null) {
            if (controladorInventario.crearInventario(inventariog)) {
                JOptionPane.showMessageDialog(rootPane, "Persona registrada en el sistema.");
                gestionInventario.limpiarInventario();
                actualizarInventario();
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se puede guardar la persona", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void actualizarInventario() {
        List<Inventario> invent = controladorInventario.obtenerInventario();
        modelInventario.setPersonas(invent);
        modelInventario.fireTableDataChanged();
    }

    public void eliminarInventario() {

        if (inventario != null) {
            inventario.setId_inventario(inventario.getId_inventario());
            if (controladorInventario.eliminarInventario(inventario)) {
                JOptionPane.showMessageDialog(rootPane, "Persona eliminada con exito del sitema.");
                gestionInventario.limpiarInventario();
                inventario = null;
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se puede eliminar a la persona", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void editarInventario() {
        if (inventario == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay una persona seleccionada para editar", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Inventario invent = gestionInventario.guardarEditarInvenario();
        if (invent != null) {
            invent.setId_inventario(inventario.getId_inventario());
            if (controladorInventario.actualizarInventario(invent)) {
                JOptionPane.showMessageDialog(rootPane, "Persona editada con exito del sitema.");
                gestionInventario.limpiarInventario();
                inventario = null;
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se puede editar la persona", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void buscarInventario() {

        if (buscarInventario.getSelectedItem().equals("Código")) {
            List<Inventario> personaCodigo = controladorInventario.getInventarioCodigo(textParametroBusquedaInventario.getText());
            modelInventario.setPersonas(personaCodigo);
            modelInventario.fireTableDataChanged();
        } else if (buscarInventario.getSelectedIndex() == 1) {
            List<Inventario> personaDescripcion = controladorInventario.getInventarioDescripcion(textParametroBusquedaInventario.getText());
            modelInventario.setPersonas(personaDescripcion);
            modelInventario.fireTableDataChanged();
        }
    }

    public void validarCedula() {
        if (!utilidades.validadorDeCedula(txt_cedula.getText())) {
            JOptionPane.showMessageDialog(rootPane, "La cédula ingresada no es válida", "ERROR", JOptionPane.ERROR_MESSAGE);

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
        actualizar();

    }//GEN-LAST:event_accionPersonaGuardarActionPerformed

    private void accionPersonaEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accionPersonaEditarActionPerformed
        editarPersona();
        actualizar();

    }//GEN-LAST:event_accionPersonaEditarActionPerformed

    private void accionPersonaEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accionPersonaEliminarActionPerformed
        eliminarPersona();
        actualizar();

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

    private void ultimo_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimo_registroActionPerformed
        ultimaPersona();
    }//GEN-LAST:event_ultimo_registroActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        eliminarPersona();
        actualizar();
    }//GEN-LAST:event_eliminarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        editarPersona();
        actualizar();
    }//GEN-LAST:event_editarActionPerformed

    //BOTONES**********************************************************************
    private void bt_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_guardarActionPerformed
        guardarPersona();
        actualizar();
    }//GEN-LAST:event_bt_guardarActionPerformed

    private void ed_provActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ed_provActionPerformed
        editarPersonaProv();
        actualizarProv();
    }//GEN-LAST:event_ed_provActionPerformed

    private void g_provActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g_provActionPerformed
        guardarPersonaProv();
        actualizarProv();
    }//GEN-LAST:event_g_provActionPerformed

    private void e_provActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e_provActionPerformed
        eliminarPersonap();
        actualizarProv();
    }//GEN-LAST:event_e_provActionPerformed

    private void ur_provActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ur_provActionPerformed
        ultimaPersonap();
    }//GEN-LAST:event_ur_provActionPerformed

    private void lc_provActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lc_provActionPerformed
        gestionprov.limpiarProv();
    }//GEN-LAST:event_lc_provActionPerformed

    private void txtParametroBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtParametroBusquedaKeyTyped

        if (txtParametroBusqueda.getText().isEmpty()) {
            actualizar();
        } else {
            buscarCliente();
        }
    }//GEN-LAST:event_txtParametroBusquedaKeyTyped

    private void btn_buscar_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_proveedorActionPerformed
        if (txtParametroBuscarProv.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "No hay datos. Por favor ingresar datos a buscar", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            buscarProveedor();
        }
    }//GEN-LAST:event_btn_buscar_proveedorActionPerformed

    private void txtParametroBuscarProvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtParametroBuscarProvKeyTyped
        if (txtParametroBuscarProv.getText().isEmpty()) {
            actualizarProv();
        }
    }//GEN-LAST:event_txtParametroBuscarProvKeyTyped

    private void eliminar_inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_inventarioActionPerformed
        eliminarInventario();
        actualizarInventario();
    }//GEN-LAST:event_eliminar_inventarioActionPerformed

    private void textParametroBusquedaInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textParametroBusquedaInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textParametroBusquedaInventarioActionPerformed

    private void guardar_inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_inventarioActionPerformed
        guardarInventario();
    }//GEN-LAST:event_guardar_inventarioActionPerformed

    private void editar_inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_inventarioActionPerformed
        editarInventario();
        actualizarInventario();
    }//GEN-LAST:event_editar_inventarioActionPerformed

    private void textParametroBusquedaInventarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textParametroBusquedaInventarioKeyTyped
        if (textParametroBusquedaInventario.getText().isEmpty()) {
            actualizarInventario();
        } else {
            buscarInventario();
        }
    }//GEN-LAST:event_textParametroBusquedaInventarioKeyTyped

    private void txtParametroBusquedaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtParametroBusquedaFocusGained
        txtParametroBusqueda.setBackground(Color.decode("#E1F5FE"));    }//GEN-LAST:event_txtParametroBusquedaFocusGained

    private void txtParametroBusquedaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtParametroBusquedaFocusLost
        txtParametroBusqueda.setBackground(Color.white);
     }//GEN-LAST:event_txtParametroBusquedaFocusLost

    private void txt_nombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nombreFocusGained
        txt_nombre.setBackground(Color.decode("#E1F5FE"));
        text2.setText("Escribe su nombre");

    }//GEN-LAST:event_txt_nombreFocusGained

    private void txt_nombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nombreFocusLost
        txt_nombre.setBackground(Color.white);
        text2.setText("");

    }//GEN-LAST:event_txt_nombreFocusLost

    private void txt_apellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_apellidoFocusGained
        txt_apellido.setBackground(Color.decode("#E1F5FE"));
        text3.setText("Escribe su apellido");

    }//GEN-LAST:event_txt_apellidoFocusGained

    private void txt_apellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_apellidoFocusLost
        txt_apellido.setBackground(Color.white);
        text3.setText("");

    }//GEN-LAST:event_txt_apellidoFocusLost

    private void txt_direccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_direccionFocusGained
        txt_direccion.setBackground(Color.decode("#E1F5FE"));
        text4.setText("Escribe su dirección");

    }//GEN-LAST:event_txt_direccionFocusGained

    private void txt_direccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_direccionFocusLost
        txt_direccion.setBackground(Color.white);
        text4.setText("");

    }//GEN-LAST:event_txt_direccionFocusLost

    private void txt_correoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_correoFocusGained
        txt_correo.setBackground(Color.decode("#E1F5FE"));
        text5.setText("Escribe su correo");

    }//GEN-LAST:event_txt_correoFocusGained

    private void txt_correoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_correoFocusLost
        txt_correo.setBackground(Color.white);
        text5.setText("");

    }//GEN-LAST:event_txt_correoFocusLost

    private void txt_telefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_telefonoFocusGained
        txt_telefono.setBackground(Color.decode("#E1F5FE"));
        texto6.setText("Escribe su teléfono");
    }//GEN-LAST:event_txt_telefonoFocusGained

    private void txt_telefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_telefonoFocusLost
        txt_telefono.setBackground(Color.white);
        texto6.setText("");

    }//GEN-LAST:event_txt_telefonoFocusLost

    private void txt_cedulaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cedulaFocusGained
        txt_cedula.setBackground(Color.decode("#E1F5FE"));
        text1.setText("Ingrese su cédula");

    }//GEN-LAST:event_txt_cedulaFocusGained

    private void txt_cedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cedulaFocusLost
        txt_cedula.setBackground(Color.white);
        text1.setText("");
        if (rBtton_cedula.isSelected()) {
            if (txt_cedula.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "El campo édula no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
                txt_cedula.requestFocus();
            } else if (!utilidades.validadorDeCedula(txt_cedula.getText())) {
                JOptionPane.showMessageDialog(rootPane, "La cédula ingresada no es válida.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txt_cedulaFocusLost

    private void text_coFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_coFocusGained

    }//GEN-LAST:event_text_coFocusGained

    private void txtParametroBuscarProvFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtParametroBuscarProvFocusGained

    }//GEN-LAST:event_txtParametroBuscarProvFocusGained

    private void text_coFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_coFocusLost

    }//GEN-LAST:event_text_coFocusLost

    private void text_pcnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_pcnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_pcnActionPerformed

    private void text_f_cFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_f_cFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_text_f_cFocusGained

    private void text_f_cFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_f_cFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_text_f_cFocusLost

    private void rBtton_cedulaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rBtton_cedulaItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            rBtton_pasaporte.setSelected(false);
        }
    }//GEN-LAST:event_rBtton_cedulaItemStateChanged

    private void rBtton_pasaporteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rBtton_pasaporteItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            rBtton_cedula.setSelected(false);
        }
    }//GEN-LAST:event_rBtton_pasaporteItemStateChanged
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GestionContable().setVisible(true);
            }
        });
    }

    @Override
    public void clickPersona(Persona p) {
        txt_cedula.setText(p.getCedula());
        txt_nombre.setText(p.getNombres());
        txt_apellido.setText(p.getApellidos());
        txt_direccion.setText(p.getDireccion());
        txt_correo.setText(p.getCorreo());
        txt_telefono.setText(p.getTelefono());
        txt_genero.setSelectedIndex(p.getGenero());
        JDateFechaNacimiento.setDate(p.getFechaNacimiento());
        System.out.println("FechaRegistro:" + p.getFecha_registro());
        personaEditar = p;

    }

    @Override
    public void clickPersonap(Persona_Prov p) {
        txt_ruc.setText(p.getRuc());
        txt_r_s.setText(p.getRazon_social());
        txt_t_a.setText(p.getTipo_actividad());
        txt_n_r_l.setText(p.getNombre_representante());
        txt_a_r_l.setText(p.getApellido_representante());
        txt_te.setText(p.getTelefono());
        txt_cor.setText(p.getCorreo());
        txt_di.setText(p.getDireccion());
        JDateFechaVencimientoDeuda.setDate(p.getFecha_vencimiento_deuda());
        personaEditarProv = p;
    }

    @Override
    public void clickInventario(Inventario i) {
        text_co.setText(i.getCodigo_pro());
        text_can.setText(String.valueOf(i.getCan_productos()));
        text_des.setText(i.getDescripcion());
        text_pcsi.setText(Double.toString(i.getPrecios_compra_sin_iva()));
        text_pcci.setText(Double.toString(i.getPrecios_compra_con_iva()));
        text_pm.setText(Double.toString(i.getPrecio_mayorista()));
        text_pcf.setText(Double.toString(i.getPrecio_cliente_fijo()));
        text_pcn.setText(Double.toString(i.getPrecio_cliente_normal()));
        text_f_c.setText(String.valueOf(i.getFecha_caducidad()));
        inventario = i;

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem BuscarCedula;
    private com.toedter.calendar.JDateChooser JDateFechaNacimiento;
    private com.toedter.calendar.JDateChooser JDateFechaVencimientoDeuda;
    private javax.swing.JMenu accionPersona;
    private javax.swing.JRadioButtonMenuItem accionPersonaEditar;
    private javax.swing.JRadioButtonMenuItem accionPersonaEliminar;
    private javax.swing.JCheckBoxMenuItem accionPersonaGuardar;
    private javax.swing.JRadioButtonMenuItem accionPersonaLimpiar;
    private javax.swing.JRadioButtonMenuItem accionPersonaUltimoRegistro;
    private javax.swing.JButton bt_guardar;
    private javax.swing.JButton btn_buscar_proveedor;
    private javax.swing.JButton btton_limpiar_registro;
    private javax.swing.JComboBox<String> buscarInventario;
    private javax.swing.JCheckBoxMenuItem buscarTelefono;
    private javax.swing.JComboBox<String> comboBuscar;
    private javax.swing.JComboBox<String> comboBuscarProveedor;
    private javax.swing.JButton e_prov;
    private javax.swing.JButton ed_prov;
    private javax.swing.JButton editar;
    private javax.swing.JButton editar_inventario;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton eliminar_inventario;
    private javax.swing.JButton g_prov;
    private javax.swing.JButton guardar_inventario;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JButton lc_prov;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JRadioButton rBtton_cedula;
    private javax.swing.JRadioButton rBtton_pasaporte;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel text5;
    private javax.swing.JTextField textParametroBusquedaInventario;
    private javax.swing.JTextField text_can;
    private javax.swing.JTextField text_co;
    private javax.swing.JTextField text_des;
    private javax.swing.JTextField text_f_c;
    private javax.swing.JTextField text_pcci;
    private javax.swing.JTextField text_pcf;
    private javax.swing.JTextField text_pcn;
    private javax.swing.JTextField text_pcsi;
    private javax.swing.JTextField text_pm;
    private javax.swing.JLabel texto6;
    private javax.swing.JTextField txtParametroBuscarProv;
    private javax.swing.JTextField txtParametroBusqueda;
    private javax.swing.JTextField txt_a_r_l;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_cor;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_di;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JComboBox<String> txt_genero;
    private javax.swing.JTextField txt_n_r_l;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_r_s;
    private javax.swing.JTextField txt_ruc;
    private javax.swing.JTextField txt_t_a;
    private javax.swing.JTextField txt_te;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JButton ultimo_registro;
    private javax.swing.JButton ur_prov;
    // End of variables declaration//GEN-END:variables
}
