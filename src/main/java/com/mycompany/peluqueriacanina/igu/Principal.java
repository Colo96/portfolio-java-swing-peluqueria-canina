
package com.mycompany.peluqueriacanina.igu;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerPrincipal = new javax.swing.JPanel();
        appTitle = new javax.swing.JLabel();
        containerBtns = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnCargarDatos = new javax.swing.JButton();
        btnVerDatos = new javax.swing.JButton();
        labelImagePrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        appTitle.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        appTitle.setText("Peluqueria Canina");

        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnCargarDatos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCargarDatos.setText("Cargar Datos");
        btnCargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarDatosActionPerformed(evt);
            }
        });

        btnVerDatos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVerDatos.setText("Ver Datos");
        btnVerDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containerBtnsLayout = new javax.swing.GroupLayout(containerBtns);
        containerBtns.setLayout(containerBtnsLayout);
        containerBtnsLayout.setHorizontalGroup(
            containerBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerBtnsLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(containerBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCargarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        containerBtnsLayout.setVerticalGroup(
            containerBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerBtnsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCargarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVerDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );

        labelImagePrincipal.setIcon(new javax.swing.ImageIcon("C:\\Users\\Probando Uno\\OneDrive\\Documentos\\NetBeansProjects\\PeluqueriaCanina\\src\\main\\resources\\4800_10_09.jpg")); // NOI18N

        javax.swing.GroupLayout containerPrincipalLayout = new javax.swing.GroupLayout(containerPrincipal);
        containerPrincipal.setLayout(containerPrincipalLayout);
        containerPrincipalLayout.setHorizontalGroup(
            containerPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(appTitle)
                .addGap(232, 232, 232))
            .addGroup(containerPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(containerBtns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(labelImagePrincipal)
                .addGap(40, 40, 40))
        );
        containerPrincipalLayout.setVerticalGroup(
            containerPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPrincipalLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(appTitle)
                .addGroup(containerPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(containerBtns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(containerPrincipalLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(labelImagePrincipal)
                        .addContainerGap(52, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarDatosActionPerformed
        CargaDatos cargar = new CargaDatos();
        cargar.setVisible(true);
        cargar.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCargarDatosActionPerformed

    private void btnVerDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDatosActionPerformed
        VerDatos visualizar = new VerDatos();
        visualizar.setVisible(true);
        visualizar.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVerDatosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appTitle;
    private javax.swing.JButton btnCargarDatos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerDatos;
    private javax.swing.JPanel containerBtns;
    private javax.swing.JPanel containerPrincipal;
    private javax.swing.JLabel labelImagePrincipal;
    // End of variables declaration//GEN-END:variables
}
