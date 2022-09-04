package ventanas;

//import departamento.Supermercado1;

public class SUPERMERCADO extends javax.swing.JFrame {

//    public static Supermercado1 sup = new Supermercado1();

    public SUPERMERCADO() {
        initComponents();
        this.setLocationRelativeTo(null);

        this.panel_man.setVisible(true);
        this.panel_operaciones.setVisible(false);
        this.panel_consultas.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panel_bar = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        btn_consultas = new javax.swing.JButton();
        btn_operaciones = new javax.swing.JButton();
        btn_mantenimiento = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        panel_man = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn_cliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_tu = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn_um = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btn_converisones = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btn_productos = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btn_proveedor = new javax.swing.JButton();
        panel_operaciones = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btn_compra = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btn_venta = new javax.swing.JButton();
        panel_consultas = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        btn_consultar = new javax.swing.JButton();
        btn_minimizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setFocusable(false);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setEnabled(false);
        background.setRequestFocusEnabled(false);
        background.setVerifyInputWhenFocusTarget(false);
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_bar.setBackground(new java.awt.Color(28, 18, 6));

        jSeparator1.setBackground(new java.awt.Color(100, 100, 100));
        jSeparator1.setForeground(new java.awt.Color(108, 112, 115));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SUPERMARKET");

        btn_consultas.setBackground(new java.awt.Color(130, 130, 130));
        btn_consultas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btn_consultas.setForeground(new java.awt.Color(180, 180, 180));
        btn_consultas.setText("Consultas");
        btn_consultas.setBorder(null);
        btn_consultas.setContentAreaFilled(false);
        btn_consultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_consultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultasActionPerformed(evt);
            }
        });

        btn_operaciones.setBackground(new java.awt.Color(130, 130, 130));
        btn_operaciones.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btn_operaciones.setForeground(new java.awt.Color(180, 180, 180));
        btn_operaciones.setText("Operaciones");
        btn_operaciones.setBorder(null);
        btn_operaciones.setContentAreaFilled(false);
        btn_operaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_operaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_operacionesActionPerformed(evt);
            }
        });

        btn_mantenimiento.setBackground(new java.awt.Color(130, 130, 130));
        btn_mantenimiento.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btn_mantenimiento.setForeground(new java.awt.Color(180, 180, 180));
        btn_mantenimiento.setText("Mantenimiento");
        btn_mantenimiento.setBorder(null);
        btn_mantenimiento.setContentAreaFilled(false);
        btn_mantenimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_mantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mantenimientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_barLayout = new javax.swing.GroupLayout(panel_bar);
        panel_bar.setLayout(panel_barLayout);
        panel_barLayout.setHorizontalGroup(
            panel_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_barLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(panel_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_mantenimiento)
                    .addComponent(btn_operaciones)
                    .addComponent(btn_consultas))
                .addGap(33, 40, Short.MAX_VALUE))
            .addGroup(panel_barLayout.createSequentialGroup()
                .addGroup(panel_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_barLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator1))
                    .addGroup(panel_barLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_barLayout.setVerticalGroup(
            panel_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_barLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btn_mantenimiento)
                .addGap(39, 39, 39)
                .addComponent(btn_operaciones)
                .addGap(35, 35, 35)
                .addComponent(btn_consultas)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        background.add(panel_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 370));

        btn_salir.setBackground(new java.awt.Color(130, 130, 130));
        btn_salir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(51, 51, 51));
        btn_salir.setText("X");
        btn_salir.setBorder(null);
        btn_salir.setContentAreaFilled(false);
        btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        background.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 30, 20));

        panel_man.setBackground(new java.awt.Color(255, 255, 255));
        panel_man.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(1, 176, 169));

        btn_cliente.setBackground(new java.awt.Color(0, 255, 51));
        btn_cliente.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_cliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_cliente.setText("Clientes");
        btn_cliente.setBorder(null);
        btn_cliente.setContentAreaFilled(false);
        btn_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(btn_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(1, 176, 169));

        btn_tu.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_tu.setForeground(new java.awt.Color(255, 255, 255));
        btn_tu.setText("T.Unidad Medida");
        btn_tu.setBorder(null);
        btn_tu.setContentAreaFilled(false);
        btn_tu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_tu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_tu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_tu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBackground(new java.awt.Color(1, 176, 169));

        btn_um.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_um.setForeground(new java.awt.Color(255, 255, 255));
        btn_um.setText("Unidad Medida");
        btn_um.setBorder(null);
        btn_um.setContentAreaFilled(false);
        btn_um.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_um.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_umActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btn_um, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_um, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel4.setBackground(new java.awt.Color(1, 176, 169));

        btn_converisones.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_converisones.setForeground(new java.awt.Color(255, 255, 255));
        btn_converisones.setText("Conversiones");
        btn_converisones.setBorder(null);
        btn_converisones.setContentAreaFilled(false);
        btn_converisones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_converisones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_converisonesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_converisones, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(btn_converisones, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBackground(new java.awt.Color(1, 176, 169));

        btn_productos.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_productos.setForeground(new java.awt.Color(255, 255, 255));
        btn_productos.setText("Productos");
        btn_productos.setBorder(null);
        btn_productos.setContentAreaFilled(false);
        btn_productos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_productosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_productos, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(1, 176, 169));

        btn_proveedor.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_proveedor.setForeground(new java.awt.Color(255, 255, 255));
        btn_proveedor.setText("Proveedores");
        btn_proveedor.setBorder(null);
        btn_proveedor.setContentAreaFilled(false);
        btn_proveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(btn_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_proveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout panel_manLayout = new javax.swing.GroupLayout(panel_man);
        panel_man.setLayout(panel_manLayout);
        panel_manLayout.setHorizontalGroup(
            panel_manLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_manLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_manLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_manLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_manLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(panel_manLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        panel_manLayout.setVerticalGroup(
            panel_manLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_manLayout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addGroup(panel_manLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(89, 89, 89)
                .addGroup(panel_manLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );

        background.add(panel_man, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 580, 340));

        panel_operaciones.setBackground(new java.awt.Color(255, 255, 255));
        panel_operaciones.setForeground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(0, 86, 159));

        btn_compra.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_compra.setForeground(new java.awt.Color(255, 255, 255));
        btn_compra.setText("Comprar Proveedor");
        btn_compra.setBorder(null);
        btn_compra.setContentAreaFilled(false);
        btn_compra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_compraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_compra, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel8.setBackground(new java.awt.Color(0, 86, 159));

        btn_venta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_venta.setForeground(new java.awt.Color(255, 255, 255));
        btn_venta.setText("Vender Cliente");
        btn_venta.setBorder(null);
        btn_venta.setContentAreaFilled(false);
        btn_venta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ventaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_venta, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(btn_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_operacionesLayout = new javax.swing.GroupLayout(panel_operaciones);
        panel_operaciones.setLayout(panel_operacionesLayout);
        panel_operacionesLayout.setHorizontalGroup(
            panel_operacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_operacionesLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        panel_operacionesLayout.setVerticalGroup(
            panel_operacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_operacionesLayout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addGroup(panel_operacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126))
        );

        background.add(panel_operaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 610, 340));

        panel_consultas.setBackground(new java.awt.Color(255, 255, 255));
        panel_consultas.setForeground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(255, 51, 0));
        jPanel9.setForeground(new java.awt.Color(255, 51, 0));

        btn_consultar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_consultar.setForeground(new java.awt.Color(255, 255, 255));
        btn_consultar.setText("Consultar");
        btn_consultar.setBorder(null);
        btn_consultar.setContentAreaFilled(false);
        btn_consultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_consultar, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_consultar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout panel_consultasLayout = new javax.swing.GroupLayout(panel_consultas);
        panel_consultas.setLayout(panel_consultasLayout);
        panel_consultasLayout.setHorizontalGroup(
            panel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_consultasLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        panel_consultasLayout.setVerticalGroup(
            panel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_consultasLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        background.add(panel_consultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 610, 340));

        btn_minimizar.setBackground(new java.awt.Color(130, 130, 130));
        btn_minimizar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_minimizar.setForeground(new java.awt.Color(51, 51, 51));
        btn_minimizar.setText("-");
        btn_minimizar.setBorder(null);
        btn_minimizar.setContentAreaFilled(false);
        btn_minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minimizarActionPerformed(evt);
            }
        });
        background.add(btn_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 30, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed

        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_consultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultasActionPerformed

        this.panel_man.setVisible(false);
        this.panel_operaciones.setVisible(false);
        this.panel_consultas.setVisible(true);

    }//GEN-LAST:event_btn_consultasActionPerformed

    private void btn_operacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_operacionesActionPerformed

        this.panel_man.setVisible(false);
        this.panel_consultas.setVisible(false);
        this.panel_operaciones.setVisible(true);
    }//GEN-LAST:event_btn_operacionesActionPerformed

    private void btn_mantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mantenimientoActionPerformed
        this.panel_man.setVisible(true);
        this.panel_operaciones.setVisible(false);
        this.panel_consultas.setVisible(false);

    }//GEN-LAST:event_btn_mantenimientoActionPerformed

    private void btn_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clienteActionPerformed
        cliente cv = new cliente();
        cv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_clienteActionPerformed

    private void btn_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proveedorActionPerformed

        this.setVisible(false);
        proveedor opV = new proveedor();
        opV.setVisible(true);
        opV.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_proveedorActionPerformed

    private void btn_converisonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_converisonesActionPerformed

        conversion cov = new conversion();
        cov.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_converisonesActionPerformed

    private void btn_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_productosActionPerformed

        producto pv = new producto();
        pv.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btn_productosActionPerformed

    private void btn_tuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tuActionPerformed

        tipoUnidad tuv = new tipoUnidad();
        tuv.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btn_tuActionPerformed

    private void btn_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_compraActionPerformed

        facturaCompra fc = new facturaCompra();
        fc.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btn_compraActionPerformed

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        CONSULTA oc = new CONSULTA();
        oc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void btn_umActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_umActionPerformed

        unidadmedida umv = new unidadmedida();
        umv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_umActionPerformed

    private void btn_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ventaActionPerformed

        this.setVisible(false);
        facturaVenta fv = new facturaVenta();
        fv.setVisible(true);

    }//GEN-LAST:event_btn_ventaActionPerformed

    private void btn_minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minimizarActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btn_minimizarActionPerformed

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
            java.util.logging.Logger.getLogger(SUPERMERCADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SUPERMERCADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SUPERMERCADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SUPERMERCADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SUPERMERCADO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btn_cliente;
    private javax.swing.JButton btn_compra;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_consultas;
    private javax.swing.JButton btn_converisones;
    private javax.swing.JButton btn_mantenimiento;
    private javax.swing.JButton btn_minimizar;
    private javax.swing.JButton btn_operaciones;
    private javax.swing.JButton btn_productos;
    private javax.swing.JButton btn_proveedor;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_tu;
    private javax.swing.JButton btn_um;
    private javax.swing.JButton btn_venta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panel_bar;
    private javax.swing.JPanel panel_consultas;
    private javax.swing.JPanel panel_man;
    private javax.swing.JPanel panel_operaciones;
    // End of variables declaration//GEN-END:variables
}
