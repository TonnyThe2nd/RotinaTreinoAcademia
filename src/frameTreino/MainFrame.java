package frameTreino;

import frameTreino.treinoExistente.TreinoExistente;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import agenda.bancoDeDados.DBConnect;

import frameTreino.diasTreino.CriarTreinos;
import javax.swing.JOptionPane;
public class MainFrame extends javax.swing.JFrame {
    
    private Connection cn;
    
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        treinoExistenteBTTN = new javax.swing.JButton();
        novoTreinoBTTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        treinoExistenteBTTN.setText("VISUALIZAR MEU TREINO");
        treinoExistenteBTTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treinoExistenteBTTNActionPerformed(evt);
            }
        });

        novoTreinoBTTN.setText("NOVO TREINO");
        novoTreinoBTTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoTreinoBTTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addComponent(treinoExistenteBTTN, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(183, Short.MAX_VALUE)
                    .addComponent(novoTreinoBTTN, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(170, 170, 170)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(255, Short.MAX_VALUE)
                .addComponent(treinoExistenteBTTN, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(145, 145, 145)
                    .addComponent(novoTreinoBTTN, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(258, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void novoTreinoBTTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoTreinoBTTNActionPerformed
        CriarTreinos day = new CriarTreinos();
        day.setVisible(true);
    }//GEN-LAST:event_novoTreinoBTTNActionPerformed

    private void treinoExistenteBTTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treinoExistenteBTTNActionPerformed
        cn = new DBConnect().conexaoBanco();
        try{
            String script = "SELECT * FROM segunda";
            PreparedStatement ps = cn.prepareStatement(script);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            if(!rs.next()){
                JOptionPane.showMessageDialog(rootPane, "Não há treino criado!!");
            }else{
                TreinoExistente te = new TreinoExistente();
                te.setVisible(true);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_treinoExistenteBTTNActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton novoTreinoBTTN;
    private javax.swing.JButton treinoExistenteBTTN;
    // End of variables declaration//GEN-END:variables
}
