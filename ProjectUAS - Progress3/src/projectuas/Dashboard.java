/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package projectuas;

import projectuas.ModelCard;
import javax.swing.ImageIcon;

public class Dashboard extends javax.swing.JPanel {


    public Dashboard() {
        initComponents();
        card1.setData(new ModelCard(new ImageIcon(getClass().getResource("/img/Book_1.png")), "Jumlah Buku SIBoox", "450"));
        card2.setData(new ModelCard(new ImageIcon(getClass().getResource("/img/Literature_1.png")), "Jumlah Skripsi SIBoox", "450"));
        card3.setData(new ModelCard(new ImageIcon(getClass().getResource("/img/pinjam_1.png")), "Jumlah Peminjaman SIBoox", "450"));
        card4.setData(new ModelCard(new ImageIcon(getClass().getResource("/img/pengembalian_1.png")), "Jumlah Pengembalian SIBoox", "450"));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel1 = new javax.swing.JLayeredPane();
        card1 = new projectuas.Card();
        card2 = new projectuas.Card();
        panel2 = new javax.swing.JLayeredPane();
        card3 = new projectuas.Card();
        card4 = new projectuas.Card();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(637, 485));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panel1.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        card1.setColor1(new java.awt.Color(0, 0, 102));
        card1.setColor2(new java.awt.Color(0, 153, 255));
        panel1.add(card1);

        card2.setColor1(new java.awt.Color(0, 0, 102));
        card2.setColor2(new java.awt.Color(0, 153, 255));
        panel1.add(card2);

        panel2.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        card3.setColor1(new java.awt.Color(0, 0, 102));
        card3.setColor2(new java.awt.Color(0, 153, 255));
        panel2.add(card3);

        card4.setColor1(new java.awt.Color(0, 0, 102));
        card4.setColor2(new java.awt.Color(0, 153, 255));
        panel2.add(card4);

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Home > Dashboard");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1036, Short.MAX_VALUE)
                            .addComponent(panel1))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private projectuas.Card card1;
    private projectuas.Card card2;
    private projectuas.Card card3;
    private projectuas.Card card4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLayeredPane panel1;
    private javax.swing.JLayeredPane panel2;
    // End of variables declaration//GEN-END:variables
}
