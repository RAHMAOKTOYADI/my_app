/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sisteminformasiklinikkampus;

/**
 *
 * @author YADI
 */
public class halamanManajemenObat extends javax.swing.JFrame { 
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(halamanManajemenObat.class.getName());
    public halamanManajemenObat() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        judulHalaman = new javax.swing.JLabel();
        tombolKembali = new javax.swing.JButton();
        cariObat = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        ketererangan1 = new javax.swing.JLabel();
        panelKeteranganObat = new javax.swing.JPanel();
        namaObat = new javax.swing.JLabel();
        keteranganObat = new javax.swing.JLabel();
        keteranganKadaluarsa = new javax.swing.JLabel();
        stokObat = new javax.swing.JLabel();
        tanggalKadaluarsa = new javax.swing.JLabel();
        panelKeteranganObat2 = new javax.swing.JPanel();
        namaObat2 = new javax.swing.JLabel();
        keteranganObat2 = new javax.swing.JLabel();
        keteranganKadaluarsa2 = new javax.swing.JLabel();
        stokObat2 = new javax.swing.JLabel();
        tanggalKadaluarsa2 = new javax.swing.JLabel();
        penelKeteranganObat3 = new javax.swing.JPanel();
        namaObat3 = new javax.swing.JLabel();
        keteranganObat3 = new javax.swing.JLabel();
        keteranganKadaluarsa3 = new javax.swing.JLabel();
        stokObat3 = new javax.swing.JLabel();
        tanggalKadaluarsa3 = new javax.swing.JLabel();
        tombolEdit = new javax.swing.JButton();
        tombolPencatatanPenyaluran = new javax.swing.JButton();
        tombolTambahObat = new javax.swing.JButton();

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
        judulHalaman.setText("MANAJEMEN OBAT");
        judulHalaman.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tombolKembali.setText("<");
        tombolKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolKembaliActionPerformed(evt);
            }
        });

        cariObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariObatActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cari..");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ketererangan1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ketererangan1.setText("Persediaan Obat");

        panelKeteranganObat.setBackground(new java.awt.Color(255, 255, 255));
        panelKeteranganObat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        namaObat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        namaObat.setText("Aspirin");

        keteranganObat.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        keteranganObat.setForeground(new java.awt.Color(153, 153, 153));
        keteranganObat.setText("Penghilang rasa sakit");

        keteranganKadaluarsa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        keteranganKadaluarsa.setText("Kadaluarsa Pada");

        stokObat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        stokObat.setText("Stok : 20");

        tanggalKadaluarsa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tanggalKadaluarsa.setText("12/10/2027");

        javax.swing.GroupLayout panelKeteranganObatLayout = new javax.swing.GroupLayout(panelKeteranganObat);
        panelKeteranganObat.setLayout(panelKeteranganObatLayout);
        panelKeteranganObatLayout.setHorizontalGroup(
            panelKeteranganObatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKeteranganObatLayout.createSequentialGroup()
                .addGroup(panelKeteranganObatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelKeteranganObatLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panelKeteranganObatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelKeteranganObatLayout.createSequentialGroup()
                                .addComponent(namaObat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(stokObat))
                            .addGroup(panelKeteranganObatLayout.createSequentialGroup()
                                .addComponent(keteranganObat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(keteranganKadaluarsa))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKeteranganObatLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tanggalKadaluarsa)))
                .addContainerGap())
        );
        panelKeteranganObatLayout.setVerticalGroup(
            panelKeteranganObatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKeteranganObatLayout.createSequentialGroup()
                .addGroup(panelKeteranganObatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(stokObat)
                    .addComponent(namaObat, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelKeteranganObatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(keteranganObat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keteranganKadaluarsa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tanggalKadaluarsa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelKeteranganObat2.setBackground(new java.awt.Color(255, 255, 255));
        panelKeteranganObat2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        namaObat2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        namaObat2.setText("Paracetamol");

        keteranganObat2.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        keteranganObat2.setForeground(new java.awt.Color(153, 153, 153));
        keteranganObat2.setText("Penurun demam");

        keteranganKadaluarsa2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        keteranganKadaluarsa2.setText("Kadaluarsa Pada");

        stokObat2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        stokObat2.setText("Stok : 5");

        tanggalKadaluarsa2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tanggalKadaluarsa2.setText("21/09/2026");

        javax.swing.GroupLayout panelKeteranganObat2Layout = new javax.swing.GroupLayout(panelKeteranganObat2);
        panelKeteranganObat2.setLayout(panelKeteranganObat2Layout);
        panelKeteranganObat2Layout.setHorizontalGroup(
            panelKeteranganObat2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKeteranganObat2Layout.createSequentialGroup()
                .addGroup(panelKeteranganObat2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelKeteranganObat2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panelKeteranganObat2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelKeteranganObat2Layout.createSequentialGroup()
                                .addComponent(namaObat2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(stokObat2))
                            .addGroup(panelKeteranganObat2Layout.createSequentialGroup()
                                .addComponent(keteranganObat2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(keteranganKadaluarsa2))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKeteranganObat2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tanggalKadaluarsa2)))
                .addContainerGap())
        );
        panelKeteranganObat2Layout.setVerticalGroup(
            panelKeteranganObat2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKeteranganObat2Layout.createSequentialGroup()
                .addGroup(panelKeteranganObat2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(stokObat2)
                    .addComponent(namaObat2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelKeteranganObat2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(keteranganObat2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keteranganKadaluarsa2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tanggalKadaluarsa2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        penelKeteranganObat3.setBackground(new java.awt.Color(255, 255, 255));
        penelKeteranganObat3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        namaObat3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        namaObat3.setText("Aspirin");

        keteranganObat3.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        keteranganObat3.setForeground(new java.awt.Color(153, 153, 153));
        keteranganObat3.setText("Penghilang rasa sakit");

        keteranganKadaluarsa3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        keteranganKadaluarsa3.setText("Kadaluarsa Pada");

        stokObat3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        stokObat3.setText("Stok : 20");

        tanggalKadaluarsa3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tanggalKadaluarsa3.setText("12/10/2027");

        javax.swing.GroupLayout penelKeteranganObat3Layout = new javax.swing.GroupLayout(penelKeteranganObat3);
        penelKeteranganObat3.setLayout(penelKeteranganObat3Layout);
        penelKeteranganObat3Layout.setHorizontalGroup(
            penelKeteranganObat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penelKeteranganObat3Layout.createSequentialGroup()
                .addGroup(penelKeteranganObat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(penelKeteranganObat3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(penelKeteranganObat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaObat3)
                            .addComponent(keteranganObat3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(penelKeteranganObat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stokObat3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(keteranganKadaluarsa3, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, penelKeteranganObat3Layout.createSequentialGroup()
                        .addContainerGap(217, Short.MAX_VALUE)
                        .addComponent(tanggalKadaluarsa3)))
                .addContainerGap())
        );
        penelKeteranganObat3Layout.setVerticalGroup(
            penelKeteranganObat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penelKeteranganObat3Layout.createSequentialGroup()
                .addGroup(penelKeteranganObat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stokObat3)
                    .addComponent(namaObat3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(penelKeteranganObat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keteranganKadaluarsa3)
                    .addComponent(keteranganObat3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tanggalKadaluarsa3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tombolEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tombolEdit.setText("Edit");

        tombolPencatatanPenyaluran.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tombolPencatatanPenyaluran.setText("Pencatatan Penyaluran");

        tombolTambahObat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tombolTambahObat.setText("Tambahkan Obat Baru (+)");

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tombolKembali)
                .addGap(8, 8, 8)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addComponent(cariObat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(judulHalaman, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addComponent(ketererangan1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelKeteranganObat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelKeteranganObat2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(penelKeteranganObat3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tombolPencatatanPenyaluran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tombolEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tombolTambahObat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(judulHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolKembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cariObat)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(ketererangan1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelKeteranganObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelKeteranganObat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(penelKeteranganObat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tombolEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tombolPencatatanPenyaluran, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tombolTambahObat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
        halamanDasboard dasboard = new halamanDasboard ();
        dasboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tombolKembaliActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cariObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariObatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cariObatActionPerformed
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
        java.awt.EventQueue.invokeLater(() -> new halamanManajemenObat().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JTextField cariObat;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel judulHalaman;
    private javax.swing.JLabel keteranganKadaluarsa;
    private javax.swing.JLabel keteranganKadaluarsa2;
    private javax.swing.JLabel keteranganKadaluarsa3;
    private javax.swing.JLabel keteranganObat;
    private javax.swing.JLabel keteranganObat2;
    private javax.swing.JLabel keteranganObat3;
    private javax.swing.JLabel ketererangan1;
    private javax.swing.JLabel namaObat;
    private javax.swing.JLabel namaObat2;
    private javax.swing.JLabel namaObat3;
    private javax.swing.JPanel panelKeteranganObat;
    private javax.swing.JPanel panelKeteranganObat2;
    private javax.swing.JPanel penelKeteranganObat3;
    private javax.swing.JLabel stokObat;
    private javax.swing.JLabel stokObat2;
    private javax.swing.JLabel stokObat3;
    private javax.swing.JLabel tanggalKadaluarsa;
    private javax.swing.JLabel tanggalKadaluarsa2;
    private javax.swing.JLabel tanggalKadaluarsa3;
    private javax.swing.JButton tombolEdit;
    private javax.swing.JButton tombolKembali;
    private javax.swing.JButton tombolPencatatanPenyaluran;
    private javax.swing.JButton tombolTambahObat;
    // End of variables declaration//GEN-END:variables
}
