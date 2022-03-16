/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.java;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class VND extends javax.swing.JFrame {

    /**
     * Creates new form VND
     */
    public VND() {
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

        jColorChooser1 = new javax.swing.JColorChooser();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        txtVND = new javax.swing.JLabel();
        edtInput = new java.awt.TextField();
        btnJPY = new javax.swing.JButton();
        btnUSD = new javax.swing.JButton();
        btnEUR = new javax.swing.JButton();
        btnGBP = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtResult = new javax.swing.JLabel();
        btnAgain = new javax.swing.JButton();
        txtDes = new javax.swing.JLabel();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VND TO OTHER");

        txtVND.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtVND.setText("Việt Nam Đồng (VND) :");

        edtInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtInputActionPerformed(evt);
            }
        });

        btnJPY.setText("Yên Nhật (JPY)");
        btnJPY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJPYActionPerformed(evt);
            }
        });

        btnUSD.setText("Đô La  Mỹ (USD)");
        btnUSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUSDActionPerformed(evt);
            }
        });

        btnEUR.setText("Euro (EUR)");
        btnEUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEURActionPerformed(evt);
            }
        });

        btnGBP.setText("Bảng Anh (GBP)");
        btnGBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGBPActionPerformed(evt);
            }
        });

        jLabel1.setText("CHỌN LOẠI TIỀN CẦN THAY ĐỔI");

        btnAgain.setText("Chuyển đổi lại");
        btnAgain.setVisible(false);
        btnAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgainActionPerformed(evt);
            }
        });

        txtDes.setText("Kết quả chuyển đổi tiền tệ");
        txtDes.setVisible(false);

        jMenu.setText("Exit");
        jMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuMouseClicked(evt);
            }
        });
        jMenuBar4.add(jMenu);

        setJMenuBar(jMenuBar4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(btnAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(86, 86, 86)
                            .addComponent(txtVND, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(edtInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(169, 169, 169))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnJPY, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtDes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnGBP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnEUR, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnUSD, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(209, 209, 209)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVND)
                    .addComponent(edtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGBP)
                    .addComponent(btnEUR)
                    .addComponent(btnUSD)
                    .addComponent(btnJPY))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtInputActionPerformed
        
    }//GEN-LAST:event_edtInputActionPerformed

    private void btnJPYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJPYActionPerformed
        // TODO add your handling code here:
        
        if(edtInput.getText().length() < 1) {
            txtResult.setText("Vui lòng nhập giá trị tiền!");
        }else {
            double  calulator = (double ) Double.parseDouble(edtInput.getText());
            txtResult.setText(edtInput.getText() + " VND" + 
                                " = " + 
                                String.valueOf(Math.round((calulator/194.47)*100.0)/100.0) + " JPY") ;
            btnAgain.setVisible(true);
            txtDes.setVisible(true);
        }
    }//GEN-LAST:event_btnJPYActionPerformed

    private void btnUSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUSDActionPerformed
        // TODO add your handling code here:
        if(edtInput.getText().length() < 1) {
            txtResult.setText("Vui lòng nhập giá trị tiền!");
        }else {
            double  calulator = (double ) Double.parseDouble(edtInput.getText());
            txtResult.setText(edtInput.getText() + " VND" + 
                                " = " + 
                                String.valueOf(Math.round((calulator/22903.07)*100.0)/100.0) + " USD") ;
            btnAgain.setVisible(true);
            txtDes.setVisible(true);
        }
    }//GEN-LAST:event_btnUSDActionPerformed

    private void btnEURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEURActionPerformed
        // TODO add your handling code here:
        if(edtInput.getText().length() < 1) {
            txtResult.setText("Vui lòng nhập giá trị tiền!");
        }else {
            double  calulator = (double ) Double.parseDouble(edtInput.getText());
            txtResult.setText(edtInput.getText() + " VND" + 
                                " = " + 
                                String.valueOf(Math.round((calulator/25062.94)*100.0)/100.0) + " EUR") ;
            btnAgain.setVisible(true);
            txtDes.setVisible(true);
        }
    }//GEN-LAST:event_btnEURActionPerformed

    private void btnGBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGBPActionPerformed
        // TODO add your handling code here:
        if(edtInput.getText().length() < 1) {
            txtResult.setText("Vui lòng nhập giá trị tiền!");
        }else {
            double  calulator = (double ) Double.parseDouble(edtInput.getText());
            txtResult.setText(edtInput.getText() + " VND" + 
                                " = " + 
                                String.valueOf(Math.round((calulator/29884.07)*100.0)/100.0) + " GBP") ;
            btnAgain.setVisible(true);
            txtDes.setVisible(true);
        }
    }//GEN-LAST:event_btnGBPActionPerformed

    private void btnAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgainActionPerformed
        // TODO add your handling code here:
        btnAgain.setVisible(false);
        edtInput.setText(null);
        txtResult.setText(null);
        txtDes.setVisible(false);
    }//GEN-LAST:event_btnAgainActionPerformed

    private void jMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuMouseClicked
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuMouseClicked

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
            java.util.logging.Logger.getLogger(VND.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VND.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VND.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VND.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VND().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgain;
    private javax.swing.JButton btnEUR;
    private javax.swing.JButton btnGBP;
    private javax.swing.JButton btnJPY;
    private javax.swing.JButton btnUSD;
    private java.awt.TextField edtInput;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JLabel txtDes;
    private javax.swing.JLabel txtResult;
    private javax.swing.JLabel txtVND;
    // End of variables declaration//GEN-END:variables
}
