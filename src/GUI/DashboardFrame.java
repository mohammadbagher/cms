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
import GUI.event.EventManagementFrame;
import GUI.label.LabelListManagementFrame;
import GUI.operation.OperaionListManagementFrame;
import GUI.report.Report;
import GUI.snapshop.SnapshotFrame;
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
                        FileOutputStream fout = new FileOutputStream("cms.data");
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
            FileInputStream fin = new FileInputStream("cms.data");
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
        attachLabelButton = new javax.swing.JButton();
        assetManagementButton = new javax.swing.JButton();
        labelManagementButton = new javax.swing.JButton();
        EventManamgementButton = new javax.swing.JButton();
        consistencyRuleButton = new javax.swing.JButton();
        BaselineManagementButton = new javax.swing.JButton();
        SettingsButton = new javax.swing.JButton();

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
        getContentPane().add(operationManagementButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 130, 60));

        attachLabelButton.setBackground(new java.awt.Color(2, 80, 130));
        attachLabelButton.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        attachLabelButton.setForeground(new java.awt.Color(1, 1, 1));
        attachLabelButton.setText("الصاق برچسب به دارایی");
        attachLabelButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        attachLabelButton.setFocusPainted(false);
        attachLabelButton.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        attachLabelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attachLabelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(attachLabelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 130, 60));

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
        getContentPane().add(assetManagementButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 130, 60));

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
        getContentPane().add(labelManagementButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 130, 60));

        EventManamgementButton.setBackground(new java.awt.Color(2, 80, 130));
        EventManamgementButton.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        EventManamgementButton.setForeground(new java.awt.Color(1, 1, 1));
        EventManamgementButton.setText("تعریف و مدیریت رخداد");
        EventManamgementButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EventManamgementButton.setFocusPainted(false);
        EventManamgementButton.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        EventManamgementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventManamgementButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EventManamgementButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 130, 60));

        consistencyRuleButton.setBackground(new java.awt.Color(2, 80, 130));
        consistencyRuleButton.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        consistencyRuleButton.setForeground(new java.awt.Color(1, 1, 1));
        consistencyRuleButton.setText("گزارش سازگارسنجی");
        consistencyRuleButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        consistencyRuleButton.setFocusPainted(false);
        consistencyRuleButton.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        consistencyRuleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consistencyRuleButtonActionPerformed(evt);
            }
        });
        getContentPane().add(consistencyRuleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 130, 60));

        BaselineManagementButton.setBackground(new java.awt.Color(2, 80, 130));
        BaselineManagementButton.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        BaselineManagementButton.setForeground(new java.awt.Color(1, 1, 1));
        BaselineManagementButton.setText("ذخیره و بازیابی مبنا");
        BaselineManagementButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BaselineManagementButton.setFocusPainted(false);
        BaselineManagementButton.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        BaselineManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaselineManagementButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BaselineManagementButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 130, 60));

        SettingsButton.setBackground(new java.awt.Color(2, 80, 130));
        SettingsButton.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        SettingsButton.setForeground(new java.awt.Color(1, 1, 1));
        SettingsButton.setText("تنظیم سیستم");
        SettingsButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SettingsButton.setFocusPainted(false);
        SettingsButton.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        SettingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SettingsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 130, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void operationManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operationManagementButtonActionPerformed
        JFrame operationFrame = new OperaionListManagementFrame();
        operationFrame.setVisible(true);
        operationFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_operationManagementButtonActionPerformed

    private void attachLabelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attachLabelButtonActionPerformed
        JFrame frame = new AssetAttachLabelFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_attachLabelButtonActionPerformed

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

    private void EventManamgementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventManamgementButtonActionPerformed
        JFrame jFrame = new EventManagementFrame();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_EventManamgementButtonActionPerformed

    private void consistencyRuleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consistencyRuleButtonActionPerformed
        Report rp = new Report();
        rp.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        rp.setVisible(true);
    }//GEN-LAST:event_consistencyRuleButtonActionPerformed

    private void BaselineManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaselineManagementButtonActionPerformed
        SnapshotFrame s = new SnapshotFrame();
        s.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        s.setVisible(true);
    }//GEN-LAST:event_BaselineManagementButtonActionPerformed

    private void SettingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SettingsButtonActionPerformed

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
    private javax.swing.JButton BaselineManagementButton;
    private javax.swing.JButton EventManamgementButton;
    private javax.swing.JButton SettingsButton;
    private javax.swing.JButton assetManagementButton;
    private javax.swing.JButton attachLabelButton;
    private javax.swing.JButton consistencyRuleButton;
    private javax.swing.JButton labelManagementButton;
    private javax.swing.JButton operationManagementButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
