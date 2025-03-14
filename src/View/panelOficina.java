package src.View;

import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.table.DefaultTableModel;
import src.Model.OficinaDeTrabajo;
import src.Model.Empleado;
import src.Model.Departamento;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

/**
 *
 * @autor Juan D Vejarano
 */
public class panelOficina extends javax.swing.JInternalFrame {

    public panelOficina() {
        initComponents();
        addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameOpened(InternalFrameEvent e) {
                onFrameOpened();
            }
        });
        tableDecano.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = tableDecano.rowAtPoint(e.getPoint());
                if (fila > -1) {
                    txtCodigoOficina.setText(tableDecano.getValueAt(fila, 0).toString());
                    comboBoxDepartamento.setSelectedItem(new ComboBoxItem(tableDecano.getValueAt(fila, 1).toString(), tableDecano.getValueAt(fila, 2).toString()));
                    comboBoxSecretaria.setSelectedItem(new ComboBoxItem(tableDecano.getValueAt(fila, 3).toString(), tableDecano.getValueAt(fila, 4).toString()));
                }
            }
        });
    }

    //#region inicializarComponentes
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoOficina = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        comboBoxSecretaria = new javax.swing.JComboBox<>();
        comboBoxDepartamento = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDecano = new javax.swing.JTable();

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        setClosable(true);
        setMaximizable(true);

        jLabel1.setText("Codigo Oficina");

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

        jLabel6.setText("Secretearia");

        jLabel7.setText("Departamento");

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
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(31, 31, 31)
                                .addComponent(comboBoxDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(25, 25, 25)
                                .addComponent(txtCodigoOficina, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(31, 31, 31)
                                .addComponent(comboBoxSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoOficina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(jLabel6)
                    .addComponent(comboBoxSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboBoxDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }
    //#endregion

    //#region Clase ComboBoxItem
    private class ComboBoxItem {
        private String id;
        private String nombre;

        public ComboBoxItem(String id, String nombre) {
            this.id = id;
            this.nombre = nombre;
        }

        @Override
        public String toString() {
            return nombre;
        }

        public String getId() {
            return id;
        }

        public String getNombre() {
            return nombre;
        }
    }
    //#endregion

    //#region Metodos

    private void limpiarCampos() {
        txtCodigoOficina.setText("");
        comboBoxDepartamento.setSelectedIndex(0);
        comboBoxSecretaria.setSelectedIndex(0);
    }

    private void cargarComboBoxSecretariaCB() {
        try {
            comboBoxSecretaria.removeAllItems();
            Empleado instsecretaria = new Empleado();
            ArrayList<String[]> secretarias = instsecretaria.obtenerSecretarias();
            for (String[] secretaria : secretarias) {
                comboBoxSecretaria.addItem(new ComboBoxItem(secretaria[0], secretaria[1]));
            }
        } catch (Exception e) {
            System.out.println("Error al cargar secretarias" + e.getMessage());
        }
    }

    private void cargarComboBoxDepartamentoCB() {
        try {
            comboBoxDepartamento.removeAllItems();
            Departamento instDepartamento = new Departamento();
            ArrayList<String[]> departamentos = instDepartamento.obtenerDepartamentosCB();
            for (String[] departamento : departamentos) {
                comboBoxDepartamento.addItem(new ComboBoxItem(departamento[0], departamento[1]));
            }
        } catch (Exception e) {
            System.out.println("Error al cargar departamentos" + e.getMessage());
        }
    }

    private void cargarTabla() {
        try {
            DefaultTableModel modelo = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            OficinaDeTrabajo instOficina = new OficinaDeTrabajo();
            tableDecano.setModel(modelo);
            ArrayList<String[]> oficinas = instOficina.obtenerOficinasDeTrabajo();
            modelo.addColumn("Codigo Oficina");
            modelo.addColumn("Id Departamento");
            modelo.addColumn("Nombre Departamento");
            modelo.addColumn("Cedula Secretaria");
            modelo.addColumn("Nombre Secretaria");
            for (String[] oficina : oficinas) {
                modelo.addRow(oficina);
            }
        } catch (Exception e) {
            System.out.println("Error al cargar tabla" + e.getMessage());
        }
    }

    //#endregion

    //#region eventos

    public void onFrameOpened() {
        cargarComboBoxSecretariaCB();
        cargarComboBoxDepartamentoCB();
        cargarTabla();
    }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        limpiarCampos();
    }

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    //#endregion

    //#region Variables declaration
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<ComboBoxItem> comboBoxDepartamento; // Cambiado a ComboBoxItem
    private javax.swing.JComboBox<ComboBoxItem> comboBoxSecretaria; // Cambiado a ComboBoxItem
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableDecano;
    private javax.swing.JTextField txtCodigoOficina;
    //#endregion
}