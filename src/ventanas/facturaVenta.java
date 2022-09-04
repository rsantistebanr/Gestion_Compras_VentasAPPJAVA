package ventanas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import entidades.*;
import departamento.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ROBERT
 */
public class facturaVenta extends javax.swing.JFrame {

    DefaultTableModel model;
    Operacion oP;
    Mantenimiento oM;
    Ventas fv;
    DetalleFactura df;

    List<entidades.Cliente> lcli;
    List<entidades.Producto> lpr;
    List<entidades.UnidadMedida> lum;
    List<entidades.Conversion> lco;

    int row = 0;

    public facturaVenta() {

        initComponents();

        model = new DefaultTableModel();
        model.addColumn("N°");
        model.addColumn("Producto");
        model.addColumn("Cantidad");
        model.addColumn("U.Medida");
        model.addColumn("P. unitario");
        model.addColumn("Subtotal");
        tablaVenta.setModel(model);

        oM = new Mantenimiento();
        oP = new Operacion(oM); //para recuperar info de la facturas registradas
        fv = new Ventas();
        oP.getTfv().Consultar();
        oP.getTdfV().Consultar();

        //1. RECUPERAMOS LA INFO DE LOS TXT
        oM.getTc().Consultar();
        oM.getTpr().Consultar();
        oM.getTum().Consultar();
        oM.getTco().Consultar();

        //2. guardamos en una lista
        lcli = new ArrayList<entidades.Cliente>();
        lpr = new ArrayList<entidades.Producto>();
        lum = new ArrayList<entidades.UnidadMedida>();
        lco = new ArrayList<entidades.Conversion>();

        lcli = oM.getTc().Seleccionar("");
        lpr = oM.getTpr().Seleccionar("");
        lum = oM.getTum().Seleccionar("");
        lco = oM.getTco().Seleccionar("");

        //3. agregamos a los items
        for (int i = 0; i < lcli.size(); i++) {
            combo_cliente.addItem(lcli.get(i).getNombre());

        }
        for (int i = 0; i < lpr.size(); i++) {
            combo_producto.addItem(lpr.get(i).getNombre());

        }
        for (int i = 0; i < lum.size(); i++) {
            combo_um.addItem(lum.get(i).getUnidadMedida());

        }
        //4. llenamos los codigo de la factura (codigo y correlativo )
        txt_codigo.setText(oP.generarCodigo(oP.getTfv().size() + 1));
        txt_correlativo.setText(oP.generarCorrelativo(oP.getTfv().size() + 1));
        df = new DetalleFactura(txt_codigo.getText());

        setSize(940, 600);
        setResizable(false);//evitar que se mueva sus dimensiones
        setLocationRelativeTo(null);//mantenerlo en el centro
        setTitle("Factura");

        ImageIcon factura_fondo = new ImageIcon("src/images/interfaz_conversiones.jpg");
        Icon icono = new ImageIcon(factura_fondo.getImage().getScaledInstance(jLabel_factura.getWidth(), jLabel_factura.getHeight(), Image.SCALE_DEFAULT));

        jLabel_factura.setIcon(icono);
        this.repaint();
        
        txt_codigo.setEditable(false);
        txt_correlativo.setEditable(false);

        txt_cantidad.requestFocus();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_nombre = new javax.swing.JLabel();
        jButton_nuevo = new javax.swing.JButton();
        jButton_eliminar = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        combo_cliente = new javax.swing.JComboBox<>();
        jLabel_cliente = new javax.swing.JLabel();
        txt_correlativo = new javax.swing.JTextField();
        txt_codigo = new javax.swing.JTextField();
        jLabel_producto = new javax.swing.JLabel();
        combo_producto = new javax.swing.JComboBox<>();
        combo_um = new javax.swing.JComboBox<>();
        jLabel_cantidad = new javax.swing.JLabel();
        jLabel_UM = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        jLabel_total = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVenta = new javax.swing.JTable();
        btn_agregar = new javax.swing.JButton();
        btn_toclose = new javax.swing.JButton();
        jLabel_factura = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_nombre.setBackground(new java.awt.Color(55, 55, 55));
        jLabel_nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_nombre.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_nombre.setText("Factura N°");
        getContentPane().add(jLabel_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 80, 20));

