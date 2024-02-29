
package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.Controladora;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class CargaDatos extends javax.swing.JFrame {

    Controladora control = new Controladora();
    
    public CargaDatos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerCargaDatos = new javax.swing.JPanel();
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
        labelImageCargaDatos = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(895, 700));

        appTitle.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        appTitle.setText("Carga de Datos");

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

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Probando Uno\\OneDrive\\Escritorio\\simbolo-de-formato-de-archivo-sav.png")); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
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

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Probando Uno\\OneDrive\\Escritorio\\4800_10_09.jpg")); // NOI18N

        javax.swing.GroupLayout containerCargaDatosLayout = new javax.swing.GroupLayout(containerCargaDatos);
        containerCargaDatos.setLayout(containerCargaDatosLayout);
        containerCargaDatosLayout.setHorizontalGroup(
            containerCargaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerCargaDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(containerCargaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerCargaDatosLayout.createSequentialGroup()
                        .addComponent(containerLabelsAndTextFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelImageCargaDatos)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerCargaDatosLayout.createSequentialGroup()
                        .addGap(0, 281, Short.MAX_VALUE)
                        .addComponent(appTitle)
                        .addGap(265, 265, 265))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerCargaDatosLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(btnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(133, 133, 133))
        );
        containerCargaDatosLayout.setVerticalGroup(
            containerCargaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerCargaDatosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(appTitle)
                .addGroup(containerCargaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerCargaDatosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(containerLabelsAndTextFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(containerCargaDatosLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(containerCargaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(labelImageCargaDatos))))
                .addGap(18, 18, 18)
                .addGroup(containerCargaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerCargaDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerCargaDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String alergico = (String) cmbAlergico.getSelectedItem();
        String atencionEspecial = (String) cmbAtencionEspecial.getSelectedItem();
        control.guardar(txtNombre.getText(), txtColor.getText(), txtRaza.getText(), txtNombreDuenio.getText(), txtCelularDuenio.getText(), alergico, atencionEspecial, txtAreaObservaciones.getText());
        
        JOptionPane optionPane = new JOptionPane("Se guardo correctamente!");
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("Guardado exitoso!");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appTitle;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbAlergico;
    private javax.swing.JComboBox<String> cmbAtencionEspecial;
    private javax.swing.JPanel containerCargaDatos;
    private javax.swing.JPanel containerLabelsAndTextFields;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelAlergico;
    private javax.swing.JLabel labelAtencionEspecial;
    private javax.swing.JLabel labelCelularDuenio;
    private javax.swing.JLabel labelColor;
    private javax.swing.JLabel labelImageCargaDatos;
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
}
