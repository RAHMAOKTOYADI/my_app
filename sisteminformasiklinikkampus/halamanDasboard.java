/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sisteminformasiklinikkampus;

/**
 *
 * @author YADI
 */
public class halamanDasboard extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(halamanDasboard.class.getName());
    public halamanDasboard() {
        initComponents();
        if (dataPengguna.nama != null && !dataPengguna.nama.isEmpty()) {
            namaUser.setText(dataPengguna.nama);
        } else {
            namaUser.setText("Pengguna"); 
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        judulHalaman = new javax.swing.JLabel();
        namaUser = new javax.swing.JLabel();
        labelKeterangan = new javax.swing.JLabel();
        tombolKembali = new javax.swing.JButton();
        tombolJadwal = new javax.swing.JButton();
        tombolManajemen = new javax.swing.JButton();
        tombolLaporan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setForeground(new java.awt.Color(255, 255, 255));

        panel.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        judulHalaman.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        judulHalaman.setText("DASBOARD ADMINISTRATOR");
        judulHalaman.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        namaUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        namaUser.setText("NAMA");

        labelKeterangan.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        labelKeterangan.setForeground(new java.awt.Color(153, 153, 153));
        labelKeterangan.setText("Administrator");

        tombolKembali.setBackground(new java.awt.Color(0, 0, 0));
        tombolKembali.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tombolKembali.setForeground(new java.awt.Color(255, 255, 255));
        tombolKembali.setText("Kembali");
        tombolKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolKembaliActionPerformed(evt);
            }
        });

        tombolJadwal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tombolJadwal.setText("     Jadwal Dokter");
        tombolJadwal.setBorder(null);
        tombolJadwal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tombolJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolJadwalActionPerformed(evt);
            }
        });

        tombolManajemen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tombolManajemen.setText("     Manajemen Obat");
        tombolManajemen.setBorder(null);
        tombolManajemen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tombolManajemen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolManajemenActionPerformed(evt);
            }
        });

        tombolLaporan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tombolLaporan.setText("     Laporan Kesehatan");
        tombolLaporan.setBorder(null);
        tombolLaporan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tombolLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolLaporanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(judulHalaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelKeterangan)
                                    .addComponent(namaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(tombolKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 152, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tombolManajemen, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tombolJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tombolLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judulHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(namaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tombolJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tombolManajemen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tombolLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(tombolKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
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
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombolKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolKembaliActionPerformed
        // TODO add your handling code here:
        halamanHome home = new halamanHome();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tombolKembaliActionPerformed

    private void tombolLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolLaporanActionPerformed
        // TODO add your handling code here:
        halamanLaporanKesehatan laporan = new halamanLaporanKesehatan();
        laporan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tombolLaporanActionPerformed

    private void tombolJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolJadwalActionPerformed
        // TODO add your handling code here:
        halamanManajemenJawdwalDokter jadwal = new halamanManajemenJawdwalDokter ();
        jadwal.setVisible(true);
        this.dispose();    
    }//GEN-LAST:event_tombolJadwalActionPerformed

    private void tombolManajemenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolManajemenActionPerformed
        // TODO add your handling code here:
        halamanManajemenObat obat = new halamanManajemenObat ();
        obat.setVisible(true);
        this.dispose();     
    }//GEN-LAST:event_tombolManajemenActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new halamanDasboard().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JLabel judulHalaman;
    private javax.swing.JLabel labelKeterangan;
    private javax.swing.JLabel namaUser;
    private javax.swing.JPanel panel;
    private javax.swing.JButton tombolJadwal;
    private javax.swing.JButton tombolKembali;
    private javax.swing.JButton tombolLaporan;
    private javax.swing.JButton tombolManajemen;
    // End of variables declaration//GEN-END:variables
}
