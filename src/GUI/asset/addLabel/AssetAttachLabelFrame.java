/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI.asset.addLabel;

import GUI.rule.ApplyRuleForm;
import GUI.utility.ScrollableListPanel;
import asset.Asset;
import asset.AssetCatalogue;
import exceptions.DuplicatedValueException;
import java.awt.ComponentOrientation;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import label.AttachedLabel;
import label.Label;
import label.LabelCatalogue;
import rule.ApplyRule;
import rule.ConsistencyRules;

/**
 *
 * @author bagher
 */
public class AssetAttachLabelFrame extends javax.swing.JFrame {

    private ScrollableListPanel labelScrollPane;
    private ScrollableListPanel assetScrollPane;
    private ScrollableListPanel valueScrollPane;
    private AttachedLabel attachedLabel;
    /**
     * Creates new form NewAssetFrame
     */
    public AssetAttachLabelFrame() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e) {
          System.out.println("Error setting native LAF: " + e);
        }
        initComponents();
        attachedLabel = new AttachedLabel();
        assetScrollPane = new ScrollableListPanel("نام دارایی", true);
        labelScrollPane = new ScrollableListPanel("نام برچسب", true);
        valueScrollPane = new ScrollableListPanel("مقدار برچسب", false);
        assetScrollPane.reloadValues(AssetCatalogue.getInstace().getAssets().toArray());
        labelScrollPane.reloadValues(LabelCatalogue.getInstace().getLabels().toArray());
        valueScrollPane.reloadValues(attachedLabel.getValues());
        chooseAsset.add(assetScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 270, 190));
        chooseLabel.add(labelScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 270, 190));
        chooseValue.add(valueScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 270, 190));
        StyledDocument doc = hintPane.getStyledDocument();
        SimpleAttributeSet right = new SimpleAttributeSet();
        StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT);
        doc.setParagraphAttributes(0, doc.getLength(), right, false);
        hintPane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        attachAssetLabel = new javax.swing.JTabbedPane();
        chooseAsset = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        chooseLabel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        chooseValue = new javax.swing.JPanel();
        addValueButton = new javax.swing.JButton();
        labelValueTextField = new javax.swing.JTextField();
        attachLabelButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        hintPane = new javax.swing.JTextPane();
        ruleContainer = new javax.swing.JPanel();
        labelsScrollPane = new javax.swing.JScrollPane();
        jLabel65 = new javax.swing.JLabel();
        addRule = new javax.swing.JButton();
        labelsScrollPane1 = new javax.swing.JScrollPane();
        rulePanel = new javax.swing.JPanel();
        ruleHeaderPanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        attachAssetLabel.setTabPlacement(javax.swing.JTabbedPane.RIGHT);
        attachAssetLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attachAssetLabelMouseClicked(evt);
            }
        });

        chooseAsset.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Web Yekan", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("الصاق برچسب به دارایی، انتخاب دارایی");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        chooseAsset.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 510, 70));

        attachAssetLabel.addTab("۱- انتخاب دارایی", chooseAsset);

        chooseLabel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Web Yekan", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("الصاق برچسب به دارایی، انتخاب برچسب");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        chooseLabel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 510, 70));

        attachAssetLabel.addTab("۲- انتخاب برچسب", chooseLabel);

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
        jLabel5.setText("الصاق برچسب به دارایی، انتخاب مقدار");
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

        attachAssetLabel.addTab("۳- انتخاب مقدار", chooseValue);

        labelsScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jLabel65.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel65.setText("قوانین تعریف شده");
        jLabel65.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        addRule.setBackground(new java.awt.Color(177, 119, 207));
        addRule.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        addRule.setForeground(new java.awt.Color(1, 1, 1));
        addRule.setText("اضافه کردن قانون");
        addRule.setFocusPainted(false);
        addRule.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        addRule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRuleActionPerformed(evt);
            }
        });

        labelsScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        rulePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ruleHeaderPanel.setBackground(new java.awt.Color(160, 196, 255));
        ruleHeaderPanel.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("ویژگی یا برچسب");
        ruleHeaderPanel.add(jLabel16);
        jLabel16.setBounds(130, 0, 100, 30);

        jLabel17.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("دارایی تحت سنجش");
        ruleHeaderPanel.add(jLabel17);
        jLabel17.setBounds(620, 0, 110, 30);

        jLabel20.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("حذف");
        ruleHeaderPanel.add(jLabel20);
        jLabel20.setBounds(10, 0, 40, 30);

        jLabel21.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("ردیف");
        ruleHeaderPanel.add(jLabel21);
        jLabel21.setBounds(740, 0, 40, 30);

        jLabel22.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("قانون");
        ruleHeaderPanel.add(jLabel22);
        jLabel22.setBounds(380, 0, 100, 30);

        jLabel23.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("دارایی مبنا");
        ruleHeaderPanel.add(jLabel23);
        jLabel23.setBounds(260, 0, 70, 30);

        jLabel24.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("ویژگی یا برچسب");
        ruleHeaderPanel.add(jLabel24);
        jLabel24.setBounds(510, 0, 110, 30);

        rulePanel.add(ruleHeaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 30));

        labelsScrollPane1.setViewportView(rulePanel);

        javax.swing.GroupLayout ruleContainerLayout = new javax.swing.GroupLayout(ruleContainer);
        ruleContainer.setLayout(ruleContainerLayout);
        ruleContainerLayout.setHorizontalGroup(
            ruleContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ruleContainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ruleContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ruleContainerLayout.createSequentialGroup()
                        .addGroup(ruleContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ruleContainerLayout.createSequentialGroup()
                                .addComponent(labelsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelsScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ruleContainerLayout.createSequentialGroup()
                        .addComponent(addRule, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(324, 324, 324))))
        );
        ruleContainerLayout.setVerticalGroup(
            ruleContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ruleContainerLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ruleContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelsScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addRule, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        attachAssetLabel.addTab("۴-قوانین سازگار سنجی", ruleContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(attachAssetLabel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(attachAssetLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void attachAssetLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attachAssetLabelMouseClicked
        if(attachedLabel.getLabel() != labelScrollPane.getSelectedItem())
            attachedLabel.setLabel((Label)labelScrollPane.getSelectedItem());
        if(attachedLabel.getLabel()!= null){
            Object[] objects = ((Label)labelScrollPane.getSelectedItem()).getValues();
            String hint = "";
            for(Object object: objects)
                hint += "• " + object.toString() + "\n";
            hintPane.setText(hint);
            if(((Label)labelScrollPane.getSelectedItem()).getType().getTypeName().equals("String")){
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
        valueScrollPane.reloadValues(attachedLabel.getValues());
    }//GEN-LAST:event_attachAssetLabelMouseClicked

    private void addValueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addValueButtonActionPerformed
        if(attachedLabel.getLabel() == null){
            JOptionPane.showMessageDialog(null, "برچسبی انتخاب نشده است.", "خطا", JOptionPane.ERROR_MESSAGE);
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
        Label label = (Label)labelScrollPane.getSelectedItem();
        Asset asset = (Asset)assetScrollPane.getSelectedItem();
        if(label == null){
            JOptionPane.showMessageDialog(null, "برچسبی انتخاب نشده است.", "خطا", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(asset == null){
            JOptionPane.showMessageDialog(null, "دارایی انتخاب نشده است.", "خطا", JOptionPane.ERROR_MESSAGE);
            return;
        }
        attachedLabel.setAsset(asset);
        asset.attachLable(attachedLabel);
        JOptionPane.showMessageDialog(null, "برچسب با موفقیت الصاق شد.", "", JOptionPane.INFORMATION_MESSAGE);
        
        //clear
        labelValueTextField.setText("");
        assetScrollPane.deSelect();
        labelScrollPane.deSelect();
        attachedLabel = new AttachedLabel();
        valueScrollPane.reloadValues(attachedLabel.getValues());
        hintPane.setText("هنوز برچسی انتخاب نشده است.");
        StyledDocument doc = hintPane.getStyledDocument();
        SimpleAttributeSet right = new SimpleAttributeSet();
        StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT);
        doc.setParagraphAttributes(0, doc.getLength(), right, false);
        hintPane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    }//GEN-LAST:event_attachLabelButtonActionPerformed

    private void addRuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRuleActionPerformed
        Label label = (Label)labelScrollPane.getSelectedItem();
        Asset asset = (Asset)assetScrollPane.getSelectedItem();
        if(label == null){
            JOptionPane.showMessageDialog(null, "برچسبی انتخاب نشده است.", "خطا", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(asset == null){
            JOptionPane.showMessageDialog(null, "دارایی انتخاب نشده است.", "خطا", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        
        
        ApplyRuleForm arf = new ApplyRuleForm(asset,this.attachedLabel, ApplyRuleForm.MOD_LABEL,this);
        arf.setVisible(true);
        arf.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_addRuleActionPerformed

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

    public void loadRuleLabelComponnets() {
        rulePanel.removeAll();
        rulePanel.add(ruleHeaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 30));
        int ruleDep = 30;
        int ruleIndex = 1;
        
        for (rule.ApplyRule apr : attachedLabel.getRules()) {
            rulePanel.add(new RuleLabelPanel(new Integer(ruleIndex++).toString(),apr, this), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, ruleDep, 780, 30));
            ruleDep += 30;
        }
        validate();
        repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRule;
    private javax.swing.JButton addValueButton;
    private javax.swing.JTabbedPane attachAssetLabel;
    private javax.swing.JButton attachLabelButton;
    private javax.swing.JPanel chooseAsset;
    private javax.swing.JPanel chooseLabel;
    private javax.swing.JPanel chooseValue;
    private javax.swing.JTextPane hintPane;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField labelValueTextField;
    private javax.swing.JScrollPane labelsScrollPane;
    private javax.swing.JScrollPane labelsScrollPane1;
    private javax.swing.JPanel ruleContainer;
    private javax.swing.JPanel ruleHeaderPanel;
    private javax.swing.JPanel rulePanel;
    // End of variables declaration//GEN-END:variables
}

class RuleLabelPanel extends javax.swing.JPanel {

    public RuleLabelPanel(String number,final ApplyRule apr, final AssetAttachLabelFrame attachLabelFrame) {
        super();
        this.setBackground(new java.awt.Color(254, 254, 254));
        this.setLayout(null);
        
        Asset inMeasureAsset = apr.getInMeasureAsset();
        Asset baseAsset = apr.getBaseAsset();
        int inMeasureProperty = apr.getInMeasurePropertyNumber();
        int baseProperty = apr.getBasePropertyNumber();
        AttachedLabel inMeasureLabel = apr.getInMeasureLabel();
        AttachedLabel baseLabel = apr.getBaseLabel();
        int rule = apr.getRule();



        //1
        JLabel numberLabel = new JLabel();

        numberLabel.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        numberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numberLabel.setText(number);
        
        this.add(numberLabel);
        numberLabel.setBounds(740, 0, 40, 30);
//        numberLabel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));

        //2
        JLabel inMeasureAssetLabel = new JLabel();

        inMeasureAssetLabel.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        inMeasureAssetLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inMeasureAssetLabel.setText(inMeasureAsset.getName());
        this.add(inMeasureAssetLabel);
        inMeasureAssetLabel.setBounds(620, 0, 110, 30);
//        inMeasureAssetLabel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));

        //3
        JLabel inMeasureTextLabel = new JLabel();

        inMeasureTextLabel.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        inMeasureTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        if (inMeasureProperty == -1) {
            inMeasureTextLabel.setText(inMeasureLabel.getLabel().getName());
        } else {
            inMeasureTextLabel.setText(Asset.getPropertyComment(inMeasureProperty));
        }
        this.add(inMeasureTextLabel);
        inMeasureTextLabel.setBounds(500, 0, 130, 30);
//        inMeasureTextLabel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));

        //4
        JLabel ruleLabel = new JLabel();

        ruleLabel.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        ruleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ruleLabel.setText(ConsistencyRules.getInstance().getRules().get(rule).getComment());
        this.add(ruleLabel);
        ruleLabel.setBounds(360, 0, 130, 30);
//        ruleLabel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));

        //5
        JLabel baseAssetLabel = new JLabel();

        baseAssetLabel.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        baseAssetLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        baseAssetLabel.setText(baseAsset.getName());
        this.add(baseAssetLabel);
        baseAssetLabel.setBounds(240, 0, 110, 30);
//        baseAssetLabel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));

        //6
        JLabel baseTextLabel = new JLabel();

        baseTextLabel.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        baseTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        if (baseProperty == -1) {
            baseTextLabel.setText(baseLabel.getLabel().getName());
        } else {
            baseTextLabel.setText(Asset.getPropertyComment(baseProperty));
        }
        this.add(baseTextLabel);
        baseTextLabel.setBounds(120, 0, 110, 30);

        JButton closeButton = new JButton();

        closeButton.setForeground(new java.awt.Color(215, 215, 215));
        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/close-24-outside.png"))); // NOI18N
        closeButton.setBorder(null);
        closeButton.setBorderPainted(false);
        this.add(closeButton);
        closeButton.setBounds(5, 0, 50, 30);
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                apr.getInMeasureAsset().removeApplyRule(apr);
//                apr.getBaseAsset().removeApplyRule(apr);
                apr.getInMeasureLabel().remveApplyRule(apr);
//                for(AttachedLabel label: apr.getInMeasureAsset().getAttachedLabels()){
//                    label.
//                }
                attachLabelFrame.loadRuleLabelComponnets();
//                JFrame newLabelFrame = new NewLabelFrame(label, labelListManagementFrame, NewLabelFrame.MOD_UPDATE);
                attachLabelFrame.setVisible(true);
                attachLabelFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                attachLabelFrame.setVisible(true);
                attachLabelFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            }
        });
    }
}
