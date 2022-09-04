/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import departamento.Mantenimiento;
import entidades.Proveedor;
import java.awt.Image;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ROBERT
 */
public class proveedor extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    Mantenimiento oM = new Mantenimiento();

    public proveedor() {

        initComponents();
        oM = new Mantenimiento();
        oM.getTp().Consultar();
        /*------------------------------------------------------------------*/
        setSize(650, 380);
        setResizable(false);//evitar que se mueva sus dimensiones
        setLocationRelativeTo(null);//mantenerlo en el centro
        setTitle("Ventana para proveedores");

        ImageIcon proveedor_fondo = new ImageIcon("src/images/interfaz_proveedor.jpg");
        Icon icono = new ImageIcon(proveedor_fondo.getImage().getScaledInstance(jLabel_proveedor.getWidth(), jLabel_proveedor.getHeight(), Image.SCALE_DEFAULT));

        jLabel_proveedor.setIcon(icono);
        this.repaint();
        /*------------------------------------------------------------------*/
        model = new DefaultTableModel();
//        model.addColumn("N°");
        model.addColumn("Codigo");
        model.addColumn("Nombre");
        model.addColumn("Ruc");

        tabla_proveedor.setModel(model);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jL_nombre = new javax.swing.JLabel();
        txt_barra = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        btn_nuevo = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_proveedor = new javax.swing.JTable();
        jLabel_proveedor = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jL_nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jL_nombre.setForeground(new java.awt.Color(255, 255, 255));
        jL_nombre.setText("Nombre");
        getContentPane().add(jL_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));
        getContentPane().add(txt_barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 310, 30));

        btn_buscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(0, 0, 0));
        btn_buscar.setText("Buscar");
        btn_buscar.setBorder(null);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 80, 30));

        btn_nuevo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_nuevo.setForeground(new java.awt.Color(0, 0, 0));
        btn_nuevo.setText("Nuevo");
        btn_nuevo.setBorder(null);
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 80, 30));

        btn_modificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_modificar.setForeground(new java.awt.Color(0, 0, 0));
        btn_modificar.setText("Modificar");
        btn_modificar.setBorder(null);
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 80, 30));

        btn_eliminar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(0, 0, 0));
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setBorder(null);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 80, 30));

        btn_salir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(0, 0, 0));
        btn_salir.setText("Salir");
        btn_salir.setBorder(null);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 80, 30));

        tabla_proveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Codigo", "Nombre", "RUC"
            }
        ));
        jScrollPane1.setViewportView(tabla_proveedor);
        if (tabla_proveedor.getColumnModel().getColumnCount() > 0) {
            tabla_proveedor.getColumnModel().getColumn(2).setPreferredWidth(80);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 530, 160));
        getContentPane().add(jLabel_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 658, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        Nuevo_Proveedor onpV = new Nuevo_Proveedor(this);
        onpV.setVisible(true);

    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed


    this.oM.getTp().Guardar();
        this.setVisible(false);
        SUPERMERCADO os = new SUPERMERCADO();
        os.setVisible(true);

    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

        /*limpio la tabla antes de mostrar*/
        int fila = tabla_proveedor.getRowCount();
        for (int i = fila - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        //muestro -> con las lineas de arriba el codigo ya no se repite si encaso vuelva a preionar en buscar
        List<entidades.Proveedor> lpro;
        lpro = oM.getTp().Seleccionar(txt_barra.getText());
//        JOptionPane.showInternalMessageDialog(null, lpro.size(), "cantidad filtro", JOptionPane.INFORMATION_MESSAGE);
        String[] columns = new String[3];
//        row += 1;
        for (int i = 0; i < lpro.size(); i++) {
//            columns[0] = Integer.toString(model.getRowCount() + 1);
            columns[0] = lpro.get(i).getCodigo();
            columns[1] = lpro.get(i).getNombres();
            columns[2] = lpro.get(i).getRuc();
            model.addRow(columns);
        }


    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed

        Modificar_Proveedor opV = new Modificar_Proveedor(this);
        opV.setVisible(true);

    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
           
        Proveedor op = new Proveedor();
        int row = this.tabla_proveedor.getSelectedRow(); //selecciono la fila que deseo eliminar
         
        if (row >= 0) {


                String codElimniar = (String)tabla_proveedor.getValueAt(row, 0); //ene ste caso es row->fila  y  1->la columna codigo
                op.setCodigo(codElimniar);
                    this.oM.getTp().Eliminar(op);
            model.removeRow(row); //elimino de la fila
            

        } else {
            JOptionPane.showMessageDialog(null, "No hay proveedor seleccionados", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_btn_eliminarActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new proveedor().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_salir;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jL_nombre;
    private javax.swing.JLabel jLabel_proveedor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_proveedor;
    private javax.swing.JTextField txt_barra;
    // End of variables declaration//GEN-END:variables
}