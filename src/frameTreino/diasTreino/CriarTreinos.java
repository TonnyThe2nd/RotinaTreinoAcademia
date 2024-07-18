package frameTreino.diasTreino;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import agenda.bancoDeDados.DBConnect;
import frameTreino.MainFrame;
import javax.swing.JTextField;

public class CriarTreinos extends javax.swing.JFrame {

    private javax.swing.JButton anteriorBttn;
    private javax.swing.JTextField descansoTF1;
    private javax.swing.JTextField descansoTF2;
    private javax.swing.JTextField descansoTF3;
    private javax.swing.JTextField descansoTF4;
    private javax.swing.JTextField descansoTF5;
    private javax.swing.JTextField descansoTF6;
    private javax.swing.JTextField descansoTF7;
    private javax.swing.JTextField descansoTF8;
    private javax.swing.JLabel diaLBL;
    private javax.swing.JTextField exercicioTF1;
    private javax.swing.JTextField exercicioTF2;
    private javax.swing.JTextField exercicioTF3;
    private javax.swing.JTextField exercicioTF4;
    private javax.swing.JTextField exercicioTF5;
    private javax.swing.JTextField exercicioTF6;
    private javax.swing.JTextField exercicioTF7;
    private javax.swing.JTextField exercicioTF8;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton mainFrameBttN;
    private javax.swing.JButton nextFrameBttn;
    private javax.swing.JTextField ordemTF1;
    private javax.swing.JTextField ordemTF2;
    private javax.swing.JTextField ordemTF3;
    private javax.swing.JTextField ordemTF4;
    private javax.swing.JTextField ordemTF5;
    private javax.swing.JTextField ordemTF6;
    private javax.swing.JTextField ordemTF7;
    private javax.swing.JTextField ordemTF8;
    private javax.swing.JTextField repTF1;
    private javax.swing.JTextField repTF2;
    private javax.swing.JTextField repTF3;
    private javax.swing.JTextField repTF4;
    private javax.swing.JTextField repTF5;
    private javax.swing.JTextField repTF6;
    private javax.swing.JTextField repTF7;
    private javax.swing.JTextField repTF8;
    private javax.swing.JTextField serieTF1;
    private javax.swing.JTextField serieTF2;
    private javax.swing.JTextField serieTF3;
    private javax.swing.JTextField serieTF4;
    private javax.swing.JTextField serieTF5;
    private javax.swing.JTextField serieTF6;
    private javax.swing.JTextField serieTF7;
    private javax.swing.JTextField serieTF8;
    private int contador = 0;
    
