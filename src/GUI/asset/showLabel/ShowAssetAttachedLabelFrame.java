/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI.asset.showLabel;

import GUI.utility.ScrollableListPanel;
import asset.Asset;
import asset.AssetCatalogue;
import exceptions.DuplicatedValueException;
import java.awt.ComponentOrientation;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import label.AttachedLabel;

/**
 *
 * @author bagher
 */
public class ShowAssetAttachedLabelFrame extends javax.swing.JFrame {

    private ScrollableListPanel labelScrollPane;
    private ScrollableListPanel assetScrollPane;
    private ScrollableListPanel valueScrollPane;
    private Asset asset;
    private AttachedLabel attachedLabel;
    /**
     * Creates new form NewAssetFrame
     */
    public ShowAssetAttachedLabelFrame() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e) {
          System.out.println("Error setting native LAF: " + e);
        }
        initComponents();
        assetScrollPane = new ScrollableListPanel("نام دارایی", true);
        labelScrollPane = new ScrollableListPanel("نام برچسب و مقدار", true, 250);
        valueScrollPane = new ScrollableListPanel("مقدار برچسب", false);
        assetScrollPane.reloadValues(AssetCatalogue.getInstace().getAssets().toArray());
        labelScrollPane.reloadValues(new Object[0]);
        valueScrollPane.reloadValues(new Object[0]);
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
        jLabel53 = new javax.swing.JLabel();
        chooseLabel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        chooseValue = new javax.swing.JPanel();
        addValueButton = new javax.swing.JButton();
        labelValueTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        hintPane = new javax.swing.JTextPane();

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
        jLabel6.setText("مشاهده‌ی برچسب‌های الصاق‌شده به دارایی - انتخاب دارایی");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        chooseAsset.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 570, 70));

        jLabel53.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel53.setText("دارایی مورد نظر را انتخاب کنید تا در مرحله‌ی بعد لیست برچسب‌های الصاق شده را ببینید.");
        chooseAsset.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 500, 30));

        attachAssetLabel.addTab("۱- دارایی", chooseAsset);

        chooseLabel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Web Yekan", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("مشاهده‌ی برچسب‌های الصاق‌شده به دارایی - انتخاب برچسب");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        chooseLabel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 580, 70));

        jLabel54.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel54.setText("همچنین با کلیک بر روی دکمه‌ی حذف، برچسب الصاق شده از روی دارایی جدا می‌شود.");
        chooseLabel.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 540, 40));

        jLabel55.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel55.setText("برچسب الصاق شده‌ی مورد نظر خود را انتخاب کنید تا در مرحله‌ی بعد بتوانید مقدار آن را تغییر دهید.");
        chooseLabel.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 540, 40));

        attachAssetLabel.addTab("۲- برچسب", chooseLabel);

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

        jLabel5.setFont(new java.awt.Font("Web Yekan", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("مشاهده‌ی برچسب‌های الصاق‌شده به دارایی، مقدار برچسب");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        chooseValue.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 650, 70));

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

        attachAssetLabel.addTab("۳- مقدار", chooseValue);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(attachAssetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(attachAssetLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void attachAssetLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attachAssetLabelMouseClicked
        if(asset != assetScrollPane.getSelectedItem()){
            asset = (Asset)assetScrollPane.getSelectedItem();
            if(asset == null)
                return;
            labelScrollPane.reloadValues(asset.getAttachedLabels());
        }
        if(asset == null)
            return;
        if(attachedLabel != labelScrollPane.getSelectedItem()){
            attachedLabel = (AttachedLabel)labelScrollPane.getSelectedItem();
            if(attachedLabel == null)
                return;
            valueScrollPane.reloadValues(attachedLabel.getValues());
        }
        if(attachedLabel == null)
            return;
        
        Object[] objects = ((AttachedLabel)labelScrollPane.getSelectedItem()).getLabel().getValues();
        String hint = "";
        for(Object object: objects)
            hint += "• " + object.toString() + "\n";
        hintPane.setText(hint);
        if(((AttachedLabel)labelScrollPane.getSelectedItem()).getLabel().getType().getTypeName().equals("String")){
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
    }//GEN-LAST:event_attachAssetLabelMouseClicked

    private void addValueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addValueButtonActionPerformed
        if(attachedLabel == null){
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

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addValueButton;
    private javax.swing.JTabbedPane attachAssetLabel;
    private javax.swing.JPanel chooseAsset;
    private javax.swing.JPanel chooseLabel;
    private javax.swing.JPanel chooseValue;
    private javax.swing.JTextPane hintPane;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField labelValueTextField;
    // End of variables declaration//GEN-END:variables
}
