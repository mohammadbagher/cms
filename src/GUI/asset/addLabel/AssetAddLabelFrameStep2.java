/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainFrame.java
 *
 * Created on Nov 29, 2013, 2:04:52 PM
 */
package GUI.asset.addLabel;

import GUI.asset.*;
import GUI.asset.newAsset.*;
import GUI.label.*;
import javax.swing.UIManager;

/**
 *
 * @author Bagher
 */
public class AssetAddLabelFrameStep2 extends javax.swing.JFrame {

    /** Creates new form MainFrame */
    public AssetAddLabelFrameStep2() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e) {
          System.out.println("Error setting native LAF: " + e);
        }
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jLabel63 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jScrollBar2 = new javax.swing.JScrollBar();
        jPanel20 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jLabel69 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("سامانه‌ی مدیریت ‍پیکربندی شهردای");
        setBackground(new java.awt.Color(152, 152, 152));
        setBounds(new java.awt.Rectangle(50, 50, 750, 500));
        setMinimumSize(new java.awt.Dimension(750, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Web Yekan", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("الصاق برچسب به دارایی - انتخاب برچسب");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 510, 70));

        jButton23.setBackground(new java.awt.Color(60, 0, 91));
        jButton23.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jButton23.setForeground(new java.awt.Color(1, 1, 1));
        jButton23.setText("خروج");
        jButton23.setFocusPainted(false);
        jButton23.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 90, 30));

        jButton17.setBackground(new java.awt.Color(60, 0, 91));
        jButton17.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jButton17.setForeground(new java.awt.Color(1, 1, 1));
        jButton17.setText("مرحله بعد");
        jButton17.setFocusPainted(false);
        jButton17.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 90, 30));

        jLabel30.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("لطفا برچسب را انتخاب کنید");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 200, -1));

        jButton20.setBackground(new java.awt.Color(60, 0, 91));
        jButton20.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jButton20.setForeground(new java.awt.Color(1, 1, 1));
        jButton20.setText("پیش‌خوان");
        jButton20.setFocusPainted(false);
        jButton20.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 90, 30));

        jPanel13.setBackground(new java.awt.Color(205, 205, 205));
        jPanel13.setLayout(null);

        jLabel44.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("2");
        jPanel13.add(jLabel44);
        jLabel44.setBounds(350, 0, 60, 30);

        jLabel45.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("مکان‌مند");
        jPanel13.add(jLabel45);
        jLabel45.setBounds(270, 0, 60, 30);

        jButton2.setForeground(new java.awt.Color(215, 215, 215));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/close-24-outside.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jPanel13.add(jButton2);
        jButton2.setBounds(10, 0, 58, 30);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/file_edit.png"))); // NOI18N
        jButton8.setBorderPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton8);
        jButton8.setBounds(90, 0, 50, 30);

        jLabel46.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("ساده");
        jPanel13.add(jLabel46);
        jLabel46.setBounds(180, 0, 60, 30);

        getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 410, 30));

        jPanel14.setBackground(new java.awt.Color(160, 196, 255));
        jPanel14.setLayout(null);

        jLabel47.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("ردیف");
        jPanel14.add(jLabel47);
        jLabel47.setBounds(350, 0, 60, 40);

        jLabel48.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("نام برچسب");
        jPanel14.add(jLabel48);
        jLabel48.setBounds(270, 0, 60, 40);

        jLabel49.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("مرکب/ساده");
        jPanel14.add(jLabel49);
        jLabel49.setBounds(160, 0, 90, 40);

        jLabel50.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("ویرایش");
        jPanel14.add(jLabel50);
        jLabel50.setBounds(70, 0, 90, 40);

        jLabel51.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("حذف");
        jPanel14.add(jLabel51);
        jLabel51.setBounds(0, 0, 90, 40);

        getContentPane().add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 410, 40));

        jPanel15.setBackground(new java.awt.Color(254, 254, 254));
        jPanel15.setLayout(null);

        jLabel52.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("۱");
        jPanel15.add(jLabel52);
        jLabel52.setBounds(350, 0, 60, 30);

        jButton37.setForeground(new java.awt.Color(215, 215, 215));
        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/close-24-outside.png"))); // NOI18N
        jButton37.setBorder(null);
        jButton37.setBorderPainted(false);
        jPanel15.add(jButton37);
        jButton37.setBounds(10, 0, 58, 30);

        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/file_edit.png"))); // NOI18N
        jButton38.setBorderPainted(false);
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton38);
        jButton38.setBounds(90, 0, 50, 30);

        jLabel53.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("خیابان");
        jPanel15.add(jLabel53);
        jLabel53.setBounds(270, 0, 60, 30);

        jLabel54.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("مرکب");
        jPanel15.add(jLabel54);
        jLabel54.setBounds(180, 0, 60, 30);

        getContentPane().add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 410, 30));

        jPanel16.setBackground(new java.awt.Color(205, 205, 205));
        jPanel16.setLayout(null);

        jLabel55.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("4");
        jPanel16.add(jLabel55);
        jLabel55.setBounds(350, 0, 60, 30);

        jLabel56.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("دوربین");
        jPanel16.add(jLabel56);
        jLabel56.setBounds(270, 0, 60, 30);

        jButton39.setForeground(new java.awt.Color(215, 215, 215));
        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/close-24-outside.png"))); // NOI18N
        jButton39.setBorder(null);
        jButton39.setBorderPainted(false);
        jPanel16.add(jButton39);
        jButton39.setBounds(10, 0, 58, 30);

        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/file_edit.png"))); // NOI18N
        jButton40.setBorderPainted(false);
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton40);
        jButton40.setBounds(90, 0, 50, 30);

        jLabel57.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("ساده");
        jPanel16.add(jLabel57);
        jLabel57.setBounds(180, 0, 60, 30);

        getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 410, 30));

        jPanel17.setBackground(new java.awt.Color(254, 254, 254));
        jPanel17.setLayout(null);

        jLabel58.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("3");
        jPanel17.add(jLabel58);
        jLabel58.setBounds(350, 0, 60, 30);

        jButton41.setForeground(new java.awt.Color(215, 215, 215));
        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/close-24-outside.png"))); // NOI18N
        jButton41.setBorder(null);
        jButton41.setBorderPainted(false);
        jPanel17.add(jButton41);
        jButton41.setBounds(10, 0, 58, 30);

        jButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/file_edit.png"))); // NOI18N
        jButton42.setBorderPainted(false);
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton42);
        jButton42.setBounds(90, 0, 50, 30);

        jLabel59.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("خطکشی");
        jPanel17.add(jLabel59);
        jLabel59.setBounds(270, 0, 60, 30);

        jLabel60.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("ساده");
        jPanel17.add(jLabel60);
        jLabel60.setBounds(180, 0, 60, 30);

        getContentPane().add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 410, 30));

        jPanel18.setBackground(new java.awt.Color(205, 205, 205));
        jPanel18.setLayout(null);

        jLabel61.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("۶");
        jPanel18.add(jLabel61);
        jLabel61.setBounds(350, 0, 60, 30);

        jLabel62.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("دوربین");
        jPanel18.add(jLabel62);
        jLabel62.setBounds(270, 0, 60, 30);

        jButton43.setForeground(new java.awt.Color(215, 215, 215));
        jButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/close-24-outside.png"))); // NOI18N
        jButton43.setBorder(null);
        jButton43.setBorderPainted(false);
        jPanel18.add(jButton43);
        jButton43.setBounds(10, 0, 58, 30);

        jButton44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/file_edit.png"))); // NOI18N
        jButton44.setBorderPainted(false);
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton44);
        jButton44.setBounds(90, 0, 50, 30);

        jLabel63.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("ساده");
        jPanel18.add(jLabel63);
        jLabel63.setBounds(180, 0, 60, 30);

        getContentPane().add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 410, 30));

        jPanel19.setBackground(new java.awt.Color(254, 254, 254));
        jPanel19.setLayout(null);

        jLabel64.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("۵");
        jPanel19.add(jLabel64);
        jLabel64.setBounds(350, 0, 60, 30);

        jButton45.setForeground(new java.awt.Color(215, 215, 215));
        jButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/close-24-outside.png"))); // NOI18N
        jButton45.setBorder(null);
        jButton45.setBorderPainted(false);
        jPanel19.add(jButton45);
        jButton45.setBounds(10, 0, 58, 30);

        jButton46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/file_edit.png"))); // NOI18N
        jButton46.setBorderPainted(false);
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton46);
        jButton46.setBounds(90, 0, 50, 30);

        jLabel65.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("خطکشی");
        jPanel19.add(jLabel65);
        jLabel65.setBounds(270, 0, 60, 30);

        jLabel66.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("ساده");
        jPanel19.add(jLabel66);
        jLabel66.setBounds(180, 0, 60, 30);

        getContentPane().add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 410, 30));
        getContentPane().add(jScrollBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, -1, 310));

        jPanel20.setBackground(new java.awt.Color(205, 205, 205));
        jPanel20.setLayout(null);

        jLabel67.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("۸");
        jPanel20.add(jLabel67);
        jLabel67.setBounds(350, 0, 60, 30);

        jLabel68.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("دوربین");
        jPanel20.add(jLabel68);
        jLabel68.setBounds(270, 0, 60, 30);

        jButton47.setForeground(new java.awt.Color(215, 215, 215));
        jButton47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/close-24-outside.png"))); // NOI18N
        jButton47.setBorder(null);
        jButton47.setBorderPainted(false);
        jPanel20.add(jButton47);
        jButton47.setBounds(10, 0, 58, 30);

        jButton48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/file_edit.png"))); // NOI18N
        jButton48.setBorderPainted(false);
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton48);
        jButton48.setBounds(90, 0, 50, 30);

        jLabel69.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("ساده");
        jPanel20.add(jLabel69);
        jLabel69.setBounds(180, 0, 60, 30);

        getContentPane().add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 410, 30));

        jPanel21.setBackground(new java.awt.Color(254, 254, 254));
        jPanel21.setLayout(null);

        jLabel70.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("۷");
        jPanel21.add(jLabel70);
        jLabel70.setBounds(350, 0, 60, 30);

        jButton49.setForeground(new java.awt.Color(215, 215, 215));
        jButton49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/close-24-outside.png"))); // NOI18N
        jButton49.setBorder(null);
        jButton49.setBorderPainted(false);
        jPanel21.add(jButton49);
        jButton49.setBounds(10, 0, 58, 30);

        jButton50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/file_edit.png"))); // NOI18N
        jButton50.setBorderPainted(false);
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton50);
        jButton50.setBounds(90, 0, 50, 30);

        jLabel71.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("خطکشی");
        jPanel21.add(jLabel71);
        jLabel71.setBounds(270, 0, 60, 30);

        jLabel72.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("ساده");
        jPanel21.add(jLabel72);
        jLabel72.setBounds(180, 0, 60, 30);

        getContentPane().add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 410, 30));

        jPanel23.setBackground(new java.awt.Color(254, 254, 254));
        jPanel23.setLayout(null);

        jLabel76.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setText("۹");
        jPanel23.add(jLabel76);
        jLabel76.setBounds(350, 0, 60, 30);

        jButton53.setForeground(new java.awt.Color(215, 215, 215));
        jButton53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/close-24-outside.png"))); // NOI18N
        jButton53.setBorder(null);
        jButton53.setBorderPainted(false);
        jPanel23.add(jButton53);
        jButton53.setBounds(10, 0, 58, 30);

        jButton54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/file_edit.png"))); // NOI18N
        jButton54.setBorderPainted(false);
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });
        jPanel23.add(jButton54);
        jButton54.setBounds(90, 0, 50, 30);

        jLabel77.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("خطکشی");
        jPanel23.add(jLabel77);
        jLabel77.setBounds(270, 0, 60, 30);

        jLabel78.setFont(new java.awt.Font("Web Yekan", 0, 15)); // NOI18N
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setText("ساده");
        jPanel23.add(jLabel78);
        jLabel78.setBounds(180, 0, 60, 30);

        getContentPane().add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 410, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton54ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AssetAddLabelFrameStep2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollBar jScrollBar2;
    // End of variables declaration//GEN-END:variables
}
