/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sisteminformasiklinikkampus;

/**
 *
 * @author YADI
 */
public class halamanManajemenJadwalDokter extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(halamanManajemenJawdwalDokter.class.getName());
    public halamanManajemenJawdwalDokter() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        judulHalaman = new javax.swing.JLabel();
        tombolKembali = new javax.swing.JButton();
        daftarDokter = new javax.swing.JLabel();
        panelKeternganDokter1 = new javax.swing.JPanel();
        namaDokter = new javax.swing.JLabel();
        keteranganDokter = new javax.swing.JLabel();
        hari = new javax.swing.JLabel();
        jamMulai = new javax.swing.JLabel();
        jamHabis = new javax.swing.JLabel();
        panelKeteranganDokter2 = new javax.swing.JPanel();
        namaDokter2 = new javax.swing.JLabel();
        keteranganDokter2 = new javax.swing.JLabel();
        hari2 = new javax.swing.JLabel();
        jamMulai2 = new javax.swing.JLabel();
        jamHabis2 = new javax.swing.JLabel();
        tombolEdit = new javax.swing.JButton();
        tombolHapus = new javax.swing.JButton();
        tombolTambahJadwal = new javax.swing.JButton();
        daftarDokterPilihan = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                bodyAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

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
        judulHalaman.setText("MANAJEMEN JADWAL DOKTER");
        judulHalaman.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tombolKembali.setText("<");
        tombolKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolKembaliActionPerformed(evt);
            }
        });

        daftarDokter.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        daftarDokter.setText("Daftar Dokter");

        panelKeternganDokter1.setBackground(new java.awt.Color(255, 255, 255));
        panelKeternganDokter1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        namaDokter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        namaDokter.setText("Dr. Sarah");

        keteranganDokter.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        keteranganDokter.setForeground(new java.awt.Color(153, 153, 153));
        keteranganDokter.setText("Spesialis Anak");

        hari.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hari.setText("Senin, Rabu");

        jamMulai.setBackground(new java.awt.Color(0, 0, 0));
        jamMulai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jamMulai.setText("Jumat - 09:00");

        jamHabis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jamHabis.setText("- 15:00");

        javax.swing.GroupLayout panelKeternganDokter1Layout = new javax.swing.GroupLayout(panelKeternganDokter1);
        panelKeternganDokter1.setLayout(panelKeternganDokter1Layout);
        panelKeternganDokter1Layout.setHorizontalGroup(
            panelKeternganDokter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKeternganDokter1Layout.createSequentialGroup()
                .addGroup(panelKeternganDokter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelKeternganDokter1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jamHabis))
                    .addGroup(panelKeternganDokter1Layout.createSequentialGroup()
                        .addGroup(panelKeternganDokter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaDokter)
                            .addComponent(keteranganDokter))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelKeternganDokter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hari, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jamMulai, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(68, 68, 68))
        );
        panelKeternganDokter1Layout.setVerticalGroup(
            panelKeternganDokter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKeternganDokter1Layout.createSequentialGroup()
                .addGroup(panelKeternganDokter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hari)
                    .addComponent(namaDokter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelKeternganDokter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jamMulai)
                    .addComponent(keteranganDokter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jamHabis)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelKeteranganDokter2.setBackground(new java.awt.Color(255, 255, 255));
        panelKeteranganDokter2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        namaDokter2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        namaDokter2.setText("Dr. Budi");

        keteranganDokter2.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        keteranganDokter2.setForeground(new java.awt.Color(153, 153, 153));
        keteranganDokter2.setText("Spesialis Jantung");

        hari2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hari2.setText("Selasa, Kamis");

        jamMulai2.setBackground(new java.awt.Color(0, 0, 0));
        jamMulai2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jamMulai2.setText("-10:00");

        jamHabis2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jamHabis2.setText("- 14:00");

        javax.swing.GroupLayout panelKeteranganDokter2Layout = new javax.swing.GroupLayout(panelKeteranganDokter2);
        panelKeteranganDokter2.setLayout(panelKeteranganDokter2Layout);
        panelKeteranganDokter2Layout.setHorizontalGroup(
            panelKeteranganDokter2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKeteranganDokter2Layout.createSequentialGroup()
                .addGroup(panelKeteranganDokter2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKeteranganDokter2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jamHabis2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKeteranganDokter2Layout.createSequentialGroup()
                        .addGroup(panelKeteranganDokter2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaDokter2)
                            .addComponent(keteranganDokter2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelKeteranganDokter2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jamMulai2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hari2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(68, 68, 68))
        );
        panelKeteranganDokter2Layout.setVerticalGroup(
            panelKeteranganDokter2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKeteranganDokter2Layout.createSequentialGroup()
                .addGroup(panelKeteranganDokter2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaDokter2)
                    .addComponent(hari2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelKeteranganDokter2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jamMulai2)
                    .addComponent(keteranganDokter2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jamHabis2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tombolEdit.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        tombolEdit.setText("Edit");
        tombolEdit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tombolEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolEditActionPerformed(evt);
            }
        });

        tombolHapus.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        tombolHapus.setText("Hapus");
        tombolHapus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tombolHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolHapusActionPerformed(evt);
            }
        });

        tombolTambahJadwal.setBackground(new java.awt.Color(0, 0, 0));
        tombolTambahJadwal.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        tombolTambahJadwal.setForeground(new java.awt.Color(255, 255, 255));
        tombolTambahJadwal.setText("Tambah Jadwal (+)");

        daftarDokterPilihan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(tombolKembali)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(judulHalaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addComponent(daftarDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(daftarDokterPilihan, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panelKeternganDokter1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelKeteranganDokter2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tombolTambahJadwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(bodyLayout.createSequentialGroup()
                                        .addComponent(tombolEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tombolHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(31, 31, 31)))))
                .addContainerGap())
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(judulHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolKembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(daftarDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(daftarDokterPilihan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panelKeternganDokter1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelKeteranganDokter2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tombolTambahJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(body, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombolKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolKembaliActionPerformed
        // TODO add your handling code here:
        halamanDasboard dasboard = new halamanDasboard ();
        dasboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tombolKembaliActionPerformed

    private void tombolEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tombolEditActionPerformed

    private void tombolHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolHapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tombolHapusActionPerformed

    private void bodyAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_bodyAncestorAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bodyAncestorAdded

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
        java.awt.EventQueue.invokeLater(() -> new halamanManajemenJawdwalDokter().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JLabel daftarDokter;
    private javax.swing.JComboBox<String> daftarDokterPilihan;
    private javax.swing.JLabel hari;
    private javax.swing.JLabel hari2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jamHabis;
    private javax.swing.JLabel jamHabis2;
    private javax.swing.JLabel jamMulai;
    private javax.swing.JLabel jamMulai2;
    private javax.swing.JLabel judulHalaman;
    private javax.swing.JLabel keteranganDokter;
    private javax.swing.JLabel keteranganDokter2;
    private javax.swing.JLabel namaDokter;
    private javax.swing.JLabel namaDokter2;
    private javax.swing.JPanel panelKeteranganDokter2;
    private javax.swing.JPanel panelKeternganDokter1;
    private javax.swing.JButton tombolEdit;
    private javax.swing.JButton tombolHapus;
    private javax.swing.JButton tombolKembali;
    private javax.swing.JButton tombolTambahJadwal;
    // End of variables declaration//GEN-END:variables
}
