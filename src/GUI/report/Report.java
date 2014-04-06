/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainFrame.java
 *
 * Created on Nov 29, 2013, 2:04:52 PM
 */
package GUI.report;

import GUI.asset.newAsset.NewAssetFrame;
import asset.Asset;
import label.Label;
import asset.AssetCatalogue;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import label.AttachedLabel;
import label.LabelCatalogue;
import rule.ApplyRule;
import rule.ConsistencyRules;

/**
 *
 * @author Bagher
 */
public final class Report extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public Report() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Error setting native LAF: " + e);
        }
        initComponents();
        this.assets.setModel(new javax.swing.JComboBox<>(AssetCatalogue.getInstace().getAssets().toArray(new Asset[AssetCatalogue.getInstace().getAssets().size()])).getModel());
        this.labels.setModel(new javax.swing.JComboBox<>(LabelCatalogue.getInstace().getLabels().toArray(new Label[LabelCatalogue.getInstace().getLabels().size()])).getModel());
        String[] consistencies = {"سازگار", "ناسازگار"};
        this.consistency.setModel(new javax.swing.JComboBox<>(consistencies).getModel());
        this.importanceLevel.setModel(new javax.swing.JComboBox<>(ApplyRule.importanceComment).getModel());
        this.loadRuleLabelComponnets();
        this.labels.setEnabled(false);
        this.assets.setEnabled(false);
        this.consistency.setEnabled(false);
        this.importanceLevel.setEnabled(false);
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
        labelsScrollPane = new javax.swing.JScrollPane();
        rulePanel = new javax.swing.JPanel();
        ruleHeaderPanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        labels = new javax.swing.JComboBox();
        assets = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        label = new javax.swing.JCheckBox();
        asset = new javax.swing.JCheckBox();
        consis = new javax.swing.JCheckBox();
        level = new javax.swing.JCheckBox();
        importanceLevel = new javax.swing.JComboBox();
        consistency = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("سامانه‌ی مدیریت ‍پیکربندی شهرداری");
        setBounds(new java.awt.Rectangle(50, 50, 750, 500));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(750, 500));
        setResizable(false);

        jLabel4.setFont(new java.awt.Font("Web Yekan", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("گزارشگیری قوانین سازگارسنجی");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        labelsScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        rulePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ruleHeaderPanel.setBackground(new java.awt.Color(160, 196, 255));
        ruleHeaderPanel.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("سطح اهمیت");
        ruleHeaderPanel.add(jLabel16);
        jLabel16.setBounds(10, 0, 100, 30);

        jLabel17.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("دارایی تحت سنجش");
        ruleHeaderPanel.add(jLabel17);
        jLabel17.setBounds(620, 0, 110, 30);

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

        jLabel18.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("ویژگی یا برچسب");
        ruleHeaderPanel.add(jLabel18);
        jLabel18.setBounds(130, 0, 100, 30);

        rulePanel.add(ruleHeaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 30));

        labelsScrollPane.setViewportView(rulePanel);

        search.setBackground(new java.awt.Color(60, 0, 91));
        search.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        search.setForeground(new java.awt.Color(1, 1, 1));
        search.setText("جستجو");
        search.setFocusPainted(false);
        search.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        labels.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        labels.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "دارایی مورد نظر را انتخاب کنید" }));
        labels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelsActionPerformed(evt);
            }
        });

        assets.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        assets.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "دارایی مورد نظر را انتخاب کنید" }));
        assets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assetsActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        label.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        label.setText("برچسب:");
        label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelActionPerformed(evt);
            }
        });

        asset.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        asset.setText("دارایی:");
        asset.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        asset.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        asset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assetActionPerformed(evt);
            }
        });

        consis.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        consis.setText("وضعیت سازگاری");
        consis.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        consis.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        consis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consisActionPerformed(evt);
            }
        });

        level.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        level.setText("سطح اهمیت");
        level.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        level.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        level.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelActionPerformed(evt);
            }
        });

        importanceLevel.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        importanceLevel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "دارایی مورد نظر را انتخاب کنید" }));
        importanceLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importanceLevelActionPerformed(evt);
            }
        });

        consistency.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        consistency.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "دارایی مورد نظر را انتخاب کنید" }));
        consistency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consistencyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelsScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(consistency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(importanceLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(level, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(consis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(assets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(asset, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(label)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label)
                                    .addComponent(consis)
                                    .addComponent(consistency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(asset)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(level)
                                        .addComponent(importanceLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(assets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)))
                .addComponent(labelsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        ArrayList<ApplyRule> aprs = new ArrayList<>();
        for (Asset asset : AssetCatalogue.getInstace().getAssets()) {
            for (ApplyRule apr : asset.getRules()) {
                aprs.add(apr);
            }
            for (AttachedLabel atl : asset.getAttachedLabels()) {
                for (ApplyRule apr : atl.getRules()) {
                    aprs.add(apr);
                }
            }
        }
        ArrayList<ApplyRule> retrivedRules = new ArrayList<>();
        for (ApplyRule apr : aprs) {
            boolean flag = true;
            try {
                if (label.isSelected()) {
                    if (((Label) labels.getSelectedItem()) == apr.getBaseLabel().getLabel() || ((Label) labels.getSelectedItem()) == apr.getInMeasureLabel().getLabel()) {
                        System.out.println("salam1");
                    } else {
                        flag = false;
                    }
                }
            }catch(Exception e){
                flag=false;
            }

            if (asset.isSelected()) {
                if (((Asset) assets.getSelectedItem()).getUID().equals(apr.getBaseAsset().getUID()) || ((Asset) assets.getSelectedItem()).getUID().equals(apr.getInMeasureAsset().getUID())) {
                    System.out.println("salam2");
                } else {
                    flag = false;
                }
            }
            if (level.isSelected()) {
                if (apr.getImportance() != importanceLevel.getSelectedIndex()) {
                    flag = false;
                }
            }
            if (consis.isSelected()) {
                if(consistency.getSelectedIndex() == 0){
                    flag=false;
                }else{
                    
                }
            }
            if (flag) {
                retrivedRules.add(apr);
            }
        }
        rulePanel.removeAll();
        rulePanel.add(ruleHeaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 30));
        int ruleDep = 30;
        int ruleIndex = 1;
        for (rule.ApplyRule apr : retrivedRules) {
            rulePanel.add(new RuleLabelPanel(new Integer(ruleIndex++).toString(), apr, this), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, ruleDep, 780, 30));
            ruleDep += 30;
        }
//        ArrayList<Asset> retrivedAssets= new ArrayList<>();
//        String searchN = searchName.getText();
//        String searchU = searchUID.getText();
//        //        retrivedAssets.add(AssetCatalogue.getInstace().getAssets().get(0));
//        for (Asset asset: AssetCatalogue.getInstace().getAssets()) {
//            if(asset.getName().contains(searchN)&&asset.getUID().contains(searchU)){
//                retrivedAssets.add(asset);
//            }
//        }
//        assetsPanel.removeAll();
//        assetsPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 30));
//        int dep = 30;
//        int index = 1;
//        for (Asset asset: retrivedAssets) {
//            assetsPanel.add(new LabelPanel(new Integer(index++).toString(), asset, this), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, dep, 460, 30));
//            dep += 30;
//        }
        validate();
        repaint();
    }//GEN-LAST:event_searchActionPerformed

    private void labelsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelsActionPerformed

    private void assetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assetsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_assetsActionPerformed

    private void labelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelActionPerformed
        if (label.isSelected()) {
            labels.setEnabled(true);
//            finalIsComposite.setText("دارایی مرکب است");
        } else {
            labels.setEnabled(false);
//            finalIsComposite.setText("دارایی مرکب نیست");
        }
    }//GEN-LAST:event_labelActionPerformed

    private void assetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assetActionPerformed
        if (asset.isSelected()) {
            assets.setEnabled(true);
//            finalIsComposite.setText("دارایی مرکب است");
        } else {
            assets.setEnabled(false);
//            finalIsComposite.setText("دارایی مرکب نیست");
        }
    }//GEN-LAST:event_assetActionPerformed

    private void consisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consisActionPerformed
        if (consis.isSelected()) {
            consistency.setEnabled(true);
//            finalIsComposite.setText("دارایی مرکب است");
        } else {
            consistency.setEnabled(false);
//            finalIsComposite.setText("دارایی مرکب نیست");
        }
    }//GEN-LAST:event_consisActionPerformed

    private void levelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelActionPerformed
        if (level.isSelected()) {
            importanceLevel.setEnabled(true);
//            finalIsComposite.setText("دارایی مرکب است");
        } else {
            importanceLevel.setEnabled(false);
//            finalIsComposite.setText("دارایی مرکب نیست");
        }
    }//GEN-LAST:event_levelActionPerformed

    private void importanceLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importanceLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_importanceLevelActionPerformed

    private void consistencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consistencyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consistencyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Report().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox asset;
    private javax.swing.JComboBox assets;
    private javax.swing.JCheckBox consis;
    private javax.swing.JComboBox consistency;
    private javax.swing.JComboBox importanceLevel;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JCheckBox label;
    private javax.swing.JComboBox labels;
    private javax.swing.JScrollPane labelsScrollPane;
    private javax.swing.JCheckBox level;
    private javax.swing.JPanel ruleHeaderPanel;
    private javax.swing.JPanel rulePanel;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
