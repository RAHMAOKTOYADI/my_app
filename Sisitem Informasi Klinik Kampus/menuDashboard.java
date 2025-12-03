/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class menuDashboard extends javax.swing.JPanel {

    /**
     * Creates new form menuDashboard
     */
    
    public void updateNotificationBadge() {
       int unreadCount = 0;

        if (userData.currentUser != null) {
            for (userData.Appointment app : userData.currentUser.appointments) {
                boolean adaPesanKonfirmasi = false;
                
                if (app.status.equalsIgnoreCase("Terkonfirmasi") || app.status.equalsIgnoreCase("Pengajuan Batal")) {
                    adaPesanKonfirmasi = true;
                } 
                else if (app.status.equalsIgnoreCase("Dibatalkan") && app.pernahDikonfirmasi == true) {
                    adaPesanKonfirmasi = true;
                }
               
                if (adaPesanKonfirmasi && app.isRead == false) {
                    unreadCount++;
                }

                if (app.status.equalsIgnoreCase("Dibatalkan") && app.isReadPembatalan == false) {
                    unreadCount++;
                }
            }
        }
        if (unreadCount > 0) {
            jLabel8.setText(String.valueOf(unreadCount));
            jLabel8.setForeground(java.awt.Color.RED);
        } else {
            jLabel8.setText("...");
            jLabel8.setForeground(java.awt.Color.BLACK);
        }
    }
    public menuDashboard() {
       initComponents();
       startTypingAnimation();
       updateNotificationBadge();
        
        jTable2.setEnabled(true); 
        jTable2.setRowSelectionAllowed(true); 
        
        jTable2.setDefaultEditor(Object.class, null);

        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = jTable2.rowAtPoint(evt.getPoint());
                int col = jTable2.columnAtPoint(evt.getPoint());
                System.out.println("Klik baris: " + row + ", Kolom: " + col);
                if (row >= 0 && col == 4) { 
                    prosesPenyelesaianKonsultasi(row);
                }
            }
        });
        
        if (userData.currentUser != null) {
            jLabel4.setText(userData.currentUser.username); 
            jLabel7.setText(userData.currentUser.nim + " - " + userData.currentUser.fakultas);
            updateDashboardData();
        } else {
            jLabel4.setText("Guest"); 
            jLabel7.setText("-");
        }
    }
   private void prosesPenyelesaianKonsultasi(int row) {
        userData.Appointment app = userData.currentUser.appointments.get(row);
        if (app.status.equalsIgnoreCase("Menunggu")) {          
            int confirm = javax.swing.JOptionPane.showConfirmDialog(this, 
                    "Status masih MENUNGGU. Batalkan pesanan ini?", 
                    "Konfirmasi Pembatalan", 
                    javax.swing.JOptionPane.YES_NO_OPTION);          
            if (confirm == javax.swing.JOptionPane.YES_OPTION) {
                app.status = "Dibatalkan";                
                userData.Notification notifBaru = new userData.Notification(
                        "Pembatalan Berhasil", 
                        "Anda membatalkan janji temu dengan " + app.dokter + " (Status: Menunggu)."
                );
                userData.currentUser.notifications.add(notifBaru);             
                updateDashboardData();     
                updateNotificationBadge(); 
                
                javax.swing.JOptionPane.showMessageDialog(this, "Pesanan berhasil dibatalkan.");
            }
        } else if (app.status.equalsIgnoreCase("Terkonfirmasi")) {
            Object[] options = {"Selesaikan Pertemuan", "Ajukan Pembatalan", "Tutup"};           
            int choice = javax.swing.JOptionPane.showOptionDialog(this,
                    "Jadwal TERKONFIRMASI.\nApa tindakan Anda selanjutnya?",
                    "Konfirmasi Tindakan",
                    javax.swing.JOptionPane.YES_NO_CANCEL_OPTION,
                    javax.swing.JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[2]); 
            if (choice == 0) {
                app.status = "Selesai"; 
                userData.Notification notifBaru = new userData.Notification(
                        "Konsultasi Selesai", 
                        "Terima kasih! Pertemuan dengan " + app.dokter + " telah selesai."
                );
                userData.currentUser.notifications.add(notifBaru);
                updateDashboardData();
                updateNotificationBadge();
                
                javax.swing.JOptionPane.showMessageDialog(this, 
                        "Pertemuan ditandai SELESAI.\n" +
                        "Data telah dipindahkan ke menu Riwayat & Jumlah Konsultasi bertambah.");
            }
            else if (choice == 1) {
                app.status = "Pengajuan Batal";               
                userData.Notification notifBaru = new userData.Notification(
                        "Pengajuan Terkirim", 
                        "Pengajuan pembatalan untuk " + app.dokter + " berhasil dikirim ke Admin."
                );
                userData.currentUser.notifications.add(notifBaru);
                
                updateDashboardData();          
                updateNotificationBadge();      
                
                javax.swing.JOptionPane.showMessageDialog(this, "Pengajuan dikirim. Tunggu persetujuan Admin.");               
            }
            
        } else { 
            javax.swing.JOptionPane.showMessageDialog(this, 
                    "Status pesanan: " + app.status + "\nTidak ada aksi tersedia.",
                    "Info", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void updateDashboardData() {
       javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);        
        model.setColumnIdentifiers(new String[] {
            "Nama", "Keluhan", "Waktu", "Dokter", "Status"
        });

        java.util.List<userData.Appointment> apps = userData.currentUser.appointments;
        int jumlahSelesai = 0; 

        for (userData.Appointment app : apps) {
            model.addRow(new Object[]{
                app.namaPasien,
                app.keluhan,
                app.hari + " " + app.waktu, 
                app.dokter,
                app.status
            });
            
            if (app.status.equalsIgnoreCase("Selesai")) {
                jumlahSelesai++;
            }
        }
        if (!apps.isEmpty()) {
            userData.Appointment latest = apps.get(apps.size() - 1);
            labelJumlah.setText(latest.dokter + " - " + latest.hari);
            jLabel1.setText(latest.status); 
        } else {
            labelJumlah.setText("Belum ada");
            jLabel1.setText("-");
        }
        
        labelJumlah1.setText(String.valueOf(jumlahSelesai));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cardAnggota = new javax.swing.JPanel();
        labelAnggota = new javax.swing.JLabel();
        labelJumlah = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cardAnggota1 = new javax.swing.JPanel();
        labelAnggota1 = new javax.swing.JLabel();
        labelJumlah1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelAnggota2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        labelAnggota5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        labelAnggota4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        labelAnggota3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(488, 518));
        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        cardAnggota.setBackground(new java.awt.Color(255, 255, 255));
        cardAnggota.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelAnggota.setBackground(new java.awt.Color(255, 255, 255));
        labelAnggota.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelAnggota.setForeground(new java.awt.Color(153, 153, 153));
        labelAnggota.setText("Janji Temu Terbaru");

        labelJumlah.setBackground(new java.awt.Color(255, 255, 255));
        labelJumlah.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelJumlah.setText("Belum ada ");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Terkonfirmasi");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-planner.gif"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cardAnggotaLayout = new javax.swing.GroupLayout(cardAnggota);
        cardAnggota.setLayout(cardAnggotaLayout);
        cardAnggotaLayout.setHorizontalGroup(
            cardAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardAnggotaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAnggota)
                    .addComponent(labelJumlah)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        cardAnggotaLayout.setVerticalGroup(
            cardAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardAnggotaLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(labelAnggota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelJumlah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(cardAnggotaLayout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        cardAnggota1.setBackground(new java.awt.Color(255, 255, 255));
        cardAnggota1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelAnggota1.setBackground(new java.awt.Color(255, 255, 255));
        labelAnggota1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelAnggota1.setForeground(new java.awt.Color(102, 102, 102));
        labelAnggota1.setText("Jumlah Konsultasi");

        labelJumlah1.setBackground(new java.awt.Color(255, 255, 255));
        labelJumlah1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelJumlah1.setText("...       ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Tercatat Selesai");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-task-completed.gif"))); // NOI18N

        javax.swing.GroupLayout cardAnggota1Layout = new javax.swing.GroupLayout(cardAnggota1);
        cardAnggota1.setLayout(cardAnggota1Layout);
        cardAnggota1Layout.setHorizontalGroup(
            cardAnggota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardAnggota1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardAnggota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(labelAnggota1)
                    .addComponent(labelJumlah1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        cardAnggota1Layout.setVerticalGroup(
            cardAnggota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardAnggota1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardAnggota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardAnggota1Layout.createSequentialGroup()
                        .addComponent(labelAnggota1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelJumlah1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-user (1).gif"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("NAMA");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("NIM               ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 281, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelAnggota2.setBackground(new java.awt.Color(255, 255, 255));
        labelAnggota2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelAnggota2.setForeground(new java.awt.Color(102, 102, 102));
        labelAnggota2.setText("Profile");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-user.gif"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        labelAnggota5.setBackground(new java.awt.Color(255, 255, 255));
        labelAnggota5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelAnggota5.setForeground(new java.awt.Color(102, 102, 102));
        labelAnggota5.setText("Mahasiswa");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAnggota2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAnggota5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(labelAnggota2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelAnggota5)
                        .addGap(27, 27, 27))))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel4AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        labelAnggota4.setBackground(new java.awt.Color(255, 255, 255));
        labelAnggota4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelAnggota4.setForeground(new java.awt.Color(102, 102, 102));
        labelAnggota4.setText("Notifikasi");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-sms.gif"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("...");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAnggota4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(labelAnggota4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTable2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Keluhan", "Tanggal & jam", "Dokter", "Keterangan"
            }
        ));
        jTable2.setEnabled(false);
        jTable2.setRowHeight(40);
        jScrollPane2.setViewportView(jTable2);

        jLabel5.setBackground(new java.awt.Color(0, 153, 153));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Selamat Datang !!!");
        jLabel5.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel5AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        labelAnggota3.setBackground(new java.awt.Color(255, 255, 255));
        labelAnggota3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelAnggota3.setForeground(new java.awt.Color(102, 102, 102));
        labelAnggota3.setText("   Tabel Pencatatan ");

        jPanel5.setBackground(new java.awt.Color(153, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("  1. KONFIRMASI JADWAL: Janji temu baru hanya dianggap sah setelah \n      menerima status 'TERKONFIRMASI'.\n\n  2. BATAS PEMBATALAN: Pembatalan janji harus dilakukan min. 4 jam \n      sebelum jadwal.\n\n  3. BANTUAN TEKNIS: Hubungi Ext. 101 jika ada masalah login atau jadwal\n      mendadak.");
        jTextArea1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(jTextArea1);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Informasi Penggunaan !!!");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-info.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAnggota3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cardAnggota1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cardAnggota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cardAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cardAnggota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addComponent(labelAnggota3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel5AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel5AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5AncestorAdded

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        halamanNotifikasi notif = new halamanNotifikasi(this);
        notif.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jPanel4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel4AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4AncestorAdded

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        profilMahasiswa mahasiswa = new profilMahasiswa();
        mahasiswa.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
    private void startTypingAnimation() {
        charIndex = 0;
        jLabel5.setText(""); 
        typingTimer = new javax.swing.Timer(TYPING_DELAY, (e) -> {
            if (charIndex < TARGET_TEXT.length()) {
                String currentText = TARGET_TEXT.substring(0, charIndex + 1);
                jLabel5.setText(currentText + "|"); 
                charIndex++;
            } else {
                typingTimer.stop();
                jLabel5.setText(TARGET_TEXT); 
                startLoopTimer(); 
            }
        });
        typingTimer.start();
    }
    
    private void startLoopTimer() {
        loopTimer = new javax.swing.Timer(LOOP_DELAY, (e) -> {
            loopTimer.stop();
            startTypingAnimation(); 
        });
        loopTimer.setRepeats(false); 
        loopTimer.start();
    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cardAnggota;
    private javax.swing.JPanel cardAnggota1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelAnggota;
    private javax.swing.JLabel labelAnggota1;
    private javax.swing.JLabel labelAnggota2;
    private javax.swing.JLabel labelAnggota3;
    private javax.swing.JLabel labelAnggota4;
    private javax.swing.JLabel labelAnggota5;
    private javax.swing.JLabel labelJumlah;
    private javax.swing.JLabel labelJumlah1;
    // End of variables declaration//GEN-END:variables
    private final String TARGET_TEXT = "Selamat Datang !!!";
    private final int TYPING_DELAY = 150; 
    private final int LOOP_DELAY = 2000;
    private javax.swing.Timer typingTimer;
    private javax.swing.Timer loopTimer;
    private int charIndex = 0;
    // End of variables declaration   
}