        jButton_nuevo.setBackground(new java.awt.Color(0, 0, 204));
        jButton_nuevo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_nuevo.setForeground(new java.awt.Color(255, 255, 255));
        jButton_nuevo.setText("Nuevo");
        jButton_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_nuevoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, -1, 30));

        jButton_eliminar.setBackground(new java.awt.Color(0, 0, 204));
        jButton_eliminar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_eliminar.setText("Eliminar");
        jButton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, -1, 30));

        btn_save.setBackground(new java.awt.Color(0, 0, 204));
        btn_save.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_save.setForeground(new java.awt.Color(255, 255, 255));
        btn_save.setText("Guardar");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        getContentPane().add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 100, 30));

        combo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_clienteActionPerformed(evt);
            }
        });
        getContentPane().add(combo_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 300, 30));

        jLabel_cliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_cliente.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_cliente.setText("Cliente");
        getContentPane().add(jLabel_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 80, 30));
        getContentPane().add(txt_correlativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 60, 30));
        getContentPane().add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 60, 30));

        jLabel_producto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_producto.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_producto.setText("Producto");
        getContentPane().add(jLabel_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        combo_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_productoActionPerformed(evt);
            }
        });
        getContentPane().add(combo_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 110, 30));

        getContentPane().add(combo_um, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 100, 30));

        jLabel_cantidad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_cantidad.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_cantidad.setText("Cantidad");
        getContentPane().add(jLabel_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        jLabel_UM.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_UM.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_UM.setText("U.M.");
        getContentPane().add(jLabel_UM, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));
        getContentPane().add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 60, 30));

        jLabel_total.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_total.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_total.setText("Total");
        getContentPane().add(jLabel_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 50, 30));
        getContentPane().add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, 120, 30));

        tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "PRODUCTO", "CANTIDAD", "UNIDADA MEDIDA", "PREC. UNT.", "SUBTOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaVenta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 720, 180));

        btn_agregar.setBackground(new java.awt.Color(0, 0, 204));
        btn_agregar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_agregar.setText("AGREGAR");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, -1, 30));

        btn_toclose.setBackground(new java.awt.Color(0, 0, 204));
        btn_toclose.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_toclose.setForeground(new java.awt.Color(255, 255, 255));
        btn_toclose.setText("Salir");
        btn_toclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tocloseActionPerformed(evt);
            }
        });
        getContentPane().add(btn_toclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, 90, 30));
        getContentPane().add(jLabel_factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_clienteActionPerformed

    private void combo_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_productoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_combo_productoActionPerformed

    private void jButton_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nuevoActionPerformed
        int fila = tablaVenta.getRowCount();
        for (int i = fila - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        this.txt_cantidad.setText("");
        this.txt_total.setText("");
        if (fila > 0) {
            //limpiarmos las listas del detalle que se encuentra en el bufer
            df.getCantidad().clear();
            df.getNombre().clear();
            df.getPu().clear();
            df.getUnidadmedida().clear();
            df.getFactores().clear();
//            JOptionPane.showMessageDialog(this, "Se limpio las listas: " + df.getCantidad().size());
        }
    }//GEN-LAST:event_jButton_nuevoActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed

        int fila = tablaVenta.getRowCount();//me indica cuantas filas hay

        /*------------------------------------------------------------------*/
        if (fila > 0) {
            for (int i = 0; i < df.getNombre().size(); i++) {
                for (int j = 0; j < this.lpr.size(); j++) {
                    if (df.getNombre().get(i).equals(this.lpr.get(j).getNombre())) {
                        this.oM.getTpr().recorrerVenta(this.lpr.get(j).getNombre(), df.getCantidad().get(i) * df.getFactores().get(i));//nombre //resta el stock 
                    }
                }
            }
            oM.getTpr().Guardar();

            //inserto el detalle en el bufer y guardo en el txt // I insert the detail in the list and save
            oP.getTdfV().Insertar(df);
            oP.getTdfV().Guardar();

            fv.setCodigo(txt_codigo.getText());
            fv.setCorrelativo(txt_correlativo.getText());
            fv.setNombreCliente((String) combo_cliente.getSelectedItem());
            oP.getTfv().Insertar(fv);
            oP.getTfv().Guardar();
            JOptionPane.showMessageDialog(null, "FACTURA GUARDADA CON EXITO", "TITULO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "FACTURA NO GUARDADA", "TITULO", JOptionPane.INFORMATION_MESSAGE);
        }
        this.setVisible(false);
        SUPERMERCADO os = new SUPERMERCADO();
        os.setVisible(true);

    }//GEN-LAST:event_btn_saveActionPerformed

    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed

        row = this.tablaVenta.getSelectedRow();

        if (row >= 0) {
            model.removeRow(row);

        } else {
            JOptionPane.showMessageDialog(null, "No hay producto seleccionados", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
        //le resto al total la cantidad eliminada
        txt_total.setText(Float.toString(Float.parseFloat(txt_total.getText()) - (df.getCantidad().get(row) * df.getPu().get(row))));

        //elimino de las listas de detalle
        df.getNombre().remove(row);
        df.getCantidad().remove(row);
        df.getPu().remove(row);
        df.getUnidadmedida().remove(row);
        df.getFactores().remove(row);


    }//GEN-LAST:event_jButton_eliminarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        //creo un objeto que servira para hacerla validadcion del stokc
        Producto op = new Producto();

        row = model.getRowCount();
        if (!(txt_cantidad.getText().isEmpty())) {
            String nom = (String) combo_producto.getSelectedItem();
            op.setNombre(nom);
            op = oM.getTpr().Seleccionar(op); // obtengo el producto y sus propiedades//i get the product and it's propertiess
            float stock = op.getStock();

            String um = (String) combo_um.getSelectedItem();
            float cant = Float.parseFloat(txt_cantidad.getText());
            float factor = oP.convertir(nom, um);

//            float pu = 0;
            if (factor != 0) {
                //validamos el stock
                if (stock >= cant * factor) {
                    float pu = op.getPrecioUnitario() * factor; //este precio unitario es para el detalle
                    df.getNombre().add(nom);
                    df.getCantidad().add(cant);
                    df.getUnidadmedida().add(um);
                    df.getFactores().add(factor);
                    df.getPu().add(pu);

                    this.mostrarProducto(nom, pu, um, cant, row);
                } else {
                    JOptionPane.showMessageDialog(this, "La cantidad ingresada supera el stock.");

                }
            } else {
                JOptionPane.showMessageDialog(this, "Imposible convertir las unidades ingresadas.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "!Llene todos los campos.¡");
        }


    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_tocloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tocloseActionPerformed
        this.dispose();
        SUPERMERCADO os = new SUPERMERCADO();
        os.setVisible(true);
    }//GEN-LAST:event_btn_tocloseActionPerformed

    public void mostrarProducto(String nombre, float pu, String um, float cant, int row) {
        String[] columns = new String[6];
        columns[0] = Integer.toString(row + 1);
        columns[1] = nombre;
        columns[2] = Float.toString(cant);
        columns[3] = um;
        columns[4] = Float.toString(pu);
        float subtotal = (pu * cant);
        columns[5] = Float.toString(subtotal);

        //llenamos el total ->obtengo directo del campo y ke sumo el nuevo producto que ingresamos
        if (row > 0) {
            float total = Float.parseFloat(txt_total.getText()) + subtotal;
            txt_total.setText(Float.toString(total));

        } else { //esto indica que es el primer producto en jtble

            txt_total.setText(Float.toString(subtotal));
        }
        model.addRow(columns);

        this.txt_cantidad.setText("");

    }

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
//            java.util.logging.Logger.getLogger(facturaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(facturaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(facturaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(facturaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new facturaVenta().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_toclose;
    private javax.swing.JComboBox<String> combo_cliente;
    private javax.swing.JComboBox<String> combo_producto;
    private javax.swing.JComboBox<String> combo_um;
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JButton jButton_nuevo;
    private javax.swing.JLabel jLabel_UM;
    private javax.swing.JLabel jLabel_cantidad;
    private javax.swing.JLabel jLabel_cliente;
    private javax.swing.JLabel jLabel_factura;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JLabel jLabel_producto;
    private javax.swing.JLabel jLabel_total;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaVenta;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_correlativo;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
