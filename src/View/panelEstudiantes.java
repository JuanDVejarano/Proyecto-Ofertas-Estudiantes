package src.View;

import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.table.DefaultTableModel;
import src.Model.OficinaDeTrabajo;
import src.Model.Estudiante;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Juan D Vejarano
 */
public class panelEstudiantes extends javax.swing.JInternalFrame {

    public panelEstudiantes() {
        initComponents();
        addInternalFrameListener(new InternalFrameAdapter() {
            public void internalFrameActivated(InternalFrameEvent e) {
                onFrameOpened();
            }
        });
        tableEstudiantes.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int fila = tableEstudiantes.rowAtPoint(e.getPoint());
                txtCodigo.setText(tableEstudiantes.getValueAt(fila, 0).toString());
                txtNombre.setText(tableEstudiantes.getValueAt(fila, 1).toString());
                txtApellido.setText(tableEstudiantes.getValueAt(fila, 2).toString());
                txtFecha.setText(tableEstudiantes.getValueAt(fila, 3).toString());
                txtEmail.setText(tableEstudiantes.getValueAt(fila, 4).toString());
                txtCurriculum.setText(tableEstudiantes.getValueAt(fila, 5).toString());
                txtGrado.setText(tableEstudiantes.getValueAt(fila, 6).toString());
                buscarOficinasDeEstudainte();
            }
        });
        txtSearchDecano.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                cargarEstudiantes(txtSearchDecano.getText());
            }
        });
    }


    //#region Generated Code
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtFecha = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCurriculum = new javax.swing.JTextField();
        txtGrado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEstudiantes = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btnAgregarOfi = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableOfi = new javax.swing.JTable();
        txtSearchDecano = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setTitle("Estudiantes");

        jLabel3.setText("Apellido");

        jLabel1.setText("Codigo");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        btnLimpiar.setText("Limpiar Campos");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha Nacimiento");

        jLabel5.setText("Email");

        jLabel6.setText("Curriculum");

        jLabel7.setText("Grado");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tableEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableEstudiantes);

        jLabel8.setText("Oficinas Disponibles");

        btnAgregarOfi.setText("Agregar Oficina");
        btnAgregarOfi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarOfiActionPerformed(evt);
            }
        });

        tableOfi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableOfi);

        jLabel9.setText("Busqueda por nombre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(77, 77, 77)
                            .addComponent(txtCurriculum))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(36, 36, 36)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtEmail)
                                .addComponent(txtFecha)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNombre)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(txtApellido)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregarOfi)))
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearchDecano, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(562, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarOfi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCurriculum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtSearchDecano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(71, 71, 71)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGap(277, 277, 277)))
        );

        pack();
    }
    //#endregion

    //#region Metodos
    private void limpiarCampos() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtFecha.setText("");
        txtEmail.setText("");
        txtCurriculum.setText("");
        txtGrado.setText("");
        DefaultTableModel model = (DefaultTableModel) tableOfi.getModel();
        model.setRowCount(0);
    }

    private void cargarEstudiantes() {
        Estudiante instEstudiante = new Estudiante();
        ArrayList<String[]> estudiantes = instEstudiante.obtenerEstudiantes();
        DefaultTableModel model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.addColumn("Codigo");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Fecha Nacimiento");
        model.addColumn("Email");
        model.addColumn("Curriculum");
        model.addColumn("Grado");
        for (String[] est : estudiantes) {
            model.addRow(est);
        }
        tableEstudiantes.setModel(model);
    }

    private void cargarEstudiantes(String Nombre) {
        Estudiante instEstudiante = new Estudiante();
        ArrayList<String[]> estudiantes = instEstudiante.obtenerEstudianteNombre(Nombre);
        DefaultTableModel model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.addColumn("Codigo");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Fecha Nacimiento");
        model.addColumn("Email");
        model.addColumn("Curriculum");
        model.addColumn("Grado");
        for (String[] est : estudiantes) {
            model.addRow(est);
        }
        tableEstudiantes.setModel(model);
    }

    private void agregarEstudiante() {
        Estudiante instEstudiante = new Estudiante();
        instEstudiante.setCodigo_Estudiante(Integer.parseInt(txtCodigo.getText()));
        instEstudiante.setNombre(txtNombre.getText());
        instEstudiante.setApellidos(txtApellido.getText());
        try {
            Date fechaNacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(txtFecha.getText());
            instEstudiante.setFecha_Nacimiento(fechaNacimiento);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Formato de fecha incorrecto. Use dd/MM/yyyy");
            return;
        }
        instEstudiante.setEmail(txtEmail.getText());
        instEstudiante.setCurriculum(txtCurriculum.getText());
        instEstudiante.setGradoDeAvance(txtGrado.getText());
        if (instEstudiante.existeEstudiante()) {
            JOptionPane.showMessageDialog(this, "El estudiante ya existe");
            return;
        }
        if (instEstudiante.insertarEstudiante()) {
            JOptionPane.showMessageDialog(this, "Estudiante agregado correctamente");
            cargarEstudiantes();
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Error al agregar estudiante");
        }
    }

    private void actualizarEstudiante() {
        Estudiante instEstudiante = new Estudiante();
        instEstudiante.setCodigo_Estudiante(Integer.parseInt(txtCodigo.getText()));
        instEstudiante.setNombre(txtNombre.getText());
        instEstudiante.setApellidos(txtApellido.getText());
        try {
            Date fechaNacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(txtFecha.getText());
            instEstudiante.setFecha_Nacimiento(fechaNacimiento);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Formato de fecha incorrecto. Use dd/MM/yyyy");
            return;
        }
        instEstudiante.setEmail(txtEmail.getText());
        instEstudiante.setCurriculum(txtCurriculum.getText());
        instEstudiante.setGradoDeAvance(txtGrado.getText());
        if (instEstudiante.actualizarEstudiante()) {
            JOptionPane.showMessageDialog(this, "Estudiante actualizado correctamente");
            cargarEstudiantes();
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Error al actualizar estudiante");
        }
    }

    private void eliminar(){
        Estudiante instEstudiante = new Estudiante();
        instEstudiante.setCodigo_Estudiante(Integer.parseInt(txtCodigo.getText()));
        if (!instEstudiante.existeEstudiante()) {
            JOptionPane.showMessageDialog(this, "El estudiante no existe");
            return;
        }
        if (instEstudiante.eliminarEstudiante()) {
            JOptionPane.showMessageDialog(this, "Estudiante eliminado correctamente");
            cargarEstudiantes();
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Error al eliminar estudiante");
        }
    }

    private void cargarOficinas() {
        OficinaDeTrabajo instOficina = new OficinaDeTrabajo();
        ArrayList<String[]> oficinas = instOficina.obtenerOficinaDeTrabajoId();
        for (String[] ofi : oficinas) {
            jComboBox1.addItem(ofi[0]);
        }
    }

    private void buscarOficinasDeEstudainte() {
        Estudiante instOficina = new Estudiante();
        instOficina.setCodigo_Estudiante(Integer.parseInt(txtCodigo.getText()));
        ArrayList<String[]> oficinas = instOficina.obtenerOficinasInscritasDelEstudiante();
        DefaultTableModel model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.addColumn("Codigo oficina");
        model.addColumn("Nombre Departamento");
        model.addColumn("Nombre Decano");
        for (String[] ofi : oficinas) {
            model.addRow(ofi);
        }
        tableOfi.setModel(model);
    }

    private void agregarOficinaEstudiante() {
        Estudiante instEstudiante = new Estudiante();
        instEstudiante.setCodigo_Estudiante(Integer.parseInt(txtCodigo.getText()));
        int FK_idOficina = Integer.parseInt(jComboBox1.getSelectedItem().toString());
        if (instEstudiante.verificaResgitroDuplicado(FK_idOficina)) {
            JOptionPane.showMessageDialog(this, "El estudiante ya tiene esta oficina");
            return;
        }
        if (!instEstudiante.existeEstudiante()) {
            JOptionPane.showMessageDialog(this, "El estudiante no existe");
            return;
        }
        if (instEstudiante.agregarOficinaEstudiante(FK_idOficina)) {
            JOptionPane.showMessageDialog(this, "Oficina agregada correctamente");
            buscarOficinasDeEstudainte();
        } else {
            JOptionPane.showMessageDialog(this, "Error al agregar oficina");
        }
        buscarOficinasDeEstudainte();
    }
    //#endregion

    //#region Eventos
    private void onFrameOpened() {
        cargarEstudiantes();
        cargarOficinas();
    }
    

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
    }

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (txtCodigo.getText().isEmpty() || txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtFecha.getText().isEmpty() || txtEmail.getText().isEmpty() || txtCurriculum.getText().isEmpty() || txtGrado.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor llene todos los campos");
        } else {
            agregarEstudiante();
        }
    }

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (txtCodigo.getText().isEmpty() || txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtFecha.getText().isEmpty() || txtEmail.getText().isEmpty() || txtCurriculum.getText().isEmpty() || txtGrado.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor llene todos los campos");
        } else {
            actualizarEstudiante();
        }
    }

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (txtCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor llene el campo de codigo");
        } else {
            if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar el estudiante?") == 0) {
                eliminar();
            }
        }
    }

    private void btnAgregarOfiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarOfiActionPerformed
        if (txtCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor llene el campo de codigo");
        } else {
            agregarOficinaEstudiante();
        }
    }
    //#endregion



    //#region Variables declaration
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarOfi;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableEstudiantes;
    private javax.swing.JTable tableOfi;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCurriculum;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtFecha;
    private javax.swing.JTextField txtGrado;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSearchDecano;
    //#endregion
}
