# Progress 2
Menggunakan Apache Netbeans IDE 15 dan PostgreSQL pgAdmin 4

[![forthebadge made-with-ApacheNeatbeans](https://th.bing.com/th?id=OSAAS.67E3675844C1A9B6C86DF097C16A6D3B&w=80&h=80&c=1&o=6&pid=5.1)](https://netbeans.apache.org/) [![forthebadge made-with-PosgreSQL](https://th.bing.com/th?id=OSAAS.C27BAA7112B6F36A360DBBC4ACA18527&w=80&h=80&c=1&o=6&pid=5.1)]([https://netbeans.apache.org/](https://www.postgresql.org/)https://www.postgresql.org/)

## Action Performed
Pada menu yang ditampilkan pada sidebar akan ditampilkan panel dari masing-masing menu tersebut. Dengan remove tampilan awal lalu add panel yang akan di tampilkam

      MenuItem menuDashboard = new MenuItem(iconDashboard, false, null, "Dashboard", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanelUtama.removeAll();
                jPanelUtama.add(new Dashboard());
                jPanelUtama.repaint();
                jPanelUtama.revalidate();            }
        });

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
                jPanelUtama.add(new Skripsi());
                jPanelUtama.repaint();
                jPanelUtama.revalidate();             
            }
        });


Lalu ketika di run akan dapat di klik

<img width="960" alt="Screenshot 2023-11-12 215405" src="https://github.com/WilisArum02/Project-UAS/assets/148854173/e7a661b0-6ad6-4e19-9f27-9eab03f573aa">

<img width="960" alt="Screenshot 2023-11-12 215339" src="https://github.com/WilisArum02/Project-UAS/assets/148854173/41b50530-f3ac-4aca-8164-e8c615c96915">









