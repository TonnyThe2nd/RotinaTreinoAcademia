/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frameTreino.treinoExistente;

import agenda.bancoDeDados.DBConnect;
import frameTreino.MainFrame;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class TreinoExistente extends javax.swing.JFrame {

    private int contador = 1;
    
    public TreinoExistente() throws SQLException {
        initComponents();
        try (Connection cn = new DBConnect().conexaoBanco();
             PreparedStatement ps = cn.prepareStatement("SELECT * FROM segunda");
             ResultSet rs = ps.executeQuery()) {

            JLabel[] ordemLbl = {OrdemLBL1, OrdemLBL2, OrdemLBL3, OrdemLBL4, OrdemLBL5, OrdemLBL6, OrdemLBL7, OrdemLBL8};
            JLabel[] exercicioLbl = {ExercicioLBL1, ExercicioLBL2, ExercicioLBL3, ExercicioLBL4, ExercicioLBL5, ExercicioLBL6, ExercicioLBL7, ExercicioLBL8};
            JLabel[] serieLbl = {SerieLBL1, SerieLBL2, SerieLBL3, SerieLBL4, SerieLBL5, SerieLBL6, SerieLBL7, SerieLBL8};
            JLabel[] repLbl = {RepLBL1, RepLBL2, RepLBL3, RepLBL4, RepLBL5, RepLBL6, RepLBL7, RepLBL8};
            JLabel[] descansoLbl = {DescansoLBL1, DescansoLBL2, DescansoLBL3, DescansoLBL4, DescansoLBL5, DescansoLBL6, DescansoLBL7, DescansoLBL8};

            int i = 0;
            while (rs.next() && i < ordemLbl.length) {
                ordemLbl[i].setText(rs.getString("ordem"));
                exercicioLbl[i].setText(rs.getString("exercicio"));
                serieLbl[i].setText(rs.getString("serie"));
                repLbl[i].setText(rs.getString("repeticoes"));
                descansoLbl[i].setText(rs.getString("descanso/segundos"));
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }

    private String verificadorDia(int contador){
        String dia = "";
        switch(contador){
            case 1 : 
                diaLBL.setText("SEGUNDA-FEIRA");
                dia = "segunda";
                break;
            case 2 :
                diaLBL.setText("TERÇA-FEIRA");
                dia = "terca";
                break;
            case 3:
                diaLBL.setText("QUARTA-FEIRA");
                dia = "quarta";
                break;
            case 4:
                diaLBL.setText("QUINTA-FEIRA");
                dia = "quinta";
                break;
            case 5:
                diaLBL.setText("SEXTA-FEIRA");
                dia = "sexta";
                break;
            case 6:
                diaLBL.setText("SÁBADO");
                dia = "sabado";
                break;
            case 7:
                diaLBL.setText("DOMINGO");
                dia = "domingo";
                break;
        }
        return dia;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        diaLBL = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        OrdemLBL2 = new javax.swing.JLabel();
        OrdemLBL3 = new javax.swing.JLabel();
        OrdemLBL8 = new javax.swing.JLabel();
        OrdemLBL6 = new javax.swing.JLabel();
        OrdemLBL1 = new javax.swing.JLabel();
        OrdemLBL4 = new javax.swing.JLabel();
        OrdemLBL7 = new javax.swing.JLabel();
        OrdemLBL5 = new javax.swing.JLabel();
        ExercicioLBL8 = new javax.swing.JLabel();
        ExercicioLBL1 = new javax.swing.JLabel();
        ExercicioLBL2 = new javax.swing.JLabel();
        ExercicioLBL3 = new javax.swing.JLabel();
        ExercicioLBL4 = new javax.swing.JLabel();
        ExercicioLBL5 = new javax.swing.JLabel();
        ExercicioLBL6 = new javax.swing.JLabel();
        ExercicioLBL7 = new javax.swing.JLabel();
        SerieLBL8 = new javax.swing.JLabel();
        DescansoLBL8 = new javax.swing.JLabel();
        SerieLBL2 = new javax.swing.JLabel();
        SerieLBL3 = new javax.swing.JLabel();
        SerieLBL4 = new javax.swing.JLabel();
        SerieLBL5 = new javax.swing.JLabel();
        SerieLBL6 = new javax.swing.JLabel();
        SerieLBL7 = new javax.swing.JLabel();
        SerieLBL1 = new javax.swing.JLabel();
        RepLBL1 = new javax.swing.JLabel();
        RepLBL2 = new javax.swing.JLabel();
        RepLBL3 = new javax.swing.JLabel();
        RepLBL4 = new javax.swing.JLabel();
        RepLBL5 = new javax.swing.JLabel();
        RepLBL6 = new javax.swing.JLabel();
        RepLBL7 = new javax.swing.JLabel();
        RepLBL8 = new javax.swing.JLabel();
        DescansoLBL1 = new javax.swing.JLabel();
        DescansoLBL2 = new javax.swing.JLabel();
        DescansoLBL3 = new javax.swing.JLabel();
        DescansoLBL4 = new javax.swing.JLabel();
        DescansoLBL5 = new javax.swing.JLabel();
        DescansoLBL6 = new javax.swing.JLabel();
        DescansoLBL7 = new javax.swing.JLabel();
        AnteriorBTTN = new javax.swing.JButton();
        PosteriorBTTN = new javax.swing.JButton();
        mainFrameBttn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REPETIÇÕES");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 98, 46));

        diaLBL.setBackground(new java.awt.Color(204, 153, 0));
        diaLBL.setForeground(new java.awt.Color(0, 0, 0));
        diaLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        diaLBL.setText("SEGUNDA-FEIRA");
        getContentPane().add(diaLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 572, 66));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ORDEM");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 60, 46));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("EXERCÍCIO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 179, 46));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SÉRIES");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 93, 46));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DESCANSO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 92, 46));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 570, 2));

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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 570, 2));

        OrdemLBL2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(OrdemLBL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 70, -1));

        OrdemLBL3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(OrdemLBL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 70, -1));

        OrdemLBL8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(OrdemLBL8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 70, -1));

        OrdemLBL6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(OrdemLBL6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 70, -1));

        OrdemLBL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(OrdemLBL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 70, -1));

        OrdemLBL4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(OrdemLBL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 70, -1));

        OrdemLBL7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(OrdemLBL7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 70, -1));

        OrdemLBL5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(OrdemLBL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 70, -1));
        getContentPane().add(ExercicioLBL8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 190, -1));
        getContentPane().add(ExercicioLBL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 190, -1));
        getContentPane().add(ExercicioLBL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 190, -1));
        getContentPane().add(ExercicioLBL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 190, -1));
        getContentPane().add(ExercicioLBL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 190, -1));
        getContentPane().add(ExercicioLBL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 190, -1));
        getContentPane().add(ExercicioLBL6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 190, -1));
        getContentPane().add(ExercicioLBL7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 190, -1));
        getContentPane().add(SerieLBL8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, -1, -1));
        getContentPane().add(DescansoLBL8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, -1, -1));
        getContentPane().add(SerieLBL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));
        getContentPane().add(SerieLBL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));
        getContentPane().add(SerieLBL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));
        getContentPane().add(SerieLBL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));
        getContentPane().add(SerieLBL6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));
        getContentPane().add(SerieLBL7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));
        getContentPane().add(SerieLBL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));
        getContentPane().add(RepLBL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));
        getContentPane().add(RepLBL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));
        getContentPane().add(RepLBL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));
        getContentPane().add(RepLBL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));
        getContentPane().add(RepLBL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, -1, -1));
        getContentPane().add(RepLBL6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, -1));
        getContentPane().add(RepLBL7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, -1));
        getContentPane().add(RepLBL8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, -1, -1));
        getContentPane().add(DescansoLBL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, -1));
        getContentPane().add(DescansoLBL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, -1));
        getContentPane().add(DescansoLBL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, -1, -1));
        getContentPane().add(DescansoLBL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, -1));
        getContentPane().add(DescansoLBL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, -1, -1));
        getContentPane().add(DescansoLBL6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, -1));
        getContentPane().add(DescansoLBL7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, -1, -1));

        AnteriorBTTN.setText("<");
        AnteriorBTTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnteriorBTTNActionPerformed(evt);
            }
        });
        getContentPane().add(AnteriorBTTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, -1, -1));

        PosteriorBTTN.setText(">");
        PosteriorBTTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosteriorBTTNActionPerformed(evt);
            }
        });
        getContentPane().add(PosteriorBTTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, -1, -1));

        mainFrameBttn.setText("Tela Principal");
        mainFrameBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainFrameBttnActionPerformed(evt);
            }
        });
        getContentPane().add(mainFrameBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayTreino(int contador){
        Connection cn = new DBConnect().conexaoBanco();
        JLabel[] ordemLbl = {OrdemLBL1, OrdemLBL2, OrdemLBL3, OrdemLBL4, OrdemLBL5, OrdemLBL6, OrdemLBL7, OrdemLBL8};
        JLabel[] exercicioLbl = {ExercicioLBL1, ExercicioLBL2, ExercicioLBL3, ExercicioLBL4, ExercicioLBL5, ExercicioLBL6, ExercicioLBL7, ExercicioLBL8};
        JLabel[] serieLbl = {SerieLBL1, SerieLBL2, SerieLBL3, SerieLBL4, SerieLBL5, SerieLBL6, SerieLBL7, SerieLBL8};
        JLabel[] repLbl = {RepLBL1, RepLBL2, RepLBL3, RepLBL4, RepLBL5, RepLBL6, RepLBL7, RepLBL8};
        JLabel[] descansoLbl = {DescansoLBL1, DescansoLBL2, DescansoLBL3, DescansoLBL4, DescansoLBL5, DescansoLBL6, DescansoLBL7, DescansoLBL8};
        //RESETANDO OS TEXTOS PARA DEIXAR OS CAMPOS SEM CONTEÚDO EM BRANCO
        for (int j = 0; j < ordemLbl.length; j++) {
            ordemLbl[j].setText("");
            exercicioLbl[j].setText("");
            serieLbl[j].setText("");
            repLbl[j].setText("");
            descansoLbl[j].setText("");
        }
        String script = "SELECT * FROM " +verificadorDia(this.contador);
        PreparedStatement ps;
        try {
            ps = cn.prepareStatement(script);
            ResultSet rs = ps.executeQuery();

            int i = 0;
            while (rs.next() && i < ordemLbl.length) {
                
                
                //INSERINDO NOVOS TEXTOS
                ordemLbl[i].setText(rs.getString("ordem"));
                exercicioLbl[i].setText(rs.getString("exercicio"));
                serieLbl[i].setText(rs.getString("serie"));
                repLbl[i].setText(rs.getString("repeticoes"));
                descansoLbl[i].setText(rs.getString("descanso/segundos"));
                i++;
            }
            rs.close();
            ps.close();
            cn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private void PosteriorBTTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PosteriorBTTNActionPerformed
        if(contador>=7){
            contador = 7;
        }else{
            contador+=1;
        }
        displayTreino(contador);      
    }//GEN-LAST:event_PosteriorBTTNActionPerformed

    private void AnteriorBTTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnteriorBTTNActionPerformed
        if(contador<=1){
            contador = 1;
        }else{
            contador-=1;
        }
        displayTreino(contador);
    }//GEN-LAST:event_AnteriorBTTNActionPerformed

    private void mainFrameBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainFrameBttnActionPerformed
        MainFrame mf = new MainFrame();
        setVisible(false);
        mf.setVisible(true);
    }//GEN-LAST:event_mainFrameBttnActionPerformed

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
            java.util.logging.Logger.getLogger(TreinoExistente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TreinoExistente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TreinoExistente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TreinoExistente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TreinoExistente().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TreinoExistente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnteriorBTTN;
    private javax.swing.JLabel DescansoLBL1;
    private javax.swing.JLabel DescansoLBL2;
    private javax.swing.JLabel DescansoLBL3;
    private javax.swing.JLabel DescansoLBL4;
    private javax.swing.JLabel DescansoLBL5;
    private javax.swing.JLabel DescansoLBL6;
    private javax.swing.JLabel DescansoLBL7;
    private javax.swing.JLabel DescansoLBL8;
    private javax.swing.JLabel ExercicioLBL1;
    private javax.swing.JLabel ExercicioLBL2;
    private javax.swing.JLabel ExercicioLBL3;
    private javax.swing.JLabel ExercicioLBL4;
    private javax.swing.JLabel ExercicioLBL5;
    private javax.swing.JLabel ExercicioLBL6;
    private javax.swing.JLabel ExercicioLBL7;
    private javax.swing.JLabel ExercicioLBL8;
    private javax.swing.JLabel OrdemLBL1;
    private javax.swing.JLabel OrdemLBL2;
    private javax.swing.JLabel OrdemLBL3;
    private javax.swing.JLabel OrdemLBL4;
    private javax.swing.JLabel OrdemLBL5;
    private javax.swing.JLabel OrdemLBL6;
    private javax.swing.JLabel OrdemLBL7;
    private javax.swing.JLabel OrdemLBL8;
    private javax.swing.JButton PosteriorBTTN;
    private javax.swing.JLabel RepLBL1;
    private javax.swing.JLabel RepLBL2;
    private javax.swing.JLabel RepLBL3;
    private javax.swing.JLabel RepLBL4;
    private javax.swing.JLabel RepLBL5;
    private javax.swing.JLabel RepLBL6;
    private javax.swing.JLabel RepLBL7;
    private javax.swing.JLabel RepLBL8;
    private javax.swing.JLabel SerieLBL1;
    private javax.swing.JLabel SerieLBL2;
    private javax.swing.JLabel SerieLBL3;
    private javax.swing.JLabel SerieLBL4;
    private javax.swing.JLabel SerieLBL5;
    private javax.swing.JLabel SerieLBL6;
    private javax.swing.JLabel SerieLBL7;
    private javax.swing.JLabel SerieLBL8;
    private javax.swing.JLabel diaLBL;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton mainFrameBttn;
    // End of variables declaration//GEN-END:variables
}
