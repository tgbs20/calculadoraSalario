
package Application;


public class home extends javax.swing.JFrame {


    public home() {
        initComponents();
        this.setSize(440,391); // Defina largura e altura apropriadas
this.setLocationRelativeTo(null); // Centraliza na tela
        this.setResizable(false); // Impede o redimensionamento
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnHomeCalc = new javax.swing.JButton();
        btnLoginHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(440, 391));
        setMinimumSize(new java.awt.Dimension(440, 391));
        setPreferredSize(new java.awt.Dimension(440, 391));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(440, 391));
        jPanel1.setMinimumSize(new java.awt.Dimension(440, 391));
        jPanel1.setPreferredSize(new java.awt.Dimension(440, 391));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Elizandra M\\Downloads\\casa-limpa.png")); // NOI18N
        jLabel1.setText("Home");
        jLabel1.setIconTextGap(10);

        btnHomeCalc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHomeCalc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Application/calculadora.png"))); // NOI18N
        btnHomeCalc.setText("Calculadora de salário");
        btnHomeCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeCalcActionPerformed(evt);
            }
        });

        btnLoginHome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLoginHome.setText("Login");
        btnLoginHome.setIconTextGap(10);
        btnLoginHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLoginHome, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHomeCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(btnHomeCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnLoginHome, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 540, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeCalcActionPerformed
         coletaInfo f = new coletaInfo();
              this.dispose();
              f.setVisible(true);
    }//GEN-LAST:event_btnHomeCalcActionPerformed

    private void btnLoginHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginHomeActionPerformed
         login f = new login();
              this.dispose();
              f.setVisible(true);
    }//GEN-LAST:event_btnLoginHomeActionPerformed
       
       
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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHomeCalc;
    private javax.swing.JButton btnLoginHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
