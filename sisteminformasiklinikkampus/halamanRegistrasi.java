/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package com.sisteminformasiklinikkampus;

/**
 *
 * @author YADI
 */
public class halamanRegistrasi extends javax.swing.JFrame {
    public halamanRegistrasi() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Nim = new javax.swing.JLabel();
        nimInput = new javax.swing.JTextField();
        fakultas = new javax.swing.JLabel();
        pilihanFakultas = new javax.swing.JComboBox<>();
        email = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        passwordInput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        konfirmasiPasswordInput = new javax.swing.JTextField();
        konfirmasiPassword = new javax.swing.JLabel();
        tombolDaftar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Nim.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Nim.setText("NIM / Identitas karyawan");

        fakultas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fakultas.setText("Fakultas");

        pilihanFakultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
            "-- Pilih Fakultas --",
            "Fakultas Teknik",
            "Fakultas Ekonomi dan Bisnis",
            "Fakultas Ilmu Komputer",
            "Fakultas Kedokteran",
            "Fakultas Hukum",
            "Fakultas MIPA",
            "Fakultas Ilmu Sosial dan Politik",
            "Staf / Karyawan"
        }));
        pilihanFakultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihanFakultasActionPerformed(evt);
            }
        });

        email.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        email.setText("Email");

        passwordInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordInputActionPerformed(evt);
            }
        });

        jLabel4.setText("Password");

        konfirmasiPasswordInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konfirmasiPasswordInputActionPerformed(evt);
            }
        });

        konfirmasiPassword.setText("Konfirmasi password");

        tombolDaftar.setBackground(new java.awt.Color(0, 153, 153));
        tombolDaftar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tombolDaftar.setForeground(new java.awt.Color(255, 255, 255));
        tombolDaftar.setText("Daftar");
        tombolDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolDaftarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Nim)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nimInput)
                                    .addComponent(emailInput, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pilihanFakultas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(passwordInput, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(konfirmasiPasswordInput, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fakultas)
                                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)
                                            .addComponent(konfirmasiPassword))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(tombolDaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 93, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nimInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fakultas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pilihanFakultas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(konfirmasiPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(konfirmasiPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tombolDaftar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordInputActionPerformed

    private void konfirmasiPasswordInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konfirmasiPasswordInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_konfirmasiPasswordInputActionPerformed

    private void tombolDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolDaftarActionPerformed
        // TODO add your handling code here:
        String nim = nimInput.getText();
        String fakultas = (String) pilihanFakultas.getSelectedItem(); 
        String email = emailInput.getText();
        String pass = passwordInput.getText(); // Sebaiknya ganti jadi JPasswordField
        String konfirPass = konfirmasiPasswordInput.getText(); // Sebaiknya ganti jadi JPasswordField

        // Validasi Data
        if (nim.isEmpty() || email.isEmpty() || pass.isEmpty() || konfirPass.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Semua field harus diisi!");
            return; // Hentikan eksekusi
        }

        // Validasi pilihan fakultas
        if (fakultas.equals("-- Pilih Fakultas --")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Silakan pilih Fakultas Anda!");
            return; // Hentikan eksekusi
        }

        // Validasi format email
        if (!email.contains("@")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Format email tidak valid (harus mengandung '@')!");
            return; // Hentikan eksekusi
        }

        // Validasi password
        if (!pass.equals(konfirPass)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Password dan Konfirmasi Password tidak cocok!");
            return; // Hentikan eksekusi
        }

        // Buat nama dari email 
        String nama = "";
        int atIndex = email.indexOf('@'); // Cari posisi karakter '@'

        if (atIndex != -1) { // Jika '@' ditemukan
            nama = email.substring(0, atIndex); // Ambil teks dari awal sampai sebelum '@'
        } else {
            // Ini seharusnya tidak terjadi karena validasi di atas, tapi sebagai cadangan
            nama = email; 
        }

        //Simpan SEMUA data ke kelas statis DataPengguna (HANYA SATU KALI)
        dataPengguna.nama = nama;
        dataPengguna.nim = nim;       // Anda lupa menyimpan ini di blok kedua
        dataPengguna.fakultas = fakultas; // Anda lupa menyimpan ini di blok kedua
        dataPengguna.email = email;
        dataPengguna.password = pass;

        //Tampilkan pesan sukses dan kembali ke login (HANYA SATU KALI)
        javax.swing.JOptionPane.showMessageDialog(this, "Registrasi Berhasil! Silakan Login.");
        
        halamanLogin login = new halamanLogin();
        login.setVisible(true);
        this.dispose(); // Tutup jendela registrasi
    }//GEN-LAST:event_tombolDaftarActionPerformed

    private void pilihanFakultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihanFakultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pilihanFakultasActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nim;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel fakultas;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel konfirmasiPassword;
    private javax.swing.JTextField konfirmasiPasswordInput;
    private javax.swing.JTextField nimInput;
    private javax.swing.JTextField passwordInput;
    private javax.swing.JComboBox<String> pilihanFakultas;
    private javax.swing.JButton tombolDaftar;
    // End of variables declaration//GEN-END:variables

}
