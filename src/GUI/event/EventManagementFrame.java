/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainFrame.java
 *
 * Created on Nov 29, 2013, 2:04:52 PM
 */
package GUI.event;
import GUI.asset.AssetListManagementFrame;
import GUI.asset.newAsset.NewAssetFrame;
import GUI.label.*;
import asset.Asset;
import asset.AssetCatalogue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.UIManager;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Bagher
 */
public class EventManagementFrame extends javax.swing.JFrame {

    /** Creates new form MainFrame */
    public EventManagementFrame() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        eventsPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("سامانه‌ی مدیریت ‍پیکربندی شهردای");
        setBackground(new java.awt.Color(152, 152, 152));
        setBounds(new java.awt.Rectangle(50, 50, 750, 500));
        setMinimumSize(new java.awt.Dimension(750, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Web Yekan", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("تعریف و مدیریت رخداد");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 431, 70));

        jButton2.setBackground(new java.awt.Color(60, 0, 91));
        jButton2.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(1, 1, 1));
        jButton2.setText("تعریف رخداد جدید");
        jButton2.setFocusPainted(false);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 150, 30));

        jPanel2.setBackground(new java.awt.Color(205, 205, 205));
        jPanel2.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("2");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(490, 0, 60, 30);

        jLabel9.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("زلزله");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(410, 0, 60, 30);

        jButton1.setForeground(new java.awt.Color(215, 215, 215));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/close-24-outside.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jPanel2.add(jButton1);
        jButton1.setBounds(10, 0, 58, 30);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/action.png"))); // NOI18N
        jButton7.setBorderPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(120, 0, 50, 30);

        jLabel11.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("عملیات مربوط به زلزله");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(250, 0, 130, 30);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 550, 30));

        jPanel3.setBackground(new java.awt.Color(160, 196, 255));
        jPanel3.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("ردیف");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(490, 0, 60, 40);

        jLabel19.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("حذف");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(0, 0, 60, 40);

        jLabel16.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("نام رخداد");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(410, 0, 60, 40);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 550, 40));

        jPanel4.setBackground(new java.awt.Color(254, 254, 254));
        jPanel4.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("۱");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(490, 0, 60, 30);

        jButton4.setForeground(new java.awt.Color(215, 215, 215));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/close-24-outside.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jPanel4.add(jButton4);
        jButton4.setBounds(10, 0, 58, 30);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/action.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5);
        jButton5.setBounds(120, 0, 50, 30);

        jLabel12.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("عملیات مربوط به سیل");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(260, 0, 120, 30);

        jLabel13.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("سیل");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(410, 0, 60, 30);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 550, 30));

        jPanel5.setBackground(new java.awt.Color(205, 205, 205));
        jPanel5.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("4");
        jPanel5.add(jLabel17);
        jLabel17.setBounds(490, 0, 60, 30);

        jLabel20.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("عملیات مربوط به طوفان");
        jPanel5.add(jLabel20);
        jLabel20.setBounds(250, 0, 130, 30);

        jButton6.setForeground(new java.awt.Color(215, 215, 215));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/close-24-outside.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jPanel5.add(jButton6);
        jButton6.setBounds(10, 0, 58, 30);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/action.png"))); // NOI18N
        jButton10.setBorderPainted(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton10);
        jButton10.setBounds(120, 0, 50, 30);

        jLabel21.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("طوفان");
        jPanel5.add(jLabel21);
        jLabel21.setBounds(410, 0, 60, 30);

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 550, 30));

        jPanel6.setBackground(new java.awt.Color(254, 254, 254));
        jPanel6.setLayout(null);

        jLabel22.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("3");
        jPanel6.add(jLabel22);
        jLabel22.setBounds(490, 0, 60, 30);

        jButton9.setForeground(new java.awt.Color(215, 215, 215));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/close-24-outside.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jPanel6.add(jButton9);
        jButton9.setBounds(10, 0, 58, 30);

        jLabel23.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("عملیات مربوط به آتش");
        jPanel6.add(jLabel23);
        jLabel23.setBounds(250, 0, 130, 30);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/action.png"))); // NOI18N
        jButton11.setBorderPainted(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton11);
        jButton11.setBounds(120, 0, 50, 30);

        jLabel24.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("آتش");
        jPanel6.add(jLabel24);
        jLabel24.setBounds(410, 0, 60, 30);

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 550, 30));

        jPanel8.setBackground(new java.awt.Color(254, 254, 254));
        jPanel8.setLayout(null);

        jLabel28.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("۵");
        jPanel8.add(jLabel28);
        jLabel28.setBounds(490, 0, 60, 30);

        jButton13.setForeground(new java.awt.Color(215, 215, 215));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/close-24-outside.png"))); // NOI18N
        jButton13.setBorder(null);
        jButton13.setBorderPainted(false);
        jPanel8.add(jButton13);
        jButton13.setBounds(10, 0, 58, 30);

        jLabel29.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("عملیات مربوط به برف و کولاک");
        jPanel8.add(jLabel29);
        jLabel29.setBounds(220, 0, 160, 30);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/action.png"))); // NOI18N
        jButton12.setBorderPainted(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton12);
        jButton12.setBounds(120, 0, 50, 30);

        jLabel30.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("برف و کولاک");
        jPanel8.add(jLabel30);
        jLabel30.setBounds(400, 0, 70, 30);

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 550, 30));
        getContentPane().add(jScrollBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, -1, 190));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        eventsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel.setBackground(new java.awt.Color(160, 196, 255));
        headerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("ردیف");
        headerPanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 60, 30));

        jLabel26.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("نام رخداد");
        headerPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 70, 30));

        jLabel31.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("حذف");
        headerPanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jLabel15.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("عملیات مربوطه");
        headerPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 90, 30));

        jLabel18.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("گزارش وقوع");
        headerPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 90, 30));

        eventsPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 30));

        jScrollPane2.setViewportView(eventsPanel);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 580, 327));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new EventManagementFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel eventsPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    public void loadLabelComponents(){
        eventsPanel.removeAll();
        eventsPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 30));
        int dep = 30;
        int index = 1;
        for (Asset asset: AssetCatalogue.getInstace().getAssets()) {
            eventsPanel.add(new LabelPanel(new Integer(index++).toString(), asset, this), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, dep, 580, 30));
            dep += 30;
        }
        validate();
        repaint();
    }
}

