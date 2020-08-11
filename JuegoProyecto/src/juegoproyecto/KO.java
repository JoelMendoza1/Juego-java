
package juegoproyecto;

import javax.swing.ImageIcon;

public class KO extends javax.swing.JFrame {


    public KO() {
        initComponents();
        ImagenGanador.setIcon(new ImageIcon(Ventana2.imagenganador));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImagenGanador = new javax.swing.JLabel();
        lblGanador = new javax.swing.JLabel();
        FBlanco = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImagenGanador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenGanador.setToolTipText("");
        getContentPane().add(ImagenGanador, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 280, 300));

        lblGanador.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        lblGanador.setForeground(new java.awt.Color(204, 0, 0));
        lblGanador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGanador.setText("WINNER");
        getContentPane().add(lblGanador, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 280, 90));

        FBlanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-blanco.jpg"))); // NOI18N
        getContentPane().add(FBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 290, 390));

        btnSiguiente.setText("NEXT");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ko.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        dispose ();
        VentanaPuntuacion Window3 = new VentanaPuntuacion ();
        Window3.setVisible(true);
        Window3.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSiguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FBlanco;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel ImagenGanador;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel lblGanador;
    // End of variables declaration//GEN-END:variables
}
