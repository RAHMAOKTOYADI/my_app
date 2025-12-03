/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class userData {
    public static class JadwalDokter {
        String namaDokter;
        String spesialis;
        String hari;
        String jamMulai;
        String jamSelesai;

        public JadwalDokter(String namaDokter, String spesialis, String hari, String jamMulai, String jamSelesai) {
            this.namaDokter = namaDokter;
            this.spesialis = spesialis;
            this.hari = hari;
            this.jamMulai = jamMulai;
            this.jamSelesai = jamSelesai;
        }
    }
    
    public static java.util.ArrayList<JadwalDokter> listJadwal = new java.util.ArrayList<>();
    public static User currentUser = null;   
    public static java.util.List<User> users = new java.util.ArrayList<>(); 
    public static java.util.ArrayList<Appointment> allAppointments = new java.util.ArrayList<>();

    public static class Notification {
        public String pesan;
        public String status; 
        public String detail; 

        public Notification(String pesan, String detail) {
            this.pesan = pesan;
            this.detail = detail;
            this.status = "Belum dibaca"; 
        }
    }

    public static class Appointment {
        public String namaPasien; 
        public String nim;
        public String keluhan;
        public String hari;
        public String waktu;
        public String dokter;
        public String status;
        
        
        public boolean isRead = false;
        public boolean isReadPembatalan = false;
        public boolean pernahDikonfirmasi = false;
        
        public Appointment() {
        }
        public Appointment(String namaPasien, String nim, String keluhan, String hari, String waktu, String dokter, String status) {
            this.namaPasien = namaPasien;
            this.nim = nim;
            this.keluhan = keluhan;
            this.hari = hari;
            this.waktu = waktu;
            this.dokter = dokter;
            this.status = status;          
            this.isRead = false; 
        }
    }

    public static class User {
        public String username;
        public String email;
        public String password;
        public String nim;
        public String fakultas;
        
        public List<Appointment> appointments = new ArrayList<>();
        public ArrayList<Notification> notifications;
        
        public User(String username, String email, String password, String nim, String fakultas) {
            this.username = username;
            this.email = email;
            this.password = password;
            this.nim = nim;
            this.fakultas = fakultas;
            this.notifications = new ArrayList<>();
        }
    }

    public static void registerUser(String username, String email, String password, String nim, String fakultas) {
        User newUser = new User(username, email, password, nim, fakultas);
        users.add(newUser); 
    }

    public static boolean authenticate(String email, String password) {
        currentUser = null; 
        for (User user : users) { 
            if (user.email.equals(email) && user.password.equals(password)) {
                currentUser = user; 
                return true;
            }
        }
        return false;
    }
    
    public static void addAppointment(String nama, String nim, String keluhan, String hari, String waktu, String dokter, String status) {
        if (currentUser != null) {
            Appointment newApp = new Appointment(nama, nim, keluhan, hari, waktu, dokter, status);
            currentUser.appointments.add(newApp);
            allAppointments.add(newApp); // Tambahkan juga ke list Admin
        }
    }
}