    public CriarTreinos() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ordemTF2 = new javax.swing.JTextField();
        ordemTF8 = new javax.swing.JTextField();
        ordemTF1 = new javax.swing.JTextField();
        descansoTF3 = new javax.swing.JTextField();
        ordemTF3 = new javax.swing.JTextField();
        descansoTF4 = new javax.swing.JTextField();
        ordemTF4 = new javax.swing.JTextField();
        descansoTF5 = new javax.swing.JTextField();
        descansoTF6 = new javax.swing.JTextField();
        descansoTF7 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nextFrameBttn = new javax.swing.JButton();
        ordemTF5 = new javax.swing.JTextField();
        ordemTF6 = new javax.swing.JTextField();
        ordemTF7 = new javax.swing.JTextField();
        exercicioTF2 = new javax.swing.JTextField();
        exercicioTF8 = new javax.swing.JTextField();
        exercicioTF1 = new javax.swing.JTextField();
        exercicioTF3 = new javax.swing.JTextField();
        exercicioTF4 = new javax.swing.JTextField();
        exercicioTF5 = new javax.swing.JTextField();
        exercicioTF6 = new javax.swing.JTextField();
        exercicioTF7 = new javax.swing.JTextField();
        serieTF2 = new javax.swing.JTextField();
        serieTF8 = new javax.swing.JTextField();
        serieTF1 = new javax.swing.JTextField();
        serieTF3 = new javax.swing.JTextField();
        serieTF4 = new javax.swing.JTextField();
        serieTF5 = new javax.swing.JTextField();
        serieTF6 = new javax.swing.JTextField();
        serieTF7 = new javax.swing.JTextField();
        repTF2 = new javax.swing.JTextField();
        repTF8 = new javax.swing.JTextField();
        repTF1 = new javax.swing.JTextField();
        diaLBL = new javax.swing.JLabel();
        repTF3 = new javax.swing.JTextField();
        repTF4 = new javax.swing.JTextField();
        repTF5 = new javax.swing.JTextField();
        repTF6 = new javax.swing.JTextField();
        repTF7 = new javax.swing.JTextField();
        descansoTF2 = new javax.swing.JTextField();
        descansoTF8 = new javax.swing.JTextField();
        descansoTF1 = new javax.swing.JTextField();
        mainFrameBttN = new javax.swing.JButton();
        anteriorBttn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REPETIÇÕES");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ORDEM");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("EXERCÍCIO");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SÉRIES");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DESCANSO");

        ordemTF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordemTF1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        nextFrameBttn.setText("Próximo ->");
        nextFrameBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextFrameBttnActionPerformed(evt);
            }
        });

        exercicioTF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exercicioTF1ActionPerformed(evt);
            }
        });

        serieTF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serieTF1ActionPerformed(evt);
            }
        });

        repTF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repTF1ActionPerformed(evt);
            }
        });

        diaLBL.setBackground(new java.awt.Color(204, 153, 0));
        diaLBL.setForeground(new java.awt.Color(0, 0, 0));
        diaLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        diaLBL.setText("SEGUNDA-FEIRA");

        descansoTF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descansoTF1ActionPerformed(evt);
            }
        });

        mainFrameBttN.setText("Tela Principal");
        mainFrameBttN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainFrameBttNActionPerformed(evt);
            }
        });

        anteriorBttn.setText("<- Anterior");
        anteriorBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainFrameBttN, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addComponent(anteriorBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(nextFrameBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(diaLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(11, 11, 11)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(470, 470, 470)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(ordemTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(exercicioTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(serieTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(repTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(descansoTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(ordemTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(exercicioTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(serieTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(repTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(descansoTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(ordemTF3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(exercicioTF3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(serieTF3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(repTF3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(descansoTF3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(ordemTF4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(exercicioTF4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(serieTF4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(repTF4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(descansoTF4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(ordemTF5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(exercicioTF5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(serieTF5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(repTF5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(descansoTF5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(ordemTF6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(exercicioTF6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(serieTF6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(repTF6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(descansoTF6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(ordemTF7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(exercicioTF7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(serieTF7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(repTF7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(descansoTF7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(ordemTF8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(exercicioTF8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(serieTF8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(repTF8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(descansoTF8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(477, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextFrameBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainFrameBttN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anteriorBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 14, Short.MAX_VALUE)
                    .addComponent(diaLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(4, 4, 4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(4, 4, 4)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(8, 8, 8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ordemTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exercicioTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(serieTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(repTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(descansoTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(4, 4, 4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ordemTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exercicioTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(serieTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(repTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(descansoTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(4, 4, 4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ordemTF3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exercicioTF3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(serieTF3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(repTF3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(descansoTF3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(4, 4, 4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ordemTF4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exercicioTF4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(serieTF4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(repTF4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(descansoTF4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(4, 4, 4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ordemTF5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exercicioTF5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(serieTF5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(repTF5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(descansoTF5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(4, 4, 4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ordemTF6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exercicioTF6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(serieTF6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(repTF6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(descansoTF6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(4, 4, 4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ordemTF7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exercicioTF7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(serieTF7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(repTF7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(descansoTF7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(4, 4, 4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ordemTF8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exercicioTF8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(serieTF8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(repTF8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(descansoTF8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 61, Short.MAX_VALUE)))
        );
        pack();
    }
    }
    private String verificadorDia(int contador){
        String dia = "";
        switch(contador){
            case 0 :
                if(diaLBL != null) diaLBL.setText("SEGUNDA-FEIRA");
                break;
            case 1 : 
                dia = "segunda";
                if(diaLBL != null) diaLBL.setText("TERÇA-FEIRA");
                break;
            case 2 :
                dia = "terca";
                if(diaLBL != null) diaLBL.setText("QUARTA-FEIRA");
                break;
            case 3:
                dia = "quarta";
                if(diaLBL != null) diaLBL.setText("QUINTA-FEIRA");
                break;
            case 4:
                dia = "quinta";
                if(diaLBL != null) diaLBL.setText("SEXTA-FEIRA");
                break;
            case 5:
                dia = "sexta";
                if(diaLBL != null) diaLBL.setText("SÁBADO");
                break;
            case 6:
                dia = "sabado";
                if(diaLBL != null) diaLBL.setText("DOMINGO");
                break;
            case 7:
                dia = "domingo";
                if(nextFrameBttn != null) nextFrameBttn.setText("Finalizar");
                break;
        }
        return dia;
    }
    
    //METODO PARA INSERIR TREINO NO BANCO DE DADOS
    private void inserirTreino(String script, String scriptDelete) throws SQLException{
        JTextField[] ordemFields = {ordemTF1, ordemTF2, ordemTF3, ordemTF4, ordemTF5, ordemTF6, ordemTF7, ordemTF8};
        JTextField[] exercicioFields = {exercicioTF1, exercicioTF2, exercicioTF3, exercicioTF4, exercicioTF5, exercicioTF6, exercicioTF7, exercicioTF8};
        JTextField[] serieFields = {serieTF1, serieTF2, serieTF3, serieTF4, serieTF5, serieTF6, serieTF7, serieTF8};
        JTextField[] repFields = {repTF1, repTF2, repTF3, repTF4, repTF5, repTF6, repTF7, repTF8};
        JTextField[] descansoFields = {descansoTF1, descansoTF2, descansoTF3, descansoTF4, descansoTF5, descansoTF6, descansoTF7, descansoTF8};
        //CONEXÃO COM O BANCO DE DADOS
        Connection cn = DBConnect.conexaoBanco();
        PreparedStatement ps = cn.prepareStatement(script);  
        PreparedStatement psDelete = cn.prepareStatement(scriptDelete);
        psDelete.execute();
        for (int i = 0; i < ordemFields.length; i++) {
            if(!ordemFields[i].getText().isEmpty()){
                //INSERINDO TEXTO DESEJADO NOS CAMPOS (?) DO SCRIPT SQL
                ps.setString(1, ordemFields[i].getText());
                ps.setString(2, exercicioFields[i].getText());
                ps.setString(3, serieFields[i].getText());
                ps.setString(4, repFields[i].getText());
                ps.setString(5, descansoFields[i].getText());
                ps.execute();
            }
         }       
    }
    //MÉTODO PARA LIMPAR AS TEXTFIELDS APÓS INSERIR OS DADOS
    private void limparTextField(){
        JTextField[] ordemFields = {ordemTF1, ordemTF2, ordemTF3, ordemTF4, ordemTF5, ordemTF6, ordemTF7, ordemTF8};
        JTextField[] exercicioFields = {exercicioTF1, exercicioTF2, exercicioTF3, exercicioTF4, exercicioTF5, exercicioTF6, exercicioTF7, exercicioTF8};
        JTextField[] serieFields = {serieTF1, serieTF2, serieTF3, serieTF4, serieTF5, serieTF6, serieTF7, serieTF8};
        JTextField[] repFields = {repTF1, repTF2, repTF3, repTF4, repTF5, repTF6, repTF7, repTF8};
        JTextField[] descansoFields = {descansoTF1, descansoTF2, descansoTF3, descansoTF4, descansoTF5, descansoTF6, descansoTF7, descansoTF8};
        for(int i = 0; i<ordemFields.length; i++){
            ordemFields[i].setText("");
            exercicioFields[i].setText("");
            serieFields[i].setText("");
            repFields[i].setText("");
            descansoFields[i].setText("");
        }
    }
    private void nextFrameBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextFrameBttnActionPerformed
        contador++;
        try {
            //SCRIPT SQL
            String script = "INSERT INTO "+ verificadorDia(contador) +"(ordem, exercicio, serie, repeticoes, \"descanso/segundos\") VALUES(?,?,?,?,?);";
            String scriptDelete = "DELETE FROM " + verificadorDia(contador);
            //INSERIR TREINO
            inserirTreino(script, scriptDelete); 
            limparTextField();
            if(nextFrameBttn != null && nextFrameBttn.getText().equals("Finalizar")){
                setVisible(false);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void mainFrameBttNActionPerformed(java.awt.event.ActionEvent evt) {
        MainFrame mf = new MainFrame();
        setVisible(false);
        mf.setVisible(true);
    }

    private void anteriorBttnActionPerformed(java.awt.event.ActionEvent evt) {
        if(contador<=0){
            contador = 0;
        }else{
            contador-=1;
        }
        verificadorDia(contador);
    }

    public static void main(String args[]) {   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CriarTreinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarTreinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarTreinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarTreinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriarTreinos().setVisible(true);
            }
        });
    }
}
