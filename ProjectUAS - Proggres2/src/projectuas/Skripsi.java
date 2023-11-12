/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package projectuas;


public class Skripsi extends javax.swing.JPanel {


    public Skripsi() {
        initComponents();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jPanelView = new javax.swing.JPanel();
        txt_menu1 = new javax.swing.JLabel();
        icon_buku1 = new javax.swing.JLabel();
        bt_tambah1 = new javax.swing.JButton();
        jTextFieldPencarian1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSkripsi = new javax.swing.JTable();
        txt_judul4 = new javax.swing.JLabel();
        img_logo4 = new javax.swing.JLabel();
        jPanelAdd = new javax.swing.JPanel();
        txt_menu = new javax.swing.JLabel();
        icon_buku = new javax.swing.JLabel();
        txt_judul = new javax.swing.JLabel();
        img_logo = new javax.swing.JLabel();
        bt_simpan = new javax.swing.JButton();
        jLabelTahun = new javax.swing.JLabel();
        jLabelJumlahHalaman = new javax.swing.JLabel();
        jTextFieldISBN = new javax.swing.JTextField();
        jLabelISBN = new javax.swing.JLabel();
        jSpinnerJumlahHalaman = new javax.swing.JSpinner();
        jLabelJudul = new javax.swing.JLabel();
        jTextFieldJudul = new javax.swing.JTextField();
        jLabelPengarang = new javax.swing.JLabel();
        jTextFieldPengarang = new javax.swing.JTextField();
        jTextFieldPenerbit1 = new javax.swing.JTextField();
        bt_batal2 = new javax.swing.JButton();
        bt_batal3 = new javax.swing.JButton();
        jPanelViewEdit = new javax.swing.JPanel();
        bt_batal = new javax.swing.JButton();
        txt_menu2 = new javax.swing.JLabel();
        icon_buku2 = new javax.swing.JLabel();
        txt_judul2 = new javax.swing.JLabel();
        img_logo2 = new javax.swing.JLabel();
        bt_hapus2 = new javax.swing.JButton();
        jTextFieldPencarian2 = new javax.swing.JTextField();
        bt_hapus3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableSkripsi1 = new javax.swing.JTable();
        jPanelEdit = new javax.swing.JPanel();
        txt_menu3 = new javax.swing.JLabel();
        icon_buku3 = new javax.swing.JLabel();
        txt_judul3 = new javax.swing.JLabel();
        img_logo3 = new javax.swing.JLabel();
        bt_simpan1 = new javax.swing.JButton();
        jLabelTahun1 = new javax.swing.JLabel();
        jLabelJumlahHalaman1 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jSpinnerJumlahHalaman1 = new javax.swing.JSpinner();
        jLabelJudul1 = new javax.swing.JLabel();
        jTextFieldJudul1 = new javax.swing.JTextField();
        jLabelPengarang1 = new javax.swing.JLabel();
        jTextFieldPengarang1 = new javax.swing.JTextField();
        jTextFieldPenerbit2 = new javax.swing.JTextField();
        bt_batal5 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(637, 485));

        jPanelMain.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMain.setLayout(new java.awt.CardLayout());

        jPanelView.setBackground(new java.awt.Color(255, 255, 255));

        txt_menu1.setForeground(new java.awt.Color(102, 102, 102));
        txt_menu1.setText("Home > Koleksi > Skripsi");

        icon_buku1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Literature10.png"))); // NOI18N

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

