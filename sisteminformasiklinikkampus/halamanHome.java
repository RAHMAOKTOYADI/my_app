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
    private static final java.util.logging.Logger logger = 
        java.util.logging.Logger.getLogger(halamanHome.class.getName());
    
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
        
        if (!dataJanjiTemu.dokter.equals("Dr. Smith")) {
               ketterangan6.setText("Janji temu baru");
               ketrangan7.setText("telah dibuat!");
        }
    }
    
    // NOTE: initComponents() dan method lainnya sama persis seperti yang Anda berikan
    // Saya skip karena terlalu panjang, tapi tinggal tambahkan logger di atas saja
    
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
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

    // Variables declaration - sama seperti sebelumnya
}
