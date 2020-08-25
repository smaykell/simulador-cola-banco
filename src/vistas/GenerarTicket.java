package vistas;

import controlador.Core;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GenerarTicket extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private Core miCore;
    private JButton btnGenerarTicket;
    private ButtonGroup btngClientes;
    private JPanel contenedor;
    private JLabel lblTitulo;
    private JRadioButton rbtnConTarjeta;
    private JRadioButton rbtnPreferencial;
    private JRadioButton rbtnSinTarjeta;
    private JTextField txtTicketGenerado;

    public void setMiCore(Core miCore) {
        this.miCore = miCore;
    }

    public GenerarTicket() {
        initComponents();
    }

    private void initComponents() {
        this.setTitle("Generar Ticket");
        btngClientes = new ButtonGroup();
        contenedor = new JPanel();
        lblTitulo = new JLabel();
        rbtnConTarjeta = new JRadioButton();
        rbtnSinTarjeta = new JRadioButton();
        rbtnPreferencial = new JRadioButton();
        btnGenerarTicket = new JButton();
        txtTicketGenerado = new JTextField();
        btnGenerarTicket.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        contenedor.setBackground(new Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblTitulo.setText("Nuevo Ticket");

        rbtnConTarjeta.setBackground(new java.awt.Color(255, 255, 255));
        btngClientes.add(rbtnConTarjeta);
        rbtnConTarjeta.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        rbtnConTarjeta.setText("Cliente Con Tarjeta");

        rbtnSinTarjeta.setBackground(new java.awt.Color(255, 255, 255));
        btngClientes.add(rbtnSinTarjeta);
        rbtnSinTarjeta.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        rbtnSinTarjeta.setText("Cliente Sin Tarjeta");

        rbtnPreferencial.setBackground(new java.awt.Color(255, 255, 255));
        btngClientes.add(rbtnPreferencial);
        rbtnPreferencial.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        rbtnPreferencial.setText("Cliente Preferencial");

        btnGenerarTicket.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnGenerarTicket.setText("Generar Ticket");

        txtTicketGenerado.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(contenedorLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorLayout.createSequentialGroup().addGroup(contenedorLayout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(
                                contenedorLayout.createSequentialGroup().addGap(143, 143, 143).addComponent(lblTitulo))
                        .addGroup(contenedorLayout.createSequentialGroup().addGap(45, 45, 45)
                                .addGroup(contenedorLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(rbtnConTarjeta, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rbtnPreferencial, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rbtnSinTarjeta, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnGenerarTicket, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(38, 38, 38).addComponent(txtTicketGenerado,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, 127,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(53, Short.MAX_VALUE)));
        contenedorLayout.setVerticalGroup(contenedorLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorLayout.createSequentialGroup().addGap(25, 25, 25).addComponent(lblTitulo)
                        .addGap(44, 44, 44).addComponent(rbtnConTarjeta).addGap(18, 18, 18).addComponent(rbtnSinTarjeta)
                        .addGap(18, 18, 18).addComponent(rbtnPreferencial).addGap(18, 18, 18)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTicketGenerado, javax.swing.GroupLayout.DEFAULT_SIZE, 33,
                                        Short.MAX_VALUE)
                                .addComponent(btnGenerarTicket, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(52, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(contenedor,
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(contenedor,
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object origen = e.getSource();
        if (origen == btnGenerarTicket) {
            if (rbtnConTarjeta.isSelected()) {
                txtTicketGenerado.setText(miCore.nuevoTicketConTarjeta());
            } else if (rbtnSinTarjeta.isSelected()) {
                txtTicketGenerado.setText(miCore.nuevoTicketSinTarjeta());
            } else if (rbtnPreferencial.isSelected()) {
                txtTicketGenerado.setText(miCore.nuevoTicketPreferencial());
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione Tipo Cliente");
            }
        }
    }
}
