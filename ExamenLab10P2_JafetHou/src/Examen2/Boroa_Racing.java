
package Examen2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class Boroa_Racing extends javax.swing.JFrame {

    //Fila 2 Silla 13
    public ArrayList<Carros> automoviles;
    
    public Boroa_Racing() {
        initComponents();
        inicializar();
        this.setLocationRelativeTo(null);
        //Hilos ab=new Hilos(jpb_CarrerraJug1, jpb_CarrerraJug2, jl_tiempo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_Partida = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jb_CrearCarro = new javax.swing.JButton();
        jb_iniciar1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jcb_jug1 = new javax.swing.JComboBox<>();
        jcb_jug2 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jl_MarcaPartida2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jl_ModeloPartida2 = new javax.swing.JLabel();
        jl_MarcaPartida1 = new javax.swing.JLabel();
        jl_VelocidadPartida2 = new javax.swing.JLabel();
        jl_ModeloPartida1 = new javax.swing.JLabel();
        jl_VelocidadPartida1 = new javax.swing.JLabel();
        jd_Carrera = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jpb_CarrerraJug2 = new javax.swing.JProgressBar();
        jpb_CarrerraJug1 = new javax.swing.JProgressBar();
        jl_CarreramodeloJug2 = new javax.swing.JLabel();
        jl_CarreramodeloJug1 = new javax.swing.JLabel();
        jb_iniciarCarrerra = new javax.swing.JButton();
        jb_volver = new javax.swing.JButton();
        jl_tiempo = new javax.swing.JLabel();
        jd_Crear = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jt_marca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jt_modelo = new javax.swing.JTextField();
        js_velocidad = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jb_crear = new javax.swing.JButton();
        jb_VolverMenu = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jb_entrarPartida = new javax.swing.JButton();
        jb_entrarCrear1 = new javax.swing.JButton();
        jb_Exit = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setForeground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Partida");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 130, 80));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Jugador 2");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, -1, -1));

        jb_CrearCarro.setBackground(new java.awt.Color(255, 255, 255));
        jb_CrearCarro.setForeground(new java.awt.Color(0, 0, 0));
        jb_CrearCarro.setText("Crear Carro");
        jb_CrearCarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_CrearCarroMouseClicked(evt);
            }
        });
        jPanel2.add(jb_CrearCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));

        jb_iniciar1.setBackground(new java.awt.Color(255, 255, 255));
        jb_iniciar1.setForeground(new java.awt.Color(0, 0, 0));
        jb_iniciar1.setText("Iniciar");
        jb_iniciar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_iniciar1MouseClicked(evt);
            }
        });
        jPanel2.add(jb_iniciar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Jugador 1");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jcb_jug1.setBackground(new java.awt.Color(255, 255, 255));
        jcb_jug1.setForeground(new java.awt.Color(0, 0, 0));
        jcb_jug1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jcb_jug1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_jug1ItemStateChanged(evt);
            }
        });
        jPanel2.add(jcb_jug1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 180, -1));

        jcb_jug2.setBackground(new java.awt.Color(255, 255, 255));
        jcb_jug2.setForeground(new java.awt.Color(0, 0, 0));
        jcb_jug2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jcb_jug2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_jug2ItemStateChanged(evt);
            }
        });
        jPanel2.add(jcb_jug2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 180, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Marca");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        jl_MarcaPartida2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jl_MarcaPartida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 210, 40));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Velocidad");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, -1, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Modelo");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, -1, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Marca");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, -1, -1));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Modelo");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Velocidad");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        jl_ModeloPartida2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jl_ModeloPartida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 210, 40));

        jl_MarcaPartida1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jl_MarcaPartida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 210, 40));

        jl_VelocidadPartida2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jl_VelocidadPartida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 210, 40));

        jl_ModeloPartida1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jl_ModeloPartida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 210, 40));

        jl_VelocidadPartida1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jl_VelocidadPartida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 210, 40));

        javax.swing.GroupLayout jd_PartidaLayout = new javax.swing.GroupLayout(jd_Partida.getContentPane());
        jd_Partida.getContentPane().setLayout(jd_PartidaLayout);
        jd_PartidaLayout.setHorizontalGroup(
            jd_PartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_PartidaLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jd_PartidaLayout.setVerticalGroup(
            jd_PartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_PartidaLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Tiempo");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 100, 50));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Progresso");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        jpb_CarrerraJug2.setBackground(new java.awt.Color(255, 255, 255));
        jpb_CarrerraJug2.setForeground(new java.awt.Color(0, 0, 255));
        jpb_CarrerraJug2.setMaximum(10000000);
        jPanel3.add(jpb_CarrerraJug2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 300, 20));

        jpb_CarrerraJug1.setBackground(new java.awt.Color(255, 255, 255));
        jpb_CarrerraJug1.setForeground(new java.awt.Color(0, 0, 255));
        jpb_CarrerraJug1.setMaximum(10000000);
        jPanel3.add(jpb_CarrerraJug1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 300, 20));

        jl_CarreramodeloJug2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_CarreramodeloJug2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jl_CarreramodeloJug2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 130, 30));

        jl_CarreramodeloJug1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_CarreramodeloJug1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jl_CarreramodeloJug1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 110, 30));

        jb_iniciarCarrerra.setBackground(new java.awt.Color(255, 255, 255));
        jb_iniciarCarrerra.setForeground(new java.awt.Color(0, 0, 0));
        jb_iniciarCarrerra.setText("Iniciar");
        jb_iniciarCarrerra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_iniciarCarrerraMouseClicked(evt);
            }
        });
        jPanel3.add(jb_iniciarCarrerra, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, -1, -1));

        jb_volver.setBackground(new java.awt.Color(255, 255, 255));
        jb_volver.setForeground(new java.awt.Color(0, 0, 0));
        jb_volver.setText("Volver");
        jb_volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_volverMouseClicked(evt);
            }
        });
        jPanel3.add(jb_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        jl_tiempo.setBackground(new java.awt.Color(0, 0, 0));
        jl_tiempo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jl_tiempo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jl_tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 140, 100));

        javax.swing.GroupLayout jd_CarreraLayout = new javax.swing.GroupLayout(jd_Carrera.getContentPane());
        jd_Carrera.getContentPane().setLayout(jd_CarreraLayout);
        jd_CarreraLayout.setHorizontalGroup(
            jd_CarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );
        jd_CarreraLayout.setVerticalGroup(
            jd_CarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CarreraLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Creacion de Carros");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 400, 140));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Marca");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        jt_marca.setBackground(new java.awt.Color(255, 255, 255));
        jt_marca.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jt_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 280, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Modelo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

        jt_modelo.setBackground(new java.awt.Color(255, 255, 255));
        jt_modelo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jt_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 350, 280, -1));

        js_velocidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        js_velocidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        jPanel1.add(js_velocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 290, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Velocidad");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, -1, -1));

        jb_crear.setBackground(new java.awt.Color(255, 255, 255));
        jb_crear.setForeground(new java.awt.Color(0, 0, 0));
        jb_crear.setText("Crear");
        jb_crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearMouseClicked(evt);
            }
        });
        jPanel1.add(jb_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, -1, -1));

        jb_VolverMenu.setBackground(new java.awt.Color(255, 255, 255));
        jb_VolverMenu.setForeground(new java.awt.Color(0, 0, 0));
        jb_VolverMenu.setText("Volver al inicio");
        jb_VolverMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_VolverMenuMouseClicked(evt);
            }
        });
        jPanel1.add(jb_VolverMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, -1, -1));

        javax.swing.GroupLayout jd_CrearLayout = new javax.swing.GroupLayout(jd_Crear.getContentPane());
        jd_Crear.getContentPane().setLayout(jd_CrearLayout);
        jd_CrearLayout.setHorizontalGroup(
            jd_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CrearLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jd_CrearLayout.setVerticalGroup(
            jd_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CrearLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(255, 51, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Bienvenido Boroa Racing");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 420, 160));

        jb_entrarPartida.setBackground(new java.awt.Color(255, 255, 255));
        jb_entrarPartida.setForeground(new java.awt.Color(0, 0, 0));
        jb_entrarPartida.setText("Partida");
        jb_entrarPartida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_entrarPartidaMouseClicked(evt);
            }
        });
        jPanel5.add(jb_entrarPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 90, -1));

        jb_entrarCrear1.setBackground(new java.awt.Color(255, 255, 255));
        jb_entrarCrear1.setForeground(new java.awt.Color(0, 0, 0));
        jb_entrarCrear1.setText("Crear Carro");
        jb_entrarCrear1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_entrarCrear1MouseClicked(evt);
            }
        });
        jPanel5.add(jb_entrarCrear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        jb_Exit.setBackground(new java.awt.Color(255, 255, 255));
        jb_Exit.setForeground(new java.awt.Color(0, 0, 0));
        jb_Exit.setText("Salir");
        jb_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ExitMouseClicked(evt);
            }
        });
        jPanel5.add(jb_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void inicializar() {
        automoviles = new ArrayList();
        admin administrador = new admin("./carros.bin");
        administrador.cargar();
        automoviles = administrador.getLista();
    }
    
    private void combobox(){
        
        DefaultComboBoxModel  j1 = (DefaultComboBoxModel)jcb_jug1.getModel();
        DefaultComboBoxModel  j2 = (DefaultComboBoxModel)jcb_jug2.getModel(); 
        
        for (Carros automovile : automoviles) {
            j1.addElement(automovile);
            j2.addElement(automovile);
        }
        
        jcb_jug1.setModel(j1);
        jcb_jug2.setModel(j2);
        
    }
    
    private void recombobox(){
        
        DefaultComboBoxModel  j1 = (DefaultComboBoxModel)jcb_jug1.getModel();
        DefaultComboBoxModel  j2 = (DefaultComboBoxModel)jcb_jug2.getModel();   
        
        j1.removeAllElements();
        j2.removeAllElements();
        
        jcb_jug1.setModel(j1);
        jcb_jug2.setModel(j2);
        
    }
    
    private void jb_crearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearMouseClicked
        
        escribir();
            
        jd_Crear.setVisible(false);
        jd_Partida.pack();
        jd_Partida.setLocationRelativeTo(this);
        combobox();
        jd_Partida.setModal(true);
        jd_Partida.setVisible(true);
        
    }//GEN-LAST:event_jb_crearMouseClicked

    private void escribir(){
        
        if(jt_marca.getText().equals("" )){
            
            JOptionPane.showMessageDialog(this, "No a ingresado marca");
            
        }else if(jt_modelo.getText().equals("")){
            
            JOptionPane.showMessageDialog(this, "No a ingresado modelo");
            
        }else{
                
            Carros nCarro = new Carros(jt_marca.getText(), jt_modelo.getText(), (int)js_velocidad.getValue());
            admin adCarro = new admin("./carros.bin");
            
            adCarro.cargar();
            adCarro.setCarros(nCarro);
            adCarro.escribir();
            automoviles.add(nCarro);

            jt_marca.setText("");
            jt_modelo.setText("");
            js_velocidad.setValue(1);
        }
        
    }
    
    private void jb_CrearCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_CrearCarroMouseClicked
        jd_Partida.setVisible(false);
        jd_Crear.pack();
        jd_Crear.setLocationRelativeTo(this);
        recombobox();
        jd_Crear.setVisible(true);
    }//GEN-LAST:event_jb_CrearCarroMouseClicked

    private void jb_iniciar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_iniciar1MouseClicked

        jd_Partida.setVisible(false);
        jd_Carrera.pack();
        jd_Carrera.setLocationRelativeTo(this);
        recombobox();
        jd_Carrera.setModal(true);
        jd_Carrera.setVisible(true);
    }//GEN-LAST:event_jb_iniciar1MouseClicked

    private void jb_volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_volverMouseClicked
        jd_Carrera.setVisible(false);
        jd_Partida.pack();
        jd_Partida.setLocationRelativeTo(this);
        combobox();
        jd_Partida.setModal(true);
        jd_Partida.setVisible(true);
    }//GEN-LAST:event_jb_volverMouseClicked

    private void jcb_jug1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_jug1ItemStateChanged
        
        if(jcb_jug1.getSelectedItem()!= null){
            Carros centi = (Carros) jcb_jug1.getSelectedItem();
            jl_MarcaPartida1.setText(centi.getMarca());
            jl_ModeloPartida1.setText(centi.getModelo());
            String num = Integer.toString(centi.getVelocidad());
            jl_VelocidadPartida1.setText(num);
            jl_CarreramodeloJug1.setText(centi.getMarca()+" "+centi.getModelo());
        }
    }//GEN-LAST:event_jcb_jug1ItemStateChanged

    private void jb_entrarCrear1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_entrarCrear1MouseClicked
        this.setVisible(false);
        jd_Crear.pack();
        jd_Crear.setLocationRelativeTo(this);
        jd_Crear.setModal(true);
        jd_Crear.setVisible(true);
    }//GEN-LAST:event_jb_entrarCrear1MouseClicked

    private void jb_entrarPartidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_entrarPartidaMouseClicked
        this.setVisible(false);
        jd_Partida.pack();
        jd_Partida.setLocationRelativeTo(this);
        combobox();
        jd_Partida.setModal(true);
        jd_Partida.setVisible(true);
    }//GEN-LAST:event_jb_entrarPartidaMouseClicked

    private void jb_VolverMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_VolverMenuMouseClicked
        jd_Crear.setVisible(false);
        this.pack();
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        
    }//GEN-LAST:event_jb_VolverMenuMouseClicked

    private void jcb_jug2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_jug2ItemStateChanged
        if(jcb_jug2.getSelectedItem()!= null){
            Carros centi = (Carros) jcb_jug2.getSelectedItem();
            jl_MarcaPartida2.setText(centi.getMarca());
            jl_ModeloPartida2.setText(centi.getModelo());
            String num = Integer.toString(centi.getVelocidad());
            jl_VelocidadPartida2.setText(num);
            jl_CarreramodeloJug2.setText(centi.getMarca()+" "+centi.getModelo());
        }
    }//GEN-LAST:event_jcb_jug2ItemStateChanged

    private void jb_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jb_ExitMouseClicked

    private void jb_iniciarCarrerraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_iniciarCarrerraMouseClicked

            jpb_CarrerraJug1.setValue(0);
            jpb_CarrerraJug2.setValue(0);
            
            Carros centi = (Carros) jcb_jug1.getSelectedItem();
            Carros nela = (Carros) jcb_jug2.getSelectedItem();
            
            Hilos ab = new Hilos(jpb_CarrerraJug1, jpb_CarrerraJug2, centi.getVelocidad(), nela.getVelocidad(), jl_tiempo);
            Thread Carrera = new Thread(ab);
            
            Carrera.start();
        
        
        
    }//GEN-LAST:event_jb_iniciarCarrerraMouseClicked

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
            java.util.logging.Logger.getLogger(Boroa_Racing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Boroa_Racing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Boroa_Racing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Boroa_Racing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Boroa_Racing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton jb_CrearCarro;
    private javax.swing.JButton jb_Exit;
    private javax.swing.JButton jb_VolverMenu;
    private javax.swing.JButton jb_crear;
    private javax.swing.JButton jb_entrarCrear1;
    private javax.swing.JButton jb_entrarPartida;
    private javax.swing.JButton jb_iniciar1;
    private javax.swing.JButton jb_iniciarCarrerra;
    private javax.swing.JButton jb_volver;
    private javax.swing.JComboBox<String> jcb_jug1;
    private javax.swing.JComboBox<String> jcb_jug2;
    private javax.swing.JDialog jd_Carrera;
    private javax.swing.JDialog jd_Crear;
    private javax.swing.JDialog jd_Partida;
    private javax.swing.JLabel jl_CarreramodeloJug1;
    private javax.swing.JLabel jl_CarreramodeloJug2;
    private javax.swing.JLabel jl_MarcaPartida1;
    private javax.swing.JLabel jl_MarcaPartida2;
    private javax.swing.JLabel jl_ModeloPartida1;
    private javax.swing.JLabel jl_ModeloPartida2;
    private javax.swing.JLabel jl_VelocidadPartida1;
    private javax.swing.JLabel jl_VelocidadPartida2;
    private javax.swing.JLabel jl_tiempo;
    private javax.swing.JProgressBar jpb_CarrerraJug1;
    private javax.swing.JProgressBar jpb_CarrerraJug2;
    private javax.swing.JSpinner js_velocidad;
    private javax.swing.JTextField jt_marca;
    private javax.swing.JTextField jt_modelo;
    // End of variables declaration//GEN-END:variables

}
