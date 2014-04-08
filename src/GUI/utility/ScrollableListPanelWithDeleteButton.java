/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI.utility;

import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

/**
 *
 * @author ali
 */
public class ScrollableListPanelWithDeleteButton extends JScrollPane{
    private final JPanel labelValuesPanel = new javax.swing.JPanel();
    
    private final JPanel headerPanel = new javax.swing.JPanel();
    private final JLabel jLabel19 = new javax.swing.JLabel();
    private final JLabel jLabel20 = new javax.swing.JLabel();
    private final JLabel deleteLabel = new javax.swing.JLabel();
    private ButtonGroup buttonGroup = null;
    private Object selectedItem;
    private final ArrayList<Callback> callbacks;
    private final DeleteCallback deleteCallback;
    
    public void addCallback(Callback callback){
        callbacks.add(callback);
    }
    
    void setSelectedItem(Object object){
        this.selectedItem = object;
        for(Callback callback: callbacks)
            callback.trigger();
    }
    
    public Object getSelectedItem(){
        return selectedItem;
    }
    
    public void deSelect(){
        selectedItem = null;
        buttonGroup.clearSelection();
    }

    public ScrollableListPanelWithDeleteButton(String title, boolean hasButton, DeleteCallback deleteCallback) {
        super();
        this.deleteCallback = deleteCallback;
        this.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        labelValuesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        headerPanel.setBackground(new java.awt.Color(160, 196, 255));
        headerPanel.setLayout(null);

        jLabel19.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("ردیف");
        headerPanel.add(jLabel19);
        jLabel19.setBounds(310, 0, 40, 30);

        deleteLabel.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        deleteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteLabel.setText("حذف");
        headerPanel.add(deleteLabel);
        deleteLabel.setBounds(0, 0, 30, 30);

        jLabel20.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText(title);
        headerPanel.add(jLabel20);
        jLabel20.setBounds(60, 0, 250, 30);

        labelValuesPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 30));
        if(hasButton)
            buttonGroup = new ButtonGroup();
        this.setViewportView(labelValuesPanel);
        
        callbacks = new ArrayList<>();
    }
    
    public void reloadValues(Object[] values){
        labelValuesPanel.removeAll();
        labelValuesPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 30));
        int dep = 30;
        int index = 1;
        for(Object object :values){
            labelValuesPanel.add(new ListItemPanelWithDelete(new Integer(index++).toString(), object, new java.awt.Color(254, 254, 254), buttonGroup, this, deleteCallback),
                    new org.netbeans.lib.awtextra.AbsoluteConstraints(0, dep, 370, 30));
            dep += 30;
        }
        validate();
        repaint();
    }
}

class ListItemPanelWithDelete extends javax.swing.JPanel{

    public ListItemPanelWithDelete(String number, final Object value, java.awt.Color color, ButtonGroup buttonGroup, final ScrollableListPanelWithDeleteButton list, final DeleteCallback deleteCallback) {
        super();
        this.setBackground(new java.awt.Color(254, 254, 254));
        this.setLayout(null);
        JLabel numberLabel = new JLabel();
        numberLabel.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        numberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numberLabel.setText(number);
        this.add(numberLabel);
        numberLabel.setBounds(310, 0, 40, 30);
        
        JLabel valueLabel = new JLabel();
        valueLabel.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        valueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valueLabel.setText(value.toString());
        this.add(valueLabel);
        valueLabel.setBounds(60, 0, 250, 30);
        
        JButton closeButton = new JButton();

        closeButton.setForeground(new java.awt.Color(215, 215, 215));
        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/close-24-outside.png"))); // NOI18N
        closeButton.setBorder(null);
        closeButton.setBorderPainted(false);
        this.add(closeButton);
        closeButton.setBounds(0, 0, 30, 30);
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if(deleteCallback != null)
                    deleteCallback.deleteItem(value);
            }
        });
        
        this.setBackground(color);
        
        if(buttonGroup != null){
            JRadioButton radioButton = new JRadioButton();
            radioButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            radioButton.setBounds(30, 0, 30, 30);
            radioButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list.setSelectedItem(value);
            }
        });
            buttonGroup.add(radioButton);
            this.add(radioButton);
        }
    }
}
