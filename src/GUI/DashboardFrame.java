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

import GUI.asset.AssetListManagementFrame;
import GUI.asset.addLabel.AssetAttachLabelFrame;
import GUI.label.LabelListManagementFrame;
import GUI.operation.OperaionListManagementFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import ood.OOD;

/**
 *
 * @author Bagher
 */
public class DashboardFrame extends javax.swing.JFrame  {

    /**
     * Creates new form MainFrame
     */
    public DashboardFrame() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Error setting native LAF: " + e);
        }

        initComponents();
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                String ObjButtons[] = {"بله", "خیر"};
                int PromptResult = JOptionPane.showOptionDialog(null, "آیا مطمئن به خروج از برنامه هستید؟", "تایید خروج", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons, ObjButtons[1]);
                if (PromptResult == JOptionPane.YES_OPTION) {
                    OOD ood = OOD.getInstance();
                    try {
                        FileOutputStream fout = new FileOutputStream("ood.cms");
                        ObjectOutputStream oos = new ObjectOutputStream(fout);
                        oos.writeObject(ood);
                        oos.close();
                        System.out.println("Done");

                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    System.exit(0);
                }
            }
        });
        
        try {
            FileInputStream fin = new FileInputStream("ood.cms");
            ObjectInputStream oos = new ObjectInputStream(fin);
            OOD ood = (OOD)oos.readObject();
            oos.close();
            ood.initial(ood);
            System.out.println("Initializaion Done!");

        } catch (Exception ex) {
            System.err.println("no file to load.");
//            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        operationManagementButton = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        assetManagementButton = new javax.swing.JButton();
        labelManagementButton = new javax.swing.JButton();
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

        titleLabel.setFont(new java.awt.Font("Web Yekan", 0, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("پیش‌خوان سامانه‌ی مدیریت پیکربندی شهرداری");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 431, 70));

        operationManagementButton.setBackground(new java.awt.Color(2, 80, 130));
        operationManagementButton.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        operationManagementButton.setForeground(new java.awt.Color(1, 1, 1));
        operationManagementButton.setText("مدیریت عملیات");
        operationManagementButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        operationManagementButton.setFocusPainted(false);
        operationManagementButton.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        operationManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operationManagementButtonActionPerformed(evt);
            }
        });
        getContentPane().add(operationManagementButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 130, 60));

        jButton10.setBackground(new java.awt.Color(2, 80, 130));
        jButton10.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jButton10.setForeground(new java.awt.Color(1, 1, 1));
        jButton10.setText("الصاق برچسب به دارایی");
        jButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton10.setFocusPainted(false);
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 130, 60));

        assetManagementButton.setBackground(new java.awt.Color(2, 80, 130));
        assetManagementButton.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        assetManagementButton.setForeground(new java.awt.Color(1, 1, 1));
        assetManagementButton.setText("مدیریت دارایی‌ها");
        assetManagementButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        assetManagementButton.setFocusPainted(false);
        assetManagementButton.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        assetManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assetManagementButtonActionPerformed(evt);
            }
        });
        getContentPane().add(assetManagementButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 130, 60));

        labelManagementButton.setBackground(new java.awt.Color(2, 80, 130));
        labelManagementButton.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        labelManagementButton.setForeground(new java.awt.Color(1, 1, 1));
        labelManagementButton.setText("مدیریت برچسب‌ها");
        labelManagementButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelManagementButton.setFocusPainted(false);
        labelManagementButton.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        labelManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelManagementButtonActionPerformed(evt);
            }
        });
        getContentPane().add(labelManagementButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 130, 60));

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
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 130, 60));

        jButton14.setBackground(new java.awt.Color(2, 80, 130));
        jButton14.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jButton14.setForeground(new java.awt.Color(1, 1, 1));
        jButton14.setText("تعریف و مدیریت رخداد");
        jButton14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton14.setFocusPainted(false);
        jButton14.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 130, 60));

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
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 130, 60));

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
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 130, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void operationManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operationManagementButtonActionPerformed
        JFrame operationFrame = new OperaionListManagementFrame();
        operationFrame.setVisible(true);
        operationFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_operationManagementButtonActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        JFrame frame = new AssetAttachLabelFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void assetManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assetManagementButtonActionPerformed
        JFrame assetFrame = new AssetListManagementFrame();
        assetFrame.setVisible(true);
        assetFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_assetManagementButtonActionPerformed

    private void labelManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelManagementButtonActionPerformed
        JFrame labelFrame = new LabelListManagementFrame();
        labelFrame.setVisible(true);
        labelFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_labelManagementButtonActionPerformed

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
    private javax.swing.JButton assetManagementButton;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton labelManagementButton;
    private javax.swing.JButton operationManagementButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