class LabelPanel extends javax.swing.JPanel {

    public LabelPanel(String number, final Asset asset, final EventManagementFrame eventManagementFrame) {
        super();
        this.setBackground(new java.awt.Color(254, 254, 254));
        this.setLayout(null);

        JLabel numberLabel = new JLabel();

        numberLabel.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        numberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numberLabel.setText(number);
        this.add(numberLabel);
        numberLabel.setBounds(500, 0, 70, 30);

        
        JLabel eventNameLabel = new JLabel();

        eventNameLabel.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        eventNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eventNameLabel.setText(asset.getName());
        this.add(eventNameLabel);
        eventNameLabel.setBounds(330, 0, 150, 30);
        
        
        JLabel operationLabel = new JLabel();

        operationLabel.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        operationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        operationLabel.setText(asset.getName());
        this.add(operationLabel);
        operationLabel.setBounds(160, 0, 150, 30);
        
        
        JButton closeButton = new JButton();

        closeButton.setForeground(new java.awt.Color(215, 215, 215));
        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/close-24-outside.png"))); // NOI18N
        closeButton.setBorder(null);
        closeButton.setBorderPainted(false);
        this.add(closeButton);
        closeButton.setBounds(10, 0, 58, 30);
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssetCatalogue.getInstace().remove(asset);
                eventManagementFrame.loadLabelComponents();
//                JFrame newLabelFrame = new NewLabelFrame(label, labelListManagementFrame, NewLabelFrame.MOD_UPDATE);
//                newLabelFrame.setVisible(true);
//                newLabelFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            }
        });

        JButton actionButton = new JButton();

        actionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/action.png"))); // NOI18N
        actionButton.setBorderPainted(false);
        this.add(actionButton);
        actionButton.setBounds(90, 0, 50, 30);
        actionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                JFrame newLabelFrame = new NewAssetFrame(asset, assetListManagementFrame, NewAssetFrame.MOD_UPDATE);
//                newLabelFrame.setVisible(true);
//                newLabelFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            }
        });
    }
}
