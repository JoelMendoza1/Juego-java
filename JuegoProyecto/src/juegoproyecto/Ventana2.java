
package juegoproyecto;

import java.applet.AudioClip;
import java.util.ArrayList;
import javax.swing.ImageIcon;


public class Ventana2 extends javax.swing.JFrame {

    ClsControlador controller = new ClsControlador(); 
    ArrayList ListaJugadas = new ArrayList ();
    boolean repetircancion = true; 
    static String imagenganador ; 
    int vidaJ1;
    int estaminaJ1;
    int ataqueJ1;
    int ataquefinalJ1;
    int defensaJ1;
    int curacionJ1;
    int vidaJ2;
    int estaminaJ2;
    int ataqueJ2;
    int ataquefinalJ2;
    int defensaJ2;
    int curacionJ2;
    int i,j;
    boolean BuscarUusario ;    
    boolean defensaactiva = false;
    
    KO ventanaKO = new KO ();
    
    public Ventana2() {
        
        initComponents();
        AreaJugadas.setText("");
        txtVidaJ1.setEnabled(false);
        txtVidaJ2.setEnabled(false);
        txtEstaminaJ1.setEnabled(false);
        txtEstaminaJ2.setEnabled(false);
        txtNPersonaje1.setEnabled(false);
        txtNPersonaje2.setEnabled(false);
        AreaJugadas.setEnabled(false);
        btnAtaqueJ2.setEnabled(false);
        btnAtaqueFinalJ2.setEnabled(false);
        btnDefensaJ2.setEnabled(false);
        btnCurarJ2.setEnabled(false);
        boolean repetircancion = true; 
        Fondo.setIcon(new ImageIcon(Ventana.ImagenBatalla));
        
        
        txtNPersonaje1.setText(Ventana.NPersonaje1);
        txtNPersonaje2.setText(Ventana.NPersonaje2);
        lblNUsuarioJ1.setText(Ventana.NUsuario1);
        lblNUsuarioJ2.setText(Ventana.NUsuario2);
        ImagenJ1.setIcon(new ImageIcon(Ventana.imagen2));
        ImagenJ2.setIcon(new ImageIcon(Ventana.imagen3));
        
        for ( i = 0; i < 40; i++) {
            
            if (Ventana.NPersonaje1.equals(Ventana.ListaInfoPersonajes.get(i).getNombre())){
                
                txtVidaJ1.setText(""+Ventana.ListaInfoPersonajes.get(i).getVida()+" / "+Ventana.ListaInfoPersonajes.get(i).getVida());
                txtEstaminaJ1.setText(""+Ventana.ListaInfoPersonajes.get(i).getEstamina()+" / "+Ventana.ListaInfoPersonajes.get(i).getEstamina());
                vidaJ1 = Ventana.ListaInfoPersonajes.get(i).getVida();
                estaminaJ1 = Ventana.ListaInfoPersonajes.get(i).getEstamina();
                ataqueJ1 = Ventana.ListaInfoPersonajes.get(i).getAtaque();
                ataquefinalJ1 = Ventana.ListaInfoPersonajes.get(i).getAtaqueFinal();
                defensaJ1 = Ventana.ListaInfoPersonajes.get(i).getDefensa();
                curacionJ1 = Ventana.ListaInfoPersonajes.get(i).getCuracion();
                
                break;
            }
            
        }
        
        for ( j = 0; j < 40; j++) {
            
            if (Ventana.NPersonaje2.equals(Ventana.ListaInfoPersonajes.get(j).getNombre())){
                
                txtVidaJ2.setText(""+Ventana.ListaInfoPersonajes.get(j).getVida()+" / "+Ventana.ListaInfoPersonajes.get(j).getVida());
                txtEstaminaJ2.setText(""+Ventana.ListaInfoPersonajes.get(j).getEstamina()+" / "+Ventana.ListaInfoPersonajes.get(j).getEstamina());
                
                vidaJ2 = Ventana.ListaInfoPersonajes.get(j).getVida();
                estaminaJ2 = Ventana.ListaInfoPersonajes.get(j).getEstamina();
                ataqueJ2 = Ventana.ListaInfoPersonajes.get(j).getAtaque();
                ataquefinalJ2 = Ventana.ListaInfoPersonajes.get(j).getAtaqueFinal();
                defensaJ2 = Ventana.ListaInfoPersonajes.get(j).getDefensa();
                curacionJ2 = Ventana.ListaInfoPersonajes.get(j).getCuracion();
                
                break;
            }
            
        }
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNUsuarioJ1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtVidaJ1 = new javax.swing.JTextField();
        txtEstaminaJ1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaJugadas = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblNUsuarioJ2 = new javax.swing.JLabel();
        txtVidaJ2 = new javax.swing.JTextField();
        txtEstaminaJ2 = new javax.swing.JTextField();
        btnAtaqueJ1 = new javax.swing.JButton();
        btnAtaqueFinalJ1 = new javax.swing.JButton();
        btnDefensaJ1 = new javax.swing.JButton();
        btnCurarJ1 = new javax.swing.JButton();
        btnAtaqueJ2 = new javax.swing.JButton();
        btnAtaqueFinalJ2 = new javax.swing.JButton();
        btnDefensaJ2 = new javax.swing.JButton();
        btnCurarJ2 = new javax.swing.JButton();
        vs = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        txtNPersonaje1 = new javax.swing.JTextField();
        txtNPersonaje2 = new javax.swing.JTextField();
        btnMusica = new javax.swing.JButton();
        ImagenJ1 = new javax.swing.JLabel();
        ImagenJ2 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNUsuarioJ1.setForeground(new java.awt.Color(204, 0, 0));
        lblNUsuarioJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("PV");

        jLabel3.setText("Estamina");

        txtVidaJ1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtVidaJ1.setForeground(new java.awt.Color(0, 204, 0));

        txtEstaminaJ1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtEstaminaJ1.setForeground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNUsuarioJ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtVidaJ1, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(txtEstaminaJ1))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNUsuarioJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVidaJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEstaminaJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 120));

        AreaJugadas.setColumns(20);
        AreaJugadas.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        AreaJugadas.setForeground(new java.awt.Color(204, 0, 0));
        AreaJugadas.setRows(5);
        jScrollPane1.setViewportView(AreaJugadas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 880, 100));

        jLabel4.setText("PV");

        jLabel5.setText("Estamina");

        lblNUsuarioJ2.setForeground(new java.awt.Color(51, 0, 204));
        lblNUsuarioJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtVidaJ2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtVidaJ2.setForeground(new java.awt.Color(0, 153, 0));

        txtEstaminaJ2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtEstaminaJ2.setForeground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtVidaJ2, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(txtEstaminaJ2)))
                    .addComponent(lblNUsuarioJ2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNUsuarioJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtVidaJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEstaminaJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 310, 180, 120));

        btnAtaqueJ1.setText("Ataque");
        btnAtaqueJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaqueJ1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtaqueJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 110, -1));

        btnAtaqueFinalJ1.setText("Ataque Final");
        btnAtaqueFinalJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaqueFinalJ1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtaqueFinalJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 110, -1));

        btnDefensaJ1.setText("Defensa");
        btnDefensaJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefensaJ1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDefensaJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 110, -1));

        btnCurarJ1.setText("Curar");
        btnCurarJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurarJ1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCurarJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 110, -1));

        btnAtaqueJ2.setText("Ataque");
        btnAtaqueJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaqueJ2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtaqueJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 110, -1));

        btnAtaqueFinalJ2.setText("Ataque Final");
        btnAtaqueFinalJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaqueFinalJ2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtaqueFinalJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 110, -1));

        btnDefensaJ2.setText("Defensa");
        btnDefensaJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefensaJ2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDefensaJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 110, -1));

        btnCurarJ2.setText("Curar");
        btnCurarJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurarJ2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCurarJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 60, 110, -1));

        vs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vs.png"))); // NOI18N
        getContentPane().add(vs, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 110, 100));

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 70, -1));

        txtNPersonaje1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNPersonaje1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNPersonaje1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtNPersonaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 180, -1));

        txtNPersonaje2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNPersonaje2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNPersonaje2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtNPersonaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, 180, -1));

        btnMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/audio.jpg"))); // NOI18N
        btnMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusicaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 20, 20));

        ImagenJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenJ1.setToolTipText("");
        ImagenJ1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ImagenJ1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(ImagenJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 210, 300));

        ImagenJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ImagenJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 210, 310));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ezgif.com-resize(1).gif"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtaqueFinalJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaqueFinalJ1ActionPerformed
        
        ImagenJ1.setIcon(new ImageIcon(Ventana.AtaqueFJ2));
        if (defensaactiva){
            ataquefinalJ1-=defensaJ2;
        }        
        vidaJ2 -= ataquefinalJ1;
        txtVidaJ2.setText(vidaJ2+" / "+Ventana.ListaInfoPersonajes.get(j).getVida()); 

        if (defensaactiva){
            ataquefinalJ1+=defensaJ2;
            defensaactiva = false;
        }        
        estaminaJ1 -= (Ventana.ListaInfoPersonajes.get(i).getEstamina()*50)/100;
        txtEstaminaJ1.setText(estaminaJ1+" / "+Ventana.ListaInfoPersonajes.get(i).getEstamina());
        
        ListaJugadas.add("Jugador 1: Ataque Final");
        regeneracionJ2 ();
        estaminaNecesariaJ2 ();
        jugadas ();
        turnoJ2();        
        pantallaKO ();
                
    }//GEN-LAST:event_btnAtaqueFinalJ1ActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
      
        dispose();
        JuegoProyecto.window.setVisible(true);
        JuegoProyecto.window.setLocationRelativeTo(null);
        
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAtaqueJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaqueJ1ActionPerformed
                
        ImagenJ1.setIcon(new ImageIcon(Ventana.AtaqueJ2));
        if (defensaactiva){
            ataqueJ1-=defensaJ2;
        }        
        vidaJ2 -= ataqueJ1;
        txtVidaJ2.setText(vidaJ2+" / "+Ventana.ListaInfoPersonajes.get(j).getVida()); 

        if (defensaactiva){
            ataqueJ1+=defensaJ2;
            defensaactiva = false;
        }        
        
        estaminaJ1 -= (Ventana.ListaInfoPersonajes.get(i).getEstamina()*5)/100;
        txtEstaminaJ1.setText(estaminaJ1+" / "+Ventana.ListaInfoPersonajes.get(i).getEstamina());
        
        ListaJugadas.add("Jugador 1: Ataque");
        regeneracionJ2 ();
        estaminaNecesariaJ2 ();
        jugadas ();        
        turnoJ2();
        pantallaKO ();
    }//GEN-LAST:event_btnAtaqueJ1ActionPerformed

    private void btnAtaqueJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaqueJ2ActionPerformed

        ImagenJ2.setIcon(new ImageIcon(Ventana.AtaqueJ3));
        if (defensaactiva){
            ataqueJ2-=defensaJ1;
        }        
        vidaJ1 -= ataqueJ2;
        txtVidaJ1.setText(vidaJ1+" / "+Ventana.ListaInfoPersonajes.get(i).getVida()); 

        if (defensaactiva){
            ataqueJ2+=defensaJ1;
            defensaactiva = false;
        }              
        estaminaJ2 -= (Ventana.ListaInfoPersonajes.get(j).getEstamina()*5)/100;
        txtEstaminaJ2.setText(estaminaJ1+" / "+Ventana.ListaInfoPersonajes.get(j).getEstamina());
        
        AreaJugadas.setText(AreaJugadas.getText()+"\n"+"Ataque Final");
        ListaJugadas.add("Jugador 2: Ataque");

        regeneracionJ1 ();
        estaminaNecesariaJ1 ();
        jugadas ();
        turnoJ1();
        pantallaKO ();
    }//GEN-LAST:event_btnAtaqueJ2ActionPerformed

    private void btnAtaqueFinalJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaqueFinalJ2ActionPerformed

        ImagenJ2.setIcon(new ImageIcon(Ventana.AtaqueFJ3));
        if (defensaactiva){
            ataquefinalJ2-=defensaJ1;
        }        
        vidaJ1 -= ataquefinalJ2;
        txtVidaJ1.setText(vidaJ1+" / "+Ventana.ListaInfoPersonajes.get(i).getVida()); 

        if (defensaactiva){
            ataquefinalJ2+=defensaJ1;
            defensaactiva = false;
        }        
        estaminaJ2 -= (Ventana.ListaInfoPersonajes.get(j).getEstamina()*50)/100;
        txtEstaminaJ2.setText(estaminaJ2+" / "+Ventana.ListaInfoPersonajes.get(j).getEstamina());

        ListaJugadas.add("Jugador 2: Ataque Final");
        regeneracionJ1 ();
        estaminaNecesariaJ1 ();
        jugadas ();
        turnoJ1();
        pantallaKO ();
    }//GEN-LAST:event_btnAtaqueFinalJ2ActionPerformed

    private void btnCurarJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurarJ1ActionPerformed
        vidaJ1 += curacionJ1;
        txtVidaJ1.setText(vidaJ1+" / "+Ventana.ListaInfoPersonajes.get(i).getVida());         
        if (vidaJ1 >Ventana.ListaInfoPersonajes.get(i).getVida()){
            vidaJ1= Ventana.ListaInfoPersonajes.get(i).getVida();
            txtVidaJ1.setText(vidaJ1+" / "+Ventana.ListaInfoPersonajes.get(i).getVida());         

        }
        estaminaJ1 -= (Ventana.ListaInfoPersonajes.get(i).getEstamina()*20)/100;
        txtEstaminaJ1.setText(estaminaJ1+" / "+Ventana.ListaInfoPersonajes.get(i).getEstamina());
        ListaJugadas.add("Jugador 1: Curacion");
        regeneracionJ2 ();
        estaminaNecesariaJ2 ();
        jugadas ();
        turnoJ2();
    }//GEN-LAST:event_btnCurarJ1ActionPerformed

    private void btnCurarJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurarJ2ActionPerformed
        vidaJ2 += curacionJ2;
        txtVidaJ2.setText(vidaJ2+" / "+Ventana.ListaInfoPersonajes.get(j).getVida());
    
        if (vidaJ2 >Ventana.ListaInfoPersonajes.get(j).getVida()){
            vidaJ2= Ventana.ListaInfoPersonajes.get(j).getVida();
            txtVidaJ2.setText(vidaJ2+" / "+Ventana.ListaInfoPersonajes.get(j).getVida());
        }
        
        estaminaJ2 -= (Ventana.ListaInfoPersonajes.get(j).getEstamina()*20)/100;
        txtEstaminaJ2.setText(estaminaJ2+" / "+Ventana.ListaInfoPersonajes.get(j).getEstamina());
        
        ListaJugadas.add("Jugador 2: Curacion");
        regeneracionJ1 ();
        estaminaNecesariaJ1 ();
        jugadas ();
        turnoJ1();
    }//GEN-LAST:event_btnCurarJ2ActionPerformed

    private void btnDefensaJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefensaJ1ActionPerformed
        defensaactiva = true;
        ListaJugadas.add("Jugador 1: Defensa Aumentada");
        estaminaJ1 -= (Ventana.ListaInfoPersonajes.get(i).getEstamina()*25)/100;
        txtEstaminaJ1.setText(estaminaJ1+" / "+Ventana.ListaInfoPersonajes.get(i).getEstamina());
        regeneracionJ2 ();
        estaminaNecesariaJ2 ();
        jugadas ();
        turnoJ2();
    }//GEN-LAST:event_btnDefensaJ1ActionPerformed

    private void btnDefensaJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefensaJ2ActionPerformed
        defensaactiva = true;
        ListaJugadas.add("Jugador 2: Defensa Aumentada");
        estaminaJ2 -= (Ventana.ListaInfoPersonajes.get(j).getEstamina()*25)/100;
        txtEstaminaJ2.setText(estaminaJ2+" / "+Ventana.ListaInfoPersonajes.get(j).getEstamina());

        regeneracionJ1 ();
        estaminaNecesariaJ1 ();
        jugadas ();
        turnoJ1();
    }//GEN-LAST:event_btnDefensaJ2ActionPerformed

    private void btnMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicaActionPerformed

     
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/juegoproyecto/SSBUltimate.wav"));
        sonido.play();

    }//GEN-LAST:event_btnMusicaActionPerformed

    private void txtNPersonaje2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNPersonaje2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNPersonaje2ActionPerformed

    private void txtNPersonaje1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNPersonaje1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNPersonaje1ActionPerformed

    public void turnoJ1 (){
        
        btnAtaqueJ2.setEnabled(false);
        btnAtaqueFinalJ2.setEnabled(false);
        btnDefensaJ2.setEnabled(false);
        btnCurarJ2.setEnabled(false);

        
    }
    
    public void turnoJ2 (){
        
        btnAtaqueJ1.setEnabled(false);
        btnAtaqueFinalJ1.setEnabled(false);
        btnDefensaJ1.setEnabled(false);
        btnCurarJ1.setEnabled(false);

        
    }
    
    public void jugadas (){
        AreaJugadas.setText("");
        for (Object item : ListaJugadas){
              
              AreaJugadas.setText(AreaJugadas.getText()+"\n"+item);
              
          }
    }
    
    public void pantallaKO (){
        
                if (vidaJ1 <=0){
                    imagenganador = Ventana.imagen3;
        for(Object mObj : VentanaRegistro.jugadores) {
            ClsJugadores m = (ClsJugadores) mObj;
            if(m.getUsuario().equals(Ventana.NUsuario2)) {
                
        int red = m.getContadorV();
        red +=1;
        m.setContadorV(red);
        controller.escribirObjeto("jugadores.dat", VentanaRegistro.jugadores);
                break;
            }
            
        }                    
                    
                    dispose();

        KO ventanaKO2 = new KO();
        ventanaKO2.setVisible(true);
        ventanaKO2.setLocationRelativeTo(null);
        }
                
                if (vidaJ2 <=0){
                    imagenganador = Ventana.imagen2;
        for(Object mObj : VentanaRegistro.jugadores) {
            
            ClsJugadores m = (ClsJugadores) mObj;
            if(m.getUsuario().equals(Ventana.NUsuario1)) {

                
        int red = m.getContadorV();
        red +=1;
        m.setContadorV(red);
        controller.escribirObjeto("jugadores.dat", VentanaRegistro.jugadores);
                break;
            }
        
        }                      
                    dispose();
        KO ventanaKO3 = new KO();
        ventanaKO3.setVisible(true);
        ventanaKO3.setLocationRelativeTo(null);
        }
                
                
    }
    
    public void regeneracionJ1 (){
        
        estaminaJ1 += (Ventana.ListaInfoPersonajes.get(i).getEstamina()*10)/100;
        if (estaminaJ1>Ventana.ListaInfoPersonajes.get(i).getEstamina()){
            estaminaJ1 = Ventana.ListaInfoPersonajes.get(i).getEstamina();
        }
        txtEstaminaJ1.setText(estaminaJ1+" / "+Ventana.ListaInfoPersonajes.get(i).getEstamina());
        
                }
    public void regeneracionJ2 (){
        
        estaminaJ2 += (Ventana.ListaInfoPersonajes.get(j).getEstamina()*10)/100;
        if (estaminaJ2>Ventana.ListaInfoPersonajes.get(j).getEstamina()){
            estaminaJ2 = Ventana.ListaInfoPersonajes.get(j).getEstamina();
        }
        txtEstaminaJ2.setText(estaminaJ2+" / "+Ventana.ListaInfoPersonajes.get(j).getEstamina());    
    }

    public void estaminaNecesariaJ1 (){
       
        if (estaminaJ1<((Ventana.ListaInfoPersonajes.get(i).getEstamina()*50)/100)){
            btnAtaqueFinalJ1.setEnabled(false);
        }else{
            btnAtaqueFinalJ1.setEnabled(true);
        }
        if (estaminaJ1<((Ventana.ListaInfoPersonajes.get(i).getEstamina()*25)/100)){
            btnDefensaJ1.setEnabled(false);
        }else{
            btnDefensaJ1.setEnabled(true);
        }
        if (estaminaJ1<((Ventana.ListaInfoPersonajes.get(i).getEstamina()*20)/100)){
            btnCurarJ1.setEnabled(false);
        }else{
            btnCurarJ1.setEnabled(true);
        }
        if (estaminaJ1<((Ventana.ListaInfoPersonajes.get(i).getEstamina()*5)/100)){
            btnAtaqueJ1.setEnabled(false);
        }else{
            btnAtaqueJ1.setEnabled(true);
        }
               
    }
    
    public void estaminaNecesariaJ2 (){
        
        if (estaminaJ2<((Ventana.ListaInfoPersonajes.get(j).getEstamina()*50)/100)){
            btnAtaqueFinalJ2.setEnabled(false);
        }else{
            btnAtaqueFinalJ2.setEnabled(true);
        }
        if (estaminaJ2<((Ventana.ListaInfoPersonajes.get(j).getEstamina()*25)/100)){
            btnDefensaJ2.setEnabled(false);
        }else{
            btnDefensaJ2.setEnabled(true);
        }
        if (estaminaJ2<((Ventana.ListaInfoPersonajes.get(j).getEstamina()*20)/100)){
            btnCurarJ2.setEnabled(false);
        }else{
            btnCurarJ2.setEnabled(true);
        }
        if (estaminaJ2<((Ventana.ListaInfoPersonajes.get(j).getEstamina()*5)/100)){
            btnAtaqueJ2.setEnabled(false);
        }else{
            btnAtaqueJ2.setEnabled(true);
        }   
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaJugadas;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel ImagenJ1;
    private javax.swing.JLabel ImagenJ2;
    private javax.swing.JButton btnAtaqueFinalJ1;
    private javax.swing.JButton btnAtaqueFinalJ2;
    private javax.swing.JButton btnAtaqueJ1;
    private javax.swing.JButton btnAtaqueJ2;
    private javax.swing.JButton btnCurarJ1;
    private javax.swing.JButton btnCurarJ2;
    private javax.swing.JButton btnDefensaJ1;
    private javax.swing.JButton btnDefensaJ2;
    private javax.swing.JButton btnMusica;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNUsuarioJ1;
    private javax.swing.JLabel lblNUsuarioJ2;
    private javax.swing.JTextField txtEstaminaJ1;
    private javax.swing.JTextField txtEstaminaJ2;
    private javax.swing.JTextField txtNPersonaje1;
    private javax.swing.JTextField txtNPersonaje2;
    private javax.swing.JTextField txtVidaJ1;
    private javax.swing.JTextField txtVidaJ2;
    private javax.swing.JLabel vs;
    // End of variables declaration//GEN-END:variables
}
