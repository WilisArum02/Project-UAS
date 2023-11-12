# Progress 1
Menggunakan Apache Netbeans IDE 15 dan PostgreSQL pgAdmin 4

[![forthebadge made-with-ApacheNeatbeans](https://th.bing.com/th?id=OSAAS.67E3675844C1A9B6C86DF097C16A6D3B&w=80&h=80&c=1&o=6&pid=5.1)](https://netbeans.apache.org/) [![forthebadge made-with-PosgreSQL](https://th.bing.com/th?id=OSAAS.C27BAA7112B6F36A360DBBC4ACA18527&w=80&h=80&c=1&o=6&pid=5.1)]([https://netbeans.apache.org/](https://www.postgresql.org/)https://www.postgresql.org/)


## Login Page
Menggunakan JFrame Form untuk mengarahkan button login ke page selanjutnya, pada action performed menggunkaan code dibawah dimana button login ini akan diarahkan ke [Menu Utama](https://github.com/WilisArum02/Project-UAS/blob/main/ProjectUAS/src/projectuas/FrmMenuUtama.java) 
                
        FrmMenuUtama menu = new FrmMenuUtama();
        menu.setVisible(true);
        menu.revalidate();
        dispose();

Pada login ini juga menggunakan focus gained dan focus Lost untuk menghilangkan text perintah pada text field

<img width="465" alt="Screenshot 2023-11-11 001346" src="https://github.com/WilisArum02/Project-UAS/assets/148854173/707c929a-ac4a-4976-b93b-b3113d05500c">

<img width="465" alt="Screenshot 2023-11-11 001358" src="https://github.com/WilisArum02/Project-UAS/assets/148854173/ff17ee89-b94e-42ba-82ae-680f76831c8b">


## Menu Utama page
Pada [Menu Utama](https://github.com/WilisArum02/Project-UAS/blob/main/ProjectUAS/src/projectuas/FrmMenuUtama.java) dibagi menjadi 3 side menggunakan border layout yang berisikan navbar, sidebar, dan isi content atau main yang akan ditampilkan seperti pada navigator dibawah

<img width="168" alt="Screenshot 2023-11-11 003256" src="https://github.com/WilisArum02/Project-UAS/assets/148854173/8285791c-4a56-488a-a91c-ad844fa11512">

Sidebar menu item akan dibuat menggunakan [MenuItem](https://github.com/WilisArum02/Project-UAS/blob/main/ProjectUAS/src/projectuas/MenuItem.java) yang akan di execute pada Form menu utama

      ImageIcon iconItem = new ImageIcon(getClass().getResource("/img/Book_Shelf.png"));
      ImageIcon iconReport = new ImageIcon(getClass().getResource("/img/Cheque.png"));
      ImageIcon iconBuku = new ImageIcon(getClass().getResource("/img/Book.png"));
      ImageIcon iconSkripsi = new ImageIcon(getClass().getResource("/img/Literature.png"));
        
      MenuItem buku = new MenuItem(null, true, iconBuku, "Buku", null);
      MenuItem skripsi = new MenuItem(null, true, iconSkripsi, "Skripsi", null);
            
      MenuItem bukuReport = new MenuItem(null, true, iconBuku, "Buku", null);
      MenuItem skripsiReport = new MenuItem(null, true, iconSkripsi, "Skripsi", null);
            
            
      MenuItem menuItem = new MenuItem(iconItem, false, null, "Item", null, buku, skripsi);
      MenuItem menuReport = new MenuItem(iconReport, false, null, "Report", null, bukuReport, skripsiReport);
            
      addMenu(menuItem,menuReport);


Tampilannya menu pada sidebar akan bisa diklik untuk menampilkan submenunya

<img width="960" alt="Screenshot 2023-11-11 004733" src="https://github.com/WilisArum02/Project-UAS/assets/148854173/748ba033-6c58-4a36-9c19-034d6cb8c54a">



 ## Buku Page
Membuat page baru dengan JPanel Form agar dapat di generate ke dalam isi di menu utama

<img width="490" alt="Screenshot 2023-11-11 004556" src="https://github.com/WilisArum02/Project-UAS/assets/148854173/54da5b2e-cb71-4eeb-9e0e-d1f638aac637">


## Skripsi page
Membuat page baru dengan JPanel Form agar dapat di generate ke dalam isi di menu utama

<img width="486" alt="Screenshot 2023-11-11 004939" src="https://github.com/WilisArum02/Project-UAS/assets/148854173/0959ed2b-3ea3-46d7-ae86-843a6da2979d">




 
