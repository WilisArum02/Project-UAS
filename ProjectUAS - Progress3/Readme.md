# Progress 3
Noted: menggunakan data buku dan skripsi dimana jumlah kolom pada tabel keduanya berbeda, ringkasan yang tersedia menyesuaikan.

Menggunakan Apache Netbeans IDE 15 dan PostgreSQL pgAdmin 4

[![forthebadge made-with-ApacheNeatbeans](https://th.bing.com/th?id=OSAAS.67E3675844C1A9B6C86DF097C16A6D3B&w=80&h=80&c=1&o=6&pid=5.1)](https://netbeans.apache.org/) [![forthebadge made-with-PosgreSQL](https://th.bing.com/th?id=OSAAS.C27BAA7112B6F36A360DBBC4ACA18527&w=80&h=80&c=1&o=6&pid=5.1)]([https://netbeans.apache.org/](https://www.postgresql.org/)https://www.postgresql.org/)

## Searching
Pada tampilan menu [buku](https://github.com/WilisArum02/Project-UAS/blob/main/ProjectUAS%20-%20Progress3/src/projectuas/MenuBuku.java) dan [skripsi](https://github.com/WilisArum02/Project-UAS/blob/main/ProjectUAS%20-%20Progress3/src/projectuas/MenuSkripsi.java)
terdapat field dan button cari yang akan di tentukan berdasarkan combo buttonnya(judul, sub judul dll)

untuk itu kita akan membuat method ambil data dan juga get data
Ex method ambil data:

      private void ambildata() {
            EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT s FROM Skripsi_1 s");
            List<Skripsi_1> list = query.getResultList();
            em.getTransaction().commit();
            em.close();
            DefaultTableModel tbl = (DefaultTableModel) JTableSkripsi.getModel();
            tbl.setRowCount(0);
            int i = 1;
            for (Skripsi_1 s : list) {
                Object[] ob = new Object[5];
                ob[0] = s.getId_skripsi();
                ob[1] = s.getJudul();
                ob[2] = s.getPengarang();
                ob[3] = s.getTahun();
                ob[4] = s.getJumlah_halaman();
                tbl.addRow(ob);
                i++;
            }
        }


Ex method untuk searching berdasarkan:

      void getdatajudul(String judul) {
            EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT s FROM Skripsi_1 s WHERE LOWER(s.judul) LIKE :judul");
            query.setParameter("judul", "%" + judul.toLowerCase() + "%");
            List<Skripsi_1> list = query.getResultList();
            em.getTransaction().commit();
            em.close();
            DefaultTableModel tbl = (DefaultTableModel) JTableSkripsi.getModel();
            tbl.setRowCount(0);
            int i = 1;
            for (Skripsi_1 s : list) {
                Object[] ob = new Object[5];
                ob[0] = s.getId_skripsi();
                ob[1] = s.getJudul();
                ob[2] = s.getPengarang();
                ob[3] = s.getTahun();
                ob[4] = s.getJumlah_halaman();
                tbl.addRow(ob);
                i++;
            }
        }

disini kita dapat membuat method tergantung sort by apa saja yang akan kita gunakan

Lalu get data yang sudah dipanggil akan kita masukkan ke dalam button cari

<img width="355" alt="Screenshot 2023-11-19 221847" src="https://github.com/WilisArum02/Project-UAS/assets/148854173/c36d21b1-fdc8-4f97-8145-5fdf349fd8e5">

## Report
Untuk [report](https://github.com/WilisArum02/Project-UAS/blob/main/ProjectUAS%20-%20Progress3/src/projectuas/ReportBuku.java) akan di sesuaikan dengan tombol searching jadi dapat di masukkan dalam button cetak

    private void jButtonCetakActionPerformed(java.awt.event.ActionEvent evt) {

        try {
        String reportPath = "src/projectuas/reportBuku.jrxml";
        String selection = ((String) jComboBoxPencarian.getSelectedItem()).toLowerCase();
        String searchTerm = jTextFieldPencarian1.getText().trim();

        // Building the JPA query dynamically based on the selected criteria
        String queryString = "SELECT b FROM Buku_1 b WHERE ";

        switch (selection.toLowerCase()) {
            case "isbn":
                queryString += "LOWER(b.isbn) LIKE LOWER(:searchTerm)";
                break;
            case "judul":
                queryString += "LOWER(b.judul) LIKE LOWER(:searchTerm)";
                break;
            case "sub_judul":
                queryString += "LOWER(b.sub_judul) LIKE LOWER(:searchTerm)";
                break;
            case "pengarang":
                queryString += "LOWER(b.pengarang) LIKE LOWER(:searchTerm)";
                break;
            case "penerbit":
                queryString += "LOWER(b.penerbit) LIKE LOWER(:searchTerm)";
                break;
            case "tahun":
                queryString += "LOWER(b.tahun) LIKE LOWER(:searchTerm)";
                break;
            case "jumlah_halaman":
                queryString += "LOWER(b.jumlah_halaman) LIKE LOWER(:searchTerm)";
                break;
            default:
                throw new IllegalArgumentException("No search criteria selected.");
        }

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectUASPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        // Creating a CriteriaBuilder instance to create the query
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Buku_1> cq = cb.createQuery(Buku_1.class);
        Root<Buku_1> bookRoot = cq.from(Buku_1.class);
        cq.select(bookRoot);

        // Check if WHERE clause is not empty
        if (queryString.endsWith(" WHERE ")) {
            throw new IllegalArgumentException("No search criteria selected.");
        }

        TypedQuery<Buku_1> q = em.createQuery(cq.where(cb.like(cb.lower(bookRoot.get(selection)), "%" + searchTerm.toLowerCase() + "%")));
        List<Buku_1> results = q.getResultList();

        em.getTransaction().commit();
        em.close();
        emf.close();

        // Prepare data for the report
        List<Object[]> data = new ArrayList<>();
        for (Buku_1 result : results) {
            Object[] rowData = {
                result.getIsbn(),
                result.getJudul(),
                result.getSub_judul(),
                result.getPengarang(),
                result.getPenerbit(),
                result.getTahun(),
                result.getJumlah_halaman()
            };
            data.add(rowData);
        }

        // Create a JRBeanCollectionDataSource for JasperReports from the search results data
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(results);

        // Load the report design file (*.jrxml)
        JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
        JasperPrint print = JasperFillManager.fillReport(jasperReport, null, dataSource);
        JasperViewer viewer = new JasperViewer(print, false);
        viewer.setVisible(true);

    } catch (JRException | IllegalArgumentException ex) {
        Logger.getLogger(ReportBuku.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

Searching berdasarkan judul, 'ana'

<img width="960" alt="Screenshot 2023-11-19 215827" src="https://github.com/WilisArum02/Project-UAS/assets/148854173/0b6323fb-717b-497b-a087-ebf28a50d7c3">


hasil cetaknya

<img width="951" alt="Screenshot 2023-11-19 214610" src="https://github.com/WilisArum02/Project-UAS/assets/148854173/4b44416e-47d1-42a0-a840-b84b5d66e532">

