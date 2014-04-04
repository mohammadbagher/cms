/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI.operation;

import GUI.utility.ScrollableListPanel;
import exceptions.DuplicatedValueException;
import java.awt.ComponentOrientation;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import label.AttachedLabel;
import operation.Operation;

/**
 *
 * @author bagher
 */
public class TriggerOperationFrame extends javax.swing.JFrame {

    private ScrollableListPanel valueScrollPane;
    private AttachedLabel attachedLabel;
    private Operation operation;
    /**
     * Creates new form NewAssetFrame
     * @param operation
     */
    public TriggerOperationFrame(Operation operation) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e) {
          System.out.println("Error setting native LAF: " + e);
        }
        initComponents();
        this.operation = operation;
        this.attachedLabel = operation.getAttachedLabel();
        this.attachedLabel.clearValues();
        
        if(attachedLabel.getLabel()!= null){
            Object[] objects = attachedLabel.getLabel().getValues();
            String hint = "";
            for(Object object: objects)
                hint += "• " + object.toString() + "\n";
            hintPane.setText(hint);
            if(attachedLabel.getLabel().getType().getTypeName().equals("String")){
                StyledDocument doc = hintPane.getStyledDocument();
                SimpleAttributeSet right = new SimpleAttributeSet();
                StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT);
                doc.setParagraphAttributes(0, doc.getLength(), right, false);
                hintPane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
            }else{
                StyledDocument doc = hintPane.getStyledDocument();
                SimpleAttributeSet right = new SimpleAttributeSet();
                StyleConstants.setAlignment(right, StyleConstants.ALIGN_LEFT);
                doc.setParagraphAttributes(0, doc.getLength(), right, false);
                hintPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
            }
        }
        valueScrollPane = new ScrollableListPanel("مقدار برچسب", false);
        valueScrollPane.reloadValues(attachedLabel.getValues());
        chooseValue.add(valueScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 270, 190));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chooseValue = new javax.swing.JPanel();
        addValueButton = new javax.swing.JButton();
        labelValueTextField = new javax.swing.JTextField();
        attachLabelButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        hintPane = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 500));

        chooseValue.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addValueButton.setBackground(new java.awt.Color(60, 0, 91));
        addValueButton.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        addValueButton.setForeground(new java.awt.Color(1, 1, 1));
        addValueButton.setText("اضافه‌کردن");
        addValueButton.setFocusPainted(false);
        addValueButton.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        addValueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addValueButtonActionPerformed(evt);
            }
        });
        chooseValue.add(addValueButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 90, 30));

        labelValueTextField.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        labelValueTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        chooseValue.add(labelValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 170, -1));

        attachLabelButton.setBackground(new java.awt.Color(60, 0, 91));
        attachLabelButton.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        attachLabelButton.setForeground(new java.awt.Color(1, 1, 1));
        attachLabelButton.setText("الصاق برچسب به دارایی");
        attachLabelButton.setFocusPainted(false);
        attachLabelButton.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        attachLabelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attachLabelButtonActionPerformed(evt);
            }
        });
        chooseValue.add(attachLabelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 150, 30));

        jLabel5.setFont(new java.awt.Font("Web Yekan", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("انجام عملیات: انتخاب مقدار برچسب");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        chooseValue.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 510, 70));

        jLabel51.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel51.setText("مجموعه مقادیر الصاق شده");
        chooseValue.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 170, -1));

        jLabel52.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel52.setText("مقادیر ممکن برچسب");
        jLabel52.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        chooseValue.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 150, -1));

        hintPane.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        hintPane.setText("هنوز برچسی انتخاب نشده است.");
        jScrollPane2.setViewportView(hintPane);

        chooseValue.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 210, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(chooseValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(chooseValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addValueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addValueButtonActionPerformed
        if(attachedLabel.getLabel() == null){
            JOptionPane.showMessageDialog(null, "برچسب الصاق شده برچسبی ندارد.", "خطا", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            if(attachedLabel.addValue(labelValueTextField.getText()) == false)
                JOptionPane.showMessageDialog(null, "مقدار انتخاب شده با برچسب انتخاب شده سازگار نیست.", "خطا", JOptionPane.ERROR_MESSAGE);
            else{
                valueScrollPane.reloadValues(attachedLabel.getValues());
                labelValueTextField.setText("");
            }
        } catch (DuplicatedValueException ex) {
            JOptionPane.showMessageDialog(null, "مقدار انتخاب شده تکراری است.", "خطا", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addValueButtonActionPerformed

    private void attachLabelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attachLabelButtonActionPerformed
        
        JOptionPane.showMessageDialog(null, "عملیات با موفقیت انجام شد.", "", JOptionPane.INFORMATION_MESSAGE);
        
        this.dispose();
    }//GEN-LAST:event_attachLabelButtonActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(NewAssetFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(NewAssetFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(NewAssetFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(NewAssetFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new AssetAttachLabelFrame().setVisible(true);
//            }
//        });
//    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addValueButton;
    private javax.swing.JButton attachLabelButton;
    private javax.swing.JPanel chooseValue;
    private javax.swing.JTextPane hintPane;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField labelValueTextField;
    // End of variables declaration//GEN-END:variables
}
