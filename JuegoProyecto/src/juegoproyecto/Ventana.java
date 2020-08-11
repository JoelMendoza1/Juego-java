
package juegoproyecto;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.applet.AudioClip;
import javax.swing.JOptionPane;


public class Ventana extends javax.swing.JFrame {
    
 
    static public ArrayList<Personajes> ListaInfoPersonajes = new ArrayList<Personajes>();
    List<String> ListaMarvel = new ArrayList<String>();
    DefaultComboBoxModel listaMarvelModel = 
            new DefaultComboBoxModel(ListaMarvel.toArray());
    
    List<String> ListaCapcom = new ArrayList<String>();
    DefaultComboBoxModel listaCapcomModel = 
            new DefaultComboBoxModel(ListaCapcom.toArray());
       ClsControlador controller = new ClsControlador();
     
       
       int op;
       int MoC;
       String User1;
       String User2;
       static String imagenj1;
       static String imagen2;
       static String imagen3;
       static String NPersonaje1;
       static String NPersonaje2;
       static String NUsuario1;
       static String NUsuario2;
       static String AtaqueJ1;
       static String AtaqueJ2;
       static String AtaqueJ3;
       static String AtaqueFJ1;
       static String AtaqueFJ2;
       static String AtaqueFJ3;
       static String ImagenBatalla;
       boolean activarbtnJugar1 = false;
       boolean activarbtnJugar2 = false;
       boolean activarbtnJugar3 = false;
       boolean activarbtnJugar4 = false; 
       
    
    public Ventana () {
                   
        initComponents();
        
            boxJugador1.setEnabled(true);
            boxJugador2.setEnabled(true);
            VentanaRegistro.jugadores = controller.extraerObjetos("jugadores.dat");
            boxJugador1.setModel(new DefaultComboBoxModel(VentanaRegistro.jugadores.toArray()));
            boxJugador2.setModel(new DefaultComboBoxModel(VentanaRegistro.jugadores.toArray())); 
            
           
            btnJugar.setEnabled(false);
            btnJugador1.setEnabled(false);
            btnJugador2.setEnabled(false);
            
            
        
    
        
        
        ListaMarvel.add("Iron Man");ListaMarvel.add("Hulk");ListaMarvel.add("Captain America");ListaMarvel.add("Thor");
        ListaMarvel.add("Spider-Man");ListaMarvel.add("Wolverine");ListaMarvel.add("Storm");ListaMarvel.add("Phoenix");
        ListaMarvel.add("Cyclops");ListaMarvel.add("Magneto");ListaMarvel.add("Human Torch");ListaMarvel.add("Thing");
        ListaMarvel.add("Invisible Woman");ListaMarvel.add("Mister Fantastic");ListaMarvel.add("Galactus");
        ListaMarvel.add("DOMINO");ListaMarvel.add("ZEITGEIST");ListaMarvel.add("BEDLAM");ListaMarvel.add("DeadPool");
        ListaMarvel.add("COLOSSUS");
        
        ListaCapcom.add("Ryu");ListaCapcom.add("Ken");ListaCapcom.add("M.Bison");ListaCapcom.add("Chun-li");
        ListaCapcom.add("Zangief");ListaCapcom.add("Dante");ListaCapcom.add("Trish");ListaCapcom.add("Mundus");
        ListaCapcom.add("Vergil");ListaCapcom.add("Sparda");ListaCapcom.add("Leon S. Kennedy");ListaCapcom.add("Chris Redfield");
        ListaCapcom.add("Albert Wesker");ListaCapcom.add("Jill Valentine");ListaCapcom.add("Nemesis");ListaCapcom.add("Mega Man");
        ListaCapcom.add("Proto Man");ListaCapcom.add("Bass");ListaCapcom.add("Zero");ListaCapcom.add("Vile");            
            
        for (int i = 0; i < ListaMarvel.size(); i++) {
            listaMarvelModel.addElement(ListaMarvel.get(i)); 
            listaCapcomModel.addElement(ListaCapcom.get(i)); 
            
        }
        

        for (int i = 0; i < ListaMarvel.size(); i++) {
            
            if (i<5) {
            Personajes Tanque = new Personajes (ListaMarvel.get(i),800,600,100,175,50,20);
            ListaInfoPersonajes.add(Tanque);
                
            }else if (i<10){
            Personajes Luchadores = new Personajes (ListaMarvel.get(i),500,600,100,250,100,20);
            ListaInfoPersonajes.add(Luchadores);
                
            }else if (i<15){
            Personajes Neutrales = new Personajes (ListaMarvel.get(i),500,1000,75,175,100,30);
            ListaInfoPersonajes.add(Neutrales);
                
            }else if (i<20){
            Personajes Hibridos = new Personajes (ListaMarvel.get(i),400,1300,75,250,200,40);

            ListaInfoPersonajes.add(Hibridos);
                
            }     
             
        }

        for (int i = 0; i < ListaCapcom.size(); i++) {
            
            if (i<5) {
            Personajes Tanque = new Personajes (ListaCapcom.get(i),800,600,100,175,50,20);
            ListaInfoPersonajes.add(Tanque);
                
            }else if (i<10){
            Personajes Luchadores = new Personajes (ListaCapcom.get(i),500,600,100,250,100,20);
            ListaInfoPersonajes.add(Luchadores);
                
            }else if (i<15){
            Personajes Neutrales = new Personajes (ListaCapcom.get(i),500,1000,75,175,100,30);
            ListaInfoPersonajes.add(Neutrales);
                
            }else if (i<20){
            Personajes Hibridos = new Personajes (ListaCapcom.get(i),400,1300,75,250,200,40);

            ListaInfoPersonajes.add(Hibridos);
                
            }     
             
        }
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boxJugador1 = new javax.swing.JComboBox<>();
        boxPersonajes = new javax.swing.JComboBox<>();
        boxJugador2 = new javax.swing.JComboBox<>();
        boxMoC = new javax.swing.JComboBox<>();
        ImagenJugador1 = new javax.swing.JLabel();
        ImagenJugador2 = new javax.swing.JLabel();
        ImagenPersonaje = new javax.swing.JLabel();
        btnJugador1 = new javax.swing.JButton();
        btnJugador2 = new javax.swing.JButton();
        btnJugar = new javax.swing.JButton();
        btnRegJugador = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        btnLugar3 = new javax.swing.JButton();
        btnLugar2 = new javax.swing.JButton();
        btnLugar4 = new javax.swing.JButton();
        btnLugar5 = new javax.swing.JButton();
        btnLugar6 = new javax.swing.JButton();
        btnLugar7 = new javax.swing.JButton();
        btnLugar8 = new javax.swing.JButton();
        btnLugar1 = new javax.swing.JButton();
        LugarBatalla = new javax.swing.JLabel();
        Fondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boxJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxJugador1ActionPerformed(evt);
            }
        });
        getContentPane().add(boxJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 100, -1));

        boxPersonajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxPersonajesActionPerformed(evt);
            }
        });
        getContentPane().add(boxPersonajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, -1, -1));

        boxJugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxJugador2ActionPerformed(evt);
            }
        });
        getContentPane().add(boxJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 100, -1));

        boxMoC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Marvel", "Capcom" }));
        boxMoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMoCActionPerformed(evt);
            }
        });
        getContentPane().add(boxMoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, -1, -1));

        ImagenJugador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ImagenJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 230, 280));

        ImagenJugador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ImagenJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 250, 290));

        ImagenPersonaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ImagenPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 220, 300));

        btnJugador1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        btnJugador1.setText("Seleccionar Personaje");
        btnJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugador1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 160, 30));

        btnJugador2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        btnJugador2.setText("Seleccionar Personaje");
        btnJugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugador2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, -1, 30));

        btnJugar.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        btnJugar.setText("Play");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, -1, 50));

        btnRegJugador.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        btnRegJugador.setText("Registrar Jugador");
        btnRegJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegJugadorActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("JUGADOR 1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 90, -1));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("JUGADOR 2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 90, -1));

        btnSalir.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        btnSalir.setText("X");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

        lbl1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        lbl1.setForeground(new java.awt.Color(153, 153, 153));
        lbl1.setText("PERSONAJES");
        getContentPane().add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 240, 50));

        lbl2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        lbl2.setForeground(new java.awt.Color(153, 153, 153));
        lbl2.setText("USUARIOS");
        getContentPane().add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fon.gif"))); // NOI18N
        getContentPane().add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 610));

        btnLugar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Feria.jpg"))); // NOI18N
        btnLugar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLugar3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLugar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 100, 90, 50));

        btnLugar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Universo.jpg"))); // NOI18N
        btnLugar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLugar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLugar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, 90, 50));

        btnLugar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Granja.jpg"))); // NOI18N
        btnLugar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLugar4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLugar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 100, 90, 50));

        btnLugar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mansion.jpg"))); // NOI18N
        btnLugar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLugar5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLugar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 180, 90, 50));

        btnLugar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Templo.jpg"))); // NOI18N
        btnLugar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLugar6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLugar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 180, 90, 50));

        btnLugar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TemplodeGuerra.jpg"))); // NOI18N
        btnLugar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLugar7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLugar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 260, 90, 50));

        btnLugar8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Casino.jpg"))); // NOI18N
        btnLugar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLugar8ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLugar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 260, 90, 50));

        btnLugar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bosque.jpg"))); // NOI18N
        btnLugar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLugar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLugar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 90, 50));
        getContentPane().add(LugarBatalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 390, 210, 130));

        Fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoLamas.gif"))); // NOI18N
        getContentPane().add(Fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 270, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ActivarJugar (){
             if (activarbtnJugar1 && activarbtnJugar2 &&activarbtnJugar3 && activarbtnJugar4 ){
            btnJugar.setEnabled(true);             
         }else{
            btnJugar.setEnabled(false);     
         }    
    }    
    
    private void boxPersonajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxPersonajesActionPerformed

        btnJugador1.setEnabled(true); 
        btnJugador2.setEnabled(true); 
        
        
        op = boxPersonajes.getSelectedIndex();
        MoC = boxMoC.getSelectedIndex();

        switch (op){
            case 0:
                if (MoC==0){
                    
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/IronMan.jpg"));
                    imagenj1 = "Imagenes/IronMan.jpg";
                    AtaqueJ1 = "Imagenes/IronMan.jpg";
                    AtaqueFJ1 = "Imagenes/IronMan.jpg";

                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Ryu.gif"));
                    imagenj1 = "Imagenes/Ryu.gif";
                    AtaqueJ1 = "Imagenes/RyuA.gif";
                    AtaqueFJ1 = "Imagenes/RyuAF.gif";
                }
                break;
            case 1:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Hulk.jpg"));
                    imagenj1 = "Imagenes/Hulk.jpg";
                    AtaqueJ1 = "Imagenes/IronMan.jpg";
                    AtaqueFJ1 = "Imagenes/IronMan.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Ken.gif"));
                    imagenj1 = "Imagenes/Ken.gif";
                    AtaqueJ1 = "Imagenes/KenA.gif";
                    AtaqueFJ1 = "Imagenes/KenAF.gif";
                    
                }
                break;
            case 2:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/CapitanAmerica.jpg"));
                    imagenj1 = "Imagenes/CapitanAmerica.jpg";
                    AtaqueJ1 = "Imagenes/IronMan.jpg";
                    AtaqueFJ1 = "Imagenes/IronMan.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/MBison.gif"));
                    imagenj1 = "Imagenes/MBison.gif";
                    AtaqueJ1 = "Imagenes/MBisonA.gif";
                    AtaqueFJ1 = "Imagenes/MBisonAF.gif";
                }
                break;
            case 3:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Thor.jpg"));
                    imagenj1 = "Imagenes/Thor.jpg";
                    AtaqueJ1 = "Imagenes/IronMan.jpg";
                    AtaqueFJ1 = "Imagenes/IronMan.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Chun-li-espera.gif"));
                    imagenj1 = "Imagenes/Chun-li-espera.gif";
                    AtaqueJ1 = "Imagenes/Chun-li-ataque.gif";
                    AtaqueFJ1 = "Imagenes/Chun-li-ataque-final.gif";
                }
                break;
            case 4:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/SpiderMan.jpg"));
                    imagenj1 = "Imagenes/SpiderMan.jpg";
                    AtaqueJ1 = "Imagenes/IronMan.jpg";
                    AtaqueFJ1 = "Imagenes/IronMan.jpg";
                    
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Zangief.gif"));
                    imagenj1 = "Imagenes/Zangief.gif";
                    AtaqueJ1 = "Imagenes/ZangiefA.gif";
                    AtaqueFJ1 = "Imagenes/ZangiefAF.gif";
                }
                break;
            case 5:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Wolverine.jpg"));
                    imagenj1 = "Imagenes/Wolverine.jpg";
                    AtaqueJ1 = "Imagenes/IronMan.jpg";
                    AtaqueFJ1 = "Imagenes/IronMan.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Dante.gif"));
                    imagenj1 = "Imagenes/Dante.gif";
                    AtaqueJ1 = "Imagenes/DanteA.gif";
                    AtaqueFJ1 = "Imagenes/DanteAF.gif";
                }
                break;
            case 6:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Storm.jpg"));
                    imagenj1 = "Imagenes/Storm.jpg";
                    AtaqueJ1 = "Imagenes/IronMan.jpg";
                    AtaqueFJ1 = "Imagenes/IronMan.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Trish.jpg"));
                    imagenj1 = "Imagenes/Trish.jpg";
                    AtaqueJ1 = "Imagenes/IronMan.jpg";
                    AtaqueFJ1 = "Imagenes/IronMan.jpg";
                }
                break;
            case 7:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Phoenix.jpg"));
                    imagenj1 = "Imagenes/Phoenix.jpg";
                    AtaqueJ1 = "Imagenes/IronMan.jpg";
                    AtaqueFJ1 = "Imagenes/IronMan.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Mundus.jpg"));
                    imagenj1 = "Imagenes/Mundus.jpg";
                    AtaqueJ1 = "Imagenes/IronMan.jpg";
                    AtaqueFJ1 = "Imagenes/IronMan.jpg";
                }
                break;
            case 8:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Cyclops.jpg"));
                    imagenj1 = "Imagenes/Cyclops.jpg";
                    AtaqueJ1 = "Imagenes/IronMan.jpg";
                    AtaqueFJ1 = "Imagenes/IronMan.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Vergil.gif"));
                    imagenj1 = "Imagenes/Vergil.gif";
                    AtaqueJ1 = "Imagenes/VergilA.gif";
                    AtaqueFJ1 = "Imagenes/VergilAF.gif";
                }
                break;
            case 9:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Magneto.jpg"));
                    imagenj1 = "Imagenes/Magneto.jpg";
                    AtaqueJ1 = "Imagenes/IronMan.jpg";
                    AtaqueFJ1 = "Imagenes/IronMan.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Sparda.jpg"));
                    imagenj1 = "Imagenes/Sparda.jpg";
                    AtaqueJ1 = "Imagenes/IronMan.jpg";
                    AtaqueFJ1 = "Imagenes/IronMan.jpg";
                }
                break;
            case 10:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/LaAntorchaHumana.jpg"));
                    imagenj1 = "Imagenes/LaAntorchaHumana.jpg";
                    AtaqueJ1 = "Imagenes/IronMan.jpg";
                    AtaqueFJ1 = "Imagenes/IronMan.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Leon Kennedy.gif"));
                    imagenj1 = "Imagenes/Leon Kennedy.gif";
                    AtaqueJ1 = "Imagenes/LeonKennedyA.gif";
                    AtaqueFJ1 = "Imagenes/LeonKennedyAF.gif";
                }
                break;
            case 11:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/LaMole.jpg"));
                    imagenj1 = "Imagenes/LaMole.jpg";
                    AtaqueJ1 = "Imagenes/IronMan.jpg";
                    AtaqueFJ1 = "Imagenes/IronMan.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Chris Redfield.gif"));
                    imagenj1 = "Imagenes/Chris Redfield.gif";
                    AtaqueJ1 = "Imagenes/ChrisRedfieldA.gif";
                    AtaqueFJ1 = "Imagenes/ChrisRedfieldAF.gif";
                }
                break;
            case 12:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/MujerInvisible.jpg"));
                    imagenj1 = "Imagenes/MujerInvisible.jpg";
                    AtaqueJ1 = "Imagenes/IronMan.jpg";
                    AtaqueFJ1 = "Imagenes/IronMan.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/AlbertWesker.jpg"));
                    imagenj1 = "Imagenes/AlbertWesker.jpg";
                    AtaqueJ1 = "Imagenes/IronMan.jpg";
                    AtaqueFJ1 = "Imagenes/IronMan.jpg";
                }
                break;
            case 13:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/MrFantastico.jpg"));
                    imagenj1 = "Imagenes/MrFantastico.jpg";
                    AtaqueJ1 = "Imagenes/IronMan.jpg";
                    AtaqueFJ1 = "Imagenes/IronMan.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/JillValentine.jpg"));
                    imagenj1 = "Imagenes/JillValentine.jpg";
                    AtaqueJ1 = "Imagenes/IronMan.jpg";
                    AtaqueFJ1 = "Imagenes/IronMan.jpg";
                }
                break;
            case 14:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Galactus.jpg"));
                    imagenj1 = "Imagenes/Galactus.jpg";
                    AtaqueJ1 = "Imagenes/IronMan.jpg";
                    AtaqueFJ1 = "Imagenes/IronMan.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Nemesis.jpg"));
                    imagenj1 = "Imagenes/Nemesis.jpg";
                    AtaqueJ1 = "Imagenes/IronMan.jpg";
                    AtaqueFJ1 = "Imagenes/IronMan.jpg";
                }
                break;
            case 15:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Domino.jpg"));
                    imagenj1 = "Imagenes/Domino.jpg";
                    AtaqueJ1 = "Imagenes/IronMan.jpg";
                    AtaqueFJ1 = "Imagenes/IronMan.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Megaman.jpg"));
                    imagenj1 = "Imagenes/Megaman.jpg";
                    AtaqueJ1 = "Imagenes/IronMan.jpg";
                    AtaqueFJ1 = "Imagenes/IronMan.jpg";
                }
                break;
            case 16:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/bedlam.jpg"));
                    imagenj1 = "Imagenes/bedlam.jpg";
                    AtaqueJ1 = "Imagenes/IronMan.jpg";
                    AtaqueFJ1 = "Imagenes/IronMan.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/protoman-esperar.gif"));
                    imagenj1 = "Imagenes/protoman-esperar.gif";
                    AtaqueJ1 = "Imagenes/Protoman-ataque.gif";
                    AtaqueFJ1 = "Imagenes/protoman-ataque-final.gif";
                }
                break;
            case 17:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/bedlam.jpg"));
                    imagenj1 = "Imagenes/bedlam.jpg";
                    AtaqueJ1 = "Imagenes/IronMan.jpg";
                    AtaqueFJ1 = "Imagenes/IronMan.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Bass.jpg"));
                    imagenj1 = "Imagenes/Bass.jpg";
                    AtaqueJ1 = "Imagenes/IronMan.jpg";
                    AtaqueFJ1 = "Imagenes/IronMan.jpg";
                }
                break;
            case 18:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/DeadPool.jpg"));
                    imagenj1 = "Imagenes/DeadPool.jpg";
                    AtaqueJ1 = "Imagenes/IronMan.jpg";
                    AtaqueFJ1 = "Imagenes/IronMan.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Zero.gif"));
                    imagenj1 = "Imagenes/Zero.gif";
                    AtaqueJ1 = "Imagenes/ZeroA.gif";
                    AtaqueFJ1 = "Imagenes/ZeroAF.gif";
                }
                break;
            case 19:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Colosus.jpg"));
                    imagenj1 = "Imagenes/Colosus.jpg";
                    AtaqueJ1 = "Imagenes/IronMan.jpg";
                    AtaqueFJ1 = "Imagenes/IronMan.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Vile.png"));
                    imagenj1 = "Imagenes/Vile.png";
                    AtaqueJ1 = "Imagenes/IronMan.jpg";
                    AtaqueFJ1 = "Imagenes/IronMan.jpg";
                }
                break;
                 
                
                
        }
        
    }//GEN-LAST:event_boxPersonajesActionPerformed

    private void boxMoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMoCActionPerformed
        
                                
        int op = boxMoC.getSelectedIndex();
        
        if (op == 0){   
                boxPersonajes.setModel(listaMarvelModel);        
        }
        
        if (op == 1){      
                boxPersonajes.setModel(listaCapcomModel);         
        } 
        
    }//GEN-LAST:event_boxMoCActionPerformed

    private void btnJugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugador2ActionPerformed
        
        activarbtnJugar1 = true;
        imagen3 = imagenj1;
        AtaqueJ3 = AtaqueJ1;
        AtaqueFJ3 = AtaqueFJ1;
        
         ImagenJugador2.setIcon(new ImageIcon(imagenj1));
         if (MoC ==0){
         NPersonaje2 = ListaMarvel.get(op);
         }else{
         NPersonaje2 = ListaCapcom.get(op);
         }
         
         ActivarJugar();
        
    }//GEN-LAST:event_btnJugador2ActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed

        NUsuario1 = ""+boxJugador1.getSelectedItem();
        NUsuario2 = ""+boxJugador2.getSelectedItem();
        
        dispose();
        
        Ventana2 obj2 = new Ventana2();
        obj2.setVisible(true);
        obj2.setLocationRelativeTo(null); 
      

    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugador1ActionPerformed
        
        activarbtnJugar2 = true;        
        imagen2 = imagenj1;
        AtaqueJ2 = AtaqueJ1;
        AtaqueFJ2 = AtaqueFJ1;
        ImagenJugador1.setIcon(new ImageIcon(imagenj1));
        
         
         if (MoC ==0){
         NPersonaje1 = ListaMarvel.get(op);
         }else{
         NPersonaje1 = ListaCapcom.get(op);
         }
         ActivarJugar();
    }//GEN-LAST:event_btnJugador1ActionPerformed

    private void btnRegJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegJugadorActionPerformed
        
        dispose();
 
        VentanaRegistro obj3 = new VentanaRegistro();
        obj3.setVisible(true);
        obj3.setLocationRelativeTo(null); 
        
    }//GEN-LAST:event_btnRegJugadorActionPerformed

    private void boxJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxJugador1ActionPerformed
        User1 = ""+boxJugador1.getSelectedItem();
        User2 = ""+boxJugador2.getSelectedItem();
        if (User1.equals(User2)){
            activarbtnJugar3 = false;
            JOptionPane.showMessageDialog(rootPane,"Escoja Otro Usuario");
        }else{
            activarbtnJugar3 = true;
        }
         ActivarJugar();        
        
    }//GEN-LAST:event_boxJugador1ActionPerformed

    private void boxJugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxJugador2ActionPerformed
        User2 = ""+boxJugador2.getSelectedItem();
        User1 = ""+boxJugador1.getSelectedItem();
        if (User1.equals(User2)){
            activarbtnJugar3 = false;
            JOptionPane.showMessageDialog(rootPane,"Escoja Otro Usuario");
        }else{
            activarbtnJugar3 = true;
        }
         ActivarJugar();
    }//GEN-LAST:event_boxJugador2ActionPerformed

    private void btnLugar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLugar1ActionPerformed
         activarbtnJugar4 = true;
         ActivarJugar();    
         LugarBatalla.setIcon(new ImageIcon("Imagenes/BosqueP.gif"));
         ImagenBatalla = "Imagenes/Bosque.gif";
         
    }//GEN-LAST:event_btnLugar1ActionPerformed

    private void btnLugar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLugar2ActionPerformed
         activarbtnJugar4 = true;
         ActivarJugar();         
        LugarBatalla.setIcon(new ImageIcon("Imagenes/UniversoP.gif"));
         ImagenBatalla = "Imagenes/Universo.gif";
    }//GEN-LAST:event_btnLugar2ActionPerformed

    private void btnLugar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLugar3ActionPerformed
         activarbtnJugar4 = true;
         ActivarJugar();    
        LugarBatalla.setIcon(new ImageIcon("Imagenes/FeriaP.gif"));
         ImagenBatalla = "Imagenes/Feria.gif";
    }//GEN-LAST:event_btnLugar3ActionPerformed

    private void btnLugar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLugar4ActionPerformed
        activarbtnJugar4 = true;
         ActivarJugar();     
        LugarBatalla.setIcon(new ImageIcon("Imagenes/GranjaP.gif"));
         ImagenBatalla = "Imagenes/Granja.gif";
    }//GEN-LAST:event_btnLugar4ActionPerformed

    private void btnLugar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLugar5ActionPerformed
        activarbtnJugar4 = true;
         ActivarJugar();     
        LugarBatalla.setIcon(new ImageIcon("Imagenes/MansionP.gif"));
         ImagenBatalla = "Imagenes/Mansion.gif";
    }//GEN-LAST:event_btnLugar5ActionPerformed

    private void btnLugar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLugar6ActionPerformed
        activarbtnJugar4 = true;
         ActivarJugar();     
        LugarBatalla.setIcon(new ImageIcon("Imagenes/TemploP.gif"));
         ImagenBatalla = "Imagenes/Templo.gif";
    }//GEN-LAST:event_btnLugar6ActionPerformed

    private void btnLugar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLugar7ActionPerformed
        activarbtnJugar4 = true;
         ActivarJugar();     
        LugarBatalla.setIcon(new ImageIcon("Imagenes/TemplodeGuerraP.gif"));
         ImagenBatalla = "Imagenes/TemplodeGuerra.gif";
    }//GEN-LAST:event_btnLugar7ActionPerformed

    private void btnLugar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLugar8ActionPerformed
        activarbtnJugar4 = true;
         ActivarJugar();     
        LugarBatalla.setIcon(new ImageIcon("Imagenes/CasinoP.gif"));
         ImagenBatalla = "Imagenes/Casino.gif";
    }//GEN-LAST:event_btnLugar8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel Fondo2;
    private javax.swing.JLabel ImagenJugador1;
    private javax.swing.JLabel ImagenJugador2;
    private javax.swing.JLabel ImagenPersonaje;
    private javax.swing.JLabel LugarBatalla;
    private javax.swing.JComboBox<String> boxJugador1;
    private javax.swing.JComboBox<String> boxJugador2;
    private javax.swing.JComboBox<String> boxMoC;
    private javax.swing.JComboBox<String> boxPersonajes;
    private javax.swing.JButton btnJugador1;
    private javax.swing.JButton btnJugador2;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnLugar1;
    private javax.swing.JButton btnLugar2;
    private javax.swing.JButton btnLugar3;
    private javax.swing.JButton btnLugar4;
    private javax.swing.JButton btnLugar5;
    private javax.swing.JButton btnLugar6;
    private javax.swing.JButton btnLugar7;
    private javax.swing.JButton btnLugar8;
    private javax.swing.JButton btnRegJugador;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    // End of variables declaration//GEN-END:variables
}