public void loadRuleLabelComponnets() {
        rulePanel.removeAll();
        rulePanel.add(ruleHeaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 30));
        ArrayList<ApplyRule> aprs = new ArrayList<>();
        for (Asset asset : AssetCatalogue.getInstace().getAssets()) {
            for (ApplyRule apr : asset.getRules()) {
                aprs.add(apr);
            }
            for (AttachedLabel atl : asset.getAttachedLabels()) {
                for (ApplyRule apr : atl.getRules()) {
                    aprs.add(apr);
                }
            }
        }
        int ruleDep = 30;
        int ruleIndex = 1;
        for (rule.ApplyRule apr : aprs) {
            rulePanel.add(new RuleLabelPanel(new Integer(ruleIndex++).toString(), apr, this), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, ruleDep, 780, 30));
            ruleDep += 30;
        }
    }
}

class RuleLabelPanel extends javax.swing.JPanel {

    public RuleLabelPanel(String number, final ApplyRule apr, final Report report) {
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

        //7
        JLabel levelLabel = new JLabel();

        levelLabel.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        levelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        levelLabel.setText(ApplyRule.importanceComment[apr.getImportance()]);
        this.add(levelLabel);
        levelLabel.setBounds(10, 0, 100, 30);
//        baseTextLabel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));

//        JButton editButton = new JButton();
//
//        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/file_edit.png"))); // NOI18N
//        editButton.setBorderPainted(false);
//        this.add(editButton);
//        editButton.setBounds(60, 0, 50, 30);
//        editButton.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
////                JFrame newLabelFrame = new NewLabelFrame(asset, labelListManagementFrame, NewLabelFrame.MOD_UPDATE);
////                newLabelFrame.setVisible(true);
////                newLabelFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//            }
//        });
//        JButton closeButton = new JButton();
//
//        closeButton.setForeground(new java.awt.Color(215, 215, 215));
//        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/close-24-outside.png"))); // NOI18N
//        closeButton.setBorder(null);
//        closeButton.setBorderPainted(false);
//        this.add(closeButton);
//        closeButton.setBounds(5, 0, 50, 30);
//        closeButton.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                apr.getInMeasureAsset().removeApplyRule(apr);
//                apr.getBaseAsset().removeApplyRule(apr);
////                for(AttachedLabel label: apr.getInMeasureAsset().getAttachedLabels()){
////                    label.
////                }
//                newAssetFrame.loadRuleLabelComponnets();
////                JFrame newLabelFrame = new NewLabelFrame(label, labelListManagementFrame, NewLabelFrame.MOD_UPDATE);
//                newAssetFrame.setVisible(true);
//                newAssetFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//            }
//        });
    }
}
