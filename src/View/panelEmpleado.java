package src.View;

import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.table.DefaultTableModel;
import src.Model.Cargo;
import src.Model.Empleado;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Juan D Vejarano
 */
public class panelEmpleado extends javax.swing.JInternalFrame {


    public panelEmpleado() {
        initComponents();
        addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameOpened(InternalFrameEvent e) {
                onFrameOpened();
            }
        });
        tableEmpleados.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = tableEmpleados.getSelectedRow();
                if (fila >= 0) {
                    txtCeulda.setText(tableEmpleados.getValueAt(fila, 0).toString());
                    txtNombre.setText(tableEmpleados.getValueAt(fila, 1).toString());
                    txtApellido.setText(tableEmpleados.getValueAt(fila, 2).toString());
                    txtCelular.setText(tableEmpleados.getValueAt(fila, 3).toString());
                    txtCorreo.setText(tableEmpleados.getValueAt(fila, 4).toString());
                    jComboBox1.setSelectedItem(tableEmpleados.getValueAt(fila, 5).toString());
                }
            }
        });
    }

    //#region Inicializar Componentes
    @SuppressWarnings("unchecked")

    private void initComponents() {

        txtCeulda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEmpleados = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setTitle("Empleado");
        setMixingCutoutShape(null);

        jLabel1.setText("Cedula");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Celular");

        jLabel5.setText("Correo");

        jLabel6.setText("Cargo");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

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

        tableEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableEmpleados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar))
                            .addComponent(txtCorreo)
                            .addComponent(jComboBox1, 0, 249, Short.MAX_VALUE)
                            .addComponent(txtCelular)
                            .addComponent(txtApellido))
                        .addGap(0, 527, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(txtCeulda))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCeulda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
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
                    .addComponent(jLabel4)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    //#endregion

    //#region Metodos

    public void limpiarCampos() {
        txtCeulda.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtCelular.setText("");
        txtCorreo.setText("");
        jComboBox1.setSelectedIndex(0);
    }

    public void cargarCargos() {
        jComboBox1.removeAllItems();
        Cargo instCargo = new Cargo();
        ArrayList<String[]> cargos = instCargo.obtenerCargos();
        for (String[] cargoItem : cargos) {
            jComboBox1.addItem(cargoItem[1]);
        }
    }

    public void cargarTablaEmpleados() {
        Empleado instEmpleado = new Empleado();
        ArrayList<String[]> empleados = instEmpleado.obtenerEmpleados();
        DefaultTableModel model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.addColumn("Cedula");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Celular");
        model.addColumn("Correo");
        model.addColumn("Cargo");
        for (String[] empleadoItem : empleados) {
            model.addRow(empleadoItem);
        }
        tableEmpleados.setModel(model);
    }

    public void agregarEmpleado() {
        Empleado instEmpleado = new Empleado();
        instEmpleado.setCedula(Integer.parseInt(txtCeulda.getText()));
        instEmpleado.setNombre(txtNombre.getText());
        instEmpleado.setApellido(txtApellido.getText());
        instEmpleado.setCelular(txtCelular.getText());
        instEmpleado.setCorreo(txtCorreo.getText());
        instEmpleado.setIdCargo(jComboBox1.getSelectedIndex() + 1);
        if(instEmpleado.existeCorreo()) {
            JOptionPane.showMessageDialog(null, "El correo ya existe debe ingresar otro");
            return;
        }
        if (instEmpleado.insertarEmpleados()) {
            JOptionPane.showMessageDialog(null, "Empleado agregado correctamente");
            cargarTablaEmpleados();
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Error al agregar empleado");
        }
    }

    public void actualizarEmpleado() {
        Empleado instEmpleado = new Empleado();
        instEmpleado.setCedula(Integer.parseInt(txtCeulda.getText()));
        instEmpleado.setNombre(txtNombre.getText());
        instEmpleado.setApellido(txtApellido.getText());
        instEmpleado.setCelular(txtCelular.getText());
        instEmpleado.setCorreo(txtCorreo.getText());
        instEmpleado.setIdCargo(jComboBox1.getSelectedIndex() + 1);
        if(instEmpleado.existeCorreo(Integer.parseInt(txtCeulda.getText()))) {
            JOptionPane.showMessageDialog(null, "El correo ya existe debe ingresar otro");
            return;
        }
        if (instEmpleado.actualizarEmpleados()) {
            JOptionPane.showMessageDialog(null, "Empleado actualizado correctamente");
            cargarTablaEmpleados();
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Error al actualizar empleado");
        }
    }

    public void eliminarEmpleado() {
        Empleado instEmpleado = new Empleado();
        instEmpleado.setCedula(Integer.parseInt(txtCeulda.getText()));
        if (instEmpleado.eliminarEmpleados()) {
            JOptionPane.showMessageDialog(null, "Empleado eliminado correctamente");
            cargarTablaEmpleados();
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Error al eliminar empleado");
        }
    }

    public void buscarEmpleado() {
        Empleado instEmpleado = new Empleado();
        instEmpleado.setCedula(Integer.parseInt(txtCeulda.getText()));
        ArrayList<String[]> empleado = instEmpleado.obtenerEmpleadoCedula();
        if (empleado.size() > 0) {
            txtNombre.setText(empleado.get(0)[1]);
            txtApellido.setText(empleado.get(0)[2]);
            txtCelular.setText(empleado.get(0)[3]);
            txtCorreo.setText(empleado.get(0)[4]);
            jComboBox1.setSelectedItem(empleado.get(0)[5]);
        } else {
            JOptionPane.showMessageDialog(null, "Empleado no encontrado");
            limpiarCampos();
        }
    }



    //#endregion

    //#region Eventos

    private void onFrameOpened() {
        cargarCargos();
        cargarTablaEmpleados();
    }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {
        if(txtCeulda.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor llene el campo de cedula");
        } else {
            buscarEmpleado();
        }
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        limpiarCampos();
    }

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {
        if (txtCeulda.getText().isEmpty() || txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtCelular.getText().isEmpty() || txtCorreo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos");
        } else {
            agregarEmpleado();
        }
    }

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {
        if(txtCeulda.getText().isEmpty() || txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtCelular.getText().isEmpty() || txtCorreo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos");
        } else {
            actualizarEmpleado();
        }
    }

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {
        if(txtCeulda.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor llene el campo de cedula");
        } else if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el empleado?", "Eliminar Empleado", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            eliminarEmpleado();
        }
    }

    //#endregion

    //#region Variables Formulario
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableEmpleados;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCeulda;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    //#endregion
}
