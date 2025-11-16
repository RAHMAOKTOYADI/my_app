/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package tugas.sisteminformasiklinikkampusaplikasi;

public class halamanRegistrasi extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(halamanRegistrasi.class.getName());
    public halamanRegistrasi() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
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
        tombolDaftar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);

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

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Password");

        konfirmasiPasswordInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konfirmasiPasswordInputActionPerformed(evt);
            }
        });

        konfirmasiPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        konfirmasiPassword.setText("Konfirmasi password");

        tombolDaftar.setBackground(new java.awt.Color(0, 0, 0));
        tombolDaftar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tombolDaftar.setForeground(new java.awt.Color(255, 255, 255));
        tombolDaftar.setText("Daftar");
        tombolDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolDaftarActionPerformed(evt);
            }
        });

        tombolDaftar1.setBackground(new java.awt.Color(0, 0, 0));
        tombolDaftar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tombolDaftar1.setForeground(new java.awt.Color(255, 255, 255));
        tombolDaftar1.setText("kembali");
        tombolDaftar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolDaftar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tombolDaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tombolDaftar1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Nim)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(konfirmasiPasswordInput, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordInput, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailInput, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pilihanFakultas, javax.swing.GroupLayout.Alignment.LEADING, 0, 304, Short.MAX_VALUE)
                            .addComponent(fakultas, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(konfirmasiPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nimInput, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addContainerGap(7, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(345, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolDaftar)
                    .addComponent(tombolDaftar1))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
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
                    .addContainerGap(64, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
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

    private void tombolDaftar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolDaftar1ActionPerformed
        // TODO add your handling code here:
        halamanLogin login = new halamanLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tombolDaftar1ActionPerformed

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
    private javax.swing.JButton tombolDaftar1;
    // End of variables declaration//GEN-END:variables

}
