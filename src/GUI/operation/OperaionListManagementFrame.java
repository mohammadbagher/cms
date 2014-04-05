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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import operation.Operation;
import operation.OperationCatalogue;

/**
 *
 * @author Bagher
 */
public class OperaionListManagementFrame extends javax.swing.JFrame {

    /** Creates new form MainFrame */
    public OperaionListManagementFrame() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
          System.out.println("Error setting native LAF: " + e);
        }
        initComponents();
        loadOperationComponents();
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
        newOperationButton = new javax.swing.JButton();
        operationScrollPane = new javax.swing.JScrollPane();
        operationsPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("سامانه‌ی مدیریت ‍پیکربندی شهردای");
        setBackground(new java.awt.Color(152, 152, 152));
        setBounds(new java.awt.Rectangle(50, 50, 750, 500));
        setMinimumSize(new java.awt.Dimension(750, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Web Yekan", 0, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("مدیریت عملیات‌ها");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 431, 70));

        newOperationButton.setBackground(new java.awt.Color(254, 254, 254));
        newOperationButton.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        newOperationButton.setForeground(new java.awt.Color(1, 1, 1));
        newOperationButton.setText("تعریف عملیات جدید");
        newOperationButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 139, 255), 1, true));
        newOperationButton.setFocusPainted(false);
        newOperationButton.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        newOperationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOperationButtonActionPerformed(evt);
            }
        });
        getContentPane().add(newOperationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 120, 30));

        operationScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        operationsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel.setBackground(new java.awt.Color(160, 196, 255));
        headerPanel.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("ردیف");
        headerPanel.add(jLabel14);
        jLabel14.setBounds(310, 0, 60, 30);

        jLabel15.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("نام عملیات");
        headerPanel.add(jLabel15);
        jLabel15.setBounds(160, 0, 150, 30);

        jLabel18.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("انجام عملیات");
        headerPanel.add(jLabel18);
        jLabel18.setBounds(70, 0, 90, 30);

        jLabel19.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("حذف");
        headerPanel.add(jLabel19);
        jLabel19.setBounds(0, 0, 80, 30);

        operationsPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 30));

        operationScrollPane.setViewportView(operationsPanel);

        getContentPane().add(operationScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 370, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void loadOperationComponents() {
        operationsPanel.removeAll();
        operationsPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 30));
        int dep = 30;
        int index = 1;
        for(Operation operation :OperationCatalogue.getInstace().getOperations()){
            operationsPanel.add(new OperationPanel(new Integer(index++).toString(), operation, this), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, dep, 370, 30));
            dep += 30;
        }
        validate();
        repaint();
    }
    
    private void newOperationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newOperationButtonActionPerformed
        JFrame newOperationFrame;
        newOperationFrame = new NewOperationFrame(this);
        newOperationFrame.setVisible(true);
        newOperationFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_newOperationButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new OperaionListManagementFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JButton newOperationButton;
    private javax.swing.JScrollPane operationScrollPane;
    private javax.swing.JPanel operationsPanel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

}

class OperationPanel extends javax.swing.JPanel{

    public OperationPanel(String number, final Operation operation, final OperaionListManagementFrame operationListManagementFrame) {
        super();
        
        this.setBackground(new java.awt.Color(254, 254, 254));
        this.setLayout(null);
        
        JLabel numberLabel = new JLabel();

        numberLabel.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        numberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numberLabel.setText(number);
        this.add(numberLabel);
        numberLabel.setBounds(310, 0, 60, 30);
        
        JButton closeButton = new JButton();

        closeButton.setForeground(new java.awt.Color(215, 215, 215));
        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/close-24-outside.png"))); // NOI18N
        closeButton.setBorder(null);
        closeButton.setBorderPainted(false);
        this.add(closeButton);
        closeButton.setBounds(0, 0, 80, 30);
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperationCatalogue.getInstace().remove(operation);
                operationListManagementFrame.loadOperationComponents();
            }
        });
        
        JButton triggerButton = new JButton();

        triggerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/run.png"))); // NOI18N
        triggerButton.setBorderPainted(false);
        this.add(triggerButton);
        triggerButton.setBounds(70, 0, 90, 30);
        triggerButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFrame newFrame = new TriggerOperationFrame(operation);
                newFrame.setVisible(true);
                newFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            }
        });
        
        JLabel valueLabel = new JLabel();

        valueLabel.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        valueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valueLabel.setText(operation.getName());
        this.add(valueLabel);
        valueLabel.setBounds(160, 0, 150, 30);
    }
}
