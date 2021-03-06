package programacion.dam.tarea9.ventanas;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import programacion.dam.tarea9.beans.CuentaBancaria;
import programacion.dam.tarea9.util.Util;

/**
 *
 * @author Roach
 */
public class ListadoCuentas extends javax.swing.JPanel implements Serializable{

    // Atributos
    public DefaultTableModel modelo;
    private boolean existenDatos = false;
    
    /**
     * Creates new form ListadoCuentas
     */
    public ListadoCuentas() {
        initComponents();
    }

    /**
     * M�todo que pinta el panel en la ventana principal.
     * @return 
     */
    public JPanel ventanaCuenta() {
        // Pintamos los atributos mas importantes de los articulos.
        String[] columnas = {"C�digo de Cuenta", "Titular", "Saldo Actual"};
        modelo = new DefaultTableModel(null, columnas);

        tablaCuentasBancarias.setModel(modelo);
        // Cargamos la lista de cuentas bancarias.
        this.cargarListaCuentasBancarias();
        
        existenDatos = true;
        return this;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCuentasBancarias = new javax.swing.JTable();

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Listado de Cuentas");

        tablaCuentasBancarias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablaCuentasBancarias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CCC", "Titular", "Saldo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCuentasBancarias.setRowHeight(25);
        jScrollPane1.setViewportView(tablaCuentasBancarias);
        if (tablaCuentasBancarias.getColumnModel().getColumnCount() > 0) {
            tablaCuentasBancarias.getColumnModel().getColumn(0).setMinWidth(200);
            tablaCuentasBancarias.getColumnModel().getColumn(0).setPreferredWidth(250);
            tablaCuentasBancarias.getColumnModel().getColumn(1).setMinWidth(180);
            tablaCuentasBancarias.getColumnModel().getColumn(1).setPreferredWidth(180);
            tablaCuentasBancarias.getColumnModel().getColumn(2).setMinWidth(80);
            tablaCuentasBancarias.getColumnModel().getColumn(2).setPreferredWidth(80);
            tablaCuentasBancarias.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

// ***************************************************************************************************
// ************************************ Utilidades de la Clase ***************************************
// ***************************************************************************************************
    
    /**
     * M�todo auxiliar que limpia la tabla.
     */
    private void borrarTabla(){
        int longitud = tablaCuentasBancarias.getRowCount()-1;  
        for(int i = longitud; i >= 0; i--){
            modelo.removeRow(i);
        }
    }
    
    /**
     * M�todo que carga los articulos que se encuentran en la lista temporal,
     * y recoge los datos mas importantes para cargarlos en la tabla.
     */
    private void cargarListaCuentasBancarias(){
        // Liampiamos la tabla al cargar nuevas cuentas bancarias, para evitar duplicidades.
        if(existenDatos){
            borrarTabla();
        }
        
        ArrayList<CuentaBancaria> listaCuentas = Util.listarCuentasBancarias();
        
        for(CuentaBancaria cuenta : listaCuentas){
            // Creamos un array para recoger los datos necesarios de cada cuenta bancaria.
            String titular = cuenta.getTitular().getNombre().concat(" ").concat(cuenta.getTitular().getApellidos());
            String [] fila = {cuenta.getCcc(), titular, cuenta.getSaldo().toString().concat(" Euros")};
    
            // A�adimos a la tabla los datos de la cuenta actual.
            modelo.addRow(fila);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCuentasBancarias;
    // End of variables declaration//GEN-END:variables
}
