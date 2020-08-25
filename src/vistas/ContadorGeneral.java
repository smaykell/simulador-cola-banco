package vistas;

import controlador.Core;

import javax.swing.JFrame;

public class ContadorGeneral extends JFrame {

        private static final long serialVersionUID = 1L;

        private javax.swing.JButton btnAtras;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel txtEnVentanilla;

        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JScrollPane jScrollPane3;
        private javax.swing.JTextArea txtConTarjeta;
        private javax.swing.JTextArea txtPreferenciales;
        private javax.swing.JTextArea txtSinTarjeta;

        public void setMiCore(Core miCore) {
        }

        public ContadorGeneral() {
                initComponents();
        }

        private void initComponents() {
                this.setTitle("Contador General");
                jPanel1 = new javax.swing.JPanel();
                jScrollPane1 = new javax.swing.JScrollPane();
                txtConTarjeta = new javax.swing.JTextArea();
                jScrollPane2 = new javax.swing.JScrollPane();
                txtSinTarjeta = new javax.swing.JTextArea();
                jScrollPane3 = new javax.swing.JScrollPane();
                txtPreferenciales = new javax.swing.JTextArea();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                btnAtras = new javax.swing.JButton();
                jLabel4 = new javax.swing.JLabel();
                txtEnVentanilla = new javax.swing.JLabel();
                txtEnVentanilla.setFont(new java.awt.Font("Verdana", 0, 14));
                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));

                txtConTarjeta.setColumns(20);
                txtConTarjeta.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
                txtConTarjeta.setRows(5);
                jScrollPane1.setViewportView(txtConTarjeta);

                txtSinTarjeta.setColumns(20);
                txtSinTarjeta.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
                txtSinTarjeta.setRows(5);
                jScrollPane2.setViewportView(txtSinTarjeta);

                txtPreferenciales.setColumns(20);
                txtPreferenciales.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
                txtPreferenciales.setRows(5);
                jScrollPane3.setViewportView(txtPreferenciales);

                jLabel1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
                jLabel1.setText("Clientes Preferenciales");

                jLabel2.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
                jLabel2.setText("Clientes Con Tarjeta");

                jLabel3.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
                jLabel3.setText("Clientes Sin Tarjeta");

                jLabel4.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
                jLabel4.setText("Turno de atención para: ");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(btnAtras).addContainerGap())
                                .addGroup(jPanel1Layout.createSequentialGroup().addGap(30, 30, 30)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel4)
                                                                                .addGap(32, 32, 32)
                                                                                .addComponent(txtEnVentanilla,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                79,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jScrollPane3,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jLabel1))
                                                                                .addGap(33, 33, 33)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jScrollPane1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jLabel2))
                                                                                .addGap(36, 36, 36)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jLabel3)
                                                                                                .addComponent(jScrollPane2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup().addContainerGap(24, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel4).addComponent(txtEnVentanilla,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                18,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(26, 26, 26)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel1).addComponent(jLabel2)
                                                                .addComponent(jLabel3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jScrollPane2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                213,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jScrollPane1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                213,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jScrollPane3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                213,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnAtras).addGap(4, 4, 4)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                pack();
        }

        public void actualizarColaPreferencial(String text) {
                txtPreferenciales.setText(text);
        }

        public void actualizarColaConTarjeta(String text) {
                txtConTarjeta.setText(text);
        }

        public void actualizarColaSinTarjeta(String text) {
                txtSinTarjeta.setText(text);
        }

        public void actualizarEnVentanilla(String text) {
                txtEnVentanilla.setText(text);
        }
}
