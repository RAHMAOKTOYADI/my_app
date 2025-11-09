/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sisteminformasiklinikkampus;

/**
 *
 * @author YADI
 */
public class halamanLaporanKesehatan extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(halamanLaporanKesehatan.class.getName());
    public halamanLaporanKesehatan() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        judulHalaman = new javax.swing.JLabel();
        tombolKembali = new javax.swing.JButton();
        namaPasien = new javax.swing.JLabel();
        Tanggal = new javax.swing.JLabel();
        Dokter = new javax.swing.JLabel();
        Pengaduan = new javax.swing.JLabel();
        Diagnosis = new javax.swing.JLabel();
        Resep = new javax.swing.JLabel();
        inputNamaPasien = new javax.swing.JTextField();
        inputTanggal = new javax.swing.JTextField();
        InputDokter = new javax.swing.JTextField();
        inputPengaduan = new javax.swing.JTextField();
        inputDiagnosis = new javax.swing.JTextField();
        inputResep = new javax.swing.JTextField();
        Statistik = new javax.swing.JLabel();
        keterangan = new javax.swing.JLabel();
        panelJumlahKunjungan = new javax.swing.JPanel();
        keterangan2 = new javax.swing.JLabel();
        jumlahKunjungan = new javax.swing.JLabel();
        persentaseKunjungan = new javax.swing.JLabel();
        panelTambahPasien = new javax.swing.JPanel();
        keterangan3 = new javax.swing.JLabel();
        jumlahPasienBaru = new javax.swing.JLabel();
        persentasePasienTambah = new javax.swing.JLabel();
        tombolTambahCatatan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        body.setBackground(new java.awt.Color(255, 255, 255));

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

        judulHalaman.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        judulHalaman.setText("LAPORAN DAN REKAM KESEHATAN");
        judulHalaman.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tombolKembali.setText("<");
        tombolKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolKembaliActionPerformed(evt);
            }
        });

        namaPasien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        namaPasien.setText("Nama Pasien");

        Tanggal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Tanggal.setText("Tanggal");

        Dokter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Dokter.setText("Dokter");

        Pengaduan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Pengaduan.setText("Pengaduan");

        Diagnosis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Diagnosis.setText("Diagnosis");

        Resep.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Resep.setText("Resep");

        inputTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTanggalActionPerformed(evt);
            }
        });

        InputDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputDokterActionPerformed(evt);
            }
        });

        inputPengaduan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPengaduanActionPerformed(evt);
            }
        });

        inputDiagnosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDiagnosisActionPerformed(evt);
            }
        });

        inputResep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputResepActionPerformed(evt);
            }
        });

        Statistik.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        Statistik.setText("Statsitik Konsultasi Pasien");

        keterangan.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        keterangan.setForeground(new java.awt.Color(153, 153, 153));
        keterangan.setText("Ringkasan mingguan");

        panelJumlahKunjungan.setBackground(new java.awt.Color(255, 255, 255));
        panelJumlahKunjungan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        keterangan2.setBackground(new java.awt.Color(255, 255, 255));
        keterangan2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        keterangan2.setForeground(new java.awt.Color(153, 153, 153));
        keterangan2.setText("Jumlah Kunjungan");

        jumlahKunjungan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jumlahKunjungan.setText("150");

        persentaseKunjungan.setText("+10%");

        javax.swing.GroupLayout panelJumlahKunjunganLayout = new javax.swing.GroupLayout(panelJumlahKunjungan);
        panelJumlahKunjungan.setLayout(panelJumlahKunjunganLayout);
        panelJumlahKunjunganLayout.setHorizontalGroup(
            panelJumlahKunjunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJumlahKunjunganLayout.createSequentialGroup()
                .addGroup(panelJumlahKunjunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(keterangan2)
                    .addComponent(jumlahKunjungan)
                    .addComponent(persentaseKunjungan))
                .addGap(0, 46, Short.MAX_VALUE))
        );
        panelJumlahKunjunganLayout.setVerticalGroup(
            panelJumlahKunjunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJumlahKunjunganLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(keterangan2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jumlahKunjungan, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(persentaseKunjungan, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        panelTambahPasien.setBackground(new java.awt.Color(255, 255, 255));
        panelTambahPasien.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        keterangan3.setBackground(new java.awt.Color(255, 255, 255));
        keterangan3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        keterangan3.setForeground(new java.awt.Color(153, 153, 153));
        keterangan3.setText("Pasien Baru");

        jumlahPasienBaru.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jumlahPasienBaru.setText("3");

        persentasePasienTambah.setText("+5%");

        javax.swing.GroupLayout panelTambahPasienLayout = new javax.swing.GroupLayout(panelTambahPasien);
        panelTambahPasien.setLayout(panelTambahPasienLayout);
        panelTambahPasienLayout.setHorizontalGroup(
            panelTambahPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTambahPasienLayout.createSequentialGroup()
                .addGroup(panelTambahPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(keterangan3)
                    .addComponent(jumlahPasienBaru)
                    .addComponent(persentasePasienTambah))
                .addGap(0, 76, Short.MAX_VALUE))
        );
        panelTambahPasienLayout.setVerticalGroup(
            panelTambahPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTambahPasienLayout.createSequentialGroup()
                .addComponent(keterangan3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jumlahPasienBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(persentasePasienTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        tombolTambahCatatan.setBackground(new java.awt.Color(0, 0, 0));
        tombolTambahCatatan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tombolTambahCatatan.setForeground(new java.awt.Color(255, 255, 255));
        tombolTambahCatatan.setText("Tambah catatan (+)");

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tombolKembali)
                .addGap(7, 7, 7)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(judulHalaman, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputNamaPasien)
                            .addComponent(inputTanggal)
                            .addComponent(InputDokter)
                            .addComponent(inputPengaduan)
                            .addComponent(inputDiagnosis)
                            .addComponent(inputResep)
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addComponent(panelJumlahKunjungan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelTambahPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pengaduan)
                                    .addComponent(namaPasien)
                                    .addComponent(Resep)
                                    .addComponent(Tanggal)
                                    .addComponent(Dokter)
                                    .addComponent(Diagnosis)
                                    .addComponent(Statistik)
                                    .addComponent(keterangan))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tombolTambahCatatan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(judulHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolKembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Dokter, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pengaduan, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputPengaduan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Diagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputDiagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Resep, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputResep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Statistik, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addComponent(keterangan)
                        .addGap(18, 18, 18)
                        .addComponent(panelJumlahKunjungan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelTambahPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tombolTambahCatatan, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombolKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolKembaliActionPerformed
        // TODO add your handling code here:
        halamanDasboard dasboard = new halamanDasboard ();
        dasboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tombolKembaliActionPerformed

    private void inputTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTanggalActionPerformed

    private void InputDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputDokterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputDokterActionPerformed

    private void inputPengaduanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPengaduanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPengaduanActionPerformed

    private void inputDiagnosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDiagnosisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDiagnosisActionPerformed

    private void inputResepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputResepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputResepActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new halamanLaporanKesehatan().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Diagnosis;
    private javax.swing.JLabel Dokter;
    private javax.swing.JTextField InputDokter;
    private javax.swing.JLabel Pengaduan;
    private javax.swing.JLabel Resep;
    private javax.swing.JLabel Statistik;
    private javax.swing.JLabel Tanggal;
    private javax.swing.JPanel body;
    private javax.swing.JTextField inputDiagnosis;
    private javax.swing.JTextField inputNamaPasien;
    private javax.swing.JTextField inputPengaduan;
    private javax.swing.JTextField inputResep;
    private javax.swing.JTextField inputTanggal;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel judulHalaman;
    private javax.swing.JLabel jumlahKunjungan;
    private javax.swing.JLabel jumlahPasienBaru;
    private javax.swing.JLabel keterangan;
    private javax.swing.JLabel keterangan2;
    private javax.swing.JLabel keterangan3;
    private javax.swing.JLabel namaPasien;
    private javax.swing.JPanel panelJumlahKunjungan;
    private javax.swing.JPanel panelTambahPasien;
    private javax.swing.JLabel persentaseKunjungan;
    private javax.swing.JLabel persentasePasienTambah;
    private javax.swing.JButton tombolKembali;
    private javax.swing.JButton tombolTambahCatatan;
    // End of variables declaration//GEN-END:variables
}
