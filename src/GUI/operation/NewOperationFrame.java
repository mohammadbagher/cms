/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainFrame.java
 *
 * Created on Nov 29, 2013, 2:04:52 PM
 */
package GUI.operation;

import GUI.utility.Callback;
import GUI.utility.ScrollableListPanel;
import asset.Asset;
import asset.AssetCatalogue;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import label.AttachedLabel;
import label.LabelCatalogue;
import operation.Operation;
import operation.OperationCatalogue;

/**
 *
 * @author Bagher
 */
public class NewOperationFrame extends javax.swing.JFrame {
    public static final int MOD_UPDATE = 1;
    public static final int MOD_NEW = 2;
            
    private Operation operation;
    private OperaionListManagementFrame operaionListManagementFrame;
    private ScrollableListPanel labelScrollPane;
    private ScrollableListPanel assetScrollPane;

    /** Creates new form MainFrame
     * @param operaionListManagementFrame */
    public NewOperationFrame(OperaionListManagementFrame operaionListManagementFrame) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e) {
          System.out.println("Error setting native LAF: " + e);
        }
        labelScrollPane = new ScrollableListPanel("نام برچسب الصاق شده", true);
        assetScrollPane = new ScrollableListPanel("نام دارایی", true);
        this.operaionListManagementFrame = operaionListManagementFrame;
        this.operation = new Operation();
        initComponents();
        assetScrollPane.reloadValues(AssetCatalogue.getInstace().getAssets().toArray());
        assetScrollPane.addCallback(new Callback() {
            @Override
            public void trigger() {
                Asset asset = (Asset)assetScrollPane.getSelectedItem();
                if(asset != null)
                    labelScrollPane.reloadValues(asset.getAttachedLabels());
            }
        });
        getContentPane().add(assetScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 270, 190));
        getContentPane().add(labelScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 270, 190));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        saveOperationButton = new javax.swing.JButton();
        operationNameTextField = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("سامانه‌ی مدیریت ‍پیکربندی شهردای");
        setBackground(new java.awt.Color(152, 152, 152));
        setBounds(new java.awt.Rectangle(50, 50, 750, 500));
        setMinimumSize(new java.awt.Dimension(750, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Web Yekan", 0, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("تعریف عملیات جدید");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 431, 70));

        saveOperationButton.setBackground(new java.awt.Color(254, 254, 254));
        saveOperationButton.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        saveOperationButton.setForeground(new java.awt.Color(1, 1, 1));
        saveOperationButton.setText("ذخیره عملیات");
        saveOperationButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 139, 255), 1, true));
        saveOperationButton.setFocusPainted(false);
        saveOperationButton.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        saveOperationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveOperationButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveOperationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 120, 30));

        operationNameTextField.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        operationNameTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        operationNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operationNameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(operationNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 150, 30));

        jLabel48.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel48.setText("نام علمیات");
        getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveOperationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveOperationButtonActionPerformed
        if(operationNameTextField.getText().equals("")){
            JOptionPane.showMessageDialog(null, "برای عملیات نامی انتخاب نشده است.", "خطا", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(assetScrollPane.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "دارایی انتخاب نشده است.", "خطا", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(labelScrollPane.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "برچسب الصاق شده انتخاب نشده است.", "خطا", JOptionPane.ERROR_MESSAGE);
            return;
        }
        operation.setAsset((Asset)assetScrollPane.getSelectedItem());
        operation.setAttachedLabel((AttachedLabel)labelScrollPane.getSelectedItem());
        operation.setName(operationNameTextField.getText());
        OperationCatalogue.getInstace().addOperation(operation);
        JOptionPane.showMessageDialog(null, "عملیات با موفقیت تعریف شد.", "", JOptionPane.INFORMATION_MESSAGE);
        
        //clear
        operation = new Operation();
        operationNameTextField.setText("");
        assetScrollPane.deSelect();
        labelScrollPane.deSelect();
        operaionListManagementFrame.loadOperationComponents();
    }//GEN-LAST:event_saveOperationButtonActionPerformed

    private void operationNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operationNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_operationNameTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel48;
    private javax.swing.JTextField operationNameTextField;
    private javax.swing.JButton saveOperationButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
