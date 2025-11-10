/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sisteminformasiklinikkampus;

/**
 *
 * @author YADI
 */
public class halamanLogin extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(halamanLogin.class.getName());
    public halamanLogin() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        Body = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        judulAplikasi1 = new javax.swing.JLabel();
        judulAplikasi2 = new javax.swing.JLabel();
        tombolDaftar = new javax.swing.JButton();
        login = new javax.swing.JLabel();
        pesanMasuk = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        tombolLogin = new javax.swing.JButton();
        tombolLupaPassword = new javax.swing.JButton();
        emailInput = new javax.swing.JTextField();
        passwordInput = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Body.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        judulAplikasi1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        judulAplikasi1.setForeground(new java.awt.Color(255, 255, 255));
        judulAplikasi1.setText("SISTEM INFORMASI KLINIK");

        judulAplikasi2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        judulAplikasi2.setForeground(new java.awt.Color(255, 255, 255));
        judulAplikasi2.setText("KAMPUS");

        tombolDaftar.setBackground(new java.awt.Color(0, 102, 102));
        tombolDaftar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tombolDaftar.setForeground(new java.awt.Color(255, 255, 255));
        tombolDaftar.setText("DAFTAR");
        tombolDaftar.setBorder(new javax.swing.border.MatteBorder(null));
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
                .addGap(33, 33, 33)
                .addComponent(judulAplikasi1)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(tombolDaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(judulAplikasi2)
                        .addGap(110, 110, 110))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(judulAplikasi1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(judulAplikasi2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tombolDaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        login.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        login.setText("LOGIN");

        pesanMasuk.setText("Silahkan masuk ke akun anda !");

        email.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        email.setText("Email");

        password.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        password.setText("Password");

        tombolLogin.setBackground(new java.awt.Color(0, 102, 102));
        tombolLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tombolLogin.setForeground(new java.awt.Color(255, 255, 255));
        tombolLogin.setText("Login");
        tombolLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolLoginActionPerformed(evt);
            }
        });

        tombolLupaPassword.setForeground(new java.awt.Color(255, 51, 51));
        tombolLupaPassword.setText("  Klik disini jika anda lupa nama dan password akun anda !");
        tombolLupaPassword.setBorder(null);
        tombolLupaPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tombolLupaPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolLupaPasswordActionPerformed(evt);
            }
        });

        passwordInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tombolLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(login)
                                .addGap(132, 132, 132))
                            .addGroup(BodyLayout.createSequentialGroup()
                                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(password))
                                .addGap(23, 23, 23)
                                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailInput)
                                    .addGroup(BodyLayout.createSequentialGroup()
                                        .addComponent(pesanMasuk)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(passwordInput))
                                .addContainerGap())
                            .addGroup(BodyLayout.createSequentialGroup()
                                .addComponent(tombolLupaPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                                .addContainerGap())))))
        );
        BodyLayout.setVerticalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pesanMasuk)
                .addGap(12, 12, 12)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(password)
                    .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(tombolLupaPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tombolLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
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
    private void tombolLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolLoginActionPerformed
        // TODO add your handling code here:
        String email = emailInput.getText();
        String password = new String(passwordInput.getPassword());

        if (dataPengguna.email == null || dataPengguna.password == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Belum ada akun terdaftar. Silakan 'DAFTAR' terlebih dahulu.");
            return;
        }

        if (email.equals(dataPengguna.email) && password.equals(dataPengguna.password)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Login Berhasil! Selamat Datang.");
            halamanHome home = new halamanHome();
            home.setVisible(true);
            this.dispose(); 
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Email atau Password salah!");
        }
    }//GEN-LAST:event_tombolLoginActionPerformed

    private void tombolDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolDaftarActionPerformed
        // TODO add your handling code here:
        halamanRegistrasi formRegistrasi = new halamanRegistrasi();
        formRegistrasi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tombolDaftarActionPerformed

    private void passwordInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordInputActionPerformed
    
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
        java.awt.EventQueue.invokeLater(() -> new halamanLogin().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailInput;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel judulAplikasi1;
    private javax.swing.JLabel judulAplikasi2;
    private javax.swing.JLabel login;
    private javax.swing.JLabel password;
    private javax.swing.JTextField passwordInput;
    private javax.swing.JLabel pesanMasuk;
    private javax.swing.JButton tombolDaftar;
    private javax.swing.JButton tombolLogin;
    private javax.swing.JButton tombolLupaPassword;
    // End of variables declaration//GEN-END:variables
}
