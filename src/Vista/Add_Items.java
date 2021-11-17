/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Clases.Inventario;
import java.awt.Toolkit;
import Clases.Producto;
import Controlador.Operaciones;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose angel
 */
public class Add_Items extends javax.swing.JFrame {

    Operaciones validaciones = new Operaciones();
    public Inventario Inventario = new Inventario();
    public Producto producto = new Producto();

    /**
     * Creates new form No_sé
     */
    public Add_Items() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/stock.png")));
    }

    void Limpiar() {

        TXTID.setText("");
        TXTArticulo.setText("");
        TXTPrecio.setText("");
        TXTExistencias.setText("");

    }

    void habilita(boolean answer) {
        TXTID.setEnabled(answer);
        TXTArticulo.setEnabled(answer);
        TXTPrecio.setEnabled(answer);
        TXTExistencias.setEnabled(answer);

    }

    public void ImprimirLista() {
        if (Inventario.getTamano() > 0) {
            for (int j = 0; j < Inventario.getTamano(); j++) {
                JTable.setValueAt(Inventario.posicionProducto(j).getId(), j, 0);
                JTable.setValueAt(Inventario.posicionProducto(j).getArticulo().toUpperCase(), j, 1);
                JTable.setValueAt(Inventario.posicionProducto(j).getPrecio(), j, 2);
                JTable.setValueAt(Inventario.posicionProducto(j).getStock(), j, 3);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay productos guardados", "Validación de datos", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TXTExistencias = new javax.swing.JTextField();
        TXTPrecio = new javax.swing.JTextField();
        TXTArticulo = new javax.swing.JTextField();
        TXTID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable = new javax.swing.JTable();
        JTitulo = new javax.swing.JLabel();
        JBSalir = new javax.swing.JButton();
        JBImprimir = new javax.swing.JButton();
        JBAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TXTExistencias.setBackground(new java.awt.Color(255, 255, 255));
        TXTExistencias.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Existencias:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12))); // NOI18N

        TXTPrecio.setBackground(new java.awt.Color(255, 255, 255));
        TXTPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Precio:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12))); // NOI18N

        TXTArticulo.setBackground(new java.awt.Color(255, 255, 255));
        TXTArticulo.setForeground(new java.awt.Color(0, 0, 0));
        TXTArticulo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Articulo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12))); // NOI18N

        TXTID.setBackground(new java.awt.Color(255, 255, 255));
        TXTID.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12))); // NOI18N
        TXTID.setSelectedTextColor(new java.awt.Color(204, 255, 255));

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        JTable.setAutoCreateRowSorter(true);
        JTable.setBackground(new java.awt.Color(255, 255, 255));
        JTable.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Articulo", "Precio", "Existencias"
            }
        ));
        JTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JTable.setSelectionBackground(new java.awt.Color(204, 255, 255));
        JTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        JTable.setShowHorizontalLines(true);
        JTable.setShowVerticalLines(true);
        jScrollPane1.setViewportView(JTable);

        JTitulo.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        JTitulo.setForeground(new java.awt.Color(0, 0, 0));
        JTitulo.setText("Inventario");

        JBSalir.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        JBSalir.setForeground(new java.awt.Color(0, 0, 0));
        JBSalir.setText("Salir");
        JBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalirActionPerformed(evt);
            }
        });

        JBImprimir.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        JBImprimir.setForeground(new java.awt.Color(0, 0, 0));
        JBImprimir.setText("Imprimir");
        JBImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBImprimirActionPerformed(evt);
            }
        });

        JBAgregar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        JBAgregar.setForeground(new java.awt.Color(0, 0, 0));
        JBAgregar.setText("Agregar");
        JBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TXTExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TXTArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TXTID, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TXTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(JTitulo)
                        .addGap(220, 220, 220))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(JTitulo)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBSalir)
                        .addGap(18, 18, 18)
                        .addComponent(JBAgregar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBImprimir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JBSalirActionPerformed

    private void JBImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBImprimirActionPerformed
        ImprimirLista();
    }//GEN-LAST:event_JBImprimirActionPerformed

    private void JBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAgregarActionPerformed
        if (!validaciones.Esnumero(TXTID.getText().trim()) || TXTID.getText().trim().isEmpty() || Long.parseLong(TXTID.getText().trim()) < 0) {
            JOptionPane.showMessageDialog(null, "No es un ID válido o debe ingresar algún id no negativo", "Validación de datos", JOptionPane.ERROR_MESSAGE);
        } else {
            if (!validaciones.Estexto(TXTArticulo.getText().toUpperCase().trim()) || TXTArticulo.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No es un nombre valido o campo vacio", "Validación de datos", JOptionPane.ERROR_MESSAGE);
            } else {
                if (!validaciones.Esnumero(TXTPrecio.getText().trim()) || TXTPrecio.getText().trim().isEmpty() || Long.parseLong(TXTPrecio.getText().trim()) < 0) {
                    JOptionPane.showMessageDialog(null, "No es un Precio válido o debe ingresar algún precio no negativo", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (!validaciones.Esnumero(TXTExistencias.getText().trim()) || TXTExistencias.getText().trim().isEmpty() || Long.parseLong(TXTExistencias.getText().trim()) < 0) {
                        JOptionPane.showMessageDialog(null, "No es un numero válido o debe ingresar algún numero no negativo", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                    } else {

                        producto = new Producto(TXTID.getText(), TXTArticulo.getText().toUpperCase(), TXTPrecio.getText().toUpperCase(), TXTExistencias.getText().toUpperCase(), Inventario);

                        Inventario.agregar(producto);

                        Limpiar();
                        habilita(true);
                        JOptionPane.showMessageDialog(null, "Procucto Guardado", "Ingreso de Datos", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }
    }//GEN-LAST:event_JBAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Items().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAgregar;
    private javax.swing.JButton JBImprimir;
    private javax.swing.JButton JBSalir;
    private javax.swing.JTable JTable;
    private javax.swing.JLabel JTitulo;
    private javax.swing.JTextField TXTArticulo;
    private javax.swing.JTextField TXTExistencias;
    private javax.swing.JTextField TXTID;
    private javax.swing.JTextField TXTPrecio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
