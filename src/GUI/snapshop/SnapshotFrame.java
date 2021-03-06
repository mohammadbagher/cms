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

import GUI.event.EventManagementFrame;
import GUI.operation.*;
import asset.Asset;
import asset.AssetCatalogue;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import ood.OOD;
import snapshot.CMSSpnt;

/**
 *
 * @author Bagher
 */
public class SnapshotFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public SnapshotFrame() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Error setting native LAF: " + e);
        }
        initComponents();
        loadLabelComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        snptsPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("سامانه‌ی مدیریت ‍پیکربندی شهردای");
        setBounds(new java.awt.Rectangle(50, 50, 750, 500));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(750, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Web Yekan", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("مدیریت عملیات");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 431, 30));

        jButton2.setBackground(new java.awt.Color(60, 0, 91));
        jButton2.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(1, 1, 1));
        jButton2.setText("افزودن حالت فعلی سیستم به لیست مبنا‌ها");
        jButton2.setFocusPainted(false);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 250, 30));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        snptsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel.setBackground(new java.awt.Color(160, 196, 255));
        headerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("ردیف");
        headerPanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 60, 30));

        jLabel26.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("نام مبنا");
        headerPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 70, 30));

        jLabel31.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("حذف");
        headerPanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jLabel17.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("تاریخ ایجاد");
        headerPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 90, 30));

        jLabel20.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("بازگرداندن");
        headerPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 60, 30));

        snptsPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 30));

        jScrollPane2.setViewportView(snptsPanel);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 580, 327));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String name = JOptionPane.showInputDialog("نام مبنا را وارد کنید");
        if (name == null) {
            System.out.println("The user canceled");
            return;
        }
        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "نام مبنا نمی‌تواند خالی باشد.", "خطا", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        OOD ood = OOD.getInstance();
        try {
            FileOutputStream fout = new FileOutputStream("snapshots/" + timeStamp + ".data");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(ood);
            oos.close();
            System.out.println("Done");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        snapshot.Snapshot.getInstance().addSnapshot(new CMSSpnt(name, timeStamp));
        loadLabelComponents();

}//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SnapshotFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel snptsPanel;
    // End of variables declaration//GEN-END:variables
public void loadLabelComponents() {
        snptsPanel.removeAll();
        snptsPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 30));

        int dep = 30;
        int index = 1;
        for (CMSSpnt snpt : snapshot.Snapshot.getInstance().getSnapshots()) {
            System.out.println("saefefewf");
            snptsPanel.add(new LabelPanel(new Integer(index++).toString(), snpt, this), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, dep, 580, 30));
            dep += 30;
        }

        validate();
        repaint();
    }
}

class LabelPanel extends javax.swing.JPanel {

    public LabelPanel(String number, final snapshot.CMSSpnt snpt, final SnapshotFrame snap) {
        super();
        this.setBackground(new java.awt.Color(254, 254, 254));
        this.setLayout(null);

        JLabel numberLabel = new JLabel();

        numberLabel.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        numberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numberLabel.setText(number);
        this.add(numberLabel);
        numberLabel.setBounds(500, 0, 70, 30);

        JLabel nameLabel = new JLabel();

        nameLabel.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText(snpt.getName());
        this.add(nameLabel);
        nameLabel.setBounds(330, 0, 150, 30);

        JLabel timeLabel = new JLabel();

        timeLabel.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel.setText(snpt.getTime());
        this.add(timeLabel);
        timeLabel.setBounds(160, 0, 150, 30);

        JButton closeButton = new JButton();

        closeButton.setForeground(new java.awt.Color(215, 215, 215));
        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/close-24-outside.png"))); // NOI18N
        closeButton.setBorder(null);
        closeButton.setBorderPainted(false);
        this.add(closeButton);
        closeButton.setBounds(10, 0, 58, 30);
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snapshot.Snapshot.getInstance().getSnapshots().remove(snpt);
                snap.loadLabelComponents();
                snap.setVisible(true);
                snap.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                validate();
                repaint();
            }
        });

        JButton actionButton = new JButton();

        actionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/base.png"))); // NOI18N
        actionButton.setBorderPainted(false);
        this.add(actionButton);
        actionButton.setBounds(90, 0, 50, 30);
        actionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    FileInputStream fin = new FileInputStream("snapshots/" + snpt.getTime() + ".data");
                    ObjectInputStream oos = new ObjectInputStream(fin);
                    OOD ood = (OOD) oos.readObject();
                    oos.close();
                    ood.initial(ood);
                    System.out.println("Initializaion Done!");
                    JOptionPane.showMessageDialog(null, "سیستم به حالت مورد نظر شما با موفقیت بازگردانی شد.", "پیام", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    System.err.println("no file to load. snapshot");
//            ex.printStackTrace();
                }
            }
        });
    }
}
