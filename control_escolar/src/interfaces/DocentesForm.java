package interfaces;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import modelos.DocentesDAO;
import modelos.Docentes;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.table.TableCellRenderer;

public class DocentesForm extends javax.swing.JInternalFrame {

    DocentesDAO dao = new DocentesDAO();
    Docentes v = new Docentes();
    DefaultTableModel modelo = new DefaultTableModel();
    int id;

    public DocentesForm() {
        initComponents();
        listar();
        //Permite centrar el Header(titulos) de la tabla.
        TableCellRenderer rendererFromHeader = tabla.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);

    }

    void listar() {
        List<Docentes> lista = dao.listar();
        modelo = (DefaultTableModel) tabla.getModel();
        Object[] ob = new Object[15];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getNombrecompleto();
            ob[2] = lista.get(i).getCodigo_presu();
            ob[3] = lista.get(i).getTelefono();
            ob[4] = lista.get(i).getDireccion();
            ob[5] = lista.get(i).getCorreo();
            ob[6] = lista.get(i).getCurp();
            ob[7] = lista.get(i).getAño_sep();
            ob[8] = lista.get(i).getAño_esc();
            ob[9] = lista.get(i).getAño_zona();
            ob[10] = lista.get(i).getFecha_nacimiento();
            ob[11] = lista.get(i).getRfc();
            ob[12] = lista.get(i).getCargo();
            ob[13] = lista.get(i).getNo_identifi();
            ob[14] = lista.get(i).getContraseña();
            modelo.addRow(ob);
        }
        tabla.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreCompleto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        txtNIdentificacion = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        txtCURP = new javax.swing.JTextField();
        CalendarIngresoESC = new com.toedter.calendar.JDateChooser();
        CalendarIngresoZN = new com.toedter.calendar.JDateChooser();
        CalendarFechaNacimiento = new com.toedter.calendar.JDateChooser();
        txtCodigoPresupuestal = new javax.swing.JTextField();
        CalendarIngresoSep = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setClosable(true);
        setTitle("MODULO DOCENTES");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("NOMBRE COMPLETO");

        txtNombreCompleto.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CODIGO PRESUPUESTAL");

        jLabel3.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("TELEFONO");

        txtTelefono.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

        btnAgregar.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar-usuario.png"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/archivo.png"))); // NOI18N
        btnActualizar.setText("MODIFICAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/basura.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("DIRECCION");

        txtDireccion.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("CURP");

        jLabel7.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("AÑO INGRESO SEP");

        jLabel8.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("AÑO INGRESO ESCUELA");

        jLabel9.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("AÑO INGRESO ZONA");

        txtCorreo.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("CORREO");

        jLabel11.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("FECHA DE NACIMIENTO");

        jLabel12.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("RFC");

        jLabel13.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("CARGO");

        jLabel14.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("NO. IDENTIFICACION");

        jLabel15.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("CONTRASEÑA");

        txtRFC.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

        txtCargo.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

        txtNIdentificacion.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

        txtContraseña.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

        txtCURP.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

        txtCodigoPresupuestal.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addComponent(btnActualizar)
                        .addGap(127, 127, 127)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel10))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(txtTelefono)
                            .addComponent(txtNombreCompleto)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(txtCodigoPresupuestal))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCURP)
                                    .addComponent(CalendarIngresoESC, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CalendarIngresoZN, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCargo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRFC, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNIdentificacion, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtContraseña, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CalendarIngresoSep, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CalendarFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombreCompleto))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(txtCodigoPresupuestal))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtCURP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13))
                            .addComponent(CalendarIngresoSep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel14)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtNIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(4, 4, 4)))
                            .addComponent(CalendarIngresoESC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15))
                            .addComponent(CalendarIngresoZN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(CalendarFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnActualizar)
                            .addComponent(btnEliminar)))
                    .addComponent(btnAgregar))
                .addGap(10, 10, 10))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabla.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE COMPLETO", "CODIGO PRESUPUESTAL", "TELEFONO", "DIRECCION", "CORREO", "CURP", "AÑO INGRESO SEP", "AÑO INGRESO ESCUELA", "AÑO INGRESO ZONA", "FECHA DE NACIMIENTO", "RFC", "CARGO", "NO. IDENTIFICACION", "CONTRASEÑA"
            }
        ));
        tabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabla.setSelectionBackground(new java.awt.Color(153, 0, 153));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setPreferredWidth(40);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(230);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(200);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(100);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(300);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(200);
            tabla.getColumnModel().getColumn(6).setPreferredWidth(200);
            tabla.getColumnModel().getColumn(7).setPreferredWidth(150);
            tabla.getColumnModel().getColumn(8).setPreferredWidth(170);
            tabla.getColumnModel().getColumn(9).setPreferredWidth(150);
            tabla.getColumnModel().getColumn(10).setPreferredWidth(150);
            tabla.getColumnModel().getColumn(11).setPreferredWidth(200);
            tabla.getColumnModel().getColumn(12).setPreferredWidth(100);
            tabla.getColumnModel().getColumn(13).setPreferredWidth(130);
            tabla.getColumnModel().getColumn(14).setPreferredWidth(130);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1164, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Se debe seleccionar una fila");
        } else {
            id = Integer.parseInt(tabla.getValueAt(fila, 0).toString());
            String nomcom = tabla.getValueAt(fila, 1).toString();
            String codigopresu = tabla.getValueAt(fila, 2).toString();
            String tele = tabla.getValueAt(fila, 3).toString();
            String dire = tabla.getValueAt(fila, 4).toString();
            String correo = tabla.getValueAt(fila, 5).toString();
            String curp = tabla.getValueAt(fila, 6).toString();
            Date date;
            Date date2;
            Date date3;
            Date date4;
            try {
                date = new SimpleDateFormat("yyy-MM-dd").parse((String) tabla.getValueAt(fila, 7).toString());
                CalendarIngresoSep.setDate(date);
                date2 = new SimpleDateFormat("yyy-MM-dd").parse((String) tabla.getValueAt(fila, 8).toString());
                CalendarIngresoESC.setDate(date2);
                date3 = new SimpleDateFormat("yyy-MM-dd").parse((String) tabla.getValueAt(fila, 9).toString());
                CalendarIngresoZN.setDate(date3);
                date4 = new SimpleDateFormat("yyy-MM-dd").parse((String) tabla.getValueAt(fila, 10).toString());
                CalendarFechaNacimiento.setDate(date4);
            } catch (ParseException ex) {
                Logger.getLogger(DocentesForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            String rfc = tabla.getValueAt(fila, 11).toString();
            String cargo = tabla.getValueAt(fila, 12).toString();
            String noident = tabla.getValueAt(fila, 13).toString();
            String contra = tabla.getValueAt(fila, 14).toString();

            txtNombreCompleto.setText(nomcom);
            txtCodigoPresupuestal.setText(codigopresu);
            txtTelefono.setText(tele);
            txtDireccion.setText(dire);
            txtCorreo.setText(correo);
            txtCURP.setText(curp);
            txtRFC.setText(rfc);
            txtCargo.setText(cargo);
            txtNIdentificacion.setText(noident);
            txtContraseña.setText(contra);

        }
    }//GEN-LAST:event_tablaMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
        limpiarcampos();
        limpiarTabla();
        listar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizar();
        limpiarTabla();
        listar();
        limpiarcampos();

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregar();
        limpiarTabla();
        listar();
        limpiarcampos();

    }//GEN-LAST:event_btnAgregarActionPerformed

    void agregar() {

        if (txtNombreCompleto.getText().equals("") & txtCodigoPresupuestal.getText().equals("")
                & txtTelefono.getText().equals("") & txtDireccion.getText().equals("") & txtCorreo.getText().equals("")
                & txtCURP.getText().equals("") & txtRFC.getText().equals("") & txtCargo.getText().equals("")
                & txtNIdentificacion.getText().equals("") & txtContraseña.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Se deben llenar todos los campos");

        } else {
            int año = CalendarIngresoSep.getCalendar().get(Calendar.YEAR);
            int dia = CalendarIngresoSep.getCalendar().get(Calendar.DAY_OF_MONTH);
            int mes = CalendarIngresoSep.getCalendar().get(Calendar.MONTH);

            int año2 = CalendarIngresoESC.getCalendar().get(Calendar.YEAR);
            int dia2 = CalendarIngresoESC.getCalendar().get(Calendar.DAY_OF_MONTH);
            int mes2 = CalendarIngresoESC.getCalendar().get(Calendar.MONTH);

            int año3 = CalendarIngresoZN.getCalendar().get(Calendar.YEAR);
            int dia3 = CalendarIngresoZN.getCalendar().get(Calendar.DAY_OF_MONTH);
            int mes3 = CalendarIngresoZN.getCalendar().get(Calendar.MONTH);

            int año4 = CalendarFechaNacimiento.getCalendar().get(Calendar.YEAR);
            int dia4 = CalendarFechaNacimiento.getCalendar().get(Calendar.DAY_OF_MONTH);
            int mes4 = CalendarFechaNacimiento.getCalendar().get(Calendar.MONTH);

            String nomcom = txtNombreCompleto.getText();
            String codpre = txtCodigoPresupuestal.getText();
            String tel = txtTelefono.getText();
            String direc = txtDireccion.getText();
            String correo = txtCorreo.getText();
            String curp = txtCURP.getText();
            String fecha = año + "-" + mes + "-" + dia;
            String fecha2 = año2 + "-" + mes2 + "-" + dia2;
            String fecha3 = año3 + "-" + mes3 + "-" + dia3;
            String fecha4 = año4 + "-" + mes4 + "-" + dia4;
            String rfc = txtRFC.getText();
            String cargo = txtCargo.getText();
            String noident = txtNIdentificacion.getText();
            String contra = txtContraseña.getText();

            Object[] ob = new Object[14];
            ob[0] = nomcom;
            ob[1] = codpre;
            ob[2] = tel;
            ob[3] = direc;
            ob[4] = correo;
            ob[5] = curp;
            ob[6] = fecha;
            ob[7] = fecha2;
            ob[8] = fecha3;
            ob[9] = fecha4;
            ob[10] = rfc;
            ob[11] = cargo;
            ob[12] = noident;
            ob[13] = contra;
            dao.add(ob);
            JOptionPane.showMessageDialog(this, "Usuario registrado exitosamente");

        }
    }

    void limpiarcampos() {

        txtNombreCompleto.setText("");
        txtCodigoPresupuestal.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtCorreo.setText("");
        txtCURP.setText("");
        CalendarIngresoSep.setCalendar(null);
        CalendarIngresoESC.setCalendar(null);
        CalendarIngresoZN.setCalendar(null);
        CalendarFechaNacimiento.setCalendar(null);
        txtRFC.setText("");
        txtCargo.setText("");
        txtNIdentificacion.setText("");
        txtContraseña.setText("");

    }
