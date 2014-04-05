/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.asset;

import GUI.asset.newAsset.NewAssetFrame;
import asset.AssetCatalogue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import asset.Asset;
import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
/**
 *
 * @author bagher
 */
public class AssetListManagementFrame extends javax.swing.JFrame {
    DefaultMutableTreeNode root;
    /**
     * Creates new form AssetListManagementFrame
     */
    public AssetListManagementFrame() {
        initComponents();
        this.loadLabelComponents();
    }
    
    public void bfs(DefaultMutableTreeNode root, ArrayList<Asset> assets){
        for(int i = 0;i< assets.size();i++ ){
            DefaultMutableTreeNode dmt = new DefaultMutableTreeNode(assets.get(i));
            root.add(dmt);
            if(assets.get(i).getSubAssets().size()>0){
                bfs(dmt,assets.get(i).getSubAssets());
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        assetTree = new javax.swing.JTree();
        jLabel3 = new javax.swing.JLabel();
        newAssetButton = new javax.swing.JButton();
        search = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        assetsPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        searchUID = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        searchName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jScrollPane1.setViewportView(assetTree);

        jLabel3.setFont(new java.awt.Font("Web Yekan", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("مدیریت دارایی‌ها");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        newAssetButton.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        newAssetButton.setForeground(new java.awt.Color(1, 1, 1));
        newAssetButton.setText("تعریف دارایی جدید");
        newAssetButton.setFocusPainted(false);
        newAssetButton.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        newAssetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAssetButtonActionPerformed(evt);
            }
        });

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

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        assetsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel.setBackground(new java.awt.Color(160, 196, 255));
        headerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("ردیف");
        headerPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 60, 30));

        jLabel17.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("نام دارایی");
        headerPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 70, 30));

        jLabel20.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("ویرایش");
        headerPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 90, 30));

        jLabel21.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("حذف");
        headerPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        assetsPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 30));

        jScrollPane2.setViewportView(assetsPanel);

        jLabel18.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("شناسه‌ی یکتا:");

        searchUID.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        searchUID.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel19.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("نام:");

        searchName.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        searchName.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(newAssetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(searchUID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(searchName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newAssetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchUID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newAssetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAssetButtonActionPerformed
        JFrame newLabelFrame = new NewAssetFrame(null, this, NewAssetFrame.MOD_NEW);
                newLabelFrame.setVisible(true);
                newLabelFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_newAssetButtonActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        ArrayList<Asset> retrivedAssets= new ArrayList<>();
        String searchN = searchName.getText();
        String searchU = searchUID.getText();
//        retrivedAssets.add(AssetCatalogue.getInstace().getAssets().get(0));
        for (Asset asset: AssetCatalogue.getInstace().getAssets()) {
            if(asset.getName().contains(searchN)&&asset.getUID().contains(searchU)){
                retrivedAssets.add(asset);
            }
        }
        assetsPanel.removeAll();
        assetsPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 30));
        int dep = 30;
        int index = 1;
        for (Asset asset: retrivedAssets) {
            assetsPanel.add(new LabelPanel(new Integer(index++).toString(), asset, this), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, dep, 460, 30));
            dep += 30;
        }
        validate();
        repaint();
    }//GEN-LAST:event_searchActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AssetListManagementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssetListManagementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssetListManagementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssetListManagementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssetListManagementFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree assetTree;
    private javax.swing.JPanel assetsPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton newAssetButton;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchName;
    private javax.swing.JTextField searchUID;
    // End of variables declaration//GEN-END:variables

    public void loadLabelComponents() {
        root=new DefaultMutableTreeNode("دارایی‌ها");
        bfs(root,AssetCatalogue.getInstace().getAssets());
        DefaultTreeModel treeModel = new DefaultTreeModel(root);
        assetTree.setModel(treeModel);
        
        assetsPanel.removeAll();
        assetsPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 30));
        int dep = 30;
        int index = 1;
        for (Asset asset: AssetCatalogue.getInstace().getAssets()) {
            assetsPanel.add(new LabelPanel(new Integer(index++).toString(), asset, this), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, dep, 460, 30));
            dep += 30;
        }
        validate();
        repaint();
    }
}

class LabelPanel extends javax.swing.JPanel {

    public LabelPanel(String number, final Asset asset, final AssetListManagementFrame assetListManagementFrame) {
        super();

        this.setBackground(new java.awt.Color(254, 254, 254));
        this.setLayout(null);

        JLabel numberLabel = new JLabel();

        numberLabel.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        numberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numberLabel.setText(number);
        this.add(numberLabel);
        numberLabel.setBounds(410, 0, 60, 30);

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
                assetListManagementFrame.loadLabelComponents();
//                JFrame newLabelFrame = new NewLabelFrame(label, labelListManagementFrame, NewLabelFrame.MOD_UPDATE);
//                newLabelFrame.setVisible(true);
//                newLabelFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            }
        });

        JButton editButton = new JButton();

        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/file_edit.png"))); // NOI18N
        editButton.setBorderPainted(false);
        this.add(editButton);
        editButton.setBounds(90, 0, 50, 30);
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFrame newLabelFrame = new NewAssetFrame(asset, assetListManagementFrame, NewAssetFrame.MOD_UPDATE);
                newLabelFrame.setVisible(true);
                newLabelFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            }
        });

        JLabel valueLabel = new JLabel();

        valueLabel.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        valueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valueLabel.setText(asset.getName());
        this.add(valueLabel);
        valueLabel.setBounds(170, 0, 210, 30);
    }
}
