package tugas.sisteminformasiklinikkampusaplikasi;
public class halamanHome extends javax.swing.JFrame {    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(halamanHome.class.getName());
    public halamanHome() {
        initComponents();
        this.setLocationRelativeTo(null);
            if (dataPengguna.nama != null && !dataPengguna.nama.isEmpty()) {
                textJudul.setText("Selamat Datang, " + dataPengguna.nama);
                } else {
                    textJudul.setText("Selamat Datang"); 
                }
            if (dataPengguna.nim != null && !dataPengguna.nim.isEmpty()) {
                nimOutput.setText("NIM : " + dataPengguna.nim); 
            }
            
            int jumlahDikonfirmasi = 0;
            
            for (int i = 0; i < dataJanjiTemu.jumlahJanjiTemu; i++) {
            // Periksa apakah status di indeks tersebut adalah TRUE (sudah selesai)
                if (dataJanjiTemu.statusSelesai[i]) {
                    jumlahDikonfirmasi++;
                }
            }
            
            jumlahKonsultasi.setText(String.valueOf(jumlahDikonfirmasi) + " janji temu selesai");
            
            int indeksTerbaru = dataJanjiTemu.jumlahJanjiTemu - 1; // Mendapatkan indeks janji temu terakhir

            if (indeksTerbaru >= 0 && dataJanjiTemu.tanggal[indeksTerbaru] != null && !dataJanjiTemu.tanggal[indeksTerbaru].isEmpty()) {
                // Menggunakan indeksTerbaru
                String tanggalTerbaru = dataJanjiTemu.tanggal[indeksTerbaru];
                String dokterTerbaru = dataJanjiTemu.dokter[indeksTerbaru];
                String keluhanTerbaru = dataJanjiTemu.keluhan[indeksTerbaru];

                // 1. Panel Janji Temu Mendatang
                tanggalJanji.setText(tanggalTerbaru);

                // 2. Panel Pemberitahuan
                namaDokter9.setText("dengan " + dokterTerbaru);
                keterangan11.setText("pada tanggal " + tanggalTerbaru);

                if (dokterTerbaru != null && !dokterTerbaru.equals("--Pilih Dokter")) {
                    ketterangan6.setText("Janji temu baru");
                    ketrangan7.setText("telah dibuat!");
                }
                if (keluhanTerbaru != null && !keluhanTerbaru.isEmpty()) {
                    jLabel6.setText(keluhanTerbaru);
                } else {
                    jLabel6.setText("..."); 
                }
            } else {
                // Logika jika tidak ada janji temu yang tersimpan
                tanggalJanji.setText("........");
                namaDokter9.setText("");
                keterangan11.setText("");
                ketterangan6.setText("Tidak ada");
                ketrangan7.setText("pemberitahuan");
                jLabel6.setText(""); 
            }
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        Body = new javax.swing.JPanel();
        judulHalaman = new javax.swing.JPanel();
        textJudul = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nimOutput = new javax.swing.JLabel();
        keterangan = new javax.swing.JLabel();
        panelJanjiTemu = new javax.swing.JPanel();
        keterangan2 = new javax.swing.JLabel();
        tanggalJanji = new javax.swing.JLabel();
        keterangan3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        panelKonsultasiJumlah = new javax.swing.JPanel();
        keterangan4 = new javax.swing.JLabel();
        jumlahKonsultasi = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pemberitahuan = new javax.swing.JLabel();
        keterangan5 = new javax.swing.JLabel();
        keterangan9 = new javax.swing.JPanel();
        ketterangan6 = new javax.swing.JLabel();
        ketrangan7 = new javax.swing.JLabel();
        keterangan8 = new javax.swing.JLabel();
        namaDokter9 = new javax.swing.JLabel();
        ketrangan10 = new javax.swing.JLabel();
        keterangan11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pilihanMenu = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        tombolKeluar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Body.setBackground(new java.awt.Color(255, 255, 255));

        judulHalaman.setBackground(new java.awt.Color(102, 255, 204));
        judulHalaman.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        textJudul.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textJudul.setText("Selamat Datang");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-user-50.png"))); // NOI18N

        nimOutput.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nimOutput.setText("NIM : ");

        javax.swing.GroupLayout judulHalamanLayout = new javax.swing.GroupLayout(judulHalaman);
        judulHalaman.setLayout(judulHalamanLayout);
        judulHalamanLayout.setHorizontalGroup(
            judulHalamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(judulHalamanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textJudul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nimOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        judulHalamanLayout.setVerticalGroup(
            judulHalamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, judulHalamanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(judulHalamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nimOutput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textJudul, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        keterangan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        keterangan.setText("Janji temu mendatang");

        panelJanjiTemu.setBackground(new java.awt.Color(255, 255, 255));
        panelJanjiTemu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        keterangan2.setBackground(new java.awt.Color(255, 255, 255));
        keterangan2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        keterangan2.setForeground(new java.awt.Color(153, 153, 153));
        keterangan2.setText("janji temu terbaru");

        tanggalJanji.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        tanggalJanji.setText("......          ");
        tanggalJanji.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tanggalJanjiAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        keterangan3.setText("Terkonfirmasi");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kalender.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelJanjiTemuLayout = new javax.swing.GroupLayout(panelJanjiTemu);
        panelJanjiTemu.setLayout(panelJanjiTemuLayout);
        panelJanjiTemuLayout.setHorizontalGroup(
            panelJanjiTemuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJanjiTemuLayout.createSequentialGroup()
                .addGroup(panelJanjiTemuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(keterangan3)
                    .addComponent(keterangan2)
                    .addComponent(tanggalJanji))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelJanjiTemuLayout.setVerticalGroup(
            panelJanjiTemuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJanjiTemuLayout.createSequentialGroup()
                .addComponent(keterangan2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tanggalJanji)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(keterangan3)
                .addGap(8, 8, 8))
            .addGroup(panelJanjiTemuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelKonsultasiJumlah.setBackground(new java.awt.Color(255, 255, 255));
        panelKonsultasiJumlah.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        keterangan4.setBackground(new java.awt.Color(255, 255, 255));
        keterangan4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        keterangan4.setForeground(new java.awt.Color(153, 153, 153));
        keterangan4.setText("Konsultasi bulan ini");

        jumlahKonsultasi.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jumlahKonsultasi.setText("Belum ada");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stacks_30dp_000000_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N

        javax.swing.GroupLayout panelKonsultasiJumlahLayout = new javax.swing.GroupLayout(panelKonsultasiJumlah);
        panelKonsultasiJumlah.setLayout(panelKonsultasiJumlahLayout);
        panelKonsultasiJumlahLayout.setHorizontalGroup(
            panelKonsultasiJumlahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKonsultasiJumlahLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelKonsultasiJumlahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(keterangan4)
                    .addComponent(jumlahKonsultasi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(14, 14, 14))
        );
        panelKonsultasiJumlahLayout.setVerticalGroup(
            panelKonsultasiJumlahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKonsultasiJumlahLayout.createSequentialGroup()
                .addComponent(keterangan4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jumlahKonsultasi)
                .addGap(0, 30, Short.MAX_VALUE))
            .addGroup(panelKonsultasiJumlahLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pemberitahuan.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        pemberitahuan.setText("Pemberitahuan");

        keterangan5.setBackground(new java.awt.Color(255, 255, 255));
        keterangan5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        keterangan5.setForeground(new java.awt.Color(153, 153, 153));
        keterangan5.setText("Pembaruan terbaru");

        keterangan9.setBackground(new java.awt.Color(255, 255, 255));
        keterangan9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ketterangan6.setText(".........                   ");

        ketrangan7.setText(".........               ");
        ketrangan7.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ketrangan7AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        keterangan8.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        keterangan8.setText("Janji temu anda ");

        namaDokter9.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        namaDokter9.setText("dengan Nama Dr");

        ketrangan10.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        ketrangan10.setText("telah dikonfirmasi");

        keterangan11.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        keterangan11.setText("pada tanggal :");

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setText("Keluhan :");

        javax.swing.GroupLayout keterangan9Layout = new javax.swing.GroupLayout(keterangan9);
        keterangan9.setLayout(keterangan9Layout);
        keterangan9Layout.setHorizontalGroup(
            keterangan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(keterangan9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(keterangan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, keterangan9Layout.createSequentialGroup()
                        .addGroup(keterangan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ketterangan6)
                            .addComponent(ketrangan7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 681, Short.MAX_VALUE)
                        .addGroup(keterangan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(keterangan9Layout.createSequentialGroup()
                                .addGroup(keterangan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ketrangan10)
                                    .addComponent(namaDokter9))
                                .addGap(3, 3, 3))
                            .addComponent(keterangan8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(keterangan9Layout.createSequentialGroup()
                        .addGroup(keterangan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, keterangan9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(keterangan11, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        keterangan9Layout.setVerticalGroup(
            keterangan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(keterangan9Layout.createSequentialGroup()
                .addGroup(keterangan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(keterangan9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ketterangan6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ketrangan7))
                    .addGroup(keterangan9Layout.createSequentialGroup()
                        .addComponent(keterangan8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namaDokter9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ketrangan10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(keterangan11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        pilihanMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Menu--", "1. Pemesanan janji temu", "2. Riwayat konsultasi" }));
        pilihanMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihanMenuActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(270, 690));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.jpeg"))); // NOI18N
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jButton1.setText("Profil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Pengaturan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Info Aplikasi");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tombolKeluar.setBackground(new java.awt.Color(0, 0, 0));
        tombolKeluar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tombolKeluar.setForeground(new java.awt.Color(255, 255, 255));
        tombolKeluar.setText("Keluar");
        tombolKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolKeluarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SISITEM INFORMASI KLINIK");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("KAMPUS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tombolKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel9)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(44, 44, 44)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(tombolKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/groups_2_30dp_000000_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 255, 204));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/healthcare.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 182, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BodyLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(panelKonsultasiJumlah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panelJanjiTemu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BodyLayout.createSequentialGroup()
                                        .addComponent(keterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8))))
                            .addGroup(BodyLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pemberitahuan)
                                    .addComponent(keterangan5))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pilihanMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(judulHalaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(keterangan9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        BodyLayout.setVerticalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judulHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(keterangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(pilihanMenu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addComponent(panelJanjiTemu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelKonsultasiJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(pemberitahuan))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(keterangan5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(keterangan9, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Body, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pilihanMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihanMenuActionPerformed
        // TODO add your handling code here:
        String menuTerpilih = (String) pilihanMenu.getSelectedItem();
        if (menuTerpilih.equals("1. Pemesanan janji temu")) {
            halamanPemesananJanjiTemu janjiTemu = new halamanPemesananJanjiTemu ();
            janjiTemu.setVisible(true);          
        }
        else if (menuTerpilih.equals("2. Riwayat konsultasi")) {
            halamanRiwayatKonsultasi riwayat = new halamanRiwayatKonsultasi();
            riwayat.setVisible(true);           
        }
    }//GEN-LAST:event_pilihanMenuActionPerformed
    private void ketrangan7AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ketrangan7AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_ketrangan7AncestorAdded

    private void tanggalJanjiAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tanggalJanjiAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalJanjiAncestorAdded

    private void tombolKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolKeluarActionPerformed
        // TODO add your handling code here:
        dataJanjiTemu.tanggal = null;
        dataJanjiTemu.dokter = null;
        dataPengguna.nama = null;

        halamanLogin login = new halamanLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tombolKeluarActionPerformed
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        pengaturan pengaturan = new pengaturan ();
        pengaturan.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        profil profil = new profil();
        profil.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1AncestorAdded

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        informasi informasi = new informasi ();
        informasi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        halamanRiwayatKonsultasi riwayat = new halamanRiwayatKonsultasi();
        riwayat.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new halamanHome().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel judulHalaman;
    private javax.swing.JLabel jumlahKonsultasi;
    private javax.swing.JLabel keterangan;
    private javax.swing.JLabel keterangan11;
    private javax.swing.JLabel keterangan2;
    private javax.swing.JLabel keterangan3;
    private javax.swing.JLabel keterangan4;
    private javax.swing.JLabel keterangan5;
    private javax.swing.JLabel keterangan8;
    private javax.swing.JPanel keterangan9;
    private javax.swing.JLabel ketrangan10;
    private javax.swing.JLabel ketrangan7;
    private javax.swing.JLabel ketterangan6;
    private javax.swing.JLabel namaDokter9;
    private javax.swing.JLabel nimOutput;
    private javax.swing.JPanel panelJanjiTemu;
    private javax.swing.JPanel panelKonsultasiJumlah;
    private javax.swing.JLabel pemberitahuan;
    private javax.swing.JComboBox<String> pilihanMenu;
    private javax.swing.JLabel tanggalJanji;
    private javax.swing.JLabel textJudul;
    private javax.swing.JButton tombolKeluar;
    // End of variables declaration//GEN-END:variables
}

