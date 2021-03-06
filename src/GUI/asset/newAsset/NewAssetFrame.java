/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.asset.newAsset;

//import GUI.label.LabelListManagementFrame;
//import GUI.label.NewLabelFrame;
import GUI.asset.AssetListManagementFrame;
import GUI.rule.ApplyRuleForm;
import asset.Asset;
import asset.AssetCatalogue;
import asset.AssetFile;
import asset.Human;
import asset.Place;
import asset.PrimaryProperty;
import gis.GISInfo;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.WindowConstants;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import label.AttachedLabel;
import rule.ConsistencyRules;
import rule.ApplyRule;
//import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
//import label.Label;
//import label.LabelCatalogue;

/**
 *
 * @author bagher
 */
public final class NewAssetFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewAssetFrame
     */
    private AssetListManagementFrame assetListManagementFrame;
    public static final int MOD_UPDATE = 1;
    public static final int MOD_NEW = 2;
    ArrayList<Asset> subAssets = new ArrayList<>();
    ArrayList<Asset> allAssetForSubAsset = new ArrayList<Asset>();
    Asset finalAsset = new Asset();
    DefaultMutableTreeNode rootAsset;
    private int mode;

    public NewAssetFrame(Asset asset, AssetListManagementFrame assetListManagementFrame, int mode) {
        initComponents();
        this.assetListManagementFrame = assetListManagementFrame;
        this.mode = mode;
        otherProperties.setEnabledAt(1, false);
        otherProperties.setEnabledAt(2, false);
        otherProperties.setEnabledAt(3, false);
        otherProperties.setEnabledAt(4, false);

        for (int i = 0; i < AssetCatalogue.getInstace().getAssets().size(); i++) {
            allAssetForSubAsset.add(AssetCatalogue.getInstace().getAssets().get(i));
        }
        assets.setModel(new javax.swing.JComboBox<>(AssetCatalogue.getInstace().getAssets().toArray(new Asset[AssetCatalogue.getInstace().getAssets().size()])).getModel());
        rootAsset = new DefaultMutableTreeNode(finalAsset);
        DefaultTreeModel treeModel = new DefaultTreeModel(rootAsset);
        subAssetTree.setModel(treeModel);

        if (asset == null) {
            finalAsset.setName("somethingfordebuging");
            assetKindLabels.setVisible(false);
            loadLabelComponents();
        } else {
            finalAsset = asset;
            if (finalAsset.getAssetKind() != null) {
                assetKindLabels.setModel(new javax.swing.JComboBox<label.Label>(label.LabelCatalogue.getInstace().getAssetKindLabels().toArray(new label.Label[label.LabelCatalogue.getInstace().getAssetKindLabels().size()])).getModel());
                assetKindLabels.setVisible(true);
                assetKindLabels.setSelectedItem(finalAsset.getAssetKind());
                isAssetKind.setSelected(true);
            } else {
                assetKindLabels.setVisible(false);
            }
            allAssetForSubAsset.remove(asset);
            assets.setModel(new javax.swing.JComboBox<Asset>(allAssetForSubAsset.toArray(new Asset[allAssetForSubAsset.size()])).getModel());
            assetName.setText(finalAsset.getName());
            assetUID.setText(finalAsset.getUID());

            if (finalAsset.isIsComposite()) {
                isComposite.doClick();
                loadLabelComponents();
            }
            if (finalAsset.isIsHuman()) {
                isHuman.doClick();
                humanAssetName.setText(finalAsset.getHuman().getName());
                humanAssetFamily.setText(finalAsset.getHuman().getFamilyName());
                humanAssetNationalCode.setText(finalAsset.getHuman().getNationalCode() + "");
                humanAssetPersonalCode.setText(finalAsset.getHuman().getPersonalCode() + "");
                humanAssetComments.setText(finalAsset.getHuman().getComments());
            }
            if (finalAsset.isIsPhysical()) {
                isPhysical.doClick();
                if (finalAsset.getDocMode() == 1) {
                    withoutDoc.doClick();
                } else if (finalAsset.getDocMode() == 2) {
                    noDoc.doClick();
                } else if (finalAsset.getDocMode() == 3) {
                    hasDoc.doClick();
                }
                physicalProperties.setText(finalAsset.getPhysicalProperties());
                if (finalAsset.isHasBime()) {
                    bimeComment.setText(finalAsset.getBimeComment());
                }
                if (finalAsset.isHasDoc()) {
                    docComment.setText(finalAsset.getDocComment());
                }
            }
            if (finalAsset.isIsPlace()) {
                hasPlace.doClick();
            }
        }
        loadLabelComponents();
        loadRuleLabelComponnets();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bimeOption = new javax.swing.ButtonGroup();
        docOption = new javax.swing.ButtonGroup();
        otherProperties = new javax.swing.JTabbedPane();
        primaryTab = new javax.swing.JInternalFrame();
        jLabel3 = new javax.swing.JLabel();
        assetName = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        assetUID = new javax.swing.JTextField();
        isComposite = new javax.swing.JCheckBox();
        hasPlace = new javax.swing.JCheckBox();
        isHuman = new javax.swing.JCheckBox();
        isPhysical = new javax.swing.JCheckBox();
        isAssetKind = new javax.swing.JCheckBox();
        assetKindLabels = new javax.swing.JComboBox();
        subAssetTab = new javax.swing.JInternalFrame();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        subAssetTree = new javax.swing.JTree();
        assetsScrollPane = new javax.swing.JScrollPane();
        assetsPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        addSubAsset = new javax.swing.JButton();
        assets = new javax.swing.JComboBox();
        humanTab = new javax.swing.JInternalFrame();
        jLabel7 = new javax.swing.JLabel();
        humanAssetName = new javax.swing.JTextField();
        humanAssetFamily = new javax.swing.JTextField();
        humanAssetNationalCode = new javax.swing.JTextField();
        humanAssetPersonalCode = new javax.swing.JTextField();
        humanAssetComments = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        placeTab = new javax.swing.JInternalFrame();
        jLabel4 = new javax.swing.JLabel();
        placeComment = new javax.swing.JLabel();
        placeNorth = new javax.swing.JLabel();
        placeEast = new javax.swing.JLabel();
        placelabel1 = new javax.swing.JLabel();
        placelabel2 = new javax.swing.JLabel();
        physicalTab = new javax.swing.JInternalFrame();
        jLabel62 = new javax.swing.JLabel();
        physicalProperties = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        hasBime = new javax.swing.JRadioButton();
        noBime = new javax.swing.JRadioButton();
        jLabel63 = new javax.swing.JLabel();
        bimeComment = new javax.swing.JTextField();
        hasDoc = new javax.swing.JRadioButton();
        withoutDoc = new javax.swing.JRadioButton();
        noDoc = new javax.swing.JRadioButton();
        docComment = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        rules = new javax.swing.JInternalFrame();
        jLabel65 = new javax.swing.JLabel();
        labelsScrollPane = new javax.swing.JScrollPane();
        rulePanel = new javax.swing.JPanel();
        ruleHeaderPanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        addRule = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel10 = new javax.swing.JLabel();
        labelsScrollPane1 = new javax.swing.JScrollPane();
        propertiesPanel = new javax.swing.JPanel();
        headerPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        propertyName = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        propertyValue = new javax.swing.JTextField();
        addProperty = new javax.swing.JButton();
        fileTab = new javax.swing.JInternalFrame();
        jLabel11 = new javax.swing.JLabel();
        addFile = new javax.swing.JButton();
        labelsScrollPane2 = new javax.swing.JScrollPane();
        filePanel = new javax.swing.JPanel();
        headerPanel2 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        fileName = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        addProperty2 = new javax.swing.JButton();
        filePath = new javax.swing.JLabel();
        finalTab = new javax.swing.JInternalFrame();
        jLabel6 = new javax.swing.JLabel();
        finalAssetName = new javax.swing.JLabel();
        finalAssetUID = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        finalIsHuman = new javax.swing.JLabel();
        finalIsComposite = new javax.swing.JLabel();
        finalIsPlace = new javax.swing.JLabel();
        finalIsPhysical = new javax.swing.JLabel();
        saveAssetbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        primaryTab.setVisible(true);

        jLabel3.setFont(new java.awt.Font("Web Yekan", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("تعریف دارایی جدید - مشخصات پایه");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        assetName.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        assetName.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        assetName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assetNameActionPerformed(evt);
            }
        });
        assetName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                assetNameFocusLost(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel51.setText("نام دارایی");

        jLabel47.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel47.setText("UID");

        assetUID.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        assetUID.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        assetUID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assetUIDActionPerformed(evt);
            }
        });
        assetUID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                assetUIDFocusLost(evt);
            }
        });

        isComposite.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        isComposite.setText("دارایی مرکب است");
        isComposite.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        isComposite.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        isComposite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isCompositeActionPerformed(evt);
            }
        });

        hasPlace.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        hasPlace.setText("دارایی مکان‌مند است");
        hasPlace.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        hasPlace.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        hasPlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasPlaceActionPerformed(evt);
            }
        });

        isHuman.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        isHuman.setText("دارایی انسانی است");
        isHuman.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        isHuman.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        isHuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isHumanActionPerformed(evt);
            }
        });

        isPhysical.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        isPhysical.setText("دارایی فیزیکی (ملموس) است");
        isPhysical.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        isPhysical.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        isPhysical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isPhysicalActionPerformed(evt);
            }
        });

        isAssetKind.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        isAssetKind.setText("دارای برچسب تعریف‌گر نوع دارایی");
        isAssetKind.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        isAssetKind.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        isAssetKind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isAssetKindActionPerformed(evt);
            }
        });

        assetKindLabels.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        assetKindLabels.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "دارایی مورد نظر را انتخاب کنید" }));
        assetKindLabels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assetKindLabelsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout primaryTabLayout = new javax.swing.GroupLayout(primaryTab.getContentPane());
        primaryTab.getContentPane().setLayout(primaryTabLayout);
        primaryTabLayout.setHorizontalGroup(
            primaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(primaryTabLayout.createSequentialGroup()
                .addGroup(primaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(primaryTabLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(assetKindLabels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(primaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(isHuman, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isPhysical, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isComposite, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hasPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isAssetKind, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(primaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(primaryTabLayout.createSequentialGroup()
                            .addGap(87, 87, 87)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(primaryTabLayout.createSequentialGroup()
                            .addGap(353, 353, 353)
                            .addGroup(primaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(primaryTabLayout.createSequentialGroup()
                                    .addComponent(assetUID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(69, 69, 69)
                                    .addComponent(jLabel47))
                                .addGroup(primaryTabLayout.createSequentialGroup()
                                    .addComponent(assetName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel51))))))
                .addContainerGap(267, Short.MAX_VALUE))
        );
        primaryTabLayout.setVerticalGroup(
            primaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(primaryTabLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addGroup(primaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assetName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(primaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assetUID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(isComposite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(isHuman)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hasPlace)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(isPhysical)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(primaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isAssetKind)
                    .addComponent(assetKindLabels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
        );

        otherProperties.addTab("مشخصات اولیه", primaryTab);

        subAssetTab.setVisible(true);

        jLabel8.setFont(new java.awt.Font("Web Yekan", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("تعریف دارایی جدید - زیردارایی‌ها");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jScrollPane1.setViewportView(subAssetTree);

        assetsScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        assetsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel.setBackground(new java.awt.Color(160, 196, 255));
        headerPanel.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("ردیف");
        headerPanel.add(jLabel14);
        jLabel14.setBounds(270, 0, 40, 30);

        jLabel15.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("نام دارایی");
        headerPanel.add(jLabel15);
        jLabel15.setBounds(170, 0, 60, 30);

        jLabel19.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("حذف");
        headerPanel.add(jLabel19);
        jLabel19.setBounds(0, 0, 80, 30);

        assetsPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 30));

        assetsScrollPane.setViewportView(assetsPanel);

        addSubAsset.setBackground(new java.awt.Color(177, 119, 207));
        addSubAsset.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        addSubAsset.setForeground(new java.awt.Color(1, 1, 1));
        addSubAsset.setText("اضافه کردن زیردارایی");
        addSubAsset.setFocusPainted(false);
        addSubAsset.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        addSubAsset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSubAssetActionPerformed(evt);
            }
        });

        assets.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        assets.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "دارایی مورد نظر را انتخاب کنید" }));
        assets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assetsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout subAssetTabLayout = new javax.swing.GroupLayout(subAssetTab.getContentPane());
        subAssetTab.getContentPane().setLayout(subAssetTabLayout);
        subAssetTabLayout.setHorizontalGroup(
            subAssetTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subAssetTabLayout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addGroup(subAssetTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addSubAsset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(subAssetTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(assetsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
            .addGroup(subAssetTabLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        subAssetTabLayout.setVerticalGroup(
            subAssetTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subAssetTabLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subAssetTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addSubAsset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subAssetTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(subAssetTabLayout.createSequentialGroup()
                        .addComponent(assetsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        otherProperties.addTab("زیردارایی", subAssetTab);

        humanTab.setVisible(true);

        jLabel7.setFont(new java.awt.Font("Web Yekan", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("تعریف دارایی جدید - مشخصات دارایی انسانی");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        humanAssetName.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        humanAssetName.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        humanAssetName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                humanAssetNameActionPerformed(evt);
            }
        });

        humanAssetFamily.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        humanAssetFamily.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        humanAssetFamily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                humanAssetFamilyActionPerformed(evt);
            }
        });

        humanAssetNationalCode.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        humanAssetNationalCode.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        humanAssetNationalCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                humanAssetNationalCodeActionPerformed(evt);
            }
        });

        humanAssetPersonalCode.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        humanAssetPersonalCode.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        humanAssetPersonalCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                humanAssetPersonalCodeActionPerformed(evt);
            }
        });

        humanAssetComments.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        humanAssetComments.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        humanAssetComments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                humanAssetCommentsActionPerformed(evt);
            }
        });

        jLabel77.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel77.setText("توضیحات");
        jLabel77.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel78.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel78.setText("کد ‍پرسنلی");
        jLabel78.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel79.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel79.setText("شماره ملی");
        jLabel79.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel80.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel80.setText("نام خانوداگی");
        jLabel80.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel81.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel81.setText("نام");
        jLabel81.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel82.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel82.setText("غیر از توضیحات، بقیه‌ی موارد اجباری هستند");
        jLabel82.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout humanTabLayout = new javax.swing.GroupLayout(humanTab.getContentPane());
        humanTab.getContentPane().setLayout(humanTabLayout);
        humanTabLayout.setHorizontalGroup(
            humanTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(humanTabLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(humanTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(humanTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(humanTabLayout.createSequentialGroup()
                            .addComponent(humanAssetFamily, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(humanTabLayout.createSequentialGroup()
                            .addComponent(humanAssetNationalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(humanTabLayout.createSequentialGroup()
                            .addComponent(humanAssetPersonalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(humanTabLayout.createSequentialGroup()
                            .addComponent(humanAssetComments, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(humanTabLayout.createSequentialGroup()
                            .addGroup(humanTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(humanAssetName, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10)
                            .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(262, Short.MAX_VALUE))
        );
        humanTabLayout.setVerticalGroup(
            humanTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(humanTabLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(humanTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(humanAssetName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(humanTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(humanAssetFamily, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(humanTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(humanAssetNationalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(humanTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(humanAssetPersonalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(humanTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(humanAssetComments, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );

        otherProperties.addTab("دارایی انسانی", humanTab);

        placeTab.getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Web Yekan", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("تعریف دارایی جدید - مشخصات دارایی مکان‌مند");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        placeTab.getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 0, 427, 38);

        placeComment.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        placeComment.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        placeComment.setText("اطلاعات مکانی با موفقیت دریافت شد.");
        placeComment.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        placeTab.getContentPane().add(placeComment);
        placeComment.setBounds(410, 100, 210, 30);

        placeNorth.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        placeNorth.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        placeNorth.setText("0");
        placeNorth.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        placeTab.getContentPane().add(placeNorth);
        placeNorth.setBounds(430, 140, 86, 24);

        placeEast.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        placeEast.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        placeEast.setText("0");
        placeEast.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        placeTab.getContentPane().add(placeEast);
        placeEast.setBounds(423, 180, 90, 24);

        placelabel1.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        placelabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        placelabel1.setText("عرض جغرافیایی:");
        placelabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        placeTab.getContentPane().add(placelabel1);
        placelabel1.setBounds(524, 140, 90, 24);

        placelabel2.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        placelabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        placelabel2.setText("طول جغرافیایی:");
        placelabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        placeTab.getContentPane().add(placelabel2);
        placelabel2.setBounds(526, 180, 90, 24);

        otherProperties.addTab("دارایی مکان‌مند", placeTab);

        physicalTab.getContentPane().setLayout(null);

        jLabel62.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel62.setText("مشخصات ظاهری دارایی");
        jLabel62.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        physicalTab.getContentPane().add(jLabel62);
        jLabel62.setBounds(490, 80, 123, 24);

        physicalProperties.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        physicalProperties.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        physicalProperties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                physicalPropertiesActionPerformed(evt);
            }
        });
        physicalTab.getContentPane().add(physicalProperties);
        physicalProperties.setBounds(300, 80, 150, 34);

        jLabel5.setFont(new java.awt.Font("Web Yekan", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("تعریف دارایی جدید - مشخصات دارایی فیزیکی");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        physicalTab.getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 0, 420, 38);

        bimeOption.add(hasBime);
        hasBime.setText("بیمه دارد");
        hasBime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        hasBime.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        hasBime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasBimeActionPerformed(evt);
            }
        });
        physicalTab.getContentPane().add(hasBime);
        hasBime.setBounds(400, 120, 100, 22);

        bimeOption.add(noBime);
        noBime.setSelected(true);
        noBime.setText("بیمه ندارد");
        noBime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        noBime.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        noBime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noBimeActionPerformed(evt);
            }
        });
        physicalTab.getContentPane().add(noBime);
        noBime.setBounds(524, 120, 100, 22);

        jLabel63.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel63.setText("شرح بیمه");
        jLabel63.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        physicalTab.getContentPane().add(jLabel63);
        jLabel63.setBounds(560, 170, 49, 24);

        bimeComment.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        bimeComment.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        bimeComment.setEnabled(false);
        bimeComment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bimeCommentActionPerformed(evt);
            }
        });
        physicalTab.getContentPane().add(bimeComment);
        bimeComment.setBounds(300, 170, 150, 34);

        docOption.add(hasDoc);
        hasDoc.setText("سند دارد");
        hasDoc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        hasDoc.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        hasDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasDocActionPerformed(evt);
            }
        });
        physicalTab.getContentPane().add(hasDoc);
        hasDoc.setBounds(239, 230, 90, 22);

        docOption.add(withoutDoc);
        withoutDoc.setSelected(true);
        withoutDoc.setText("سند ندارد");
        withoutDoc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        withoutDoc.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        withoutDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withoutDocActionPerformed(evt);
            }
        });
        physicalTab.getContentPane().add(withoutDoc);
        withoutDoc.setBounds(514, 230, 100, 22);

        docOption.add(noDoc);
        noDoc.setText("سند موضوعیت ندارد");
        noDoc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        noDoc.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        noDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noDocActionPerformed(evt);
            }
        });
        physicalTab.getContentPane().add(noDoc);
        noDoc.setBounds(344, 230, 170, 22);

        docComment.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        docComment.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        docComment.setEnabled(false);
        docComment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docCommentActionPerformed(evt);
            }
        });
        physicalTab.getContentPane().add(docComment);
        docComment.setBounds(200, 280, 250, 34);

        jLabel64.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel64.setText("شرح سند");
        jLabel64.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        physicalTab.getContentPane().add(jLabel64);
        jLabel64.setBounds(560, 280, 51, 24);

        otherProperties.addTab("دارایی فیزیکی", physicalTab);

        rules.setVisible(true);

        jLabel65.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel65.setText("قوانین تعریف شده");
        jLabel65.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        labelsScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

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

        labelsScrollPane.setViewportView(rulePanel);

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

        jLabel9.setFont(new java.awt.Font("Web Yekan", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("قوانین سازگارسنجی");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout rulesLayout = new javax.swing.GroupLayout(rules.getContentPane());
        rules.getContentPane().setLayout(rulesLayout);
        rulesLayout.setHorizontalGroup(
            rulesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rulesLayout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rulesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(rulesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rulesLayout.createSequentialGroup()
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rulesLayout.createSequentialGroup()
                        .addComponent(addRule, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(321, 321, 321))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rulesLayout.createSequentialGroup()
                        .addComponent(labelsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        rulesLayout.setVerticalGroup(
            rulesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rulesLayout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addRule, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        otherProperties.addTab("قوانین سازگار سنجی", rules);

        jInternalFrame1.setVisible(true);

        jLabel10.setFont(new java.awt.Font("Web Yekan", 0, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("دیگر ویژگی‌های اولیه");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        labelsScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        propertiesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel1.setBackground(new java.awt.Color(160, 196, 255));
        headerPanel1.setLayout(null);

        jLabel18.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("ردیف");
        headerPanel1.add(jLabel18);
        jLabel18.setBounds(410, 0, 40, 30);

        jLabel25.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("عنوان");
        headerPanel1.add(jLabel25);
        jLabel25.setBounds(280, 0, 80, 30);

        jLabel26.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("مقدار");
        headerPanel1.add(jLabel26);
        jLabel26.setBounds(110, 0, 90, 30);

        jLabel27.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("حذف");
        headerPanel1.add(jLabel27);
        jLabel27.setBounds(20, 0, 40, 30);

        propertiesPanel.add(headerPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 30));

        labelsScrollPane1.setViewportView(propertiesPanel);

        propertyName.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel28.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("نام ویژگی:");

        jLabel29.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("مقدار ویژگی:");

        propertyValue.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        addProperty.setBackground(new java.awt.Color(205, 141, 238));
        addProperty.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        addProperty.setForeground(new java.awt.Color(1, 1, 1));
        addProperty.setText("افزودن");
        addProperty.setFocusPainted(false);
        addProperty.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        addProperty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPropertyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addProperty, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(319, 319, 319))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(propertyName, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(propertyValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(labelsScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(247, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelsScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(propertyName)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(propertyValue)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addProperty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );

        otherProperties.addTab("دیگر ویژگی‌ها", jInternalFrame1);

        fileTab.setVisible(true);

        jLabel11.setFont(new java.awt.Font("Web Yekan", 0, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("فایل‌های دارایی");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        addFile.setBackground(new java.awt.Color(205, 141, 238));
        addFile.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        addFile.setForeground(new java.awt.Color(1, 1, 1));
        addFile.setText("افزودن فایل به دارایی");
        addFile.setFocusPainted(false);
        addFile.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        addFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFileActionPerformed(evt);
            }
        });

        labelsScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        filePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel2.setBackground(new java.awt.Color(160, 196, 255));
        headerPanel2.setLayout(null);

        jLabel30.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("ردیف");
        headerPanel2.add(jLabel30);
        jLabel30.setBounds(410, 0, 40, 30);

        jLabel31.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("عنوان");
        headerPanel2.add(jLabel31);
        jLabel31.setBounds(320, 0, 80, 30);

        jLabel32.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("آدرس");
        headerPanel2.add(jLabel32);
        jLabel32.setBounds(130, 0, 90, 30);

        jLabel33.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("حذف");
        headerPanel2.add(jLabel33);
        jLabel33.setBounds(20, 0, 40, 30);

        filePanel.add(headerPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 30));

        labelsScrollPane2.setViewportView(filePanel);

        fileName.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel34.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("عنوان فایل:");

        addProperty2.setBackground(new java.awt.Color(205, 141, 238));
        addProperty2.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        addProperty2.setForeground(new java.awt.Color(1, 1, 1));
        addProperty2.setText("انتخاب فایل");
        addProperty2.setFocusPainted(false);
        addProperty2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        addProperty2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProperty2ActionPerformed(evt);
            }
        });

        filePath.setText("فایل انتخاب نشده است.");

        javax.swing.GroupLayout fileTabLayout = new javax.swing.GroupLayout(fileTab.getContentPane());
        fileTab.getContentPane().setLayout(fileTabLayout);
        fileTabLayout.setHorizontalGroup(
            fileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fileTabLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(276, 276, 276))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fileTabLayout.createSequentialGroup()
                .addContainerGap(229, Short.MAX_VALUE)
                .addGroup(fileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fileTabLayout.createSequentialGroup()
                        .addGroup(fileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fileName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filePath, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(fileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addProperty2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fileTabLayout.createSequentialGroup()
                        .addComponent(labelsScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addFile, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        fileTabLayout.setVerticalGroup(
            fileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fileTabLayout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(fileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addProperty2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filePath, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addFile, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelsScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        otherProperties.addTab("فایل ها", fileTab);

        finalTab.setVisible(true);

        jLabel6.setFont(new java.awt.Font("Web Yekan", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("تعریف دارایی جدید - ذخیره");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        finalAssetName.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        finalAssetName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        finalAssetUID.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        finalAssetUID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel48.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel48.setText("UID");

        jLabel52.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel52.setText("نام دارایی");

        finalIsHuman.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        finalIsHuman.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        finalIsHuman.setText("دارایی انسان نیست");

        finalIsComposite.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        finalIsComposite.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        finalIsComposite.setText("دارایی مرکب نیست");

        finalIsPlace.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        finalIsPlace.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        finalIsPlace.setText("دارایی مکان‌مند نیست");

        finalIsPhysical.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        finalIsPhysical.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        finalIsPhysical.setText("دارایی فیزیکی نیست");

        saveAssetbtn.setBackground(new java.awt.Color(205, 141, 238));
        saveAssetbtn.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        saveAssetbtn.setForeground(new java.awt.Color(1, 1, 1));
        saveAssetbtn.setText("ذخیره‌ی دارایی");
        saveAssetbtn.setFocusPainted(false);
        saveAssetbtn.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        saveAssetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAssetbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout finalTabLayout = new javax.swing.GroupLayout(finalTab.getContentPane());
        finalTab.getContentPane().setLayout(finalTabLayout);
        finalTabLayout.setHorizontalGroup(
            finalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finalTabLayout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLabel6)
                .addGap(0, 409, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, finalTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(finalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, finalTabLayout.createSequentialGroup()
                        .addGroup(finalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(finalIsHuman)
                            .addComponent(finalIsPlace)
                            .addComponent(finalIsPhysical)
                            .addComponent(finalIsComposite))
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, finalTabLayout.createSequentialGroup()
                        .addGroup(finalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(finalAssetName, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(finalAssetUID, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(finalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52))
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, finalTabLayout.createSequentialGroup()
                        .addComponent(saveAssetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(325, 325, 325))))
        );
        finalTabLayout.setVerticalGroup(
            finalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finalTabLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(38, 38, 38)
                .addGroup(finalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(finalAssetName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addGroup(finalTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel48)
                    .addComponent(finalAssetUID, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(finalIsComposite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(finalIsHuman)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(finalIsPlace)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(finalIsPhysical)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(saveAssetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );

        otherProperties.addTab("نهایی کردن", finalTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(otherProperties))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(otherProperties, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void isCompositeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isCompositeActionPerformed
        if (isComposite.isSelected()) {
            otherProperties.setEnabledAt(1, true);
            finalIsComposite.setText("دارایی مرکب است");
        } else {
            otherProperties.setEnabledAt(1, false);
            finalIsComposite.setText("دارایی مرکب نیست");
        }
    }//GEN-LAST:event_isCompositeActionPerformed

    private void hasPlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasPlaceActionPerformed
        if (hasPlace.isSelected()) {
            otherProperties.setEnabledAt(3, true);
            finalIsPlace.setText("دارایی مکان‌مند است");
//            loadLabelComponents();
            setPlace();
        } else {
            otherProperties.setEnabledAt(3, false);
            finalIsPlace.setText("دارایی مکان‌مند نیست");
        }
    }//GEN-LAST:event_hasPlaceActionPerformed

    private void isHumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isHumanActionPerformed
        if (isHuman.isSelected()) {
            otherProperties.setEnabledAt(2, true);
            finalIsHuman.setText("دارایی انسان است");
        } else {
            otherProperties.setEnabledAt(2, false);
            finalIsHuman.setText("دارایی انسان نیست");
        }
    }//GEN-LAST:event_isHumanActionPerformed

    private void isPhysicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isPhysicalActionPerformed
        if (isPhysical.isSelected()) {
            otherProperties.setEnabledAt(4, true);
            finalIsPhysical.setText("دارایی فیزیکی است");
        } else {
            otherProperties.setEnabledAt(4, false);
            finalIsPhysical.setText("دارایی فیزیکی نیست");
        }
    }//GEN-LAST:event_isPhysicalActionPerformed

    private void physicalPropertiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_physicalPropertiesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_physicalPropertiesActionPerformed

    private void hasBimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasBimeActionPerformed
        bimeComment.setEnabled(true);
    }//GEN-LAST:event_hasBimeActionPerformed

    private void noBimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noBimeActionPerformed
        bimeComment.setEnabled(false);
    }//GEN-LAST:event_noBimeActionPerformed

    private void bimeCommentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bimeCommentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bimeCommentActionPerformed

    private void hasDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasDocActionPerformed
        docComment.setEnabled(true);
    }//GEN-LAST:event_hasDocActionPerformed

    private void docCommentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docCommentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docCommentActionPerformed

    private void humanAssetNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_humanAssetNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_humanAssetNameActionPerformed

    private void humanAssetFamilyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_humanAssetFamilyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_humanAssetFamilyActionPerformed

    private void humanAssetNationalCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_humanAssetNationalCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_humanAssetNationalCodeActionPerformed

    private void humanAssetPersonalCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_humanAssetPersonalCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_humanAssetPersonalCodeActionPerformed

    private void humanAssetCommentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_humanAssetCommentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_humanAssetCommentsActionPerformed

    private void addSubAssetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSubAssetActionPerformed
//        System.out.println(((Asset)assets.getSelectedItem()).getName());
        subAssets.add((Asset) assets.getSelectedItem());
        DefaultMutableTreeNode subAsset = new DefaultMutableTreeNode((Asset) assets.getSelectedItem());
        rootAsset.add(subAsset);
        this.loadLabelComponents();
        this.allAssetForSubAsset.remove((Asset) assets.getSelectedItem());
        assets.setModel(new javax.swing.JComboBox<Asset>(allAssetForSubAsset.toArray(new Asset[allAssetForSubAsset.size()])).getModel());

    }//GEN-LAST:event_addSubAssetActionPerformed

    private void saveAssetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAssetbtnActionPerformed
        if (assetName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "برای دارایی نامی انتخاب نشده است.", "خطا", JOptionPane.ERROR_MESSAGE);
            return;
        }
        finalAsset.setName(assetName.getText());

        if (assetUID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "برای دارایی UID انتخاب نشده است.", "خطا", JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean repeated = false;
        for (Asset asset : AssetCatalogue.getInstace().getAssets()) {
            if (asset.getUID().equals(assetUID.getText())) {
                repeated = true;
            }
        }
//        if (repeated && this.mode == MOD_NEW) {
//            JOptionPane.showMessageDialog(null, "برای دارایی UID تکراری انتخاب شده است.", "خطا", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
        finalAsset.setUID(assetUID.getText());

        if (isHuman.isSelected()) {
            if (humanAssetName.getText().equals("") || humanAssetFamily.getText().equals("") || humanAssetNationalCode.getText().equals("") || humanAssetPersonalCode.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "اطلاعات مربوط به بخش دارایی انسانی به طور کامل پرنشده است.", "خطا", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try {
                Double.parseDouble(humanAssetNationalCode.getText());
                Double.parseDouble(humanAssetPersonalCode.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "اطلاعات کد ملی یا کد پرسنلی ناصحیح می‌باشند.", "خطا", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Human human = new Human();
            human.setName(humanAssetName.getText());
            human.setFamilyName(humanAssetFamily.getText());
            human.setPersonalCode(Integer.parseInt(humanAssetPersonalCode.getText()));
            human.setNationalCode(Integer.parseInt(humanAssetPersonalCode.getText()));
            human.setComments(humanAssetComments.getText());
            finalAsset.setHuman(human);
        }

        if (hasPlace.isSelected()) {
            System.out.println(placeEast.getText());
            System.out.println(placeNorth.getText());
            if (placeEast.getText().equals("0") && placeNorth.getText().equals("0")) {
                JOptionPane.showMessageDialog(null, "اطلاعات مکانی دارایی در سامانه‌ی GIS موجود نمی‌باشد.", "خطا", JOptionPane.ERROR_MESSAGE);
                hasPlace.doClick();
                return;
            }
            Place place = new Place();
            place.setEast(Double.parseDouble(placeEast.getText()));
            place.setNorth(Double.parseDouble(placeNorth.getText()));
            finalAsset.setPlace(place);
        }

        if (isPhysical.isSelected()) {
            if (physicalProperties.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "مشخصات ظاهری دارایی وارد نشده است.", "خطا", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (hasBime.isSelected()) {
                if (bimeComment.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "شرح بیمه وارد نشده است.", "خطا", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            if (hasDoc.isSelected()) {
                if (docComment.getText().equals("")) {
                    finalAsset.setDocMode(3);
                    JOptionPane.showMessageDialog(null, "شرح سند وارد نشده است.", "خطا", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else if (withoutDoc.isSelected()) {
                finalAsset.setDocMode(1);
            } else if (noDoc.isSelected()) {
                finalAsset.setDocMode(2);
            }
            finalAsset.setBimeComment(bimeComment.getText());
            finalAsset.setDocComment(docComment.getText());
            finalAsset.setPhysicalProperties(physicalProperties.getText());
        }

        if (isComposite.isSelected()) {
            if (subAssets.isEmpty()) {
                JOptionPane.showMessageDialog(null, "دارایی مرکب حداقل باید یک زیر دارایی داشته باشد.", "خطا", JOptionPane.ERROR_MESSAGE);
                return;
            }
            finalAsset.setSubAssets(subAssets);
        }
        if(isAssetKind.isSelected()){
            finalAsset.setAssetKind((label.Label)assetKindLabels.getSelectedItem());
        }
        this.assetListManagementFrame.loadLabelComponents();
        if (this.mode == NewAssetFrame.MOD_NEW) {
            AssetCatalogue.getInstace().getAssets().add(finalAsset);
            JOptionPane.showMessageDialog(null, "دارایی مورد نظر با موفقیت ایجاد و ذخیره گردید.", "پیام", JOptionPane.INFORMATION_MESSAGE);
        } else {
            assetListManagementFrame.loadLabelComponents();
            JOptionPane.showMessageDialog(null, "دارایی مورد نظر با موفقیت بروزرسانی شد.", "پیام", JOptionPane.INFORMATION_MESSAGE);
        }
        this.loadLabelComponents();
        this.dispose();

    }//GEN-LAST:event_saveAssetbtnActionPerformed

    private void assetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assetsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_assetsActionPerformed

    private void withoutDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withoutDocActionPerformed
        docComment.setEnabled(false);
    }//GEN-LAST:event_withoutDocActionPerformed

    private void noDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noDocActionPerformed
        docComment.setEnabled(false);
    }//GEN-LAST:event_noDocActionPerformed

    private void addRuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRuleActionPerformed
        ApplyRuleForm arf = new ApplyRuleForm(finalAsset, ApplyRuleForm.MOD_NEW, this);
        arf.setVisible(true);
        arf.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_addRuleActionPerformed

    private void assetUIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_assetUIDFocusLost
        finalAssetUID.setText(assetUID.getText());
        if (mode == MOD_NEW) {
            finalAsset.setUID(assetUID.getText());
        }
    }//GEN-LAST:event_assetUIDFocusLost

    private void assetUIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assetUIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_assetUIDActionPerformed

    private void assetNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_assetNameFocusLost
        finalAssetName.setText(assetName.getText());
        if (mode == MOD_NEW) {
            finalAsset.setName(assetName.getText());
        }
        subAssetTree.repaint();
        loadRuleLabelComponnets();
    }//GEN-LAST:event_assetNameFocusLost

    private void assetNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assetNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_assetNameActionPerformed

    private void addPropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPropertyActionPerformed
        if (propertyName.getText().equals("") || propertyValue.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "اطلاعات ویژگی اولیه به صورت کامل وارد نشده است.", "خطا", JOptionPane.ERROR_MESSAGE);
            return;
        }
        finalAsset.getProperties().add(new PrimaryProperty(propertyName.getText(), propertyValue.getText()));
        propertyName.setText("");
        propertyValue.setText("");
        this.loadLabelComponents();
    }//GEN-LAST:event_addPropertyActionPerformed

    private void addFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFileActionPerformed
        if (fileName.getText().equals("") || filePath.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "نام فایل وارد نشده است.", "خطا", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (filePath.getText().equals("فایل انتخاب نشده است.")) {
            JOptionPane.showMessageDialog(null, "فایل انتخاب نشده است.", "خطا", JOptionPane.ERROR_MESSAGE);
            return;
        }
        finalAsset.getFiles().add(new AssetFile(fileName.getText(), filePath.getText()));
        fileName.setText("");
        filePath.setText("فایل انتخاب نشده است.");
        this.loadLabelComponents();
    }//GEN-LAST:event_addFileActionPerformed

    private void addProperty2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProperty2ActionPerformed
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(NewAssetFrame.this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            filePath.setText(file.getAbsolutePath());
        } else {
        }
    }//GEN-LAST:event_addProperty2ActionPerformed

    private void isAssetKindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isAssetKindActionPerformed
        if (isAssetKind.isSelected()) {
            if (label.LabelCatalogue.getInstace().getAssetKindLabels().isEmpty()) {
                String[] noLabel = {"برچسبی به دارایی الصاق نشده است."};
                assetKindLabels.setModel(new javax.swing.JComboBox(noLabel).getModel());
            }else{
                assetKindLabels.setModel(new javax.swing.JComboBox<label.Label>(label.LabelCatalogue.getInstace().getAssetKindLabels().toArray(new label.Label[label.LabelCatalogue.getInstace().getAssetKindLabels().size()])).getModel());
            }
            
            assetKindLabels.setVisible(true);
        } else {
            assetKindLabels.setVisible(false);
        }
    }//GEN-LAST:event_isAssetKindActionPerformed

    private void assetKindLabelsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assetKindLabelsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_assetKindLabelsActionPerformed

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
            java.util.logging.Logger.getLogger(NewAssetFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewAssetFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewAssetFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewAssetFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewAssetFrame(null, null, NewAssetFrame.MOD_NEW).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFile;
    private javax.swing.JButton addProperty;
    private javax.swing.JButton addProperty2;
    private javax.swing.JButton addRule;
    private javax.swing.JButton addSubAsset;
    private javax.swing.JComboBox assetKindLabels;
    private javax.swing.JTextField assetName;
    private javax.swing.JTextField assetUID;
    private javax.swing.JComboBox assets;
    private javax.swing.JPanel assetsPanel;
    private javax.swing.JScrollPane assetsScrollPane;
    private javax.swing.JTextField bimeComment;
    private javax.swing.ButtonGroup bimeOption;
    private javax.swing.JTextField docComment;
    private javax.swing.ButtonGroup docOption;
    private javax.swing.JTextField fileName;
    private javax.swing.JPanel filePanel;
    private javax.swing.JLabel filePath;
    private javax.swing.JInternalFrame fileTab;
    private javax.swing.JLabel finalAssetName;
    private javax.swing.JLabel finalAssetUID;
    private javax.swing.JLabel finalIsComposite;
    private javax.swing.JLabel finalIsHuman;
    private javax.swing.JLabel finalIsPhysical;
    private javax.swing.JLabel finalIsPlace;
    private javax.swing.JInternalFrame finalTab;
    private javax.swing.JRadioButton hasBime;
    private javax.swing.JRadioButton hasDoc;
    private javax.swing.JCheckBox hasPlace;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel headerPanel1;
    private javax.swing.JPanel headerPanel2;
    private javax.swing.JTextField humanAssetComments;
    private javax.swing.JTextField humanAssetFamily;
    private javax.swing.JTextField humanAssetName;
    private javax.swing.JTextField humanAssetNationalCode;
    private javax.swing.JTextField humanAssetPersonalCode;
    private javax.swing.JInternalFrame humanTab;
    private javax.swing.JCheckBox isAssetKind;
    private javax.swing.JCheckBox isComposite;
    private javax.swing.JCheckBox isHuman;
    private javax.swing.JCheckBox isPhysical;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane labelsScrollPane;
    private javax.swing.JScrollPane labelsScrollPane1;
    private javax.swing.JScrollPane labelsScrollPane2;
    private javax.swing.JRadioButton noBime;
    private javax.swing.JRadioButton noDoc;
    private javax.swing.JTabbedPane otherProperties;
    private javax.swing.JTextField physicalProperties;
    private javax.swing.JInternalFrame physicalTab;
    private javax.swing.JLabel placeComment;
    private javax.swing.JLabel placeEast;
    private javax.swing.JLabel placeNorth;
    private javax.swing.JInternalFrame placeTab;
    private javax.swing.JLabel placelabel1;
    private javax.swing.JLabel placelabel2;
    private javax.swing.JInternalFrame primaryTab;
    private javax.swing.JPanel propertiesPanel;
    private javax.swing.JTextField propertyName;
    private javax.swing.JTextField propertyValue;
    private javax.swing.JPanel ruleHeaderPanel;
    private javax.swing.JPanel rulePanel;
    private javax.swing.JInternalFrame rules;
    private javax.swing.JButton saveAssetbtn;
    private javax.swing.JInternalFrame subAssetTab;
    private javax.swing.JTree subAssetTree;
    private javax.swing.JRadioButton withoutDoc;
    // End of variables declaration//GEN-END:variables

    void setAssetComboBox(ArrayList<Asset> subAssets) {
        assets.setModel(new javax.swing.JComboBox<Asset>(subAssets.toArray(new Asset[subAssets.size()])).getModel());
    }

    public void setSubAssetTree(JTree subAssetTree) {
        this.subAssetTree = subAssetTree;
    }

    public JTree getSubAssetTree() {
        return subAssetTree;
    }

    void loadLabelComponents() {
        rootAsset = new DefaultMutableTreeNode(finalAsset);
        for (int i = 0; i < subAssets.size(); i++) {
            rootAsset.add(new DefaultMutableTreeNode(subAssets.get(i)));
        }
        DefaultTreeModel treeModel = new DefaultTreeModel(rootAsset);
        subAssetTree.setModel(treeModel);
        assetsPanel.removeAll();
        assetsPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 30));
        int dep = 30;
        int index = 1;
        for (Asset asset : subAssets) {
            assetsPanel.add(new LabelPanel(new Integer(index++).toString(), asset, this), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, dep, 320, 30));
            dep += 30;
        }

        propertiesPanel.removeAll();
        propertiesPanel.add(headerPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 30));
        dep = 30;
        index = 1;
        for (PrimaryProperty property : finalAsset.getProperties()) {
            propertiesPanel.add(new PropertyLabelPanel(new Integer(index++).toString(), property, this), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, dep, 450, 30));
            dep += 30;
        }

        filePanel.removeAll();
        filePanel.add(headerPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 30));
        dep = 30;
        index = 1;
        for (AssetFile file : finalAsset.getFiles()) {
            filePanel.add(new FileLabelPanel(new Integer(index++).toString(), file, this), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, dep, 450, 30));
            dep += 30;
        }

        validate();
        repaint();
    }

    public void loadRuleLabelComponnets() {
        setPlace();
        rulePanel.removeAll();
        rulePanel.add(ruleHeaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 30));
        ArrayList<ApplyRule> aprs = new ArrayList<>();
//        for (Asset asset: AssetCatalogue.getInstace().getAssets()){
        Asset asset = finalAsset;
        for (ApplyRule apr : asset.getRules()) {
            aprs.add(apr);
        }
        for (AttachedLabel atl : asset.getAttachedLabels()) {
            for (ApplyRule apr : atl.getRules()) {
                aprs.add(apr);
            }
        }
//        }
        int ruleDep = 30;
        int ruleIndex = 1;
        for (rule.ApplyRule apr : aprs) {
            rulePanel.add(new RuleLabelPanel(new Integer(ruleIndex++).toString(), apr, this), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, ruleDep, 780, 30));
            ruleDep += 30;
        }
    }

    void setPlace() {
        double east = GISInfo.getInstance().getEast(this.assetUID.getText());
        double north = GISInfo.getInstance().getNorth(this.assetUID.getText());
        if (east == 0 || north == 0) {
            System.out.println("");
            placeComment.setText("اطلاعات مکانی با موفقیت دریافت نشد.");
            placeEast.setText("0");
            placeNorth.setText("0");
        } else {
            placeComment.setText("اطلاعات مکانی با موفقیت دریافت شد.");
            placeEast.setText(east + "");
            placeNorth.setText(north + "");
        }
    }
}

class LabelPanel extends javax.swing.JPanel {

    public LabelPanel(String number, final Asset asset, final NewAssetFrame newAssetFrame) {
        super();
        this.setBackground(new java.awt.Color(254, 254, 254));
        this.setLayout(null);

        JLabel numberLabel = new JLabel();

        numberLabel.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        numberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numberLabel.setText(number);
        this.add(numberLabel);
        numberLabel.setBounds(250, 0, 60, 30);

        JButton closeButton = new JButton();

        closeButton.setForeground(new java.awt.Color(215, 215, 215));
        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/close-24-outside.png"))); // NOI18N
        closeButton.setBorder(null);
        closeButton.setBorderPainted(false);
        this.add(closeButton);
        closeButton.setBounds(10, 0, 58, 30);
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //TODO
                for (int i = 0; i < newAssetFrame.rootAsset.getChildCount(); i++) {
                    System.out.println(((Asset) ((DefaultMutableTreeNode) newAssetFrame.rootAsset.getChildAt(i)).getUserObject()));
                }
//                System.out.println(newAssetFrame.rootAsset.getUserObject());
                newAssetFrame.subAssets.remove(asset);
                newAssetFrame.allAssetForSubAsset.add(asset);
                newAssetFrame.loadLabelComponents();
                newAssetFrame.setAssetComboBox(newAssetFrame.allAssetForSubAsset);
//                JFrame newLabelFrame = new NewLabelFrame(label, labelListManagementFrame, NewLabelFrame.MOD_UPDATE);
                newAssetFrame.setVisible(true);
                newAssetFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            }
        });

//        JButton editButton = new JButton();
//
//        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/file_edit.png"))); // NOI18N
//        editButton.setBorderPainted(false);
//        this.add(editButton);
//        editButton.setBounds(90, 0, 50, 30);
//        editButton.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
////                JFrame newLabelFrame = new NewLabelFrame(asset, labelListManagementFrame, NewLabelFrame.MOD_UPDATE);
////                newLabelFrame.setVisible(true);
////                newLabelFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
////            }
//        });
        JLabel valueLabel = new JLabel();

        valueLabel.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        valueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valueLabel.setText(asset.getName());
        this.add(valueLabel);
        valueLabel.setBounds(170, 0, 60, 30);
    }
}

