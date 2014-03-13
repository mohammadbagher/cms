/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI.utility;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author ali
 */
public class ScrollableListPanel extends JScrollPane{
    private JPanel labelValuesPanel = new javax.swing.JPanel();
    
    private JPanel headerPanel = new javax.swing.JPanel();
    private JLabel jLabel19 = new javax.swing.JLabel();
    private JLabel jLabel20 = new javax.swing.JLabel();
    private ButtonGroup buttonGroup = null;

    public ScrollableListPanel(String title, boolean hasButton) {
        super();
        
        this.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        labelValuesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        headerPanel.setBackground(new java.awt.Color(160, 196, 255));
        headerPanel.setLayout(null);

        jLabel19.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("ردیف");
        headerPanel.add(jLabel19);
        jLabel19.setBounds(210, 0, 40, 30);

        jLabel20.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText(title);
        headerPanel.add(jLabel20);
        jLabel20.setBounds(30, 0, 180, 30);

        labelValuesPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 30));

        if(hasButton)
            buttonGroup = new ButtonGroup();
        
        this.setViewportView(labelValuesPanel);
    }
    
    public void reloadValues(Object[] values){
        labelValuesPanel.removeAll();
        labelValuesPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 30));
        int dep = 30;
        int index = 1;
        for(Object object :values){
            labelValuesPanel.add(new ListItemPanel(new Integer(index++).toString(), object, new java.awt.Color(254, 254, 254), buttonGroup),
                    new org.netbeans.lib.awtextra.AbsoluteConstraints(0, dep, 270, 30));
            dep += 30;
        }
        validate();
        repaint();
    }
}

class ListItemPanel extends javax.swing.JPanel{

    public ListItemPanel(String number, Object value, java.awt.Color color, ButtonGroup buttonGroup) {
        super();
        this.setBackground(new java.awt.Color(254, 254, 254));
        this.setLayout(null);
        JLabel numberLabel = new JLabel();
        numberLabel.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        numberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numberLabel.setText(number);
        this.add(numberLabel);
        numberLabel.setBounds(210, 0, 40, 30);
        
        JLabel valueLabel = new JLabel();
        valueLabel.setFont(new java.awt.Font("XB Zar", 0, 15)); // NOI18N
        valueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valueLabel.setText(value.toString());
        this.add(valueLabel);
        valueLabel.setBounds(30, 0, 180, 30);
        
        this.setBackground(color);
        
        if(buttonGroup != null){
            JRadioButton radioButton = new JRadioButton();
            radioButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            radioButton.setBounds(0, 0, 30, 30);
            buttonGroup.add(radioButton);
            this.add(radioButton);
        }
    }
}
