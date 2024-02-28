

package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.Controladora;
import com.mycompany.peluqueriacanina.logica.Mascota;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class EditarDatos extends javax.swing.JFrame {

    Controladora control = null;
    int num_cliente;
    Mascota mascota;
    
    /** Creates new form EditarDatos */
    public EditarDatos(int num_cliente) {
        control = new Controladora();
        //this.num_cliente = num_cliente;
        initComponents();
        cargarDatos(num_cliente);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerEditarDatos = new javax.swing.JPanel();
        appTitle = new javax.swing.JLabel();
        containerLabelsAndTextFields = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        labelColor = new javax.swing.JLabel();
        labelAlergico = new javax.swing.JLabel();
        labelAtencionEspecial = new javax.swing.JLabel();
        labelRaza = new javax.swing.JLabel();
        labelNombreDuenio = new javax.swing.JLabel();
        labelCelularDuenio = new javax.swing.JLabel();
        labelObservaciones = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtNombreDuenio = new javax.swing.JTextField();
        txtCelularDuenio = new javax.swing.JTextField();
        txtObservaciones = new javax.swing.JScrollPane();
        txtAreaObservaciones = new javax.swing.JTextArea();
        cmbAtencionEspecial = new javax.swing.JComboBox<>();
        cmbAlergico = new javax.swing.JComboBox<>();
        labelImageEditarDatos = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        appTitle.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        appTitle.setText("Editar Datos");

        labelNombre.setText("Nombre:");

        labelColor.setText("Color:");

        labelAlergico.setText("Alergico:");

        labelAtencionEspecial.setText("Atencion Especial:");

        labelRaza.setText("Raza:");

        labelNombreDuenio.setText("Nombre Dueño:");

        labelCelularDuenio.setText("Celular Dueño:");

        labelObservaciones.setText("Observaciones:");

        txtAreaObservaciones.setColumns(20);
        txtAreaObservaciones.setRows(5);
        txtObservaciones.setViewportView(txtAreaObservaciones);

        cmbAtencionEspecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));

        cmbAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));

        javax.swing.GroupLayout containerLabelsAndTextFieldsLayout = new javax.swing.GroupLayout(containerLabelsAndTextFields);
        containerLabelsAndTextFields.setLayout(containerLabelsAndTextFieldsLayout);
        containerLabelsAndTextFieldsLayout.setHorizontalGroup(
            containerLabelsAndTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLabelsAndTextFieldsLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(containerLabelsAndTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(containerLabelsAndTextFieldsLayout.createSequentialGroup()
                        .addComponent(labelAlergico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbAlergico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(containerLabelsAndTextFieldsLayout.createSequentialGroup()
                        .addComponent(labelNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre))
                    .addGroup(containerLabelsAndTextFieldsLayout.createSequentialGroup()
                        .addComponent(labelObservaciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtObservaciones))
                    .addGroup(containerLabelsAndTextFieldsLayout.createSequentialGroup()
                        .addComponent(labelRaza)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRaza))
                    .addGroup(containerLabelsAndTextFieldsLayout.createSequentialGroup()
                        .addComponent(labelColor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtColor))
                    .addGroup(containerLabelsAndTextFieldsLayout.createSequentialGroup()
                        .addComponent(labelCelularDuenio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCelularDuenio))
                    .addGroup(containerLabelsAndTextFieldsLayout.createSequentialGroup()
                        .addGroup(containerLabelsAndTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNombreDuenio)
                            .addComponent(labelAtencionEspecial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(containerLabelsAndTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreDuenio)
                            .addComponent(cmbAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        containerLabelsAndTextFieldsLayout.setVerticalGroup(
            containerLabelsAndTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLabelsAndTextFieldsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(containerLabelsAndTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(containerLabelsAndTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRaza)
                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(containerLabelsAndTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelColor)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(containerLabelsAndTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAlergico)
                    .addComponent(cmbAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(containerLabelsAndTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAtencionEspecial)
                    .addComponent(cmbAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(containerLabelsAndTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreDuenio)
                    .addComponent(txtNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(containerLabelsAndTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCelularDuenio)
                    .addComponent(txtCelularDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(containerLabelsAndTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelObservaciones)
                    .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        labelImageEditarDatos.setIcon(new javax.swing.ImageIcon("C:\\Users\\Probando Uno\\OneDrive\\Escritorio\\4800_10_09.jpg")); // NOI18N

        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Probando Uno\\OneDrive\\Escritorio\\editar.png")); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Probando Uno\\OneDrive\\Escritorio\\escoba.png")); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containerEditarDatosLayout = new javax.swing.GroupLayout(containerEditarDatos);
        containerEditarDatos.setLayout(containerEditarDatosLayout);
        containerEditarDatosLayout.setHorizontalGroup(
            containerEditarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerEditarDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(containerEditarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerEditarDatosLayout.createSequentialGroup()
                        .addComponent(containerLabelsAndTextFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelImageEditarDatos)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerEditarDatosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(appTitle)
                        .addGap(265, 265, 265))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerEditarDatosLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(btnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addGap(133, 133, 133))
        );
        containerEditarDatosLayout.setVerticalGroup(
            containerEditarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerEditarDatosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(appTitle)
                .addGroup(containerEditarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerEditarDatosLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(labelImageEditarDatos))
                    .addGroup(containerEditarDatosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(containerLabelsAndTextFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(containerEditarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerEditarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerEditarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String nombre = txtNombre.getText();
        String color = txtColor.getText();
        String raza = txtRaza.getText();
        String observaciones = txtAreaObservaciones.getText();
        String alergico = (String) cmbAlergico.getSelectedItem();
        String atencionEspecial = (String) cmbAtencionEspecial.getSelectedItem();
        
        String nombre_duenio = txtNombreDuenio.getText();
        String celular = txtCelularDuenio.getText();

        control.editarMascota(mascota, nombre, color, raza, observaciones, alergico, atencionEspecial, nombre_duenio, celular);

        mostrarMensaje("Edición realizada correctamente", "Info", "Edicion correcta");
        
        VerDatos ver = new VerDatos();
        ver.setVisible(true);
        ver.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNombre.setText("");
        txtColor.setText("");
        txtRaza.setText("");
        txtNombreDuenio.setText("");
        txtCelularDuenio.setText("");
        txtAreaObservaciones.setText("");
        cmbAlergico.setSelectedIndex(0);
        cmbAtencionEspecial.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appTitle;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbAlergico;
    private javax.swing.JComboBox<String> cmbAtencionEspecial;
    private javax.swing.JPanel containerEditarDatos;
    private javax.swing.JPanel containerLabelsAndTextFields;
    private javax.swing.JLabel labelAlergico;
    private javax.swing.JLabel labelAtencionEspecial;
    private javax.swing.JLabel labelCelularDuenio;
    private javax.swing.JLabel labelColor;
    private javax.swing.JLabel labelImageEditarDatos;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombreDuenio;
    private javax.swing.JLabel labelObservaciones;
    private javax.swing.JLabel labelRaza;
    private javax.swing.JTextArea txtAreaObservaciones;
    private javax.swing.JTextField txtCelularDuenio;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreDuenio;
    private javax.swing.JScrollPane txtObservaciones;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos(int num_cliente) {
        this.mascota = control.traerMascota(num_cliente);
        
        txtNombre.setText(mascota.getNombre());
        txtColor.setText(mascota.getColor());
        txtRaza.setText(mascota.getRaza());
        txtNombreDuenio.setText(mascota.getDuenio().getNombre());
        txtCelularDuenio.setText(mascota.getDuenio().getCelular());
        txtAreaObservaciones.setText(mascota.getObservaciones());
        
        if (mascota.getAlergico().equalsIgnoreCase("Si")) {
            cmbAlergico.setSelectedIndex(1);
        } else if (mascota.getAlergico().equalsIgnoreCase("No")) {
            cmbAlergico.setSelectedIndex(2);
        } else {
            cmbAlergico.setSelectedIndex(0);
        }
        
        if (mascota.getAtencion_especial().equalsIgnoreCase("Si")) {
             cmbAtencionEspecial.setSelectedIndex(1);
        } else if (mascota.getAtencion_especial().equalsIgnoreCase("No")) {
            cmbAtencionEspecial.setSelectedIndex(2);
        } else {
            cmbAtencionEspecial.setSelectedIndex(0);
        }
    }
    
    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

}
