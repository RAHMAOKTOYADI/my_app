/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sisteminformasiklinikkampus;

/**
 *
 * @author YADI
 */
public class halamanHome extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(halamanHome.class.getName());
    public halamanHome() {
        initComponents();
        if (dataPengguna.nama != null && !dataPengguna.nama.isEmpty()) {
            textJudul.setText("Selamat Datang, " + dataPengguna.nama);
        } else {
            textJudul.setText("Selamat Datang"); 
        }
        
        tanggalJanji.setText(dataJanjiTemu.tanggal);
        namaDokter9.setText("dengan " + dataJanjiTemu.dokter);
        keterangan11.setText("pada tanggal " + dataJanjiTemu.tanggal);
        
        tanggalJanji.setText(dataJanjiTemu.tanggal);
        namaDokter9.setText("dengan " + dataJanjiTemu.dokter);
        keterangan11.setText("pada tanggal " + dataJanjiTemu.tanggal);
        if (!dataJanjiTemu.dokter.equals("Dr. Smith")) {
               ketterangan6.setText("Janji temu baru");
               ketrangan7.setText("telah dibuat!");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Body = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        judulHalaman = new javax.swing.JPanel();
        textJudul = new javax.swing.JLabel();
        keterangan = new javax.swing.JLabel();
        panelJanjiTemu = new javax.swing.JPanel();
        keterangan2 = new javax.swing.JLabel();
        tanggalJanji = new javax.swing.JLabel();
        keterangan3 = new javax.swing.JLabel();
        panelKonsultasiJumlah = new javax.swing.JPanel();
        keterangan4 = new javax.swing.JLabel();
        jumlahKonsultasi = new javax.swing.JLabel();
        pemberitahuan = new javax.swing.JLabel();
        keterangan5 = new javax.swing.JLabel();
        keterangan9 = new javax.swing.JPanel();
        ketterangan6 = new javax.swing.JLabel();
        ketrangan7 = new javax.swing.JLabel();
        keterangan8 = new javax.swing.JLabel();
        namaDokter9 = new javax.swing.JLabel();
        ketrangan10 = new javax.swing.JLabel();
        keterangan11 = new javax.swing.JLabel();
        tombolKeluar = new javax.swing.JButton();
        pilihanMenu = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Body.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        judulHalaman.setBackground(new java.awt.Color(255, 255, 255));
        judulHalaman.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        textJudul.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textJudul.setText("Selamat Datang");

        javax.swing.GroupLayout judulHalamanLayout = new javax.swing.GroupLayout(judulHalaman);
        judulHalaman.setLayout(judulHalamanLayout);
        judulHalamanLayout.setHorizontalGroup(
            judulHalamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(judulHalamanLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(textJudul)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        judulHalamanLayout.setVerticalGroup(
            judulHalamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, judulHalamanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textJudul, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        keterangan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        keterangan.setText("Janji temu mendatang");

        panelJanjiTemu.setBackground(new java.awt.Color(255, 255, 255));
        panelJanjiTemu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        keterangan2.setBackground(new java.awt.Color(255, 255, 255));
        keterangan2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        keterangan2.setForeground(new java.awt.Color(153, 153, 153));
        keterangan2.setText("Janji temu berikutnya");

        tanggalJanji.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        tanggalJanji.setText("tanggal       ");

        keterangan3.setText("Terkonfirmasi");

        javax.swing.GroupLayout panelJanjiTemuLayout = new javax.swing.GroupLayout(panelJanjiTemu);
        panelJanjiTemu.setLayout(panelJanjiTemuLayout);
        panelJanjiTemuLayout.setHorizontalGroup(
            panelJanjiTemuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJanjiTemuLayout.createSequentialGroup()
                .addGroup(panelJanjiTemuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(keterangan2)
                    .addComponent(tanggalJanji)
                    .addComponent(keterangan3))
                .addGap(0, 50, Short.MAX_VALUE))
        );
        panelJanjiTemuLayout.setVerticalGroup(
            panelJanjiTemuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJanjiTemuLayout.createSequentialGroup()
                .addComponent(keterangan2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tanggalJanji)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(keterangan3)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        panelKonsultasiJumlah.setBackground(new java.awt.Color(255, 255, 255));
        panelKonsultasiJumlah.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        keterangan4.setBackground(new java.awt.Color(255, 255, 255));
        keterangan4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        keterangan4.setForeground(new java.awt.Color(153, 153, 153));
        keterangan4.setText("Konsultasi bulan ini");

        jumlahKonsultasi.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jumlahKonsultasi.setText("3");

        javax.swing.GroupLayout panelKonsultasiJumlahLayout = new javax.swing.GroupLayout(panelKonsultasiJumlah);
        panelKonsultasiJumlah.setLayout(panelKonsultasiJumlahLayout);
        panelKonsultasiJumlahLayout.setHorizontalGroup(
            panelKonsultasiJumlahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKonsultasiJumlahLayout.createSequentialGroup()
                .addComponent(keterangan4)
                .addGap(0, 51, Short.MAX_VALUE))
            .addGroup(panelKonsultasiJumlahLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jumlahKonsultasi, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelKonsultasiJumlahLayout.setVerticalGroup(
            panelKonsultasiJumlahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKonsultasiJumlahLayout.createSequentialGroup()
                .addComponent(keterangan4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jumlahKonsultasi)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pemberitahuan.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        pemberitahuan.setText("Pemberitahuan");

        keterangan5.setBackground(new java.awt.Color(255, 255, 255));
        keterangan5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        keterangan5.setForeground(new java.awt.Color(153, 153, 153));
        keterangan5.setText("Pembaruan terbaru");

        keterangan9.setBackground(new java.awt.Color(255, 255, 255));
        keterangan9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ketterangan6.setText("Janji temu telah");

        ketrangan7.setText("dikonfirmasi");

        keterangan8.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        keterangan8.setText("Janji temu anda ");

        namaDokter9.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        namaDokter9.setText("dengan Nama Dr");

        ketrangan10.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        ketrangan10.setText("telah dikonfirmasi");

        keterangan11.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        keterangan11.setText("pada tanggal :");

        javax.swing.GroupLayout keterangan9Layout = new javax.swing.GroupLayout(keterangan9);
        keterangan9.setLayout(keterangan9Layout);
        keterangan9Layout.setHorizontalGroup(
            keterangan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, keterangan9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(keterangan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(keterangan9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(keterangan11, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(keterangan9Layout.createSequentialGroup()
                        .addGroup(keterangan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ketterangan6)
                            .addComponent(ketrangan7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(keterangan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(keterangan9Layout.createSequentialGroup()
                                .addGroup(keterangan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ketrangan10)
                                    .addComponent(namaDokter9))
                                .addGap(3, 3, 3))
                            .addComponent(keterangan8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        keterangan9Layout.setVerticalGroup(
            keterangan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(keterangan9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ketterangan6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ketrangan7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(keterangan9Layout.createSequentialGroup()
                .addComponent(keterangan8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaDokter9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ketrangan10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(keterangan11)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        tombolKeluar.setBackground(new java.awt.Color(0, 0, 0));
        tombolKeluar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tombolKeluar.setForeground(new java.awt.Color(255, 255, 255));
        tombolKeluar.setText("Keluar");
        tombolKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolKeluarActionPerformed(evt);
            }
        });

        pilihanMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Menu--", "1. Pemesanan janji temu", "2. Riwayat konsultasi" }));
        pilihanMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihanMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(judulHalaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(BodyLayout.createSequentialGroup()
                                .addGap(0, 11, Short.MAX_VALUE)
                                .addComponent(panelJanjiTemu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(panelKonsultasiJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BodyLayout.createSequentialGroup()
                                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pemberitahuan)
                                    .addComponent(keterangan5))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(BodyLayout.createSequentialGroup()
                                .addComponent(keterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pilihanMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(keterangan9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(tombolKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        BodyLayout.setVerticalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judulHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keterangan)
                    .addComponent(pilihanMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelJanjiTemu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelKonsultasiJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pemberitahuan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(keterangan5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(keterangan9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tombolKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombolKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolKeluarActionPerformed
        // TODO add your handling code here:
        halamanLogin login = new halamanLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tombolKeluarActionPerformed

    private void pilihanMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihanMenuActionPerformed
        // TODO add your handling code here:
        String menuTerpilih = (String) pilihanMenu.getSelectedItem();
        if (menuTerpilih.equals("1. Pemesanan janji temu")) {
            halamanPemesananJanjiTemu janjiTemu = new halamanPemesananJanjiTemu ();
            janjiTemu.setVisible(true);
            this.dispose();
        } 
        else if (menuTerpilih.equals("2. Riwayat konsultasi")) {
            halamanRiwayatKonsultasi riwayat = new halamanRiwayatKonsultasi();
            riwayat.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_pilihanMenuActionPerformed

    public static void main(String args[]) {
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> new halamanHome().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JPanel jPanel2;
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
    private javax.swing.JPanel panelJanjiTemu;
    private javax.swing.JPanel panelKonsultasiJumlah;
    private javax.swing.JLabel pemberitahuan;
    private javax.swing.JComboBox<String> pilihanMenu;
    private javax.swing.JLabel tanggalJanji;
    private javax.swing.JLabel textJudul;
    private javax.swing.JButton tombolKeluar;
    // End of variables declaration//GEN-END:variables
}