class RuleLabelPanel extends javax.swing.JPanel {

    public RuleLabelPanel(String number, final ApplyRule apr, final NewAssetFrame newAssetFrame) {
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
        if (apr.getConstant() == null) {
            baseAssetLabel.setText(baseAsset.getName());
        } else {
            baseAssetLabel.setText("----");
        }

        this.add(baseAssetLabel);
        baseAssetLabel.setBounds(240, 0, 110, 30);
//        baseAssetLabel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));

        //6
        JLabel baseTextLabel = new JLabel();

        baseTextLabel.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        baseTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        if (apr.getConstant() == null) {
            if (baseProperty == -1) {
                baseTextLabel.setText(baseLabel.getLabel().getName());
            } else {
                baseTextLabel.setText(Asset.getPropertyComment(baseProperty));
            }
        } else {
            baseTextLabel.setText(apr.getConstant());
        }
        this.add(baseTextLabel);
        baseTextLabel.setBounds(120, 0, 110, 30);
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
        JButton closeButton = new JButton();

        closeButton.setForeground(new java.awt.Color(215, 215, 215));
        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/close-24-outside.png"))); // NOI18N
        closeButton.setBorder(null);
        closeButton.setBorderPainted(false);
        this.add(closeButton);
        closeButton.setBounds(5, 0, 50, 30);
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apr.getInMeasureAsset().removeApplyRule(apr);
                apr.getBaseAsset().removeApplyRule(apr);
//                for(AttachedLabel label: apr.getInMeasureAsset().getAttachedLabels()){
//                    label.
//                }
                newAssetFrame.loadRuleLabelComponnets();
//                JFrame newLabelFrame = new NewLabelFrame(label, labelListManagementFrame, NewLabelFrame.MOD_UPDATE);
                newAssetFrame.setVisible(true);
                newAssetFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            }
        });
    }
}

