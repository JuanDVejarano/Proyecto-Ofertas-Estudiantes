package src.View;

import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.table.DefaultTableModel;
import src.Model.Departamento;
import src.Model.Empleado;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author juan D Vejarano
 */
public class panelDepartamento extends javax.swing.JInternalFrame {

    //#region Constructor con eventos
    public panelDepartamento() {
        initComponents();
        addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameOpened(InternalFrameEvent e) {
                onFrameOpened();
            }
        });
        txtSearchDepartamento.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String searchText = txtSearchDepartamento.getText();
                cargarTablaDepartamento(searchText);
            }
        });
        txtSearchDecano.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String searchText = txtSearchDecano.getText();
                cargarTablaDecano(searchText);
            }
        });
        tableDecano.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = tableDecano.getSelectedRow();
                if (selectedRow != -1) {
                    txtCCDecano.setText(tableDecano.getValueAt(selectedRow, 0).toString());
                    txtNombreDecano.setText(tableDecano.getValueAt(selectedRow, 1).toString());
                }
            }
        });
        tableDepartamento.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = tableDepartamento.getSelectedRow();
                if (selectedRow != -1) {
                    txtId.setText(tableDepartamento.getValueAt(selectedRow, 0).toString());
                    txtNombre.setText(tableDepartamento.getValueAt(selectedRow, 1).toString());
                    txtCCDecano.setText(tableDepartamento.getValueAt(selectedRow, 2).toString());
                    txtNombreDecano.setText(tableDepartamento.getValueAt(selectedRow, 3).toString());
                }
            }
        });
    }
    //#endregion

    //#region initComponents
    @SuppressWarnings("unchecked")    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCCDecano = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombreDecano = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtSearchDepartamento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDepartamento = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSearchDecano = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDecano = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Id:");

        txtId.setEnabled(false);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("CC Decano:");

        txtCCDecano.setEnabled(false);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nombre Decano:");

        txtNombreDecano.setEnabled(false);

        btnLimpiar.setText("Limpiar Campos");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

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

        jLabel5.setText("buscar Departamento por nombre");

        tableDepartamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableDepartamento);

        jLabel6.setText("Seleccion un Decano");

        jLabel7.setText("Busqueda por nombre");

        tableDecano.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableDecano);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAgregar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnActualizar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEliminar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtCCDecano, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtNombre)
                                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(txtNombreDecano, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(255, 255, 255))
                                    .addComponent(txtSearchDepartamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSearchDecano, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearchDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCCDecano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombreDecano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnActualizar)
                            .addComponent(btnEliminar))))
                .addGap(10, 10, 10)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSearchDecano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }
    //#endregion

    //#region Metodos
    
    public void limpiarCampos() {
        txtId.setText("");
        txtNombre.setText("");
        txtCCDecano.setText("");
        txtNombreDecano.setText("");
    }

    public void cargarTablaDepartamento() {
        Departamento departamento = new Departamento();
        ArrayList<String[]> listaDepartamento;
        listaDepartamento = departamento.obtenerDepartamentos();
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        modelo.addColumn("Id Departamento");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cedula Decano");
        modelo.addColumn("Nombre Decano");
         for (String[] row : listaDepartamento) {
            modelo.addRow(row);
        }
        tableDepartamento.setModel(modelo);
    }

    public void cargarTablaDepartamento(String nombre) {
        Departamento departamento = new Departamento();
        ArrayList<String[]> listaDepartamento;
        listaDepartamento = departamento.obtenerDepartamentoNombre(nombre);
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        modelo.addColumn("Id Departamento");
        modelo.addColumn("Nombre");
        modelo.addColumn("Nombre Decano");
         for (String[] row : listaDepartamento) {
            modelo.addRow(row);
        }
        tableDepartamento.setModel(modelo);
    }

    public void cargaTablaDecano() {
        Empleado decano = new Empleado();
        ArrayList<String[]> listaDecano;
        listaDecano = decano.obtenerDecano();
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        modelo.addColumn("Cedula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Celular");
        modelo.addColumn("Correo");
        for (String[] row : listaDecano) {
            modelo.addRow(row);
        }
        tableDecano.setModel(modelo);
    }

    public void cargarTablaDecano(String nombre) {
        Empleado decano = new Empleado();
        ArrayList<String[]> listaDecano;
        listaDecano = decano.obtenerDecanoNombre(nombre);
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        modelo.addColumn("Cedula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Celular");
        modelo.addColumn("Correo");
        for (String[] row : listaDecano) {
            modelo.addRow(row);
        }
        tableDecano.setModel(modelo);
    }

    public void agregarDepartamento() {
        Departamento departamento = new Departamento();
        departamento.setNombre(txtNombre.getText());
        departamento.setFK_idDecano(Integer.parseInt(txtCCDecano.getText()));
        if (departamento.insertarDepartamento()) {
            cargarTablaDepartamento();
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Error al insertar el departamento");
        }
    }

    public void actualizarDepartamento() {
        Departamento departamento = new Departamento();
        departamento.setIdDepartamento(Integer.parseInt(txtId.getText()));
        departamento.setNombre(txtNombre.getText());
        departamento.setFK_idDecano(Integer.parseInt(txtCCDecano.getText()));
        if (departamento.actualizarDepartamento()) {
            cargarTablaDepartamento();
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Error al actualizar el departamento");
        }
    }

    //#endregion

    //#region Eventos

    private void onFrameOpened() {
        cargarTablaDepartamento();
        cargaTablaDecano();
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
    }

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {
        if(!txtNombre.getText().isEmpty() && !txtCCDecano.getText().isEmpty() && !txtNombreDecano.getText().isEmpty()){
            agregarDepartamento();
        } else {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos");
        }
    }

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(!txtId.getText().isEmpty() && !txtNombre.getText().isEmpty() && !txtCCDecano.getText().isEmpty() && !txtNombreDecano.getText().isEmpty()){
            actualizarDepartamento();
        } else {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos");
        }
    }

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {
        if(!txtId.getText().isEmpty()){
            if (JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar el departamento?", "Eliminar Departamento", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                Departamento departamento = new Departamento();
                departamento.setIdDepartamento(Integer.parseInt(txtId.getText()));
                if (departamento.eliminarDepartamento()) {
                    cargarTablaDepartamento();
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar el departamento");
                }
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un departamento");
        }
    }


    //#endregion

    //#region Variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableDecano;
    private javax.swing.JTable tableDepartamento;
    private javax.swing.JTextField txtCCDecano;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreDecano;
    private javax.swing.JTextField txtSearchDecano;
    private javax.swing.JTextField txtSearchDepartamento;
    //#endregion
}
