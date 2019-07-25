package interfaces;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import modelos.AlumnosDAO;
import modelos.Alumnos;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.table.TableCellRenderer;
import modelos.conexion;

public class AlumnoForm extends javax.swing.JInternalFrame {

    AlumnosDAO dao = new AlumnosDAO();
    Alumnos v = new Alumnos();
    DefaultTableModel modelo = new DefaultTableModel();
    int id;

    Connection con;
    conexion acceso = new conexion();
    PreparedStatement ps;

    public AlumnoForm() {
        initComponents();
        listar();
        mostrargrado();
        mostrarpadre();
        //Permite centrar el Header(titulos) de la tabla.
        TableCellRenderer rendererFromHeader = tabla.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);

    }

    void listar() {
        List<Alumnos> lista = dao.listar();
        modelo = (DefaultTableModel) tabla.getModel();
        Object[] ob = new Object[9];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getMatricula();
            ob[2] = lista.get(i).getNombrecom();
            ob[3] = lista.get(i).getCurp();
            ob[4] = lista.get(i).getFechanaci();
            ob[5] = lista.get(i).getSexo();
            ob[6] = lista.get(i).getGrpsangre();
            ob[7] = lista.get(i).getIdgrado();
//            ob[8] = lista.get(i).getIdpadre();
            ob[8] = lista.get(i).getNombreCompleto();
            modelo.addRow(ob);
        }
        tabla.setModel(modelo);
    }

    void mostrargrado() {
        String sql = " select * from grado";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ComboGrado.addItem(rs.getString("numero"));
            }
        } catch (SQLException ex) {

        }
    }

    void mostrarpadre() {
        String sql = " select * from padre";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ComboPadre.addItem(rs.getString("np_completo"));
            }
        } catch (SQLException ex) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCurp = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ComboSexo = new javax.swing.JComboBox<>();
        CalendarFecha = new com.toedter.calendar.JDateChooser();
        txtNombreCompleto = new javax.swing.JTextField();
        ComboGrado = new javax.swing.JComboBox<>();
        ComboSangre = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        ComboPadre = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setClosable(true);
        setTitle("MODULO ALUMNO");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("MATRICULA");

        txtMatricula.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NOMBRE COMPLETO");

        jLabel3.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CURP");

        txtCurp.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

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
        jLabel4.setText("FECHA DE NACIMIENTO");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/28-2-210.jpg"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("SEXO");

        jLabel7.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("TIPO DE SANGRE");

        jLabel8.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("GRADO");

        ComboSexo.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        ComboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "Masculino", "Femenino" }));

        txtNombreCompleto.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

        ComboGrado.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        ComboGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE" }));
        ComboGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboGradoActionPerformed(evt);
            }
        });

        ComboSangre.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        ComboSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "O +", "O -", "A +", "A -", "B +", "B -", "AB +", "AB -" }));

        jLabel9.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("PADRE O TUTOR");

        ComboPadre.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        ComboPadre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE" }));
        ComboPadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboPadreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135)
                        .addComponent(btnActualizar)
                        .addGap(127, 127, 127)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCurp)
                            .addComponent(txtMatricula)
                            .addComponent(CalendarFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(txtNombreCompleto))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboSangre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboGrado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboPadre, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(12, 12, 12)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtMatricula))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(15, 15, 15))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(ComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(ComboSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(CalendarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ComboGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(ComboPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnActualizar)
                            .addComponent(btnEliminar))
                        .addGap(15, 15, 15))))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabla.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MATRICULA", "NOMBRE COMPLETO", "CURP", "FECHA DE NACIMIENTO", "SEXO", "TIPO DE SANGRE", "GRADO", "PADRE O TUTOR"
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
            tabla.getColumnModel().getColumn(1).setPreferredWidth(100);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(250);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(170);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(150);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(100);
            tabla.getColumnModel().getColumn(6).setPreferredWidth(150);
            tabla.getColumnModel().getColumn(8).setPreferredWidth(250);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Se debe seleccionar una fila");
        } else {
            id = Integer.parseInt(tabla.getValueAt(fila, 0).toString());
            String matri = tabla.getValueAt(fila, 1).toString();
            String nomcom = tabla.getValueAt(fila, 2).toString();
            String curp = tabla.getValueAt(fila, 3).toString();
            Date date;
            try {
                date = new SimpleDateFormat("yyy-MM-dd").parse((String) tabla.getValueAt(fila, 4).toString());
                CalendarFecha.setDate(date);
            } catch (ParseException ex) {
                Logger.getLogger(UsuariosForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            ComboSexo.setSelectedItem(tabla.getValueAt(fila, 5));
            ComboSangre.setSelectedItem(tabla.getValueAt(fila, 6));
            ComboGrado.setSelectedItem(tabla.getValueAt(fila, 7));
            ComboPadre.setSelectedItem(tabla.getValueAt(fila, 8));

            txtMatricula.setText(matri);
            txtNombreCompleto.setText(nomcom);
            txtCurp.setText(curp);

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

    private void ComboGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboGradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboGradoActionPerformed

    private void ComboPadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboPadreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboPadreActionPerformed

    void agregar() {
        if (txtMatricula.getText().equals("") & txtNombreCompleto.getText().equals("")
                & txtCurp.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Se deben llenar todos los campos");
        } else {
            int año = CalendarFecha.getCalendar().get(Calendar.YEAR);
            int dia = CalendarFecha.getCalendar().get(Calendar.DAY_OF_MONTH);
            int mes = CalendarFecha.getCalendar().get(Calendar.MONTH);

            String matri = txtMatricula.getText();
            String nombrec = txtNombreCompleto.getText();
            String curp = txtCurp.getText();
            String fecha = año + "-" + mes + "-" + dia;
            String combsex = ComboSexo.getSelectedItem().toString();
            String comsangre = ComboSangre.getSelectedItem().toString();
            int combgrado = ComboGrado.getSelectedIndex();
            int combpadre = ComboPadre.getSelectedIndex();

            Object[] ob = new Object[8];
            ob[0] = matri;
            ob[1] = nombrec;
            ob[2] = curp;
            ob[3] = fecha;
            ob[4] = combsex;
            ob[5] = comsangre;
            ob[6] = combgrado;
            ob[7] = combpadre;
            dao.add(ob);
            JOptionPane.showMessageDialog(this, "Usuario registrado exitosamente");

        }
    }

    void limpiarcampos() {
        txtMatricula.setText("");
        txtNombreCompleto.setText("");
        txtCurp.setText("");
        CalendarFecha.setCalendar(null);
        ComboSexo.setSelectedItem("Masculino");
        ComboSangre.setSelectedItem("O+");
        ComboGrado.setSelectedItem("SELECCIONE");
        ComboPadre.setSelectedItem("SELECCIONE");

    }

    void actualizar() {
        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Se debe seleccionar una fila");

        } else {
            String matri = txtMatricula.getText();
            String nombrec = txtNombreCompleto.getText();
            String curp = txtCurp.getText();
            SimpleDateFormat dateFormato = new SimpleDateFormat("yyy-MM-dd");
            String date = dateFormato.format(CalendarFecha.getDate());
            String combsex = ComboSexo.getSelectedItem().toString();
            String grpsangre = ComboSangre.getSelectedItem().toString();
            int idgrado = ComboGrado.getSelectedIndex();
            int idpadre = ComboPadre.getSelectedIndex();
//            String idgrado = ComboGrado.getSelectedItem().toString();
//            String idpadre = ComboPadre.getSelectedItem().toString();

            Object[] obj = new Object[9];
            obj[0] = matri;
            obj[1] = nombrec;
            obj[2] = curp;
            obj[3] = date;
            obj[4] = combsex;
            obj[5] = grpsangre;
            obj[6] = idgrado;
            obj[7] = idpadre;
            obj[8] = id;
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
    private com.toedter.calendar.JDateChooser CalendarFecha;
    private javax.swing.JComboBox<String> ComboGrado;
    private javax.swing.JComboBox<String> ComboPadre;
    private javax.swing.JComboBox<String> ComboSangre;
    private javax.swing.JComboBox<String> ComboSexo;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCurp;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombreCompleto;
    // End of variables declaration//GEN-END:variables
}
