package pizzagui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PizzaGui extends javax.swing.JFrame {

    public PizzaGui() {
        initComponents();
    }
    
    
    DefaultTableModel model = new DefaultTableModel();
    String Tészta;
    String Alapszósz;
    String Méretek;
    String Feltétek;
    String y1;
    String y2;
    String y3;
    String y4;
    String y5;
    String y6;
    String y7;
    String y8;
    String y9;
    String t1;
    String t2;
    String t3;
    String sz1;
    String sz2;
    String sz3;
    int tpizza;
    int tpizza1;
    int tpizza2;
    int tpizza3;
    int szpizza;
    int szpizza1;
    int szpizza2;
    int szpizza3;
    int Darabszám;
    int Fizetendő;
    int Összeg;
    int x1;
    int x2;
    int x3;
    int x4;
    int x5;
    int x6;
    int x7;
    int x8;
    int x9;
    int Feltétösszeg = x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        txtfl1 = new javax.swing.JTextField();
        pnlfejleckulso = new javax.swing.JPanel();
        pnlfejlecbelso = new javax.swing.JPanel();
        txtugyfelszolgalat = new javax.swing.JLabel();
        txtnyitvatartas = new javax.swing.JLabel();
        txtpizzakep = new javax.swing.JLabel();
        txtfocim = new javax.swing.JLabel();
        pnlpizzatesztak = new javax.swing.JPanel();
        pnlpizzatesztakbelso = new javax.swing.JPanel();
        txtpizzatesztak = new javax.swing.JLabel();
        tgbtnpizzatesztak1 = new javax.swing.JToggleButton();
        tgbtnpizzatesztak2 = new javax.swing.JToggleButton();
        tgbtnpizzatesztak3 = new javax.swing.JToggleButton();
        pnlpizzameretek = new javax.swing.JPanel();
        pnlpizzameretekbelso = new javax.swing.JPanel();
        txtpizzameretek = new javax.swing.JLabel();
        pnlmeretek2 = new javax.swing.JPanel();
        rdbtnmeretek2 = new javax.swing.JRadioButton();
        pnlmeretek1 = new javax.swing.JPanel();
        rdbtnmeretek1 = new javax.swing.JRadioButton();
        pnlmeretek3 = new javax.swing.JPanel();
        rdbtnmeretek3 = new javax.swing.JRadioButton();
        pnlpizzafeltetek = new javax.swing.JPanel();
        pnlpizzafeltetekbelso = new javax.swing.JPanel();
        txtfeltetek = new javax.swing.JLabel();
        pnlfeltetek1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        pnlfeltetek2 = new javax.swing.JPanel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        pnlfeltetek3 = new javax.swing.JPanel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        pnlpizzaalapszoszok = new javax.swing.JPanel();
        pnlpizzaalapszoszokbelso = new javax.swing.JPanel();
        txtalapszoszok = new javax.swing.JLabel();
        tgbtnalapszoszok1 = new javax.swing.JToggleButton();
        tgbtnalapszoszok2 = new javax.swing.JToggleButton();
        tgbtnalapszoszok3 = new javax.swing.JToggleButton();
        pnlpizzadarab = new javax.swing.JPanel();
        pnlpizzadarabbelso = new javax.swing.JPanel();
        txtdarab = new javax.swing.JLabel();
        spnrdarab = new javax.swing.JSpinner();
        pnlgombok = new javax.swing.JPanel();
        btntorles = new javax.swing.JButton();
        btnrendel = new javax.swing.JButton();
        btnhozzaad = new javax.swing.JButton();
        btntorles1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        txtfl1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pizza Hub - Pizzarendelés");
        setBackground(java.awt.Color.black);
        setForeground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(3, 3));

        pnlfejleckulso.setBackground(new java.awt.Color(255, 249, 242));
        pnlfejleckulso.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pnlfejlecbelso.setBackground(new java.awt.Color(255, 255, 255));
        pnlfejlecbelso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        txtugyfelszolgalat.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtugyfelszolgalat.setText("Ügyfélszolgálat: 0630/ 388-3882");

        txtnyitvatartas.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtnyitvatartas.setText("Nyitvatartás: 07:00 - 19:00");

        txtpizzakep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzagui/pizzakep.png"))); // NOI18N

        txtfocim.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        txtfocim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtfocim.setText("<html><u>Pizza Hub  -  Pizzarendelés</u></html>");

        javax.swing.GroupLayout pnlfejlecbelsoLayout = new javax.swing.GroupLayout(pnlfejlecbelso);
        pnlfejlecbelso.setLayout(pnlfejlecbelsoLayout);
        pnlfejlecbelsoLayout.setHorizontalGroup(
            pnlfejlecbelsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlfejlecbelsoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtpizzakep)
                .addGap(37, 37, 37)
                .addComponent(txtfocim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(pnlfejlecbelsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtugyfelszolgalat)
                    .addComponent(txtnyitvatartas))
                .addGap(15, 15, 15))
        );
        pnlfejlecbelsoLayout.setVerticalGroup(
            pnlfejlecbelsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlfejlecbelsoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlfejlecbelsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtpizzakep)
                    .addGroup(pnlfejlecbelsoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtugyfelszolgalat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnyitvatartas)))
                .addGap(15, 15, 15))
            .addGroup(pnlfejlecbelsoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtfocim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlfejleckulsoLayout = new javax.swing.GroupLayout(pnlfejleckulso);
        pnlfejleckulso.setLayout(pnlfejleckulsoLayout);
        pnlfejleckulsoLayout.setHorizontalGroup(
            pnlfejleckulsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlfejleckulsoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlfejlecbelso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlfejleckulsoLayout.setVerticalGroup(
            pnlfejleckulsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlfejleckulsoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlfejlecbelso, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlpizzatesztak.setBackground(new java.awt.Color(255, 249, 242));
        pnlpizzatesztak.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlpizzatesztak.setPreferredSize(new java.awt.Dimension(410, 186));

        pnlpizzatesztakbelso.setBackground(new java.awt.Color(255, 255, 255));
        pnlpizzatesztakbelso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        txtpizzatesztak.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        txtpizzatesztak.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtpizzatesztak.setText("Pizza Tészták");

        javax.swing.GroupLayout pnlpizzatesztakbelsoLayout = new javax.swing.GroupLayout(pnlpizzatesztakbelso);
        pnlpizzatesztakbelso.setLayout(pnlpizzatesztakbelsoLayout);
        pnlpizzatesztakbelsoLayout.setHorizontalGroup(
            pnlpizzatesztakbelsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlpizzatesztakbelsoLayout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addComponent(txtpizzatesztak)
                .addGap(134, 134, 134))
        );
        pnlpizzatesztakbelsoLayout.setVerticalGroup(
            pnlpizzatesztakbelsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlpizzatesztakbelsoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtpizzatesztak)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        tgbtnpizzatesztak1.setBackground(new java.awt.Color(255, 249, 242));
        buttonGroup1.add(tgbtnpizzatesztak1);
        tgbtnpizzatesztak1.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        tgbtnpizzatesztak1.setText("Vékony");
        tgbtnpizzatesztak1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbtnpizzatesztak1ActionPerformed(evt);
            }
        });

        tgbtnpizzatesztak2.setBackground(new java.awt.Color(255, 249, 242));
        buttonGroup1.add(tgbtnpizzatesztak2);
        tgbtnpizzatesztak2.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        tgbtnpizzatesztak2.setText("Vastag");
        tgbtnpizzatesztak2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbtnpizzatesztak2ActionPerformed(evt);
            }
        });

        tgbtnpizzatesztak3.setBackground(new java.awt.Color(255, 249, 242));
        buttonGroup1.add(tgbtnpizzatesztak3);
        tgbtnpizzatesztak3.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        tgbtnpizzatesztak3.setText("<html>Sajttal<br>Töltött</html>");
        tgbtnpizzatesztak3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbtnpizzatesztak3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlpizzatesztakLayout = new javax.swing.GroupLayout(pnlpizzatesztak);
        pnlpizzatesztak.setLayout(pnlpizzatesztakLayout);
        pnlpizzatesztakLayout.setHorizontalGroup(
            pnlpizzatesztakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlpizzatesztakLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlpizzatesztakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlpizzatesztakLayout.createSequentialGroup()
                        .addComponent(tgbtnpizzatesztak1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tgbtnpizzatesztak2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tgbtnpizzatesztak3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(pnlpizzatesztakLayout.createSequentialGroup()
                        .addComponent(pnlpizzatesztakbelso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlpizzatesztakLayout.setVerticalGroup(
            pnlpizzatesztakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlpizzatesztakLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlpizzatesztakbelso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlpizzatesztakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tgbtnpizzatesztak1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tgbtnpizzatesztak2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlpizzatesztakLayout.createSequentialGroup()
                        .addComponent(tgbtnpizzatesztak3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnlpizzameretek.setBackground(new java.awt.Color(255, 249, 242));
        pnlpizzameretek.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlpizzameretek.setPreferredSize(new java.awt.Dimension(270, 4));

        pnlpizzameretekbelso.setBackground(new java.awt.Color(255, 255, 255));
        pnlpizzameretekbelso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        pnlpizzameretekbelso.setPreferredSize(new java.awt.Dimension(175, 47));

        txtpizzameretek.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        txtpizzameretek.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtpizzameretek.setText("Méretek");

        javax.swing.GroupLayout pnlpizzameretekbelsoLayout = new javax.swing.GroupLayout(pnlpizzameretekbelso);
        pnlpizzameretekbelso.setLayout(pnlpizzameretekbelsoLayout);
        pnlpizzameretekbelsoLayout.setHorizontalGroup(
            pnlpizzameretekbelsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlpizzameretekbelsoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtpizzameretek)
                .addGap(88, 88, 88))
        );
        pnlpizzameretekbelsoLayout.setVerticalGroup(
            pnlpizzameretekbelsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlpizzameretekbelsoLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(txtpizzameretek)
                .addGap(11, 11, 11))
        );

        pnlmeretek2.setBackground(new java.awt.Color(255, 255, 255));
        pnlmeretek2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlmeretek2.setPreferredSize(new java.awt.Dimension(153, 46));

        buttonGroup3.add(rdbtnmeretek2);
        rdbtnmeretek2.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        rdbtnmeretek2.setText("  Nagy - 32cm");
        rdbtnmeretek2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rdbtnmeretek2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        rdbtnmeretek2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnmeretek2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlmeretek2Layout = new javax.swing.GroupLayout(pnlmeretek2);
        pnlmeretek2.setLayout(pnlmeretek2Layout);
        pnlmeretek2Layout.setHorizontalGroup(
            pnlmeretek2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlmeretek2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbtnmeretek2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlmeretek2Layout.setVerticalGroup(
            pnlmeretek2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlmeretek2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbtnmeretek2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlmeretek1.setBackground(new java.awt.Color(255, 255, 255));
        pnlmeretek1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup3.add(rdbtnmeretek1);
        rdbtnmeretek1.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        rdbtnmeretek1.setText("  Kicsi - 25cm");
        rdbtnmeretek1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rdbtnmeretek1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        rdbtnmeretek1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnmeretek1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlmeretek1Layout = new javax.swing.GroupLayout(pnlmeretek1);
        pnlmeretek1.setLayout(pnlmeretek1Layout);
        pnlmeretek1Layout.setHorizontalGroup(
            pnlmeretek1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlmeretek1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbtnmeretek1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlmeretek1Layout.setVerticalGroup(
            pnlmeretek1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlmeretek1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbtnmeretek1)
                .addContainerGap())
        );

        pnlmeretek3.setBackground(new java.awt.Color(255, 255, 255));
        pnlmeretek3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlmeretek3.setPreferredSize(new java.awt.Dimension(153, 46));

        buttonGroup3.add(rdbtnmeretek3);
        rdbtnmeretek3.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        rdbtnmeretek3.setText("  Családi - 50cm");
        rdbtnmeretek3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rdbtnmeretek3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        rdbtnmeretek3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnmeretek3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlmeretek3Layout = new javax.swing.GroupLayout(pnlmeretek3);
        pnlmeretek3.setLayout(pnlmeretek3Layout);
        pnlmeretek3Layout.setHorizontalGroup(
            pnlmeretek3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlmeretek3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbtnmeretek3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlmeretek3Layout.setVerticalGroup(
            pnlmeretek3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlmeretek3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbtnmeretek3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlpizzameretekLayout = new javax.swing.GroupLayout(pnlpizzameretek);
        pnlpizzameretek.setLayout(pnlpizzameretekLayout);
        pnlpizzameretekLayout.setHorizontalGroup(
            pnlpizzameretekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlpizzameretekLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlpizzameretekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlpizzameretekbelso, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(pnlmeretek2, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(pnlmeretek1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlmeretek3, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlpizzameretekLayout.setVerticalGroup(
            pnlpizzameretekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlpizzameretekLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlpizzameretekbelso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlmeretek1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlmeretek2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlmeretek3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlpizzafeltetek.setBackground(new java.awt.Color(255, 249, 242));
        pnlpizzafeltetek.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlpizzafeltetek.setPreferredSize(new java.awt.Dimension(270, 323));

        pnlpizzafeltetekbelso.setBackground(new java.awt.Color(255, 255, 255));
        pnlpizzafeltetekbelso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        pnlpizzafeltetekbelso.setPreferredSize(new java.awt.Dimension(0, 47));

        txtfeltetek.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        txtfeltetek.setText("Feltétek");

        javax.swing.GroupLayout pnlpizzafeltetekbelsoLayout = new javax.swing.GroupLayout(pnlpizzafeltetekbelso);
        pnlpizzafeltetekbelso.setLayout(pnlpizzafeltetekbelsoLayout);
        pnlpizzafeltetekbelsoLayout.setHorizontalGroup(
            pnlpizzafeltetekbelsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlpizzafeltetekbelsoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtfeltetek)
                .addGap(222, 222, 222))
        );
        pnlpizzafeltetekbelsoLayout.setVerticalGroup(
            pnlpizzafeltetekbelsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlpizzafeltetekbelsoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtfeltetek)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pnlfeltetek1.setBackground(new java.awt.Color(255, 255, 255));
        pnlfeltetek1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jCheckBox1.setText("  Sonka");

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jCheckBox2.setText("  Szalámi");

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jCheckBox3.setText("  Sajt");

        javax.swing.GroupLayout pnlfeltetek1Layout = new javax.swing.GroupLayout(pnlfeltetek1);
        pnlfeltetek1.setLayout(pnlfeltetek1Layout);
        pnlfeltetek1Layout.setHorizontalGroup(
            pnlfeltetek1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlfeltetek1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBox2)
                .addGap(96, 96, 96)
                .addComponent(jCheckBox3)
                .addGap(40, 40, 40))
        );
        pnlfeltetek1Layout.setVerticalGroup(
            pnlfeltetek1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlfeltetek1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(pnlfeltetek1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pnlfeltetek2.setBackground(new java.awt.Color(255, 255, 255));
        pnlfeltetek2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlfeltetek2.setPreferredSize(new java.awt.Dimension(530, 47));

        jCheckBox4.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jCheckBox4.setText("  Hagyma");

        jCheckBox5.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jCheckBox5.setText("  Kukorica");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jCheckBox6.setText("  Oliva");

        javax.swing.GroupLayout pnlfeltetek2Layout = new javax.swing.GroupLayout(pnlfeltetek2);
        pnlfeltetek2.setLayout(pnlfeltetek2Layout);
        pnlfeltetek2Layout.setHorizontalGroup(
            pnlfeltetek2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlfeltetek2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jCheckBox4)
                .addGap(106, 106, 106)
                .addComponent(jCheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jCheckBox6)
                .addGap(31, 31, 31))
        );
        pnlfeltetek2Layout.setVerticalGroup(
            pnlfeltetek2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlfeltetek2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(pnlfeltetek2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pnlfeltetek3.setBackground(new java.awt.Color(255, 255, 255));
        pnlfeltetek3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlfeltetek3.setPreferredSize(new java.awt.Dimension(530, 45));

        jCheckBox7.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jCheckBox7.setText("  Gomba");

        jCheckBox8.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jCheckBox8.setText("  Kolbász");

        jCheckBox9.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jCheckBox9.setText("  Bacon");

        javax.swing.GroupLayout pnlfeltetek3Layout = new javax.swing.GroupLayout(pnlfeltetek3);
        pnlfeltetek3.setLayout(pnlfeltetek3Layout);
        pnlfeltetek3Layout.setHorizontalGroup(
            pnlfeltetek3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlfeltetek3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jCheckBox7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBox8)
                .addGap(95, 95, 95)
                .addComponent(jCheckBox9)
                .addGap(21, 21, 21))
        );
        pnlfeltetek3Layout.setVerticalGroup(
            pnlfeltetek3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlfeltetek3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(pnlfeltetek3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox7)
                    .addGroup(pnlfeltetek3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox8)
                        .addComponent(jCheckBox9)))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlpizzafeltetekLayout = new javax.swing.GroupLayout(pnlpizzafeltetek);
        pnlpizzafeltetek.setLayout(pnlpizzafeltetekLayout);
        pnlpizzafeltetekLayout.setHorizontalGroup(
            pnlpizzafeltetekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlpizzafeltetekLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlpizzafeltetekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlpizzafeltetekbelso, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addComponent(pnlfeltetek1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlfeltetek2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlfeltetek3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlpizzafeltetekLayout.setVerticalGroup(
            pnlpizzafeltetekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlpizzafeltetekLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(pnlpizzafeltetekbelso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlfeltetek1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlfeltetek2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlfeltetek3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlpizzaalapszoszok.setBackground(new java.awt.Color(255, 249, 242));
        pnlpizzaalapszoszok.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pnlpizzaalapszoszokbelso.setBackground(new java.awt.Color(255, 255, 255));
        pnlpizzaalapszoszokbelso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        txtalapszoszok.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        txtalapszoszok.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtalapszoszok.setText("Alapszószok");

        javax.swing.GroupLayout pnlpizzaalapszoszokbelsoLayout = new javax.swing.GroupLayout(pnlpizzaalapszoszokbelso);
        pnlpizzaalapszoszokbelso.setLayout(pnlpizzaalapszoszokbelsoLayout);
        pnlpizzaalapszoszokbelsoLayout.setHorizontalGroup(
            pnlpizzaalapszoszokbelsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlpizzaalapszoszokbelsoLayout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addComponent(txtalapszoszok)
                .addGap(134, 134, 134))
        );
        pnlpizzaalapszoszokbelsoLayout.setVerticalGroup(
            pnlpizzaalapszoszokbelsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlpizzaalapszoszokbelsoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtalapszoszok)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        tgbtnalapszoszok1.setBackground(new java.awt.Color(255, 249, 242));
        buttonGroup2.add(tgbtnalapszoszok1);
        tgbtnalapszoszok1.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        tgbtnalapszoszok1.setText("Paradicsom");

        tgbtnalapszoszok2.setBackground(new java.awt.Color(255, 249, 242));
        buttonGroup2.add(tgbtnalapszoszok2);
        tgbtnalapszoszok2.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        tgbtnalapszoszok2.setText("Tejszín");

        tgbtnalapszoszok3.setBackground(new java.awt.Color(255, 249, 242));
        buttonGroup2.add(tgbtnalapszoszok3);
        tgbtnalapszoszok3.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        tgbtnalapszoszok3.setText("Barbecue");

        javax.swing.GroupLayout pnlpizzaalapszoszokLayout = new javax.swing.GroupLayout(pnlpizzaalapszoszok);
        pnlpizzaalapszoszok.setLayout(pnlpizzaalapszoszokLayout);
        pnlpizzaalapszoszokLayout.setHorizontalGroup(
            pnlpizzaalapszoszokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlpizzaalapszoszokLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlpizzaalapszoszokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlpizzaalapszoszokbelso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlpizzaalapszoszokLayout.createSequentialGroup()
                        .addComponent(tgbtnalapszoszok1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tgbtnalapszoszok2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tgbtnalapszoszok3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlpizzaalapszoszokLayout.setVerticalGroup(
            pnlpizzaalapszoszokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlpizzaalapszoszokLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlpizzaalapszoszokbelso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlpizzaalapszoszokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tgbtnalapszoszok1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(tgbtnalapszoszok3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tgbtnalapszoszok2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlpizzadarab.setBackground(new java.awt.Color(255, 249, 242));
        pnlpizzadarab.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pnlpizzadarabbelso.setBackground(new java.awt.Color(255, 255, 255));
        pnlpizzadarabbelso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        pnlpizzadarabbelso.setPreferredSize(new java.awt.Dimension(175, 47));

        txtdarab.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        txtdarab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdarab.setText("Darab");

        javax.swing.GroupLayout pnlpizzadarabbelsoLayout = new javax.swing.GroupLayout(pnlpizzadarabbelso);
        pnlpizzadarabbelso.setLayout(pnlpizzadarabbelsoLayout);
        pnlpizzadarabbelsoLayout.setHorizontalGroup(
            pnlpizzadarabbelsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlpizzadarabbelsoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtdarab)
                .addGap(100, 100, 100))
        );
        pnlpizzadarabbelsoLayout.setVerticalGroup(
            pnlpizzadarabbelsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlpizzadarabbelsoLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(txtdarab)
                .addGap(11, 11, 11))
        );

        spnrdarab.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        spnrdarab.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        javax.swing.GroupLayout pnlpizzadarabLayout = new javax.swing.GroupLayout(pnlpizzadarab);
        pnlpizzadarab.setLayout(pnlpizzadarabLayout);
        pnlpizzadarabLayout.setHorizontalGroup(
            pnlpizzadarabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlpizzadarabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlpizzadarabbelso, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlpizzadarabLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(spnrdarab, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlpizzadarabLayout.setVerticalGroup(
            pnlpizzadarabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlpizzadarabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlpizzadarabbelso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spnrdarab, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlgombok.setBackground(new java.awt.Color(255, 249, 242));
        pnlgombok.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlgombok.setPreferredSize(new java.awt.Dimension(270, 4));

        btntorles.setBackground(new java.awt.Color(255, 235, 230));
        btntorles.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btntorles.setText("Jelölések Törlése");
        btntorles.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btntorles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntorlesActionPerformed(evt);
            }
        });

        btnrendel.setBackground(new java.awt.Color(227, 255, 247));
        btnrendel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnrendel.setText("Rendel");
        btnrendel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnrendel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrendelActionPerformed(evt);
            }
        });

        btnhozzaad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnhozzaad.setText("Kosárhoz Ad");
        btnhozzaad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnhozzaad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhozzaadActionPerformed(evt);
            }
        });

        btntorles1.setBackground(new java.awt.Color(255, 235, 230));
        btntorles1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btntorles1.setText("Kosár Törlése");
        btntorles1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btntorles1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntorles1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlgombokLayout = new javax.swing.GroupLayout(pnlgombok);
        pnlgombok.setLayout(pnlgombokLayout);
        pnlgombokLayout.setHorizontalGroup(
            pnlgombokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlgombokLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlgombokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btntorles, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntorles1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlgombokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnrendel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnhozzaad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlgombokLayout.setVerticalGroup(
            pnlgombokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlgombokLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlgombokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntorles, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhozzaad, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlgombokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnrendel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntorles1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tészta", "Alapszósz", "Méret", "Feltét/ek", "Darab", "Fizetendő"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowSelectionAllowed(false);
        jTable1.setShowGrid(true);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(pnlfejleckulso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlpizzatesztak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlpizzaalapszoszok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlpizzameretek, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(pnlpizzadarab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlpizzafeltetek, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                            .addComponent(pnlgombok, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(pnlfejleckulso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlpizzatesztak, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(pnlpizzaalapszoszok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlpizzameretek, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlpizzafeltetek, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlpizzadarab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlgombok, javax.swing.GroupLayout.PREFERRED_SIZE, 114, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void btntorlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntorlesActionPerformed
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox6.setSelected(false);
        jCheckBox7.setSelected(false);
        jCheckBox8.setSelected(false);
        jCheckBox9.setSelected(false);
        spnrdarab.setValue(0);
    }//GEN-LAST:event_btntorlesActionPerformed

    private void btnrendelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrendelActionPerformed
        int spnrValue = (int) spnrdarab.getValue();
        if(Fizetendő > 0 & x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 > 0 & spnrValue > 0 & tpizza1 + tpizza2 + tpizza3 > 0 & szpizza1 + szpizza2 + szpizza3 > 0){
            int ikon2 = 1;
            JOptionPane.showMessageDialog(null, "Sikeres rendelés!", "Pizza Hub - Pizzarendelés", ikon2);
            System.exit(0);
        }else{
            int ikon = 0;
            JOptionPane.showMessageDialog(null, "Rendelés leadásához kérem állítson össze legalább egy teljes pizzát!\n[Rendelés elkészítésekor csak a teljes pizzákat vesszük figyelembe!]", "Pizza Hub - Pizzarendelés", ikon);
        }
    }//GEN-LAST:event_btnrendelActionPerformed

    private void rdbtnmeretek1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnmeretek1ActionPerformed

    }//GEN-LAST:event_rdbtnmeretek1ActionPerformed

    private void rdbtnmeretek2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnmeretek2ActionPerformed

    }//GEN-LAST:event_rdbtnmeretek2ActionPerformed

    private void rdbtnmeretek3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnmeretek3ActionPerformed

    }//GEN-LAST:event_rdbtnmeretek3ActionPerformed

    private void tgbtnpizzatesztak1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtnpizzatesztak1ActionPerformed

    }//GEN-LAST:event_tgbtnpizzatesztak1ActionPerformed

    private void tgbtnpizzatesztak2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtnpizzatesztak2ActionPerformed
        
    }//GEN-LAST:event_tgbtnpizzatesztak2ActionPerformed

    private void tgbtnpizzatesztak3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtnpizzatesztak3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tgbtnpizzatesztak3ActionPerformed

    private void btnhozzaadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhozzaadActionPerformed
        
        if(tgbtnpizzatesztak1.isSelected() == true)
        {
            t1 = "Vékony";
            tpizza1 = 1;
        }else{
            t1 = "";
            tpizza1 = 0;
        }
        if(tgbtnpizzatesztak2.isSelected() == true)
        {
            t2 = "Vastag";
            tpizza2 = 1;
        }else{
            t2 = "";
            tpizza2 = 0;
        }
        if(tgbtnpizzatesztak3.isSelected() == true)
        {
            t3 = "Sajttal Töltött";
            tpizza3 = 1;
        }else{
            t3 = "";
            tpizza3 = 0;
        }
        
        if(tgbtnalapszoszok1.isSelected() == true)
        {
            sz1 = "Paradicsom";
            szpizza1 = 1;
        }else{
            sz1 = "";
            szpizza1 = 0;
        }
        if(tgbtnalapszoszok2.isSelected() == true)
        {
            sz2 = "Tejszín";
            szpizza2 = 1;
        }else{
            sz2 = "";
            szpizza2 = 0;
        }
        if(tgbtnalapszoszok3.isSelected() == true)
        {
            sz3 = "Barbecue";
            szpizza3 = 1;
        }else{
            sz3 = "";
            szpizza3 = 0;
        }

        if(jCheckBox1.isSelected() == true)
        {
            y1 = "Sonka, ";
            x1 = 100;
        }else{
            y1 = "";
            x1 = 0;
        }
        
        if(jCheckBox2.isSelected() == true)
        {
            y2 = "Szalámi, ";
            x2 = 130;
        }else{
            y2 = "";
            x2 = 0;
        }
        
        if(jCheckBox3.isSelected() == true)
        {
            y3 = "Sajt, ";
            x3 = 50;
        }else{
            y3 = "";
            x3 = 0;
        }
        
        if(jCheckBox4.isSelected() == true)
        {
            y4 = "Hagyma, ";
            x4 = 70;
        }else{
            y4 = "";
            x4 = 0;
        }
        
        if(jCheckBox5.isSelected() == true)
        {
            y5 = "Kukorica, ";
            x5 = 80;
        }else{
            y5 = "";
            x5 = 0;
        }
        
        if(jCheckBox6.isSelected() == true)
        {
            y6 = "Oliva, ";
            x6 = 100;
        }else{
            y6 = "";
            x6 = 0;
        }
        
        if(jCheckBox7.isSelected() == true)
        {
            y7 = "Gomba, ";
            x7 = 90;
        }else{
            y7 = "";
            x7 = 0;
        }
        
        if(jCheckBox8.isSelected() == true)
        {
            y8 = "Kolbász, ";
            x8 = 150;
        }else{
            y8 = "";
            x8 = 0;
        }
        
        if(jCheckBox9.isSelected() == true)
        {
            y9 = "Bacon, ";
            x9 = 120;
        }else{
            y9 = "";
            x9 = 0;
        }
        
        if(rdbtnmeretek1.isSelected() == true)
        {
            Méretek = "Kicsi";
            Fizetendő = 2400;
        }
        else if(rdbtnmeretek2.isSelected() == true)
        {
            Méretek = "Nagy";
            Fizetendő = 3500;
        }
        else if(rdbtnmeretek3.isSelected() == true)
        {
            Méretek = "Családi";
            Fizetendő = 4600;
        }
        else if(rdbtnmeretek1.isSelected() == false)
        {
            Méretek = "";
            Fizetendő = 0;
        }
        
        String Feltétek = y1 + y2 + y3 + y4 + y5 + y6 + y7 + y8 + y9;
        String Tészta = t1 + t2 + t3;
        String Alapszósz = sz1 + sz2 + sz3;
        int Darabszám = Integer.parseInt(spnrdarab.getValue().toString());
        int Feltétösszeg = x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9;
        int tpizza = tpizza1 + tpizza2 + tpizza3;
        int szpizza = szpizza1 + szpizza2 + szpizza3;
        int Összeg = (Darabszám * Fizetendő) + (Darabszám * Feltétösszeg);
        
        model = (DefaultTableModel)jTable1.getModel();
        
        model.addRow(new Object[]
                
        {
            Tészta,
            Alapszósz,
            Méretek,
            Feltétek,
            Darabszám,
            Összeg
            
        });
    }//GEN-LAST:event_btnhozzaadActionPerformed

    private void btntorles1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntorles1ActionPerformed
        jTable1.setModel(new DefaultTableModel(null, new String[]{"Tészta","Alapszósz","Méret","Feltét/ek","Darab","Fizetendő"}));
    }//GEN-LAST:event_btntorles1ActionPerformed

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
            java.util.logging.Logger.getLogger(PizzaGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PizzaGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PizzaGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PizzaGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PizzaGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhozzaad;
    private javax.swing.JButton btnrendel;
    private javax.swing.JButton btntorles;
    private javax.swing.JButton btntorles1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pnlfejlecbelso;
    private javax.swing.JPanel pnlfejleckulso;
    private javax.swing.JPanel pnlfeltetek1;
    private javax.swing.JPanel pnlfeltetek2;
    private javax.swing.JPanel pnlfeltetek3;
    private javax.swing.JPanel pnlgombok;
    private javax.swing.JPanel pnlmeretek1;
    private javax.swing.JPanel pnlmeretek2;
    private javax.swing.JPanel pnlmeretek3;
    private javax.swing.JPanel pnlpizzaalapszoszok;
    private javax.swing.JPanel pnlpizzaalapszoszokbelso;
    private javax.swing.JPanel pnlpizzadarab;
    private javax.swing.JPanel pnlpizzadarabbelso;
    private javax.swing.JPanel pnlpizzafeltetek;
    private javax.swing.JPanel pnlpizzafeltetekbelso;
    private javax.swing.JPanel pnlpizzameretek;
    private javax.swing.JPanel pnlpizzameretekbelso;
    private javax.swing.JPanel pnlpizzatesztak;
    private javax.swing.JPanel pnlpizzatesztakbelso;
    private javax.swing.JRadioButton rdbtnmeretek1;
    private javax.swing.JRadioButton rdbtnmeretek2;
    private javax.swing.JRadioButton rdbtnmeretek3;
    private javax.swing.JSpinner spnrdarab;
    private javax.swing.JToggleButton tgbtnalapszoszok1;
    private javax.swing.JToggleButton tgbtnalapszoszok2;
    private javax.swing.JToggleButton tgbtnalapszoszok3;
    private javax.swing.JToggleButton tgbtnpizzatesztak1;
    private javax.swing.JToggleButton tgbtnpizzatesztak2;
    private javax.swing.JToggleButton tgbtnpizzatesztak3;
    private javax.swing.JLabel txtalapszoszok;
    private javax.swing.JLabel txtdarab;
    private javax.swing.JLabel txtfeltetek;
    private javax.swing.JTextField txtfl1;
    private javax.swing.JLabel txtfocim;
    private javax.swing.JLabel txtnyitvatartas;
    private javax.swing.JLabel txtpizzakep;
    private javax.swing.JLabel txtpizzameretek;
    private javax.swing.JLabel txtpizzatesztak;
    private javax.swing.JLabel txtugyfelszolgalat;
    // End of variables declaration//GEN-END:variables
}
