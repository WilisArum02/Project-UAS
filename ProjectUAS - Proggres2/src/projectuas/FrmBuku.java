/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package projectuas;



import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;



public class FrmBuku extends javax.swing.JPanel {
    
//    private final Connection conn;
//    public FrmBuku(){
//        initComponents();
//        
//        conn = (Connection) Koneksi.getConnection();
//        setTabelModel();
//        loadData();
//    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jPanelView = new javax.swing.JPanel();
        txt_menu1 = new javax.swing.JLabel();
        icon_buku1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableBuku = new javax.swing.JTable();
        txt_judul1 = new javax.swing.JLabel();
        img_logo1 = new javax.swing.JLabel();
        bt_tambah1 = new javax.swing.JButton();
        jTextFieldPencarian1 = new javax.swing.JTextField();
        bt_hapus = new javax.swing.JButton();
        bt_Batal = new javax.swing.JButton();
        jPanelAdd = new javax.swing.JPanel();
        txt_menu = new javax.swing.JLabel();
        icon_buku = new javax.swing.JLabel();
        txt_judul = new javax.swing.JLabel();
        img_logo = new javax.swing.JLabel();
        bt_simpan = new javax.swing.JButton();
        jLabelTahun = new javax.swing.JLabel();
        jTextFieldPenerbit = new javax.swing.JTextField();
        jLabelJumlahHalaman = new javax.swing.JLabel();
        jTextFieldISBN = new javax.swing.JTextField();
        jLabelISBN = new javax.swing.JLabel();
        jTextFieldSubJudul = new javax.swing.JTextField();
        jLabelJudul = new javax.swing.JLabel();
        jTextFieldJudul = new javax.swing.JTextField();
        jLabelSubJudul = new javax.swing.JLabel();
        jLabelPengarang = new javax.swing.JLabel();
        jTextFieldPengarang = new javax.swing.JTextField();
        jLabelPenerbit = new javax.swing.JLabel();
        jTextFieldTahun = new javax.swing.JTextField();
        bt_UploadFile = new javax.swing.JButton();
        bt_batal3 = new javax.swing.JButton();
        jTextFieldJumlahHalaman = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(637, 485));

        jPanelMain.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMain.setLayout(new java.awt.CardLayout());

        jPanelView.setBackground(new java.awt.Color(255, 255, 255));

        txt_menu1.setForeground(new java.awt.Color(102, 102, 102));
        txt_menu1.setText("Home > Koleksi > Buku");

        icon_buku1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Book (1).png"))); // NOI18N

        jTableBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ISBN", "Judul", "Sub_Judul", "Pengarang", "Penerbit", "Tahun", "Jumlah_Halaman"
            }
        ));
        jTableBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBukuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableBuku);

        txt_judul1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_judul1.setForeground(new java.awt.Color(0, 153, 255));
        txt_judul1.setText("Data Buku SIBoox");

        img_logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo_buku_1 (1).png"))); // NOI18N

        bt_tambah1.setBackground(new java.awt.Color(0, 0, 102));
        bt_tambah1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_tambah1.setForeground(new java.awt.Color(0, 153, 255));
        bt_tambah1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Plus.png"))); // NOI18N
        bt_tambah1.setText("Tambah");
        bt_tambah1.setBorder(null);
        bt_tambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_tambah1ActionPerformed(evt);
            }
        });

        jTextFieldPencarian1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jTextFieldPencarian1.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldPencarian1.setText("Pencarian");
        jTextFieldPencarian1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jTextFieldPencarian1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldPencarian1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldPencarian1FocusLost(evt);
            }
        });
        jTextFieldPencarian1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPencarian1ActionPerformed(evt);
            }
        });

        bt_hapus.setBackground(new java.awt.Color(0, 0, 102));
        bt_hapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_hapus.setForeground(new java.awt.Color(0, 153, 255));
        bt_hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Waste.png"))); // NOI18N
        bt_hapus.setText("Hapus");
        bt_hapus.setBorder(null);
        bt_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_hapusActionPerformed(evt);
            }
        });

        bt_Batal.setBackground(new java.awt.Color(0, 0, 102));
        bt_Batal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_Batal.setForeground(new java.awt.Color(0, 153, 255));
        bt_Batal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Restart.png"))); // NOI18N
        bt_Batal.setText("Batal");
        bt_Batal.setBorder(null);
        bt_Batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_BatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelViewLayout = new javax.swing.GroupLayout(jPanelView);
        jPanelView.setLayout(jPanelViewLayout);
        jPanelViewLayout.setHorizontalGroup(
            jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelViewLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
                    .addComponent(jTextFieldPencarian1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelViewLayout.createSequentialGroup()
                        .addComponent(img_logo1)
                        .addGap(5, 5, 5)
                        .addComponent(txt_judul1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(icon_buku1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_menu1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelViewLayout.createSequentialGroup()
                        .addComponent(bt_tambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_Batal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        jPanelViewLayout.setVerticalGroup(
            jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelViewLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon_buku1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(img_logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_judul1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_tambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_Batal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTextFieldPencarian1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
        );

        jPanelMain.add(jPanelView, "card2");

        jPanelAdd.setBackground(new java.awt.Color(255, 255, 255));

        txt_menu.setForeground(new java.awt.Color(102, 102, 102));
        txt_menu.setText("Home > Koleksi > Buku");

        icon_buku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Book (1).png"))); // NOI18N

        txt_judul.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_judul.setForeground(new java.awt.Color(0, 153, 255));
        txt_judul.setText("Tambah Data Buku SIBoox");

        img_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo_buku_1 (1).png"))); // NOI18N

        bt_simpan.setBackground(new java.awt.Color(0, 0, 102));
        bt_simpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_simpan.setForeground(new java.awt.Color(0, 153, 255));
        bt_simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Save.png"))); // NOI18N
        bt_simpan.setText("Simpan");
        bt_simpan.setBorder(null);
        bt_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_simpanActionPerformed(evt);
            }
        });

        jLabelTahun.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelTahun.setText("Tahun");

        jTextFieldPenerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPenerbitActionPerformed(evt);
            }
        });

        jLabelJumlahHalaman.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelJumlahHalaman.setText("Jumlah Halaman");

        jTextFieldISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldISBNActionPerformed(evt);
            }
        });

        jLabelISBN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelISBN.setText("ISBN");
        jLabelISBN.setToolTipText("");
        jLabelISBN.setPreferredSize(new java.awt.Dimension(29, 16));

        jTextFieldSubJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSubJudulActionPerformed(evt);
            }
        });

        jLabelJudul.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelJudul.setText("Judul");

        jTextFieldJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldJudulActionPerformed(evt);
            }
        });

        jLabelSubJudul.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelSubJudul.setText("Sub Judul");

        jLabelPengarang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelPengarang.setText("Pengarang");

        jTextFieldPengarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPengarangActionPerformed(evt);
            }
        });

        jLabelPenerbit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelPenerbit.setText("Penerbit");

        jTextFieldTahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTahunActionPerformed(evt);
            }
        });

        bt_UploadFile.setBackground(new java.awt.Color(0, 0, 102));
        bt_UploadFile.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_UploadFile.setForeground(new java.awt.Color(0, 153, 255));
        bt_UploadFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Add.png"))); // NOI18N
        bt_UploadFile.setText("Upload File");
        bt_UploadFile.setBorder(null);
        bt_UploadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_UploadFileActionPerformed(evt);
            }
        });

        bt_batal3.setBackground(new java.awt.Color(0, 0, 102));
        bt_batal3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_batal3.setForeground(new java.awt.Color(0, 153, 255));
        bt_batal3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Restart.png"))); // NOI18N
        bt_batal3.setText("Batal");
        bt_batal3.setBorder(null);
        bt_batal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_batal3ActionPerformed(evt);
            }
        });

        jTextFieldJumlahHalaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldJumlahHalamanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAddLayout = new javax.swing.GroupLayout(jPanelAdd);
        jPanelAdd.setLayout(jPanelAddLayout);
        jPanelAddLayout.setHorizontalGroup(
            jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddLayout.createSequentialGroup()
                        .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAddLayout.createSequentialGroup()
                                .addComponent(img_logo)
                                .addGap(5, 5, 5)
                                .addComponent(txt_judul)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 563, Short.MAX_VALUE)
                                .addComponent(icon_buku)
                                .addGap(5, 5, 5)
                                .addComponent(txt_menu))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddLayout.createSequentialGroup()
                                .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelJumlahHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldJudul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
                                    .addComponent(jTextFieldSubJudul, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldPengarang, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldPenerbit, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldTahun, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldISBN, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldJumlahHalaman))))
                        .addGap(20, 20, 20))
                    .addGroup(jPanelAddLayout.createSequentialGroup()
                        .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAddLayout.createSequentialGroup()
                                .addComponent(bt_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt_UploadFile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt_batal3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSubJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelAddLayout.setVerticalGroup(
            jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_menu)
                    .addComponent(icon_buku, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(img_logo)
                    .addComponent(txt_judul, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_UploadFile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_batal3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddLayout.createSequentialGroup()
                        .addComponent(jTextFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldJudul)
                            .addComponent(jLabelJudul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldSubJudul)
                            .addComponent(jLabelSubJudul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPengarang)
                            .addComponent(jLabelPengarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabelISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPenerbit)
                    .addComponent(jLabelPenerbit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTahun)
                    .addComponent(jLabelTahun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelJumlahHalaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldJumlahHalaman))
                .addGap(20, 20, 20))
        );

        jPanelMain.add(jPanelAdd, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 1015, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_simpanActionPerformed
    jPanelMain.removeAll();
    jPanelMain.add(jPanelAdd);
    jPanelMain.repaint();
    jPanelMain.revalidate();
    
    

    }//GEN-LAST:event_bt_simpanActionPerformed

    private void bt_tambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_tambah1ActionPerformed
    jPanelMain.removeAll();
    jPanelMain.repaint();
    jPanelMain.revalidate();
    
    jPanelMain.add(jPanelAdd);
    jPanelMain.repaint();
    jPanelMain.revalidate();
    }//GEN-LAST:event_bt_tambah1ActionPerformed

    private void jTextFieldPencarian1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPencarian1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPencarian1FocusGained

    private void jTextFieldPencarian1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPencarian1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPencarian1FocusLost

    private void jTextFieldPencarian1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPencarian1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPencarian1ActionPerformed

    private void jTextFieldPenerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPenerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPenerbitActionPerformed

    private void jTextFieldISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldISBNActionPerformed

    private void jTextFieldSubJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSubJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSubJudulActionPerformed

    private void jTextFieldJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldJudulActionPerformed

    private void jTextFieldPengarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPengarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPengarangActionPerformed

    private void jTextFieldTahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTahunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTahunActionPerformed

    private void bt_UploadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_UploadFileActionPerformed

    }//GEN-LAST:event_bt_UploadFileActionPerformed

    private void bt_batal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_batal3ActionPerformed
    jPanelMain.removeAll();
    jPanelMain.repaint();
    jPanelMain.revalidate();
    
    jPanelMain.add(jPanelView);
    jPanelMain.repaint();
    jPanelMain.revalidate();
        
    }//GEN-LAST:event_bt_batal3ActionPerformed

    private void jTableBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBukuMouseClicked
        
    }//GEN-LAST:event_jTableBukuMouseClicked

    private void jTextFieldJumlahHalamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldJumlahHalamanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldJumlahHalamanActionPerformed

    private void bt_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_hapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_hapusActionPerformed

    private void bt_BatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_BatalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_BatalActionPerformed



    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Batal;
    private javax.swing.JButton bt_UploadFile;
    private javax.swing.JButton bt_batal3;
    private javax.swing.JButton bt_hapus;
    private javax.swing.JButton bt_simpan;
    private javax.swing.JButton bt_tambah1;
    private javax.swing.JLabel icon_buku;
    private javax.swing.JLabel icon_buku1;
    private javax.swing.JLabel img_logo;
    private javax.swing.JLabel img_logo1;
    private javax.swing.JLabel jLabelISBN;
    private javax.swing.JLabel jLabelJudul;
    private javax.swing.JLabel jLabelJumlahHalaman;
    private javax.swing.JLabel jLabelPenerbit;
    private javax.swing.JLabel jLabelPengarang;
    private javax.swing.JLabel jLabelSubJudul;
    private javax.swing.JLabel jLabelTahun;
    private javax.swing.JPanel jPanelAdd;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelView;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableBuku;
    private javax.swing.JTextField jTextFieldISBN;
    private javax.swing.JTextField jTextFieldJudul;
    private javax.swing.JTextField jTextFieldJumlahHalaman;
    private javax.swing.JTextField jTextFieldPencarian1;
    private javax.swing.JTextField jTextFieldPenerbit;
    private javax.swing.JTextField jTextFieldPengarang;
    private javax.swing.JTextField jTextFieldSubJudul;
    private javax.swing.JTextField jTextFieldTahun;
    private javax.swing.JLabel txt_judul;
    private javax.swing.JLabel txt_judul1;
    private javax.swing.JLabel txt_menu;
    private javax.swing.JLabel txt_menu1;
    // End of variables declaration//GEN-END:variables

