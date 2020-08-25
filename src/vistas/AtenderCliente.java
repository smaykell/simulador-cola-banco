package vistas;

import controlador.Core;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AtenderCliente extends JFrame implements ActionListener {

        private static final long serialVersionUID = 1L;
        private Core miCore;
        private javax.swing.JButton btnAtras;
        private javax.swing.JButton btnAtender;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JTextField txtTicketGenerado;

        public void setMiCore(Core miCore) {
                this.miCore = miCore;
        }

        public AtenderCliente() {
                initComponents();
        }

        private void initComponents() {
                this.setTitle("Ventanilla");
                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                btnAtender = new javax.swing.JButton();
                txtTicketGenerado = new javax.swing.JTextField();
                btnAtras = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));

                jLabel1.setText("Clientes en espera:");

                jLabel2.setText("0");

                jLabel3.setText("Clientes atendidos:");

                jLabel4.setText("0");

                btnAtender.setText("Atender Cliente");
                btnAtender.addActionListener(this);

                txtTicketGenerado.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

                btnAtras.setText("Atras");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup().addGap(34, 34, 34)
                                                .addComponent(btnAtender).addGap(57, 57, 57)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel1)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jLabel2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                18,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel3)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jLabel4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                19,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addComponent(txtTicketGenerado,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                127,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(75, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(btnAtras).addGap(52, 52, 52)));
                jPanel1Layout.setVerticalGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup().addContainerGap(63, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(btnAtender,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                33,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(txtTicketGenerado,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                33, Short.MAX_VALUE))
                                                .addGap(85, 85, 85)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel1).addComponent(jLabel2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel3).addComponent(jLabel4))
                                                .addGap(28, 28, 28).addComponent(btnAtras).addGap(32, 32, 32)));

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

        public void actualizarCantidadDeAtendidos(int n) {
                jLabel4.setText(n + "");
        }

        public void actualizarCantidadEnCola(int n) {
                jLabel2.setText(n + "");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
                Object origen = e.getSource();
                if (origen == btnAtender) {
                        String ticket = miCore.atenderCliente();
                        txtTicketGenerado.setText(ticket);
                        miCore.actualizarEnVentanilla(ticket);
                }
        }
}
