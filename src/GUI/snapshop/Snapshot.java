/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainFrame.java
 *
 * Created on Nov 29, 2013, 2:04:52 PM
 */
package GUI.snapshop;
import GUI.operation.*;
import javax.swing.UIManager;


/**
 *
 * @author Bagher
 */
public class Snapshot extends javax.swing.JFrame {

    /** Creates new form MainFrame */
    public Snapshot() {
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

        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jButton23 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("سامانه‌ی مدیریت ‍پیکربندی شهردای");
        setBounds(new java.awt.Rectangle(50, 50, 750, 500));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(750, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Web Yekan", 0, 24));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("مدیریت عملیات");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 431, 70));

        jButton2.setBackground(new java.awt.Color(60, 0, 91));
        jButton2.setFont(new java.awt.Font("Web Yekan", 0, 15));
        jButton2.setForeground(new java.awt.Color(1, 1, 1));
        jButton2.setText("افزودن حالت فعلی سیستم به لیست مبنا‌ها");
        jButton2.setFocusPainted(false);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 250, 30));

        jPanel2.setBackground(new java.awt.Color(205, 205, 205));
        jPanel2.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Web Yekan", 0, 15));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("2");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(620, 0, 60, 30);

        jLabel9.setFont(new java.awt.Font("Web Yekan", 0, 15));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("بعد از عملیات اطفاء آتش گسترده");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(400, 0, 220, 30);

        jButton1.setForeground(new java.awt.Color(215, 215, 215));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/close-24-outside.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jPanel2.add(jButton1);
        jButton1.setBounds(10, 0, 58, 30);

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/run.png"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14);
        jButton14.setBounds(160, 0, 50, 30);

        jLabel32.setFont(new java.awt.Font("Web Yekan", 0, 15));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("۱۳۹۲/۰۷/۰۶");
        jPanel2.add(jLabel32);
        jLabel32.setBounds(290, 0, 90, 30);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 680, 30));

        jPanel3.setBackground(new java.awt.Color(160, 196, 255));
        jPanel3.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Web Yekan", 0, 15));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("ردیف");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(620, 0, 60, 40);

        jLabel15.setFont(new java.awt.Font("Web Yekan", 0, 15));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("نام مبنا");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(570, 0, 60, 40);

        jLabel16.setFont(new java.awt.Font("Web Yekan", 0, 15));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("تاریخ ایجاد");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(300, 0, 90, 40);

        jLabel18.setFont(new java.awt.Font("Web Yekan", 0, 15));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("بازگرداندن سیستم به مبنا");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(120, 0, 140, 40);

        jLabel19.setFont(new java.awt.Font("Web Yekan", 0, 15));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("حذف");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(0, 0, 90, 40);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 680, 40));

        jPanel4.setBackground(new java.awt.Color(254, 254, 254));
        jPanel4.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Web Yekan", 0, 15));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("۱");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(620, 0, 60, 30);

        jButton4.setForeground(new java.awt.Color(215, 215, 215));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/close-24-outside.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jPanel4.add(jButton4);
        jButton4.setBounds(10, 0, 58, 30);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/run.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5);
        jButton5.setBounds(160, 0, 50, 30);

        jLabel12.setFont(new java.awt.Font("Web Yekan", 0, 15));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("قبل وقوع سیل احتمالی");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(420, 0, 200, 30);

        jLabel13.setFont(new java.awt.Font("Web Yekan", 0, 15));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("۱۳۹۲/۰۸/۰۶");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(290, 0, 90, 30);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 680, 30));

        jPanel6.setBackground(new java.awt.Color(254, 254, 254));
        jPanel6.setLayout(null);

        jLabel22.setFont(new java.awt.Font("Web Yekan", 0, 15));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("3");
        jPanel6.add(jLabel22);
        jLabel22.setBounds(620, 0, 60, 30);

        jButton9.setForeground(new java.awt.Color(215, 215, 215));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/close-24-outside.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jPanel6.add(jButton9);
        jButton9.setBounds(10, 0, 58, 30);

        jLabel23.setFont(new java.awt.Font("Web Yekan", 0, 15));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("خرابی‌ها در دارایی ها برطرف شده");
        jPanel6.add(jLabel23);
        jLabel23.setBounds(420, 0, 200, 30);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/run.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton12);
        jButton12.setBounds(160, 0, 50, 30);

        jLabel24.setFont(new java.awt.Font("Web Yekan", 0, 15));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("۱۳۹۲/۰۲/۰۶");
        jPanel6.add(jLabel24);
        jLabel24.setBounds(290, 0, 90, 30);

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 680, 30));
        getContentPane().add(jScrollBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, -1, 130));

        jButton23.setBackground(new java.awt.Color(60, 0, 91));
        jButton23.setFont(new java.awt.Font("Web Yekan", 0, 15));
        jButton23.setForeground(new java.awt.Color(1, 1, 1));
        jButton23.setText("خروج");
        jButton23.setFocusPainted(false);
        jButton23.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 90, 30));

        jButton15.setBackground(new java.awt.Color(60, 0, 91));
        jButton15.setFont(new java.awt.Font("Web Yekan", 0, 15));
        jButton15.setForeground(new java.awt.Color(1, 1, 1));
        jButton15.setText("پیش‌خوان");
        jButton15.setFocusPainted(false);
        jButton15.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 90, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton5ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton23ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Snapshot().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollBar jScrollBar1;
    // End of variables declaration//GEN-END:variables
}