//    private void loadData() {
//      getData((DefaultTableModel) jTableBuku.getModel());
//    }
//
//    private void setTabelModel() {
//        DefaultTableModel model = (DefaultTableModel) jTableBuku.getModel();
//        model.addColumn("ISBN");
//        model.addColumn("Judul");
//        model.addColumn("Sub Judul");
//        model.addColumn("Pengarang");
//        model.addColumn("Penulis");
//        model.addColumn("Tahun");
//        model.addColumn("Jumlah Halaman");
//    }
//    
//    private void getData(DefaultTableModel model){
//        model.setRowCount(0);
//        
//        try{
//            String sql = "SELECT * FROM Buku";
//            try(PreparedStatement st = conn.prepareStatement(sql)){
//                ResultSet rs = st.executeQuery();
//                
//                while (rs.next()){
//                    String isbn = rs.getString("ISBN");
//                    String judul = rs.getString("Judul");
//                    String sub_judul = rs.getString("Sub_Judul");
//                    String pengarang = rs.getString("Pengarang");
//                    String penerbit = rs.getString("Penerbit");
//                    String tahun = rs.getString("Tahun");
//                    String jumlah_halaman = rs.getString("Jumlah_Halaman");
//                    
//                    Object[] rowData = {isbn,judul,sub_judul,pengarang,penerbit, tahun, jumlah_halaman};
//                    model.addRow(rowData);
//                    
//                }  
//            }  
//            
//        }catch (Exception e){
//            java.util.logging.Logger.getLogger(FrmBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
//        }
//    }
    

}

