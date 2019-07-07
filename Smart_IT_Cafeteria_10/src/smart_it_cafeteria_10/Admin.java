
package smart_it_cafeteria_10;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;


public class Admin extends javax.swing.JFrame {
    

    public Admin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextPassword = new javax.swing.JTextField();
        jBtnLogIn = new javax.swing.JButton();
        jBtnExit = new javax.swing.JButton();
        jBtnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setLayout(null);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 70, 120, 50);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Vegetarian-Diet.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 10, 740, 540);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 3, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 204, 0));
        jLabel2.setText("Admin Log In...");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(790, 20, 470, 90);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel4.setText("Username");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(820, 150, 130, 40);
        jPanel1.add(jTextUsername);
        jTextUsername.setBounds(970, 150, 290, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel5.setText("Password");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(820, 230, 140, 30);
        jPanel1.add(jTextPassword);
        jTextPassword.setBounds(970, 220, 290, 40);

        jBtnLogIn.setText("Log In");
        jBtnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLogInActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnLogIn);
        jBtnLogIn.setBounds(750, 350, 150, 50);

        jBtnExit.setText("Exit");
        jBtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExitActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnExit);
        jBtnExit.setBounds(1090, 350, 190, 50);

        jBtnReset.setText("Reset");
        jBtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnResetActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnReset);
        jBtnReset.setBounds(910, 350, 170, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1296, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLogInActionPerformed
        String User = jTextUsername.getText();
        String pass = jTextPassword.getText();
        
        if(User.contains("one")&& pass.contains("king"))
        {
            jTextUsername.setText(null);
            jTextPassword.setText(null);
            Admin2 obj = new Admin2();
            obj.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Invalid Log In Details");
            jTextUsername.setText(null);
            jTextPassword.setText(null);            
        }
    }//GEN-LAST:event_jBtnLogInActionPerformed

    private void jBtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExitActionPerformed
        Welcome obj = new Welcome();
        obj.setVisible(true);
    }//GEN-LAST:event_jBtnExitActionPerformed

    private void jBtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnResetActionPerformed
        jTextUsername.setText(null);
        jTextPassword.setText(null);
    }//GEN-LAST:event_jBtnResetActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnExit;
    private javax.swing.JButton jBtnLogIn;
    private javax.swing.JButton jBtnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextPassword;
    private javax.swing.JTextField jTextUsername;
    // End of variables declaration//GEN-END:variables
}
