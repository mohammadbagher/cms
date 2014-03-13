/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainFrame.java
 *
 * Created on Nov 29, 2013, 2:04:52 PM
 */
package GUI.asset.newAsset;

import GUI.label.*;
import javax.swing.UIManager;

/**
 *
 * @author Bagher
 */
public class NewAssetFrameStep5 extends javax.swing.JFrame {

    /** Creates new form MainFrame */
    public NewAssetFrameStep5() {
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

        jButton23 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton34 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("سامانه‌ی مدیریت ‍پیکربندی شهردای");
        setBackground(new java.awt.Color(152, 152, 152));
        setBounds(new java.awt.Rectangle(50, 50, 750, 500));
        setMinimumSize(new java.awt.Dimension(750, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jButton16.setBackground(new java.awt.Color(60, 0, 91));
        jButton16.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jButton16.setForeground(new java.awt.Color(1, 1, 1));
        jButton16.setText("مرحله قبل");
        jButton16.setFocusPainted(false);
        jButton16.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 90, 30));

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

        jButton18.setBackground(new java.awt.Color(60, 0, 91));
        jButton18.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jButton18.setForeground(new java.awt.Color(1, 1, 1));
        jButton18.setText("ذخیره‌ی دارایی");
        jButton18.setFocusPainted(false);
        jButton18.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 90, 30));

        jLabel3.setFont(new java.awt.Font("Web Yekan", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("تعریف دارایی جدید - زیردارایی‌ها");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 510, 70));

        jButton34.setBackground(new java.awt.Color(60, 0, 91));
        jButton34.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jButton34.setForeground(new java.awt.Color(1, 1, 1));
        jButton34.setText("اضافه کردن زیردارایی");
        jButton34.setFocusPainted(false);
        jButton34.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 130, 30));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("ساختمان زیباسازی منطقه ۹");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("اتاق مدیریت ساختمان زیباسازی منطقه ۹");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("میز چوبی شماره ۱۹۳۲");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("کامپیوتر شماره ۸۲۳");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("اتاق دبیرخانه‌ی ساختمان زیباسازی منطقه ۹");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("میز چوبی شماره ۱۹۳۳");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("کامپیوتر شماره ۸۲۴");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("کمد فایل شماره ۲۹۱۲");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("آب سرد کن شماره ۳۲");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("توالت فرنگی شماره ۴۳۲۱");
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jTree1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 310, 310));

        jPanel2.setBackground(new java.awt.Color(205, 205, 205));
        jPanel2.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("2");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(280, 0, 60, 30);

        jButton1.setForeground(new java.awt.Color(215, 215, 215));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/close-24-outside.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jPanel2.add(jButton1);
        jButton1.setBounds(10, 0, 58, 30);

        jLabel57.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel57.setText("اتاق دبیرخانه‌ی ساختمان زیباسازی منطقه ۹");
        jPanel2.add(jLabel57);
        jLabel57.setBounds(-140, 0, 420, 24);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 340, 30));

        jPanel3.setBackground(new java.awt.Color(160, 196, 255));
        jPanel3.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("ردیف");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(280, 0, 60, 40);

        jLabel15.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("نام دارایی");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(220, 0, 60, 40);

        jLabel19.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("حذف");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(0, 0, 90, 40);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 340, 40));

        jPanel4.setBackground(new java.awt.Color(254, 254, 254));
        jPanel4.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("۱");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(280, 0, 60, 30);

        jButton4.setForeground(new java.awt.Color(215, 215, 215));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/close-24-outside.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jPanel4.add(jButton4);
        jButton4.setBounds(10, 0, 58, 30);

        jLabel60.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel60.setText("اتاق مدیریت ساختمان زیباسازی منطقه ۹");
        jPanel4.add(jLabel60);
        jLabel60.setBounds(70, 0, 210, 30);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 340, 30));

        jPanel5.setBackground(new java.awt.Color(205, 205, 205));
        jPanel5.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("4");
        jPanel5.add(jLabel17);
        jLabel17.setBounds(280, 0, 60, 30);

        jButton6.setForeground(new java.awt.Color(215, 215, 215));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/close-24-outside.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jPanel5.add(jButton6);
        jButton6.setBounds(10, 0, 58, 30);

        jLabel62.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel62.setText("توالت فرنگی شماره‌ی ۴۳۲۱");
        jPanel5.add(jLabel62);
        jLabel62.setBounds(-140, 0, 420, 24);

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 340, 30));

        jPanel6.setBackground(new java.awt.Color(254, 254, 254));
        jPanel6.setLayout(null);

        jLabel22.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("3");
        jPanel6.add(jLabel22);
        jLabel22.setBounds(280, 0, 60, 30);

        jButton9.setForeground(new java.awt.Color(215, 215, 215));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/close-24-outside.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jPanel6.add(jButton9);
        jButton9.setBounds(10, 0, 58, 30);

        jLabel61.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel61.setText("آب سردکن شماره‌ی ۳۲");
        jPanel6.add(jLabel61);
        jLabel61.setBounds(-140, 0, 420, 24);

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 340, 30));
        getContentPane().add(jScrollBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, -1, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton34ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new NewAssetFrameStep5().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
