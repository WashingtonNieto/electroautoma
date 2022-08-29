/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ClienteControlador;
import Controlador.MuestraControlador;
import Modelo.Cliente;
import Modelo.Muestra;
import conexion.conexionMysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmGeneral extends javax.swing.JFrame {

    /**
     * Creates new form frmGeneral
     */
    public frmGeneral() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtpGeneral = new javax.swing.JTabbedPane();
        jpClientes = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblTelefono = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        btnBuscarCliente = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        btnActualizarCliente = new javax.swing.JButton();
        txtNit = new javax.swing.JTextField();
        btnBorrarCliente = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        txtContacto = new javax.swing.JTextField();
        btnCrearCliente = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        lblRegistroCliente = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jpMuestras = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblDescripcion = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        lblRegistroMuestra = new javax.swing.JLabel();
        lblCodigoMuestra = new javax.swing.JLabel();
        lblReferencia = new javax.swing.JLabel();
        txtIdMuestra = new javax.swing.JTextField();
        txtReferencia = new javax.swing.JTextField();
        lblCodigoInforme = new javax.swing.JLabel();
        lblCodigoUsuario = new javax.swing.JLabel();
        txtIdInforme = new javax.swing.JTextField();
        txtIdUsuario = new javax.swing.JTextField();
        lblFechaIngreso = new javax.swing.JLabel();
        txtFechaIngreso = new javax.swing.JTextField();
        lblFechaMaximaEmision = new javax.swing.JLabel();
        txtFechaMaximaEmision = new javax.swing.JTextField();
        btnCrearMuestra = new javax.swing.JButton();
        btnBuscarMuestra = new javax.swing.JButton();
        btnActualizarMuestra = new javax.swing.JButton();
        btnBorrarMuestra = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMuestras = new javax.swing.JTable();
        jpSeguimiento = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTelefono.setText("Teléfono");

        lblNombre.setText("Nombre / Razón Social:");

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        lblApellido.setText("Cédula / Nit");

        lblDireccion.setText("Dirección");

        lblCorreo.setText("E-mail");

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        lblUsuario.setText("Persona de contacto:");

        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btnActualizarCliente.setText("Actualizar");
        btnActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarClienteActionPerformed(evt);
            }
        });

        btnBorrarCliente.setText("Borrar");
        btnBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarClienteActionPerformed(evt);
            }
        });

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblClientes);

        btnCrearCliente.setText("Crear");
        btnCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearClienteActionPerformed(evt);
            }
        });

        lblRegistroCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRegistroCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistroCliente.setText("CLIENTE");

        lblId.setText("Id");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRegistroCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre)
                                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblApellido)
                                    .addComponent(lblUsuario)
                                    .addComponent(lblTelefono)
                                    .addComponent(lblDireccion)
                                    .addComponent(lblCorreo))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(btnBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 149, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblRegistroCliente)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireccion))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearCliente)
                    .addComponent(btnBuscarCliente)
                    .addComponent(btnActualizarCliente)
                    .addComponent(btnBorrarCliente))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        javax.swing.GroupLayout jpClientesLayout = new javax.swing.GroupLayout(jpClientes);
        jpClientes.setLayout(jpClientesLayout);
        jpClientesLayout.setHorizontalGroup(
            jpClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpClientesLayout.setVerticalGroup(
            jpClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtpGeneral.addTab("Clientes", jpClientes);

        lblDescripcion.setText("Descripción");

        lblRegistroMuestra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRegistroMuestra.setText("REGISTRO DE LA MUESTRA");

        lblCodigoMuestra.setText("Código de la muestra");

        lblReferencia.setText("Referencia");

        lblCodigoInforme.setText("Código de informe");

        lblCodigoUsuario.setText("Código de usuario");

        lblFechaIngreso.setText("Fecha de Ingreso");

        lblFechaMaximaEmision.setText("Fecha Máxima Emisión");

        btnCrearMuestra.setText("Crear");
        btnCrearMuestra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearMuestraActionPerformed(evt);
            }
        });

        btnBuscarMuestra.setText("Buscar");
        btnBuscarMuestra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMuestraActionPerformed(evt);
            }
        });

        btnActualizarMuestra.setText("Actualizar");
        btnActualizarMuestra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarMuestraActionPerformed(evt);
            }
        });

        btnBorrarMuestra.setText("Borrar");
        btnBorrarMuestra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarMuestraActionPerformed(evt);
            }
        });

        tblMuestras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblMuestras);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(323, 323, 323)
                                .addComponent(lblRegistroMuestra))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCodigoMuestra)
                                            .addComponent(lblCodigoInforme)
                                            .addComponent(lblCodigoUsuario)
                                            .addComponent(lblFechaIngreso)
                                            .addComponent(lblFechaMaximaEmision))
                                        .addGap(61, 61, 61)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtIdInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtIdMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtFechaMaximaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lblDescripcion)
                                    .addComponent(lblReferencia)
                                    .addComponent(txtDescripcion))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnCrearMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(btnBuscarMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(btnActualizarMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(btnBorrarMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblRegistroMuestra)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoMuestra))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdInforme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoInforme))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReferencia))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoUsuario))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaIngreso))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaMaximaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaMaximaEmision))
                .addGap(16, 16, 16)
                .addComponent(lblDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearMuestra)
                    .addComponent(btnBuscarMuestra)
                    .addComponent(btnActualizarMuestra)
                    .addComponent(btnBorrarMuestra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpMuestrasLayout = new javax.swing.GroupLayout(jpMuestras);
        jpMuestras.setLayout(jpMuestrasLayout);
        jpMuestrasLayout.setHorizontalGroup(
            jpMuestrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMuestrasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpMuestrasLayout.setVerticalGroup(
            jpMuestrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMuestrasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtpGeneral.addTab("Muestras", jpMuestras);

        javax.swing.GroupLayout jpSeguimientoLayout = new javax.swing.GroupLayout(jpSeguimiento);
        jpSeguimiento.setLayout(jpSeguimientoLayout);
        jpSeguimientoLayout.setHorizontalGroup(
            jpSeguimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 858, Short.MAX_VALUE)
        );
        jpSeguimientoLayout.setVerticalGroup(
            jpSeguimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );

        jtpGeneral.addTab("Seguimiento", jpSeguimiento);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtpGeneral)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtpGeneral)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ClienteControlador controladorCliente = new ClienteControlador();
    MuestraControlador controladorMuestra = new MuestraControlador();

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        // TODO add your handling code here:

        //borrar campos
        //borrarCamposFormulario();
        int id = Integer.parseInt(txtId.getText());
        Cliente cliente = controladorCliente.findCliente(id);
        if (cliente == null) {
            JOptionPane.showMessageDialog(this, "El Cliente no fue encontrado!");
        } else {
            txtNombre.setText(cliente.nombre);
            txtNit.setText(cliente.nit);
            txtContacto.setText(cliente.contacto);
            txtTelefono.setText(cliente.telefono);
            txtDireccion.setText(cliente.direccion);
            txtEmail.setText(cliente.email);
        }

    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarClienteActionPerformed
        // TODO add your handling code here:

        int id = Integer.parseInt(txtId.getText());
        String nombre = txtNombre.getText();
        String nit = txtNit.getText();
        String contacto = txtContacto.getText();
        String telefono = txtTelefono.getText();
        String direccion = txtDireccion.getText();
        String email = txtEmail.getText();

        boolean seActualizo = controladorCliente.updateCliente(id, nombre, nit, contacto, telefono, direccion, email);
        if (seActualizo) {
            JOptionPane.showMessageDialog(this, "El cliente se actualizó correctamente");
        } else {
            JOptionPane.showMessageDialog(this, "Hubo un error al actualizar el cliente");
        }

        llenarTablaClientes();

    }//GEN-LAST:event_btnActualizarClienteActionPerformed

    private void btnBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarClienteActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtId.getText());
        if (controladorCliente.deleteCliente(id)) {
            JOptionPane.showMessageDialog(this, "El Cliente se eliminó!");
        } else {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error el Cliente no se eliminó!");
        }
        llenarTablaClientes();

    }//GEN-LAST:event_btnBorrarClienteActionPerformed

    private void btnCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearClienteActionPerformed

        String nombre = txtNombre.getText();
        String nit = txtNit.getText();
        String contacto = txtContacto.getText();
        String telefono = txtTelefono.getText();
        String direccion = txtDireccion.getText();
        String email = txtEmail.getText();

        if (nombre.isEmpty() || nit.isEmpty() || contacto.isEmpty() || telefono.isEmpty() || direccion.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe completar los datos! ");
        } else {

            boolean seInserto = controladorCliente.insertCliente(nombre, nit, contacto, telefono, direccion, email);
            if (seInserto) {
                JOptionPane.showMessageDialog(this, "Datos Guardados correctamente");
            } else {
                JOptionPane.showMessageDialog(this, "Error al guardar datos");
            }
        }

        llenarTablaClientes();

    }//GEN-LAST:event_btnCrearClienteActionPerformed

    private void btnCrearMuestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearMuestraActionPerformed
        // TODO add your handling code here:

        int id_informe = Integer.parseInt(txtIdInforme.getText());
        String referencia = txtReferencia .getText();
        int id_usuario = Integer.parseInt(txtIdUsuario.getText());
        String fecha_ingreso = txtFechaIngreso.getText();
        String fecha_max_emision = txtFechaMaximaEmision.getText();
        String descripcion = txtDescripcion.getText();
        
        
        //if int id_informe =0 {
        //    JOptionPane.showMessageDialog(null, "Debe completar los datos! ");
        //}
        //if (val(id_informe)=null || referencia.isEmpty() || val(id_usuario)=null || fecha_ingreso.isEmpty() || fecha_max_emision.isEmpty() || descripcion.isEmpty()) {
        //    JOptionPane.showMessageDialog(null, "Debe completar los datos! ");
        //} else {

            boolean seInserto = controladorMuestra.insertMuestra(id_informe, referencia, id_usuario, fecha_ingreso, fecha_max_emision, descripcion);
            if (seInserto) {
                JOptionPane.showMessageDialog(this, "Datos Guardados correctamente");
            } else {
                JOptionPane.showMessageDialog(this, "Error al guardar datos");
            }
        //}

        llenarTablaMuestras();
    }//GEN-LAST:event_btnCrearMuestraActionPerformed

    private void btnBuscarMuestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMuestraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarMuestraActionPerformed

    private void btnActualizarMuestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarMuestraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarMuestraActionPerformed

    private void btnBorrarMuestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarMuestraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarMuestraActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGeneral().setVisible(true);
            }
        });
    }
    
    public void llenarTablaClientes(){
        ArrayList<Cliente> listaClientes = controladorCliente.SelectCliente();
        int filas = listaClientes.size();
        int columnas = 7;
        Object[][] datos = new Object[filas][columnas];
        int i = 0;
        for (Cliente cliente : listaClientes){
            datos[i][0] = cliente.id;
            datos[i][1] = cliente.nombre;
            datos[i][2] = cliente.nit;
            datos[i][3] = cliente.contacto;
            datos[i][4] = cliente.telefono;
            datos[i][5] = cliente.direccion;
            datos[i][6] = cliente.email;
            i++;
        }
        Object[] encabezados = {"Id", "Nombre","Nit","Contacto","Telefono","Direccion","Email"};
        DefaultTableModel modelo = new DefaultTableModel(datos, encabezados);
        tblClientes.setModel(modelo);
    }

    public void llenarTablaMuestras(){
        ArrayList<Muestra> listaMuestras = controladorMuestra.SelectMuestra();
        int filas = listaMuestras.size();
        int columnas = 7;
        Object[][] datos = new Object[filas][columnas];
        int i = 0;
        for (Muestra muestra : listaMuestras){
            datos[i][0] = muestra.id_muestra;
            datos[i][1] = muestra.id_informe;
            datos[i][2] = muestra.referencia;
            datos[i][3] = muestra.id_usuario;
            datos[i][4] = muestra.fecha_ingreso;
            datos[i][5] = muestra.fecha_max_emision;
            datos[i][6] = muestra.descripcion;
            i++;
        }
        Object[] encabezados = {"Id_muestra", "Id_informe","Referencia","Id_usuario","Fecha_ingreso","Fecha_max_emision","Descripcion"};
        DefaultTableModel modelo = new DefaultTableModel(datos, encabezados);
        tblMuestras.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCliente;
    private javax.swing.JButton btnActualizarMuestra;
    private javax.swing.JButton btnBorrarCliente;
    private javax.swing.JButton btnBorrarMuestra;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarMuestra;
    private javax.swing.JButton btnCrearCliente;
    private javax.swing.JButton btnCrearMuestra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpClientes;
    private javax.swing.JPanel jpMuestras;
    private javax.swing.JPanel jpSeguimiento;
    private javax.swing.JTabbedPane jtpGeneral;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCodigoInforme;
    private javax.swing.JLabel lblCodigoMuestra;
    private javax.swing.JLabel lblCodigoUsuario;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFechaIngreso;
    private javax.swing.JLabel lblFechaMaximaEmision;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblReferencia;
    private javax.swing.JLabel lblRegistroCliente;
    private javax.swing.JLabel lblRegistroMuestra;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTable tblMuestras;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFechaIngreso;
    private javax.swing.JTextField txtFechaMaximaEmision;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdInforme;
    private javax.swing.JTextField txtIdMuestra;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtReferencia;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
