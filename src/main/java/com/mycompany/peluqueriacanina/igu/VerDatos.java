

package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.Controladora;
import com.mycompany.peluqueriacanina.logica.Mascota;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VerDatos extends javax.swing.JFrame {

    Controladora control = null;
    
    public VerDatos() {
        control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerVerDatos = new javax.swing.JPanel();
        appTitle = new javax.swing.JLabel();
        containerTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        labelTitleTable = new javax.swing.JLabel();
        btnElimonar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        appTitle.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        appTitle.setText("Visualizar Datos");

        containerTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        labelTitleTable.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitleTable.setText("Datos de mascotas:");

        btnElimonar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Probando Uno\\OneDrive\\Escritorio\\borrar.png")); // NOI18N
        btnElimonar.setText("Eliminar");
        btnElimonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimonarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Probando Uno\\OneDrive\\Escritorio\\editar.png")); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containerTableLayout = new javax.swing.GroupLayout(containerTable);
        containerTable.setLayout(containerTableLayout);
        containerTableLayout.setHorizontalGroup(
            containerTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerTableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(containerTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerTableLayout.createSequentialGroup()
                        .addComponent(labelTitleTable)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(containerTableLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(containerTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnElimonar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
        );
        containerTableLayout.setVerticalGroup(
            containerTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitleTable)
                .addGap(18, 18, 18)
                .addGroup(containerTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                    .addGroup(containerTableLayout.createSequentialGroup()
                        .addComponent(btnElimonar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout containerVerDatosLayout = new javax.swing.GroupLayout(containerVerDatos);
        containerVerDatos.setLayout(containerVerDatosLayout);
        containerVerDatosLayout.setHorizontalGroup(
            containerVerDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerVerDatosLayout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(appTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(containerVerDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(containerTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        containerVerDatosLayout.setVerticalGroup(
            containerVerDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerVerDatosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(appTitle)
                .addGap(18, 18, 18)
                .addComponent(containerTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerVerDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerVerDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnElimonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimonarActionPerformed
        if(table.getRowCount() > 0){
            if(table.getSelectedRow() != -1){
                int num_cliente = Integer.parseInt(String.valueOf(table.getValueAt(table.getSelectedRow(), 0)));
                control.borrarMascota(num_cliente);
                mostrarMensaje("Mascota eliminada correctamente!", "Info", "Borrado exitoso!");
                cargarTabla();
            }else {
                mostrarMensaje("No seleccionó ninguna mascota", "Error", "Borrado fallido!");
            }
        }else {
            mostrarMensaje("No hay nada para eliminar en la tabla", "Error", "Tabla vacia!");
        }
    }//GEN-LAST:event_btnElimonarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (table.getRowCount() > 0) {
            if (table.getSelectedRow() != -1) {
                int num_cliente = Integer.parseInt(String.valueOf(table.getValueAt(table.getSelectedRow(), 0)));
                EditarDatos editar = new EditarDatos(num_cliente);
                editar.setVisible(true);
                editar.setLocationRelativeTo(null);
                //control.editarMascota(num_cliente);
                this.dispose();
            } else {
                mostrarMensaje("No seleccionó ninguna mascota", "Error", "Borrado fallido!");
            }
        } else {
            mostrarMensaje("No hay nada para eliminar en la tabla", "Error", "Tabla vacia!");
        }
    }//GEN-LAST:event_btnEditarActionPerformed


    public void mostrarMensaje(String mensaje, String tipo, String titulo){
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);            
        }else if (tipo.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE); 
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appTitle;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnElimonar;
    private javax.swing.JPanel containerTable;
    private javax.swing.JPanel containerVerDatos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTitleTable;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        DefaultTableModel tableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        String titulos[] = {
            "Numero", "Nombre", "Color", "Raza", "Alergico", "At. Especial", "Duenio", "Celular", "Observaciones"
        };
        
        tableModel.setColumnIdentifiers(titulos);
        
        List<Mascota> mascotas = control.traerMascotas();
        if (mascotas != null) {
            for (Mascota mascota : mascotas) {
                Object[] objeto = {
                    mascota.getNumero_cliente(),
                    mascota.getNombre(),
                    mascota.getColor(),
                    mascota.getRaza(),
                    mascota.getAlergico(),
                    mascota.getAtencion_especial(),
                    mascota.getDuenio().getNombre(),
                    mascota.getDuenio().getCelular(),
                    mascota.getObservaciones()
                };
                tableModel.addRow(objeto);
            }
        }
        
        table.setModel(tableModel);
        
    }

}