        jTableSkripsi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ISBN", "Judul", "Pengarang", "Tahun", "Jumlah Halaman"
            }
        ));
        jScrollPane1.setViewportView(jTableSkripsi);

        txt_judul4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_judul4.setForeground(new java.awt.Color(0, 153, 255));
        txt_judul4.setText("Tambah Skripsi Buku SIBoox");

        img_logo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo_buku_1 (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanelViewLayout = new javax.swing.GroupLayout(jPanelView);
        jPanelView.setLayout(jPanelViewLayout);
        jPanelViewLayout.setHorizontalGroup(
            jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelViewLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelViewLayout.createSequentialGroup()
                        .addComponent(bt_tambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelViewLayout.createSequentialGroup()
                        .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldPencarian1)
                            .addGroup(jPanelViewLayout.createSequentialGroup()
                                .addComponent(img_logo4)
                                .addGap(5, 5, 5)
                                .addComponent(txt_judul4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 599, Short.MAX_VALUE)
                                .addComponent(icon_buku1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_menu1)))
                        .addGap(20, 20, 20))))
            .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelViewLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1034, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
        jPanelViewLayout.setVerticalGroup(
            jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelViewLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon_buku1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(img_logo4)
                    .addComponent(txt_judul4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_menu1))
                .addGap(25, 25, 25)
                .addComponent(bt_tambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jTextFieldPencarian1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelViewLayout.createSequentialGroup()
                    .addGap(0, 195, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelMain.add(jPanelView, "card2");

        jPanelAdd.setBackground(new java.awt.Color(255, 255, 255));

        txt_menu.setForeground(new java.awt.Color(102, 102, 102));
        txt_menu.setText("Home > Koleksi > Skripsi");

        icon_buku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Literature10.png"))); // NOI18N

        txt_judul.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_judul.setForeground(new java.awt.Color(0, 153, 255));
        txt_judul.setText("Tambah Skripsi Buku SIBoox");

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

        jLabelJudul.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelJudul.setText("Judul");

        jTextFieldJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldJudulActionPerformed(evt);
            }
        });

        jLabelPengarang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelPengarang.setText("Pengarang");

        jTextFieldPengarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPengarangActionPerformed(evt);
            }
        });

        jTextFieldPenerbit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPenerbit1ActionPerformed(evt);
            }
        });

        bt_batal2.setBackground(new java.awt.Color(0, 0, 102));
        bt_batal2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_batal2.setForeground(new java.awt.Color(0, 153, 255));
        bt_batal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Add.png"))); // NOI18N
        bt_batal2.setText("Upload File");
        bt_batal2.setBorder(null);
        bt_batal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_batal2ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanelAddLayout = new javax.swing.GroupLayout(jPanelAdd);
        jPanelAdd.setLayout(jPanelAddLayout);
        jPanelAddLayout.setHorizontalGroup(
            jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddLayout.createSequentialGroup()
                        .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelAddLayout.createSequentialGroup()
                                .addComponent(img_logo)
                                .addGap(5, 5, 5)
                                .addComponent(txt_judul)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 600, Short.MAX_VALUE)
                                .addComponent(icon_buku)
                                .addGap(5, 5, 5)
                                .addComponent(txt_menu))
                            .addGroup(jPanelAddLayout.createSequentialGroup()
                                .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelJumlahHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSpinnerJumlahHalaman, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
                                    .addComponent(jTextFieldPenerbit1)
                                    .addComponent(jTextFieldISBN)
                                    .addComponent(jTextFieldJudul)
                                    .addComponent(jTextFieldPengarang))))
                        .addGap(20, 20, 20))
                    .addGroup(jPanelAddLayout.createSequentialGroup()
                        .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAddLayout.createSequentialGroup()
                                .addComponent(bt_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt_batal2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt_batal3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelAddLayout.setVerticalGroup(
            jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(icon_buku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(img_logo)
                    .addComponent(txt_judul, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_batal2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_batal3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelISBN)
                    .addComponent(jTextFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPenerbit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelJumlahHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerJumlahHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
        );

        jPanelMain.add(jPanelAdd, "card3");

        jPanelViewEdit.setBackground(new java.awt.Color(255, 255, 255));

        bt_batal.setBackground(new java.awt.Color(0, 0, 102));
        bt_batal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_batal.setForeground(new java.awt.Color(0, 153, 255));
        bt_batal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Edit.png"))); // NOI18N
        bt_batal.setText("Edit");
        bt_batal.setBorder(null);
        bt_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_batalActionPerformed(evt);
            }
        });

        txt_menu2.setForeground(new java.awt.Color(102, 102, 102));
        txt_menu2.setText("Home > Koleksi > Skripsi");

        icon_buku2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Literature10.png"))); // NOI18N

        txt_judul2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_judul2.setForeground(new java.awt.Color(0, 153, 255));
        txt_judul2.setText("Ubah Data Skripsi SIBoox");

        img_logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo_buku_1 (1).png"))); // NOI18N

        bt_hapus2.setBackground(new java.awt.Color(0, 0, 102));
        bt_hapus2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_hapus2.setForeground(new java.awt.Color(0, 153, 255));
        bt_hapus2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Waste.png"))); // NOI18N
        bt_hapus2.setText("Hapus");
        bt_hapus2.setBorder(null);
        bt_hapus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_hapus2ActionPerformed(evt);
            }
        });

        jTextFieldPencarian2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jTextFieldPencarian2.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldPencarian2.setText("Pencarian");
        jTextFieldPencarian2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jTextFieldPencarian2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldPencarian2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldPencarian2FocusLost(evt);
            }
        });
        jTextFieldPencarian2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPencarian2ActionPerformed(evt);
            }
        });

        bt_hapus3.setBackground(new java.awt.Color(0, 0, 102));
        bt_hapus3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_hapus3.setForeground(new java.awt.Color(0, 153, 255));
        bt_hapus3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Restart.png"))); // NOI18N
        bt_hapus3.setText("Batal");
        bt_hapus3.setBorder(null);
        bt_hapus3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_hapus3ActionPerformed(evt);
            }
        });

        jTableSkripsi1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ISBN", "Judul", "Pengarang", "Tahun", "Jumlah Halaman"
            }
        ));
        jScrollPane2.setViewportView(jTableSkripsi1);

        javax.swing.GroupLayout jPanelViewEditLayout = new javax.swing.GroupLayout(jPanelViewEdit);
        jPanelViewEdit.setLayout(jPanelViewEditLayout);
        jPanelViewEditLayout.setHorizontalGroup(
            jPanelViewEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelViewEditLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelViewEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelViewEditLayout.createSequentialGroup()
                        .addComponent(bt_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_hapus2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_hapus3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelViewEditLayout.createSequentialGroup()
                        .addGroup(jPanelViewEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPencarian2)
                            .addGroup(jPanelViewEditLayout.createSequentialGroup()
                                .addComponent(img_logo2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_judul2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 613, Short.MAX_VALUE)
                                .addComponent(icon_buku2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_menu2)))
                        .addGap(20, 20, 20))))
            .addGroup(jPanelViewEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelViewEditLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                    .addGap(21, 21, 21)))
        );
        jPanelViewEditLayout.setVerticalGroup(
            jPanelViewEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelViewEditLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelViewEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_judul2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(img_logo2)
                    .addComponent(txt_menu2)
                    .addComponent(icon_buku2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanelViewEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_hapus2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_batal, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(bt_hapus3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addComponent(jTextFieldPencarian2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPanelViewEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelViewEditLayout.createSequentialGroup()
                    .addGap(0, 347, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelMain.add(jPanelViewEdit, "card2");

        jPanelEdit.setBackground(new java.awt.Color(255, 255, 255));

        txt_menu3.setForeground(new java.awt.Color(102, 102, 102));
        txt_menu3.setText("Home > Koleksi > Skripsi");

        icon_buku3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Literature10.png"))); // NOI18N

        txt_judul3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_judul3.setForeground(new java.awt.Color(0, 153, 255));
        txt_judul3.setText("Edit Skripsi Buku SIBoox");

        img_logo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo_buku_1 (1).png"))); // NOI18N

        bt_simpan1.setBackground(new java.awt.Color(0, 0, 102));
        bt_simpan1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_simpan1.setForeground(new java.awt.Color(0, 153, 255));
        bt_simpan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Save.png"))); // NOI18N
        bt_simpan1.setText("Simpan");
        bt_simpan1.setBorder(null);
        bt_simpan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_simpan1ActionPerformed(evt);
            }
        });

        jLabelTahun1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelTahun1.setText("Tahun");

        jLabelJumlahHalaman1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelJumlahHalaman1.setText("Jumlah Halaman");

        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });

        jLabelID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelID.setText("ID ");
        jLabelID.setToolTipText("");

        jLabelJudul1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelJudul1.setText("Judul");

        jTextFieldJudul1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldJudul1ActionPerformed(evt);
            }
        });

        jLabelPengarang1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelPengarang1.setText("Pengarang");

        jTextFieldPengarang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPengarang1ActionPerformed(evt);
            }
        });

        jTextFieldPenerbit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPenerbit2ActionPerformed(evt);
            }
        });

        bt_batal5.setBackground(new java.awt.Color(0, 0, 102));
        bt_batal5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_batal5.setForeground(new java.awt.Color(0, 153, 255));
        bt_batal5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Restart.png"))); // NOI18N
        bt_batal5.setText("Batal");
        bt_batal5.setBorder(null);
        bt_batal5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_batal5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEditLayout = new javax.swing.GroupLayout(jPanelEdit);
        jPanelEdit.setLayout(jPanelEditLayout);
        jPanelEditLayout.setHorizontalGroup(
            jPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEditLayout.createSequentialGroup()
                        .addComponent(bt_simpan1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_batal5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelEditLayout.createSequentialGroup()
                        .addGroup(jPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEditLayout.createSequentialGroup()
                                .addGroup(jPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelJudul1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelTahun1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelJumlahHalaman1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPengarang1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                                .addGroup(jPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldPenerbit2)
                                    .addComponent(jTextFieldPengarang1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldJudul1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSpinnerJumlahHalaman1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEditLayout.createSequentialGroup()
                                .addComponent(jLabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelEditLayout.createSequentialGroup()
                                .addComponent(img_logo3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_judul3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(icon_buku3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_menu3)))
                        .addGap(20, 20, 20))))
        );
        jPanelEditLayout.setVerticalGroup(
            jPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEditLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_judul3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(img_logo3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(icon_buku3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_menu3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(25, 25, 25)
                .addGroup(jPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_simpan1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_batal5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelID))
                .addGap(25, 25, 25)
                .addGroup(jPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldJudul1)
                    .addComponent(jLabelJudul1))
                .addGap(25, 25, 25)
                .addGroup(jPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPengarang1)
                    .addComponent(jLabelPengarang1))
                .addGap(25, 25, 25)
                .addGroup(jPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPenerbit2)
                    .addComponent(jLabelTahun1))
                .addGap(25, 25, 25)
                .addGroup(jPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerJumlahHalaman1)
                    .addComponent(jLabelJumlahHalaman1))
                .addGap(248, 248, 248))
        );

        jPanelMain.add(jPanelEdit, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_batalActionPerformed
        jPanelMain.removeAll();
        jPanelMain.add(jPanelEdit);
        jPanelMain.repaint();
        jPanelMain.revalidate();
    }//GEN-LAST:event_bt_batalActionPerformed

    private void bt_hapus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_hapus2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_hapus2ActionPerformed

    private void jTextFieldPencarian2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPencarian2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPencarian2FocusGained

    private void jTextFieldPencarian2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPencarian2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPencarian2FocusLost

    private void jTextFieldPencarian2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPencarian2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPencarian2ActionPerformed

    private void bt_hapus3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_hapus3ActionPerformed
        jPanelMain.removeAll();
        jPanelMain.repaint();
        jPanelMain.revalidate();

        jPanelMain.add(jPanelView);
        jPanelMain.repaint();
        jPanelMain.revalidate();
    }//GEN-LAST:event_bt_hapus3ActionPerformed

    private void bt_batal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_batal3ActionPerformed
        jPanelMain.removeAll();
        jPanelMain.repaint();
        jPanelMain.revalidate();

        jPanelMain.add(jPanelView);
        jPanelMain.repaint();
        jPanelMain.revalidate();

    }//GEN-LAST:event_bt_batal3ActionPerformed

    private void bt_batal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_batal2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_batal2ActionPerformed

    private void jTextFieldPenerbit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPenerbit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPenerbit1ActionPerformed

    private void jTextFieldPengarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPengarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPengarangActionPerformed

    private void jTextFieldJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldJudulActionPerformed

    private void jTextFieldISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldISBNActionPerformed

    private void bt_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_simpanActionPerformed
        jPanelMain.removeAll();
        jPanelMain.add(jPanelAdd);
        jPanelMain.repaint();
        jPanelMain.revalidate();

    }//GEN-LAST:event_bt_simpanActionPerformed

    private void bt_simpan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_simpan1ActionPerformed
        jPanelMain.removeAll();
        jPanelMain.add(jPanelView);
        jPanelMain.repaint();
        jPanelMain.revalidate();
    }//GEN-LAST:event_bt_simpan1ActionPerformed

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jTextFieldJudul1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldJudul1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldJudul1ActionPerformed

    private void jTextFieldPengarang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPengarang1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPengarang1ActionPerformed

    private void jTextFieldPenerbit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPenerbit2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPenerbit2ActionPerformed

    private void bt_batal5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_batal5ActionPerformed
        jPanelMain.removeAll();
        jPanelMain.add(jPanelViewEdit);
        jPanelMain.repaint();
        jPanelMain.revalidate();
    }//GEN-LAST:event_bt_batal5ActionPerformed

    private void jTextFieldPencarian1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPencarian1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPencarian1ActionPerformed

    private void jTextFieldPencarian1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPencarian1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPencarian1FocusLost

    private void jTextFieldPencarian1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPencarian1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPencarian1FocusGained

    private void bt_tambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_tambah1ActionPerformed
        jPanelMain.removeAll();
        jPanelMain.repaint();
        jPanelMain.revalidate();

        jPanelMain.add(jPanelAdd);
        jPanelMain.repaint();
        jPanelMain.revalidate();
    }//GEN-LAST:event_bt_tambah1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_batal;
    private javax.swing.JButton bt_batal2;
    private javax.swing.JButton bt_batal3;
    private javax.swing.JButton bt_batal5;
    private javax.swing.JButton bt_hapus2;
    private javax.swing.JButton bt_hapus3;
    private javax.swing.JButton bt_simpan;
    private javax.swing.JButton bt_simpan1;
    private javax.swing.JButton bt_tambah1;
    private javax.swing.JLabel icon_buku;
    private javax.swing.JLabel icon_buku1;
    private javax.swing.JLabel icon_buku2;
    private javax.swing.JLabel icon_buku3;
    private javax.swing.JLabel img_logo;
    private javax.swing.JLabel img_logo2;
    private javax.swing.JLabel img_logo3;
    private javax.swing.JLabel img_logo4;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelISBN;
    private javax.swing.JLabel jLabelJudul;
    private javax.swing.JLabel jLabelJudul1;
    private javax.swing.JLabel jLabelJumlahHalaman;
    private javax.swing.JLabel jLabelJumlahHalaman1;
    private javax.swing.JLabel jLabelPengarang;
    private javax.swing.JLabel jLabelPengarang1;
    private javax.swing.JLabel jLabelTahun;
    private javax.swing.JLabel jLabelTahun1;
    private javax.swing.JPanel jPanelAdd;
    private javax.swing.JPanel jPanelEdit;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelView;
    private javax.swing.JPanel jPanelViewEdit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerJumlahHalaman;
    private javax.swing.JSpinner jSpinnerJumlahHalaman1;
    private javax.swing.JTable jTableSkripsi;
    private javax.swing.JTable jTableSkripsi1;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldISBN;
    private javax.swing.JTextField jTextFieldJudul;
    private javax.swing.JTextField jTextFieldJudul1;
    private javax.swing.JTextField jTextFieldPencarian1;
    private javax.swing.JTextField jTextFieldPencarian2;
    private javax.swing.JTextField jTextFieldPenerbit1;
    private javax.swing.JTextField jTextFieldPenerbit2;
    private javax.swing.JTextField jTextFieldPengarang;
    private javax.swing.JTextField jTextFieldPengarang1;
    private javax.swing.JLabel txt_judul;
    private javax.swing.JLabel txt_judul2;
    private javax.swing.JLabel txt_judul3;
    private javax.swing.JLabel txt_judul4;
    private javax.swing.JLabel txt_menu;
    private javax.swing.JLabel txt_menu1;
    private javax.swing.JLabel txt_menu2;
    private javax.swing.JLabel txt_menu3;
    // End of variables declaration//GEN-END:variables
}
