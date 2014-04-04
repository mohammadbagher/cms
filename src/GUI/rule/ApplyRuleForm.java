/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.rule;


import asset.Asset;
import asset.AssetCatalogue;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import label.*;
import rule.*;

/**
 *
 * @author bagher
 */
public class ApplyRuleForm extends javax.swing.JFrame {

    private final Asset inMeasureAsset;
    private final int mode;
    public static final int MOD_NEW = 1;
    public static final int MOD_UPDATE = 2;
    private ApplyRule apr;

    public ApplyRuleForm(Asset inMeasureAsset, int mode) {
        this.mode = mode;
        initComponents();
        this.inMeasureAsset = inMeasureAsset;
        inMeasureProperty.doClick();
        baseProperty.doClick();
        inMeasureAssetName.setText(inMeasureAsset.getName());
        baseAsset.setModel(new JComboBox<Asset>(AssetCatalogue.getInstace().getAssets().toArray(new Asset[AssetCatalogue.getInstace().getAssets().size()])).getModel());
        rulesComboBox.setModel(new JComboBox<Rule>(ConsistencyRules.getInstance().getRules().toArray(new Rule[ConsistencyRules.getInstance().getRules().size()])).getModel());
    }

    public ApplyRuleForm(ApplyRule applyRuleForm, int mode) {
        this.apr = applyRuleForm;
        this.mode = mode;
        initComponents();
        baseAsset.setModel(new JComboBox<Asset>(AssetCatalogue.getInstace().getAssets().toArray(new Asset[AssetCatalogue.getInstace().getAssets().size()])).getModel());
        rulesComboBox.setModel(new JComboBox<Rule>(ConsistencyRules.getInstance().getRules().toArray(new Rule[ConsistencyRules.getInstance().getRules().size()])).getModel());

        this.inMeasureAsset = applyRuleForm.getInMeasureAsset();
        baseAsset.setSelectedItem(applyRuleForm.getBaseAsset());
        if (applyRuleForm.getInMeasurePropertyNumber() == 0) {
            inMeasureProperty.doClick();
            inMeasureData.setSelectedIndex(applyRuleForm.getInMeasurePropertyNumber());
        } else {
            inMeasureLabel.doClick();
            inMeasureData.setSelectedItem(applyRuleForm.getInMeasureLabel());
        }
        if (applyRuleForm.getBasePropertyNumber() == 0) {
            baseProperty.doClick();
            baseData.setSelectedIndex(applyRuleForm.getBasePropertyNumber());
        } else {
            baseLabel.doClick();
            baseData.setSelectedItem(applyRuleForm.getBaseLabel());
        }
        rulesComboBox.setSelectedIndex(applyRuleForm.getRule());

        inMeasureAssetName.setText(inMeasureAsset.getName());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inMeasureLoP = new javax.swing.ButtonGroup();
        baseLoP = new javax.swing.ButtonGroup();
        saveRule = new javax.swing.JButton();
        rulesComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        baseAsset = new javax.swing.JComboBox();
        baseData = new javax.swing.JComboBox();
        jLabel52 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        baseProperty = new javax.swing.JRadioButton();
        baseLabel = new javax.swing.JRadioButton();
        jLabel59 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        inMeasureAssetName = new javax.swing.JLabel();
        inMeasureData = new javax.swing.JComboBox();
        inMeasureProperty = new javax.swing.JRadioButton();
        inMeasureLabel = new javax.swing.JRadioButton();
        jLabel58 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        saveRule.setBackground(new java.awt.Color(205, 141, 238));
        saveRule.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        saveRule.setForeground(new java.awt.Color(1, 1, 1));
        saveRule.setText("ذخیره‌ی قانون");
        saveRule.setFocusPainted(false);
        saveRule.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        saveRule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveRuleActionPerformed(evt);
            }
        });

        rulesComboBox.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        rulesComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "قانون مورد نظر را انتخاب کنید", " " }));
        rulesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rulesComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Web Yekan", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("تعریف قانون سازگار سنجی");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setBackground(new java.awt.Color(213, 177, 213));

        baseAsset.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        baseAsset.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "همین دارایی" }));
        baseAsset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baseAssetActionPerformed(evt);
            }
        });

        baseData.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        baseData.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "مقدار مورد نظر را انتخاب کنید" }));
        baseData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baseDataActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel52.setText("مقدار مبنا");

        jLabel54.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel54.setText("دارایی:");

        baseLoP.add(baseProperty);
        baseProperty.setSelected(true);
        baseProperty.setText("ویژگی اولیه");
        baseProperty.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        baseProperty.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        baseProperty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basePropertyActionPerformed(evt);
            }
        });

        baseLoP.add(baseLabel);
        baseLabel.setText("برچسب");
        baseLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        baseLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        baseLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baseLabelActionPerformed(evt);
            }
        });

        jLabel59.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel59.setText("قانون سازگار سنجی روی:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(baseAsset, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(baseData, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel52))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(baseLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(baseProperty, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(baseAsset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(baseProperty)
                    .addComponent(baseLabel))
                .addGap(18, 18, 18)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(baseData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel2.setBackground(new java.awt.Color(213, 177, 213));

        jLabel55.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel55.setText("دارایی:");

        jLabel56.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel56.setText("مقدار تحت سنجش");

        inMeasureAssetName.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        inMeasureAssetName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        inMeasureAssetName.setText("نامشخص");

        inMeasureData.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        inMeasureData.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "مقدار مورد نظر را انتخاب کنید" }));
        inMeasureData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inMeasureDataActionPerformed(evt);
            }
        });

        inMeasureLoP.add(inMeasureProperty);
        inMeasureProperty.setSelected(true);
        inMeasureProperty.setText("ویژگی اولیه");
        inMeasureProperty.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        inMeasureProperty.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        inMeasureProperty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inMeasurePropertyActionPerformed(evt);
            }
        });

        inMeasureLoP.add(inMeasureLabel);
        inMeasureLabel.setText("برچسب");
        inMeasureLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        inMeasureLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        inMeasureLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inMeasureLabelActionPerformed(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel58.setText("قانون سازگار سنجی روی:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(inMeasureLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inMeasureProperty, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(inMeasureAssetName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel55))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(inMeasureData, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inMeasureAssetName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inMeasureProperty)
                    .addComponent(inMeasureLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inMeasureData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel57.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel57.setText("قانون سازگار سنجی:");

        cancel.setBackground(new java.awt.Color(205, 141, 238));
        cancel.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        cancel.setForeground(new java.awt.Color(1, 1, 1));
        cancel.setText("لغو");
        cancel.setFocusPainted(false);
        cancel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rulesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel57)
                                    .addGap(29, 29, 29)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(saveRule, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rulesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(saveRule, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveRuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveRuleActionPerformed
        if (mode == MOD_NEW) {
            Asset selectedBaseAsset = (Asset) baseAsset.getSelectedItem();
            if (inMeasureProperty.isSelected() && baseProperty.isSelected()) {
                inMeasureAsset.getRules().add(new ApplyRule(inMeasureAsset, selectedBaseAsset, inMeasureData.getSelectedIndex(), baseData.getSelectedIndex(), null, null, rulesComboBox.getSelectedIndex()));
                if (inMeasureAsset.getUID().equals(selectedBaseAsset.getUID())) {

                } else {
                    selectedBaseAsset.getRules().add(new ApplyRule(inMeasureAsset, selectedBaseAsset, inMeasureData.getSelectedIndex(), baseData.getSelectedIndex(), null, null, rulesComboBox.getSelectedIndex()));
                }
            } else if (inMeasureProperty.isSelected() && baseLabel.isSelected()) {
                Label selectedBaseLabel = (Label) baseData.getSelectedItem();
                selectedBaseLabel.getRules().add(new ApplyRule(inMeasureAsset, selectedBaseAsset, inMeasureData.getSelectedIndex(), 0, null, selectedBaseLabel, rulesComboBox.getSelectedIndex()));
                if (inMeasureAsset.getUID().equals(selectedBaseAsset.getUID())) {

                } else {
                    inMeasureAsset.getRules().add(new ApplyRule(inMeasureAsset, selectedBaseAsset, inMeasureData.getSelectedIndex(), 0, null, selectedBaseLabel, rulesComboBox.getSelectedIndex()));
                }
            } else if (baseProperty.isSelected() && inMeasureLabel.isSelected()) {
                Label selectedInMeasureLabel = (Label) inMeasureData.getSelectedItem();
                selectedInMeasureLabel.getRules().add(new ApplyRule(inMeasureAsset, selectedBaseAsset, 0, baseData.getSelectedIndex(), selectedInMeasureLabel, null, rulesComboBox.getSelectedIndex()));
                if (inMeasureAsset.getUID().equals(selectedBaseAsset.getUID())) {

                } else {
                    selectedBaseAsset.getRules().add(new ApplyRule(inMeasureAsset, selectedBaseAsset, 0, baseData.getSelectedIndex(), selectedInMeasureLabel, null, rulesComboBox.getSelectedIndex()));
                }
            } else if (baseLabel.isSelected() && inMeasureLabel.isSelected()) {
                Label selectedInMeasureLabel = (Label) inMeasureData.getSelectedItem();
                Label selectedBaseLabel = (Label) baseData.getSelectedItem();

                selectedInMeasureLabel.getRules().add(new ApplyRule(inMeasureAsset, selectedBaseAsset, 0, 0, selectedInMeasureLabel, selectedBaseLabel, rulesComboBox.getSelectedIndex()));
                selectedBaseLabel.getRules().add(new ApplyRule(inMeasureAsset, selectedBaseAsset, 0, 0, selectedInMeasureLabel, selectedBaseLabel, rulesComboBox.getSelectedIndex()));
            }
        } else {
            if (apr == null) {
                this.dispose();
                JOptionPane.showMessageDialog(null, "مشکلی در بروزرسانی دارایی پیش‌آمده است.", "خطا", JOptionPane.ERROR_MESSAGE);
                return;
            }else{
                apr.setBaseAsset((Asset)baseAsset.getSelectedItem());
                apr.setInMeasureAsset(inMeasureAsset);
                if(baseProperty.isSelected()){
                    apr.setBasePropertyNumber(baseData.getSelectedIndex());
                    apr.setBaseLabel(null);
                }else{
                    apr.setBasePropertyNumber(0);
                    apr.setBaseLabel((Label)baseData.getSelectedItem());
                }
                if(inMeasureProperty.isSelected()){
                    apr.setInMeasurePropertyNumber(inMeasureData.getSelectedIndex());
                    apr.setInMeasureLabel(null);
                }else{
                    apr.setInMeasurePropertyNumber(0);
                    apr.setInMeasureLabel((Label)inMeasureData.getSelectedItem());
                }
                apr.setRule(rulesComboBox.getSelectedIndex());
            }
        }

        this.dispose();
        if (this.mode == MOD_NEW) {
            JOptionPane.showMessageDialog(null, "قانون مورد نظر شما با موفقیت ثبت شد.", "پیام", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "قانون مورد نظر با موفقیت بروزرسانی شد.", "پیام", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_saveRuleActionPerformed

    private void rulesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rulesComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rulesComboBoxActionPerformed

    private void baseAssetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baseAssetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_baseAssetActionPerformed

    private void baseDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baseDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_baseDataActionPerformed

    private void inMeasureDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inMeasureDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inMeasureDataActionPerformed

    private void inMeasureLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inMeasureLabelActionPerformed
        if (inMeasureAsset.getAttachedLabels().length == 0) {
            String[] noLabel = {"برچسبی به دارایی الصاق نشده است."};
            inMeasureData.setModel(new javax.swing.JComboBox(noLabel).getModel());
        } else {
            inMeasureData.setModel(new javax.swing.JComboBox<AttachedLabel>(inMeasureAsset.getAttachedLabels()).getModel());
        }
    }//GEN-LAST:event_inMeasureLabelActionPerformed

    private void inMeasurePropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inMeasurePropertyActionPerformed
        inMeasureData.setModel(new javax.swing.JComboBox<String>(Asset.assetProperties).getModel());
    }//GEN-LAST:event_inMeasurePropertyActionPerformed

    private void basePropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basePropertyActionPerformed
        baseData.setModel(new javax.swing.JComboBox<String>(Asset.assetProperties).getModel());
    }//GEN-LAST:event_basePropertyActionPerformed

    private void baseLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baseLabelActionPerformed
        Asset tmpAsset = (Asset) baseAsset.getSelectedItem();
        if (tmpAsset.getAttachedLabels().length == 0) {
            String[] noLabel = {"برچسبی به دارایی الصاق نشده است."};
            baseData.setModel(new javax.swing.JComboBox(noLabel).getModel());
        } else {
            baseData.setModel(new javax.swing.JComboBox<AttachedLabel>(tmpAsset.getAttachedLabels()).getModel());
        }
    }//GEN-LAST:event_baseLabelActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ApplyRuleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApplyRuleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApplyRuleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApplyRuleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Asset asset = new Asset();
                asset.setName("منم منم");
                asset.setUID("manam manam");
                new ApplyRuleForm(asset, 1).setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox baseAsset;
    private javax.swing.JComboBox baseData;
    private javax.swing.JRadioButton baseLabel;
    private javax.swing.ButtonGroup baseLoP;
    private javax.swing.JRadioButton baseProperty;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel inMeasureAssetName;
    private javax.swing.JComboBox inMeasureData;
    private javax.swing.JRadioButton inMeasureLabel;
    private javax.swing.ButtonGroup inMeasureLoP;
    private javax.swing.JRadioButton inMeasureProperty;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox rulesComboBox;
    private javax.swing.JButton saveRule;
    // End of variables declaration//GEN-END:variables
}
