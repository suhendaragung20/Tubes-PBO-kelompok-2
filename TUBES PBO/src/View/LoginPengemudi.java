/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author user
 */
public class LoginPengemudi extends javax.swing.JFrame {

    /**
     * Creates new form LoginPengemudi
     */
    public LoginPengemudi() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfUsernamePelngemudi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfPasswordPengemudi = new javax.swing.JTextField();
        btnLoginPengemudi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("OCR-B 10 BT", 0, 18)); // NOI18N
        jLabel1.setText("LOGIN PENGEMUDI");

        jLabel3.setText("Username");

        tfUsernamePelngemudi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsernamePelngemudiActionPerformed(evt);
            }
        });

        jLabel4.setText("Password");

        btnLoginPengemudi.setText("Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnLoginPengemudi, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfUsernamePelngemudi, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPasswordPengemudi, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfUsernamePelngemudi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(tfPasswordPengemudi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLoginPengemudi)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfUsernamePelngemudiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsernamePelngemudiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsernamePelngemudiActionPerformed

    String username;
    String password;

    public JButton getBtnLoginPengemudi() {
        return btnLoginPengemudi;
    }

    public void setTfUsernamePengemudi(String username) {
        tfUsernamePelngemudi.setText(username);
        this.username = username;
    }
    
    public void setTfPasswordPengemudi(String password) {
        tfPasswordPengemudi.setText(password);
        this.password = password;
    }
    
    public String getTfUsernamePengemudi() {
        return this.username;
    }

    public String getTfPasswordPengemudi() {
        return this.password;
    }    
    
    public void addListener(ActionListener e){
        btnLoginPengemudi.addActionListener(e);
        tfUsernamePelngemudi.addActionListener(e);
        tfPasswordPengemudi.addActionListener(e);
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoginPengemudi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tfPasswordPengemudi;
    private javax.swing.JTextField tfUsernamePelngemudi;
    // End of variables declaration//GEN-END:variables
}
