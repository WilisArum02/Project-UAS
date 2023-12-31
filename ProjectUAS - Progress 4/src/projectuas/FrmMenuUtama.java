/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectuas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
//import projectuas.FrmBuku;

/**
 *
 * @author HP
 */
public class FrmMenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenuUtama
     */
    public FrmMenuUtama() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
        execute();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelNavbar = new javax.swing.JPanel();
        jPanelGradient2 = new custom.JPanelGradient();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanelSidebar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelMenu = new javax.swing.JPanel();
        jPanelUser = new javax.swing.JPanel();
        jLabeliconUser = new javax.swing.JLabel();
        jLabelNamaPengguna = new javax.swing.JLabel();
        jLabelLevel = new javax.swing.JLabel();
        jPanelContent = new javax.swing.JPanel();
        jPanelUtama = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanelNavbar.setBackground(new java.awt.Color(0, 0, 102));
        jPanelNavbar.setPreferredSize(new java.awt.Dimension(647, 80));

        jPanelGradient2.setColorEnd(new java.awt.Color(0, 153, 255));
        jPanelGradient2.setColorStart(new java.awt.Color(0, 0, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo_buku_1.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("SIBoox");

        javax.swing.GroupLayout jPanelGradient2Layout = new javax.swing.GroupLayout(jPanelGradient2);
        jPanelGradient2.setLayout(jPanelGradient2Layout);
        jPanelGradient2Layout.setHorizontalGroup(
            jPanelGradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGradient2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1145, 1145, 1145))
        );
        jPanelGradient2Layout.setVerticalGroup(
            jPanelGradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGradient2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanelGradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanelNavbarLayout = new javax.swing.GroupLayout(jPanelNavbar);
        jPanelNavbar.setLayout(jPanelNavbarLayout);
        jPanelNavbarLayout.setHorizontalGroup(
            jPanelNavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGradient2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelNavbarLayout.setVerticalGroup(
            jPanelNavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGradient2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelNavbar, java.awt.BorderLayout.PAGE_START);

        jPanelSidebar.setBackground(new java.awt.Color(255, 255, 255));
        jPanelSidebar.setPreferredSize(new java.awt.Dimension(250, 326));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(200, 100));

        jPanelMenu.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMenu.setLayout(new javax.swing.BoxLayout(jPanelMenu, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(jPanelMenu);

        jPanelUser.setBackground(new java.awt.Color(255, 255, 255));

        jLabeliconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Akun.png"))); // NOI18N

        jLabelNamaPengguna.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNamaPengguna.setForeground(new java.awt.Color(0, 0, 102));
        jLabelNamaPengguna.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNamaPengguna.setText("Nama Pengguna");

        jLabelLevel.setForeground(new java.awt.Color(0, 0, 102));
        jLabelLevel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLevel.setText("Level");

        javax.swing.GroupLayout jPanelUserLayout = new javax.swing.GroupLayout(jPanelUser);
        jPanelUser.setLayout(jPanelUserLayout);
        jPanelUserLayout.setHorizontalGroup(
            jPanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUserLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUserLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabeliconUser))
                    .addComponent(jLabelNamaPengguna)
                    .addGroup(jPanelUserLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabelLevel)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanelUserLayout.setVerticalGroup(
            jPanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUserLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabeliconUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNamaPengguna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLevel)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelSidebarLayout = new javax.swing.GroupLayout(jPanelSidebar);
        jPanelSidebar.setLayout(jPanelSidebarLayout);
        jPanelSidebarLayout.setHorizontalGroup(
            jPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelSidebarLayout.setVerticalGroup(
            jPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSidebarLayout.createSequentialGroup()
                .addComponent(jPanelUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelSidebar, java.awt.BorderLayout.LINE_START);

        jPanelContent.setBackground(new java.awt.Color(250, 250, 250));

        jPanelUtama.setBackground(new java.awt.Color(255, 255, 255));
        jPanelUtama.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanelContentLayout = new javax.swing.GroupLayout(jPanelContent);
        jPanelContent.setLayout(jPanelContentLayout);
        jPanelContentLayout.setHorizontalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        jPanelContentLayout.setVerticalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanelContent, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1380, 773));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jPanelUtama.add(new Dashboard());
        jPanelUtama.repaint();
        jPanelUtama.revalidate();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FrmMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelLevel;
    private javax.swing.JLabel jLabelNamaPengguna;
    private javax.swing.JLabel jLabeliconUser;
    private javax.swing.JPanel jPanelContent;
    private custom.JPanelGradient jPanelGradient2;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelNavbar;
    private javax.swing.JPanel jPanelSidebar;
    private javax.swing.JPanel jPanelUser;
    private javax.swing.JPanel jPanelUtama;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void execute() {
        ImageIcon iconKoleksi = new ImageIcon(getClass().getResource("/img/Book_Shelf.png"));
        ImageIcon iconReport = new ImageIcon(getClass().getResource("/img/Print.png"));
        ImageIcon iconBuku = new ImageIcon(getClass().getResource("/img/Book.png"));
        ImageIcon iconSkripsi = new ImageIcon(getClass().getResource("/img/Literature.png"));
        ImageIcon iconTransaksi = new ImageIcon(getClass().getResource("/img/transaksi.png"));
        ImageIcon iconPeminjaman = new ImageIcon(getClass().getResource("/img/pinjam.png"));
        ImageIcon iconPengembalian = new ImageIcon(getClass().getResource("/img/pengembalian.png"));
        ImageIcon iconLogout = new ImageIcon(getClass().getResource("/img/Logout.png"));
        ImageIcon iconDashboard = new ImageIcon(getClass().getResource("/img/Dashboard.png"));
        ImageIcon iconKategori = new ImageIcon(getClass().getResource("/img/Category20.png"));
        
        
        MenuItem buku;
        buku = new MenuItem(null, true, iconBuku, "Buku", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanelUtama.removeAll();
                jPanelUtama.add(new MenuBuku());
                jPanelUtama.repaint();
                jPanelUtama.revalidate(); 
            }
        });
        
        MenuItem skripsi;
        skripsi = new MenuItem(null, true, iconSkripsi, "Skripsi", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanelUtama.removeAll();
                jPanelUtama.add(new MenuSkripsi());
                jPanelUtama.repaint();
                jPanelUtama.revalidate();             
            }
        });
        
        MenuItem kategori;
        kategori = new MenuItem(null, true, iconKategori, "Kategori", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanelUtama.removeAll();
                jPanelUtama.add(new MenuKategori());
                jPanelUtama.repaint();
                jPanelUtama.revalidate();
            }
        });
        
        MenuItem peminjaman = new MenuItem(null, true, iconPeminjaman, "Peminjaman", null);
        MenuItem pengembalian = new MenuItem(null, true, iconPengembalian, "Pengembalian", null);
        
        MenuItem bukuReport;
        bukuReport = new MenuItem(null, true, iconBuku, "Buku", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanelUtama.removeAll();
                jPanelUtama.add(new ReportBuku());
                jPanelUtama.repaint();
                jPanelUtama.revalidate(); 
            }
        });
        
        MenuItem skripsiReport;
        skripsiReport = new MenuItem(null, true, iconSkripsi, "Skripsi", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanelUtama.removeAll();
                jPanelUtama.add(new ReportSkripsi());
                jPanelUtama.repaint();
                jPanelUtama.revalidate(); 
            }
        });
        
        
        MenuItem menuDashboard = new MenuItem(iconDashboard, false, null, "Dashboard", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanelUtama.removeAll();
                jPanelUtama.add(new Dashboard());
                jPanelUtama.repaint();
                jPanelUtama.revalidate();            
            }
        });
        
         
        MenuItem menuKoleksi = new MenuItem(iconKoleksi, false, null, "Koleksi", null, buku, skripsi, kategori);
        MenuItem menuTransaksi = new MenuItem(iconTransaksi, false, null, "Transaksi", null, peminjaman, pengembalian);
        MenuItem menuReport = new MenuItem(iconReport, false, null, "Cetak", null, bukuReport, skripsiReport);
        MenuItem menuLogout = new MenuItem(iconLogout, false, null, "Logout", null);

        
        addMenu(menuDashboard, menuKoleksi,menuTransaksi, menuReport, menuLogout);

    }
    
    private void addMenu(MenuItem...menu){
        for(int i = 0; i < menu.length; i++){
            jPanelMenu.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for (MenuItem m : subMenu){
                addMenu (m);
            }
        }
        jPanelMenu.revalidate();
    }
}
