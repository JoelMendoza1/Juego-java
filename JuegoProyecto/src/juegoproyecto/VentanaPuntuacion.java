
package juegoproyecto;

import javax.swing.table.DefaultTableModel;


public class VentanaPuntuacion extends javax.swing.JFrame {


    public VentanaPuntuacion() {
        initComponents();
        llenarGrid(); 
    }


    public void llenarGrid(){
        if(VentanaRegistro.jugadores.size() > 0){
            ClsJugadores jug = new ClsJugadores();
            DefaultTableModel model = (DefaultTableModel) tblVictorias.getModel();
            for(int i = 0; i < VentanaRegistro.jugadores.size(); i ++){
                jug = (ClsJugadores) VentanaRegistro.jugadores.get(i);
                Object jugadoresN [] = { jug.getUsuario(), jug.getContadorV()};
                model.insertRow(i, jugadoresN);
            }
        }
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVictorias = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(153, 153, 153));
        lblTitulo.setText("PUNTUACIONES");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        tblVictorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Victorias"
            }
        ));
        jScrollPane1.setViewportView(tblVictorias);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 430, 240));

        btnVolver.setText("Volver a Pantalla Principal");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fr.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

        dispose();
        JuegoProyecto.window.setVisible(true);
        JuegoProyecto.window.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblVictorias;
    // End of variables declaration//GEN-END:variables
}