//No funciona correctamente
    void actualizar() {
        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Se debe seleccionar una fila");
        } else {

            String nombrec = txtNombreCompleto.getText();
            String codepre = txtCodigoPresupuestal.getText();
            String tel = txtTelefono.getText();
            String direc = txtDireccion.getText();
            String correo = txtCorreo.getText();
            String curp = txtCURP.getText();

            SimpleDateFormat dateFormato1 = new SimpleDateFormat("yyy-MM-dd");
            String date1 = dateFormato1.format(CalendarIngresoSep.getDate());
            SimpleDateFormat dateFormato2 = new SimpleDateFormat("yyy-MM-dd");
            String date2 = dateFormato2.format(CalendarIngresoESC.getDate());
            SimpleDateFormat dateFormato3 = new SimpleDateFormat("yyy-MM-dd");
            String date3 = dateFormato3.format(CalendarIngresoZN.getDate());
            SimpleDateFormat dateFormato4 = new SimpleDateFormat("yyy-MM-dd");
            String date4 = dateFormato4.format(CalendarFechaNacimiento.getDate());

            String rfc = txtRFC.getText();
            String cargo = txtCargo.getText();
            String noident = txtNIdentificacion.getText();
            String contra = txtContraseña.getText();

            Object[] obj = new Object[15];
            obj[0] = nombrec;
            obj[1] = codepre;
            obj[2] = tel;
            obj[3] = direc;
            obj[4] = correo;
            obj[5] = curp;
            obj[6] = date1;
            obj[7] = date2;
            obj[8] = date3;
            obj[9] = date4;
            obj[10] = rfc;
            obj[11] = cargo;
            obj[12] = noident;
            obj[13] = contra;
            obj[14] = id;
            dao.actualizar(obj);
        }

    }

    void eliminar() {

        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Se debe seleccionar una fila");

        } else {
            int msj = JOptionPane.showConfirmDialog(this, "  ¿Esta seguro que desea eliminar el registro?  ");
            //JOptionPane.showMessageDialog(this, "Registro eliminado");
            if (msj == JOptionPane.YES_OPTION) {
                dao.eliminar(id);
                JOptionPane.showMessageDialog(this, "Registro eliminado");
            }
            if (msj == JOptionPane.NO_OPTION) {

            }
            if (msj == JOptionPane.CLOSED_OPTION) {

            }
        }
    }

    void limpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser CalendarFechaNacimiento;
    private com.toedter.calendar.JDateChooser CalendarIngresoESC;
    private com.toedter.calendar.JDateChooser CalendarIngresoSep;
    private com.toedter.calendar.JDateChooser CalendarIngresoZN;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCURP;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCodigoPresupuestal;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNIdentificacion;
    private javax.swing.JTextField txtNombreCompleto;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