class PropertyLabelPanel extends javax.swing.JPanel {

    public PropertyLabelPanel(String number, final PrimaryProperty property, final NewAssetFrame newAssetFrame) {
        super();
        this.setBackground(new java.awt.Color(254, 254, 254));
        this.setLayout(null);

        JLabel numberLabel = new JLabel();

        numberLabel.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        numberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numberLabel.setText(number);
        this.add(numberLabel);
        numberLabel.setBounds(390, 0, 60, 30);

        JLabel nameLabel = new JLabel();

        nameLabel.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText(property.getName());
        this.add(nameLabel);
        nameLabel.setBounds(245, 0, 145, 30);

        JLabel valueLabel = new JLabel();

        valueLabel.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        valueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valueLabel.setText(property.getValue());
        this.add(valueLabel);
        valueLabel.setBounds(80, 0, 155, 30);

        JButton closeButton = new JButton();

        closeButton.setForeground(new java.awt.Color(215, 215, 215));
        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/close-24-outside.png"))); // NOI18N
        closeButton.setBorder(null);
        closeButton.setBorderPainted(false);
        this.add(closeButton);
        closeButton.setBounds(10, 0, 58, 30);
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                newAssetFrame.finalAsset.getProperties().remove(property);
                newAssetFrame.loadLabelComponents();
                newAssetFrame.setAssetComboBox(newAssetFrame.allAssetForSubAsset);
                newAssetFrame.setVisible(true);
                newAssetFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            }
        });

    }
}

