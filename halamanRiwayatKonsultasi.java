/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugas.sisteminformasiklinikkampusaplikasi;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class halamanRiwayatKonsultasi extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(halamanRiwayatKonsultasi.class.getName());
        public halamanRiwayatKonsultasi() {
            initComponents();
            this.setLocationRelativeTo(null);

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            // BARIS BARU: Tambahkan Mouse Listener ke tabel
            jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTable1MouseClicked(evt);
                }
            });

            for (int i = 0; i < dataJanjiTemu.jumlahJanjiTemu; i++) {
                // BARIS BARU: Tentukan Status berdasarkan dataJanjiTemu.statusSelesai
                String statusTeks = dataJanjiTemu.statusSelesai[i] ? "SELESAI ✔" : "Pending";

                Object[] rowData = new Object[]{
                    dataPengguna.nama,                  
                    dataJanjiTemu.keluhan[i],           
                    dataJanjiTemu.dokter[i],            
                    dataJanjiTemu.tanggal[i],
                    statusTeks // BARIS DIUBAH: Menambahkan statusTeks
                };
                model.addRow(rowData);
            }
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Body = new javax.swing.JPanel();
        judulHalaman = new javax.swing.JLabel();
        tombolKembali = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Body.setBackground(new java.awt.Color(255, 255, 255));

        judulHalaman.setBackground(new java.awt.Color(0, 204, 204));
        judulHalaman.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        judulHalaman.setText("RIWAYAT KONSULTASI");
        judulHalaman.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tombolKembali.setText("<");
        tombolKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolKembaliActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nama", "Keluhan", "Dokter", "Tanggal", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addComponent(tombolKembali)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(judulHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        BodyLayout.setVerticalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolKembali, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(judulHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                        
    int barisTerpilih = jTable1.getSelectedRow();
    
    if (barisTerpilih != -1) {
        // Ambil status janji temu saat ini dari array statis
        boolean sudahSelesai = dataJanjiTemu.statusSelesai[barisTerpilih];
        
        if (sudahSelesai) {
            JOptionPane.showMessageDialog(this, 
                "Janji temu ini sudah dikonfirmasi selesai.", 
                "Informasi", 
                JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String namaDokter = (String) jTable1.getValueAt(barisTerpilih, 2); // Kolom Dokter ada di indeks 2
        String tanggal = (String) jTable1.getValueAt(barisTerpilih, 3);   // Kolom Tanggal ada di indeks 3
        
        int konfirmasi = JOptionPane.showConfirmDialog(this,
            "Apakah pertemuan dengan " + namaDokter + " pada tanggal " + tanggal + " sudah selesai? \n\nKlik OK untuk konfirmasi.",
            "Konfirmasi Selesai Pertemuan",
            JOptionPane.OK_CANCEL_OPTION);

        if (konfirmasi == JOptionPane.OK_OPTION) {
            // Perbarui status di array statis
            dataJanjiTemu.statusSelesai[barisTerpilih] = true;
            
            // Perbarui tampilan tabel (Kolom Status ada di indeks 4)
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setValueAt("SELESAI ✔", barisTerpilih, 4); 
            
            JOptionPane.showMessageDialog(this, 
                "Pertemuan berhasil dikonfirmasi selesai!", 
                "Berhasil", 
                JOptionPane.INFORMATION_MESSAGE);
        }
    }
}    
    private void tombolKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolKembaliActionPerformed
        // TODO add your handling code here:
        halamanHome home = new halamanHome ();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tombolKembaliActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel judulHalaman;
    private javax.swing.JButton tombolKembali;
    // End of variables declaration//GEN-END:variables
}
