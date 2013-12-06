/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainFrame.java
 *
 * Created on Nov 29, 2013, 2:04:52 PM
 */
package GUI.asset;

import GUI.asset.newAsset.*;
import GUI.label.*;
import javax.swing.UIManager;

/**
 *
 * @author Bagher
 */
public class AssetHistoryFrame extends javax.swing.JFrame {

    /** Creates new form MainFrame */
    public AssetHistoryFrame() {
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
        jButton23 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel61 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("سامانه‌ی مدیریت ‍پیکربندی شهردای");
        setBackground(new java.awt.Color(152, 152, 152));
        setBounds(new java.awt.Rectangle(50, 50, 750, 500));
        setMinimumSize(new java.awt.Dimension(750, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Web Yekan", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("مشاهده‌ی سوابق و آمار دارایی");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 510, 70));

        jButton23.setBackground(new java.awt.Color(60, 0, 91));
        jButton23.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
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

        jButton17.setBackground(new java.awt.Color(60, 0, 91));
        jButton17.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jButton17.setForeground(new java.awt.Color(1, 1, 1));
        jButton17.setText("پیش‌خوان");
        jButton17.setFocusPainted(false);
        jButton17.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 90, 30));

        jLabel47.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel47.setText("UID");
        getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, -1, -1));

        jLabel51.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel51.setText("نام دارایی");
        getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, -1, -1));

        jLabel54.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel54.setText("۱۲");
        getContentPane().add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 170, -1));

        jLabel53.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel53.setText("دفعات تغییر وضعیت");
        getContentPane().add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 130, -1));

        jLabel55.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel55.setText("دفعات مشاهده");
        getContentPane().add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 130, -1));

        jLabel56.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel56.setText("دفعات تغییر دارایی");
        getContentPane().add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 130, -1));

        jLabel57.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel57.setText("azadi.squar.371");
        getContentPane().add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 170, -1));

        jLabel58.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel58.setText("لیست سوابق دارایی");
        getContentPane().add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 170, -1));

        jLabel59.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel59.setText("۱۳۲");
        getContentPane().add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 170, -1));

        jLabel60.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel60.setText("۲");
        getContentPane().add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 170, -1));

        jPanel2.setBackground(new java.awt.Color(205, 205, 205));
        jPanel2.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("2");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(350, 0, 60, 30);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/file_edit.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(20, 0, 50, 30);

        jButton26.setForeground(new java.awt.Color(215, 215, 215));
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/time_machine_shaped.png"))); // NOI18N
        jButton26.setBorder(null);
        jButton26.setBorderPainted(false);
        jPanel2.add(jButton26);
        jButton26.setBounds(120, 0, 58, 30);

        jLabel19.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("۲ خرداد ۱۳۹۲");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(210, 0, 100, 30);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 410, 30));

        jPanel3.setBackground(new java.awt.Color(160, 196, 255));
        jPanel3.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("ردیف");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(350, 0, 60, 40);

        jLabel15.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("تاریخ سابقه");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(230, 0, 60, 40);

        jLabel16.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("بازگشت به سابقه");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(100, 0, 90, 40);

        jLabel18.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("مشاهده");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(0, 0, 90, 40);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 410, 40));

        jPanel4.setBackground(new java.awt.Color(254, 254, 254));
        jPanel4.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("۱");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(350, 0, 60, 30);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/file_edit.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5);
        jButton5.setBounds(20, 0, 50, 30);

        jButton25.setForeground(new java.awt.Color(215, 215, 215));
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/time_machine_shaped.png"))); // NOI18N
        jButton25.setBorder(null);
        jButton25.setBorderPainted(false);
        jPanel4.add(jButton25);
        jButton25.setBounds(120, 0, 58, 30);

        jLabel13.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("۱۲ فروردن ۱۳۹۲");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(210, 0, 100, 30);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 410, 30));

        jPanel5.setBackground(new java.awt.Color(205, 205, 205));
        jPanel5.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("4");
        jPanel5.add(jLabel17);
        jLabel17.setBounds(350, 0, 60, 30);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/file_edit.png"))); // NOI18N
        jButton7.setBorderPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton7);
        jButton7.setBounds(20, 0, 50, 30);

        jButton28.setForeground(new java.awt.Color(215, 215, 215));
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/time_machine_shaped.png"))); // NOI18N
        jButton28.setBorder(null);
        jButton28.setBorderPainted(false);
        jPanel5.add(jButton28);
        jButton28.setBounds(120, 0, 58, 30);

        jLabel24.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("۵ تیر ۱۳۹۲");
        jPanel5.add(jLabel24);
        jLabel24.setBounds(210, 0, 100, 30);

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 410, 30));

        jPanel6.setBackground(new java.awt.Color(254, 254, 254));
        jPanel6.setLayout(null);

        jLabel22.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("3");
        jPanel6.add(jLabel22);
        jLabel22.setBounds(350, 0, 60, 30);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/file_edit.png"))); // NOI18N
        jButton10.setBorderPainted(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton10);
        jButton10.setBounds(20, 0, 50, 30);

        jButton27.setForeground(new java.awt.Color(215, 215, 215));
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/time_machine_shaped.png"))); // NOI18N
        jButton27.setBorder(null);
        jButton27.setBorderPainted(false);
        jPanel6.add(jButton27);
        jButton27.setBounds(120, 0, 58, 30);

        jLabel21.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("۵ خرداد ۱۳۹۲");
        jPanel6.add(jLabel21);
        jLabel21.setBounds(210, 0, 100, 30);

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 410, 30));

        jPanel7.setBackground(new java.awt.Color(205, 205, 205));
        jPanel7.setLayout(null);

        jLabel25.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("۶");
        jPanel7.add(jLabel25);
        jLabel25.setBounds(350, 0, 60, 30);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/file_edit.png"))); // NOI18N
        jButton12.setBorderPainted(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton12);
        jButton12.setBounds(20, 0, 50, 30);

        jButton30.setForeground(new java.awt.Color(215, 215, 215));
        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/time_machine_shaped.png"))); // NOI18N
        jButton30.setBorder(null);
        jButton30.setBorderPainted(false);
        jPanel7.add(jButton30);
        jButton30.setBounds(120, 0, 58, 30);

        jLabel12.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("۱۶ آذر ۱۳۹۲");
        jPanel7.add(jLabel12);
        jLabel12.setBounds(210, 0, 100, 30);

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 410, 30));

        jPanel8.setBackground(new java.awt.Color(254, 254, 254));
        jPanel8.setLayout(null);

        jLabel28.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("۵");
        jPanel8.add(jLabel28);
        jLabel28.setBounds(350, 0, 60, 30);

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/file_edit.png"))); // NOI18N
        jButton14.setBorderPainted(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton14);
        jButton14.setBounds(20, 0, 50, 30);

        jButton29.setForeground(new java.awt.Color(215, 215, 215));
        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/time_machine_shaped.png"))); // NOI18N
        jButton29.setBorder(null);
        jButton29.setBorderPainted(false);
        jPanel8.add(jButton29);
        jButton29.setBounds(120, 0, 58, 30);

        jLabel27.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("۲۸ مهر ۱۳۹۲");
        jPanel8.add(jLabel27);
        jLabel27.setBounds(210, 0, 100, 30);

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 410, 30));
        getContentPane().add(jScrollBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, 220));

        jLabel61.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel61.setText("میدان آزادی");
        getContentPane().add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 170, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

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
                new NewAssetFrameStep1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollBar jScrollBar1;
    // End of variables declaration//GEN-END:variables
}
