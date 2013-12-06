/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainFrame.java
 *
 * Created on Nov 29, 2013, 2:04:52 PM
 */
package GUI;

import javax.swing.UIManager;

/**
 *
 * @author Bagher
 */
public class DashboardFrame extends javax.swing.JFrame {

    /** Creates new form MainFrame */
    public DashboardFrame() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e) {
          System.out.println("Error setting native LAF: " + e);
        }
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("سامانه‌ی مدیریت ‍پیکربندی شهردای");
        setBounds(new java.awt.Rectangle(50, 50, 750, 500));
        setMinimumSize(new java.awt.Dimension(750, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Web Yekan", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("پیش‌خوان");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 431, 70));

        jButton2.setBackground(new java.awt.Color(60, 0, 91));
        jButton2.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(1, 1, 1));
        jButton2.setText("خروج");
        jButton2.setFocusPainted(false);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 90, 30));

        jButton8.setBackground(new java.awt.Color(2, 80, 130));
        jButton8.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jButton8.setForeground(new java.awt.Color(1, 1, 1));
        jButton8.setText("مدیریت عملیات");
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton8.setFocusPainted(false);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 120, 60));

        jButton10.setBackground(new java.awt.Color(2, 80, 130));
        jButton10.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jButton10.setForeground(new java.awt.Color(1, 1, 1));
        jButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton10.setFocusPainted(false);
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 120, 60));

        jButton11.setBackground(new java.awt.Color(2, 80, 130));
        jButton11.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jButton11.setForeground(new java.awt.Color(1, 1, 1));
        jButton11.setText("مدیریت دارایی‌ها");
        jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton11.setFocusPainted(false);
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 120, 60));

        jButton12.setBackground(new java.awt.Color(2, 80, 130));
        jButton12.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jButton12.setForeground(new java.awt.Color(1, 1, 1));
        jButton12.setText("مدیریت برچسب‌ها");
        jButton12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton12.setFocusPainted(false);
        jButton12.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 120, 60));

        jButton13.setBackground(new java.awt.Color(2, 80, 130));
        jButton13.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jButton13.setForeground(new java.awt.Color(1, 1, 1));
        jButton13.setText("تنظیم سیستم");
        jButton13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton13.setFocusPainted(false);
        jButton13.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 120, 60));

        jButton14.setBackground(new java.awt.Color(2, 80, 130));
        jButton14.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jButton14.setForeground(new java.awt.Color(1, 1, 1));
        jButton14.setText("تعریف و گزارش رخداد");
        jButton14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton14.setFocusPainted(false);
        jButton14.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 120, 60));

        jButton15.setBackground(new java.awt.Color(2, 80, 130));
        jButton15.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jButton15.setForeground(new java.awt.Color(1, 1, 1));
        jButton15.setText("مشاهده‌ی گزارش‌ها");
        jButton15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton15.setFocusPainted(false);
        jButton15.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 120, 60));

        jButton16.setBackground(new java.awt.Color(2, 80, 130));
        jButton16.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jButton16.setForeground(new java.awt.Color(1, 1, 1));
        jButton16.setText("ذخیره و بازیابی مبنا");
        jButton16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton16.setFocusPainted(false);
        jButton16.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 120, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new DashboardFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
