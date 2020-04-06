package programacion.dam.tarea9.ventanas;

/**
 *
 * @author Roach
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBotones = new javax.swing.JPanel();
        bCuentaNueva = new javax.swing.JButton();
        bCuentasDisponibles = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbListaCuentas = new javax.swing.JComboBox<>();
        bDatosCuenta = new javax.swing.JButton();
        bIngresar = new javax.swing.JButton();
        bRetirar = new javax.swing.JButton();
        bConsultarSaldo = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jtAccionesPrincipales = new javax.swing.JToolBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBotones.setToolTipText("");

        bCuentaNueva.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        bCuentaNueva.setText("Nueva Cuenta");
        bCuentaNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCuentaNuevaActionPerformed(evt);
            }
        });

        bCuentasDisponibles.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        bCuentasDisponibles.setText("Cuentas Disponibles");
        bCuentasDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCuentasDisponiblesActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Cuenta");

        cbListaCuentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbListaCuentas.setSelectedIndex(-1);
        cbListaCuentas.setToolTipText("");
        cbListaCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbListaCuentasActionPerformed(evt);
            }
        });

        bDatosCuenta.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        bDatosCuenta.setText("Datos de la Cuenta");
        bDatosCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDatosCuentaActionPerformed(evt);
            }
        });

        bIngresar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        bIngresar.setText("Ingresar");
        bIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIngresarActionPerformed(evt);
            }
        });

        bRetirar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        bRetirar.setText("Retirar");
        bRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRetirarActionPerformed(evt);
            }
        });

        bConsultarSaldo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        bConsultarSaldo.setText("Consultar Saldo");
        bConsultarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsultarSaldoActionPerformed(evt);
            }
        });

        bSalir.setBackground(new java.awt.Color(204, 204, 0));
        bSalir.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        bSalir.setText("Salir");

        jSeparator1.setToolTipText("Trabajar con Cuenta");

        javax.swing.GroupLayout jPanelBotonesLayout = new javax.swing.GroupLayout(jPanelBotones);
        jPanelBotones.setLayout(jPanelBotonesLayout);
        jPanelBotonesLayout.setHorizontalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(bSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bConsultarSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bRetirar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bDatosCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbListaCuentas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bCuentaNueva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bCuentasDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap())
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBotonesLayout.setVerticalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bCuentaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bCuentasDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbListaCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(bDatosCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bConsultarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setText("Crear icono tipo bancario");

        jtAccionesPrincipales.setRollover(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                    .addComponent(jtAccionesPrincipales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtAccionesPrincipales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jtAccionesPrincipales.getAccessibleContext().setAccessibleParent(jPanelBotones);

        pack();
    }// </editor-fold>//GEN-END:initComponents

// ******************************************* Acciones Botones *************************************************
    
    /**
     * Acci�n para consultar el saldo de una cuenta seleccionada.
     * @param evt 
     */
    private void bConsultarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsultarSaldoActionPerformed
        // Crear Codigo
        
    }//GEN-LAST:event_bConsultarSaldoActionPerformed

    /**
     * Acci�n para crear una nueva cuenta
     * @param evt 
     */
    private void bCuentaNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCuentaNuevaActionPerformed
        // Crear Codigo
        
    }//GEN-LAST:event_bCuentaNuevaActionPerformed

    /**
     * Acci�n para ver las cuentas disponibles (ya creadas)
     * @param evt 
     */
    private void bCuentasDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCuentasDisponiblesActionPerformed
        // Crear Codigo
        
    }//GEN-LAST:event_bCuentasDisponiblesActionPerformed

    /**
     * Lista de cuentas (desplegable)
     * @param evt 
     */
    private void cbListaCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbListaCuentasActionPerformed
        // Crear Codigo
        
    }//GEN-LAST:event_cbListaCuentasActionPerformed

    /**
     * Acci�n para ver los datos de una cuenta seleccionada.
     * @param evt 
     */
    private void bDatosCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDatosCuentaActionPerformed
        // Crear Codigo
        
    }//GEN-LAST:event_bDatosCuentaActionPerformed

    /**
     * Acci�n para ingresar dinero en una cuenta seleccionada.
     * @param evt 
     */
    private void bIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIngresarActionPerformed
        // Crear Codigo
        
    }//GEN-LAST:event_bIngresarActionPerformed

    /**
     * Acci�n para retirar dinero en una cuenta seleccionada.
     * @param evt 
     */
    private void bRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRetirarActionPerformed
        // Crear Codigo
        
    }//GEN-LAST:event_bRetirarActionPerformed

// **************************************************************************************************************
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bConsultarSaldo;
    private javax.swing.JButton bCuentaNueva;
    private javax.swing.JButton bCuentasDisponibles;
    private javax.swing.JButton bDatosCuenta;
    private javax.swing.JButton bIngresar;
    private javax.swing.JButton bRetirar;
    private javax.swing.JButton bSalir;
    private javax.swing.JComboBox<String> cbListaCuentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToolBar jtAccionesPrincipales;
    // End of variables declaration//GEN-END:variables
}