class FileLabelPanel extends javax.swing.JPanel {

    public FileLabelPanel(String number, final AssetFile file, final NewAssetFrame newAssetFrame) {
        super();
        this.setBackground(new java.awt.Color(254, 254, 254));
        this.setLayout(null);

        JLabel numberLabel = new JLabel();

        numberLabel.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        numberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numberLabel.setText(number);
        this.add(numberLabel);
        numberLabel.setBounds(420, 0, 30, 30);

        JLabel nameLabel = new JLabel();

        nameLabel.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText(file.getName());
        this.add(nameLabel);
        nameLabel.setBounds(320, 0, 100, 30);

        JLabel valueLabel = new JLabel();

        valueLabel.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        valueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valueLabel.setText(file.getAddress());
        this.add(valueLabel);
        valueLabel.setBounds(80, 0, 240, 30);

        JButton closeButton = new JButton();

        closeButton.setForeground(new java.awt.Color(215, 215, 215));
        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/close-24-outside.png"))); // NOI18N
        closeButton.setBorder(null);
        closeButton.setBorderPainted(false);
        this.add(closeButton);
        closeButton.setBounds(10, 0, 58, 30);
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                newAssetFrame.finalAsset.getFiles().remove(file);
                newAssetFrame.loadLabelComponents();
                newAssetFrame.setAssetComboBox(newAssetFrame.allAssetForSubAsset);
                newAssetFrame.setVisible(true);
                newAssetFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            }
        });

    }
}
