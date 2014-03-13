/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainFrame.java
 *
 * Created on Nov 29, 2013, 2:04:52 PM
 */
package GUI.label;

import GUI.utility.ScrollableListPanel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import label.BooleanLabelType;
import label.DoubleLabelType;
import label.IntegerLabelType;
import label.Label;
import label.LabelCatalogue;
import label.StringLabelType;

/**
 *
 * @author Bagher
 */
public class NewLabelFrame extends javax.swing.JFrame {

    public static final int MOD_UPDATE = 1;
    public static final int MOD_NEW = 2;

    private Label label;
    private LabelListManagementFrame labelListManagementFrame;
    private ScrollableListPanel labelValueScrollPane;
    private int mod = MOD_NEW;

    /**
     * Creates new form MainFrame
     *
     * @param label
     * @param labelListManagementFrame
     * @param mod
     */
    public NewLabelFrame(Label label, LabelListManagementFrame labelListManagementFrame, int mod) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Error setting native LAF: " + e);
        }
        this.mod = mod;
        this.labelListManagementFrame = labelListManagementFrame;
        if (mod == MOD_NEW || label == null) {
            this.label = new Label();
            this.label.setType(new StringLabelType());
        } else {
            this.label = label;
        }
        labelValueScrollPane = new ScrollableListPanel("مقدار", false);
        initComponents();
        loadLabelVauleComponents();
        getContentPane().add(labelValueScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 270, 190));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTypeButtonGroup = new javax.swing.ButtonGroup();
        titleLabel = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        saveLabelButton = new javax.swing.JButton();
        stringRadioButton = new javax.swing.JRadioButton();
        booleanRadioButton = new javax.swing.JRadioButton();
        intRadioButton = new javax.swing.JRadioButton();
        doubleRadioButton = new javax.swing.JRadioButton();
        labelValueTextField = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        addValueButton = new javax.swing.JButton();
        labelNameTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("سامانه‌ی مدیریت ‍پیکربندی شهردای");
        setBackground(new java.awt.Color(152, 152, 152));
        setBounds(new java.awt.Rectangle(50, 50, 750, 500));
        setMinimumSize(new java.awt.Dimension(750, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Web Yekan", 0, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText((mod == MOD_NEW)?("تعریف برچسب جدید"):("مشاهده و بروزرسانی برچسب"));
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 431, 70));

        jLabel47.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel47.setText("نام برچسب");
        getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, -1, -1));

        jLabel49.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel49.setText("مقادیر ممکن");
        getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, -1, -1));

        saveLabelButton.setBackground(new java.awt.Color(254, 254, 254));
        saveLabelButton.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        saveLabelButton.setForeground(new java.awt.Color(1, 1, 1));
        saveLabelButton.setText("ذخیره‌ی برچسب");
        saveLabelButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 139, 255), 1, true));
        saveLabelButton.setFocusPainted(false);
        saveLabelButton.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        saveLabelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveLabelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveLabelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 120, 30));

        labelTypeButtonGroup.add(stringRadioButton);
        stringRadioButton.setSelected(true);
        stringRadioButton.setText("رشته");
        stringRadioButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        stringRadioButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        stringRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stringRadioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(stringRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 80, -1));

        labelTypeButtonGroup.add(booleanRadioButton);
        booleanRadioButton.setText("دودویی");
        booleanRadioButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        booleanRadioButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        booleanRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booleanRadioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(booleanRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 110, -1));

        labelTypeButtonGroup.add(intRadioButton);
        intRadioButton.setText("عدد صحیح");
        intRadioButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        intRadioButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        intRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intRadioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(intRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 110, -1));

        labelTypeButtonGroup.add(doubleRadioButton);
        doubleRadioButton.setText("اعشاری");
        doubleRadioButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        doubleRadioButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        doubleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doubleRadioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(doubleRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 80, -1));

        labelValueTextField.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        labelValueTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        labelValueTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelValueTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(labelValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 150, -1));

        jLabel46.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel46.setText("نوع برچسب");
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 110, 30));

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
        getContentPane().add(addValueButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 90, 30));

        labelNameTextField.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        labelNameTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        labelNameTextField.setText(label.getName());
        labelNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelNameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(labelNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 150, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadLabelVauleComponents() {
        labelValueScrollPane.reloadValues(label.getValues());

        if (label != null && label.getType() != null) {
            System.out.println(label.getName());
            if (label.getType().getTypeName().equals("String")) {
                stringRadioButton.setSelected(true);
            } else if (label.getType().getTypeName().equals("Double")) {
                doubleRadioButton.setSelected(true);
            } else if (label.getType().getTypeName().equals("Integer")) {
                intRadioButton.setSelected(true);
            } else if (label.getType().getTypeName().equals("Boolean")) {
                booleanRadioButton.setSelected(true);
            }
        }
        validate();
        repaint();
    }

    private void saveLabelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveLabelButtonActionPerformed
        if (labelNameTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "برای برچسب نامی انتخاب نشده است.", "خطا", JOptionPane.ERROR_MESSAGE);
            return;
        }
        label.setName(labelNameTextField.getText());
        if (mod == MOD_NEW) {
            LabelCatalogue.getInstace().addLabel(label);
            Label newLabel = new Label();
            newLabel.setType(label.getType());
            label = newLabel;
            labelValueTextField.setText("");
            labelNameTextField.setText("");
            loadLabelVauleComponents();
        }
        labelListManagementFrame.loadLabelComponents();
    }//GEN-LAST:event_saveLabelButtonActionPerformed

    private void stringRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stringRadioButtonActionPerformed
        label.setType(new StringLabelType());
        loadLabelVauleComponents();
    }//GEN-LAST:event_stringRadioButtonActionPerformed

    private void intRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intRadioButtonActionPerformed
        label.setType(new IntegerLabelType());
        loadLabelVauleComponents();
    }//GEN-LAST:event_intRadioButtonActionPerformed

    private void booleanRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booleanRadioButtonActionPerformed
        label.setType(new BooleanLabelType());
        loadLabelVauleComponents();
    }//GEN-LAST:event_booleanRadioButtonActionPerformed

    private void doubleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doubleRadioButtonActionPerformed
        label.setType(new DoubleLabelType());
        loadLabelVauleComponents();
    }//GEN-LAST:event_doubleRadioButtonActionPerformed

    private void addValueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addValueButtonActionPerformed
        try {
            label.addVaule(labelValueTextField.getText());
            loadLabelVauleComponents();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "مقدار وارد شده با نوع مشخص‌شده سازگار نیست.", "خطا", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addValueButtonActionPerformed

    private void labelValueTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelValueTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelValueTextFieldActionPerformed

    private void labelNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelNameTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addValueButton;
    private javax.swing.JRadioButton booleanRadioButton;
    private javax.swing.JRadioButton doubleRadioButton;
    private javax.swing.JRadioButton intRadioButton;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JTextField labelNameTextField;
    private javax.swing.ButtonGroup labelTypeButtonGroup;
    private javax.swing.JTextField labelValueTextField;
    private javax.swing.JButton saveLabelButton;
    private javax.swing.JRadioButton stringRadioButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
