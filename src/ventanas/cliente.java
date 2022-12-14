package ventanas;

import departamento.Mantenimiento;
import entidades.Cliente;
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
public class cliente extends javax.swing.JFrame {

    Mantenimiento oM;
    DefaultTableModel model;

    public cliente() {
        initComponents();
        setSize(650, 380);
        setResizable(false);//evitar que se mueva sus dimensiones
        setLocationRelativeTo(null);//mantenerlo en el centro
        setTitle("Ventana para clientes");
        oM = new Mantenimiento();
        oM.getTc().Consultar();

        ImageIcon cliente_fondo = new ImageIcon("src/images/interfaz_cliente.jpg");
        Icon icono = new ImageIcon(cliente_fondo.getImage().getScaledInstance(jLabel_cliente.getWidth(), jLabel_cliente.getHeight(), Image.SCALE_DEFAULT));
        jLabel_cliente.setIcon(icono);
        this.repaint();

        model = new DefaultTableModel();
//        model.addColumn("N°");
        model.addColumn("Codigo");
        model.addColumn("DNI");
        model.addColumn("Nombre");
        model.addColumn("Direccion");
        tabla_cliente.setModel(model);

    }


    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jL_nombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        btn_nuevo = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_cliente = new javax.swing.JTable();
        jLabel_cliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jL_nombre.setBackground(new java.awt.Color(55, 55, 55));
        jL_nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jL_nombre.setForeground(new java.awt.Color(255, 255, 255));
        jL_nombre.setText("Nombre");
        getContentPane().add(jL_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 80, 20));

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 300, 30));

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 80, 30));

        btn_nuevo.setText("Nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 300, 70, -1));

        tabla_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla_cliente);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 520, 150));
        getContentPane().add(jLabel_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents


        
        
    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

        /*limpio la tabla antes de mostrar*/
        int fila = tabla_cliente.getRowCount();
        for (int i = fila - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        //muestro -> con las lineas de arriba el codigo ya no se repite si encaso vuelva a preionar en buscar

        List<entidades.Cliente> lcli;
        lcli = oM.getTc().Seleccionar(txt_nombre.getText());
        String[] columns = new String[4];
        for (int i = 0; i < lcli.size(); i++) {
//            columns[0] = Integer.toString(model.getRowCount() + 1);
            columns[0] = lcli.get(i).getCodigo();
            columns[1] = lcli.get(i).getDNI();
            columns[2] = lcli.get(i).getNombre();
            columns[3] = lcli.get(i).getDireccion();

            model.addRow(columns);
        }


    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
       
        Nuevo_Clientes ncv = new Nuevo_Clientes(this);
        ncv.setVisible(true);

    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed

        Cliente oC = new Cliente();
        int row = this.tabla_cliente.getSelectedRow(); //selecciono la fila que deseo eliminar

        if (row >= 0) {

 
            String codElimniar = (String) tabla_cliente.getValueAt(row, 0); //en ste caso es row->fila  y  1->la columna codigo
            oC.setCodigo(codElimniar);
            this.oM.getTc().Eliminar(oC);
            JOptionPane.showMessageDialog(this, "sizeCliente: "+ oM.getTc().size());
            model.removeRow(row); //elimino de la fila
            this.oM.getTc().Guardar();
            

        } else {
            JOptionPane.showMessageDialog(null, "No hay producto seleccionados", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        
         Modificar_Cliente ocV = new Modificar_Cliente(this);
        ocV.setVisible(true);
        
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        
//        guardamos el todo el buferr en el txt
        oM.getTc().Guardar();
        this.setVisible(false);
        SUPERMERCADO os = new SUPERMERCADO();
        os.setVisible(true);
    }//GEN-LAST:event_btn_salirActionPerformed

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
//            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new cliente().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jL_nombre;
    private javax.swing.JLabel jLabel_cliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_cliente;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
