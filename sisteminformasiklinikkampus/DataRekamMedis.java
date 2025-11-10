package com.sisteminformasiklinikkampus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 
 */
public class DataRekamMedis {
    private String id;
    private String nimPasien;
    private String namaPasien;
    private String tanggal;
    private String namaDokter;
    private String keluhan;
    private String diagnosis;
    private String resep;
    private String status; 
    
    // Constructor
    public DataRekamMedis(String id, String nimPasien, String namaPasien, 
                          String tanggal, String namaDokter, String keluhan, 
                          String diagnosis, String resep, String status) {
        this.id = id;
        this.nimPasien = nimPasien;
        this.namaPasien = namaPasien;
        this.tanggal = tanggal;
        this.namaDokter = namaDokter;
        this.keluhan = keluhan;
        this.diagnosis = diagnosis;
        this.resep = resep;
        this.status = status;
    }
    
    public DataRekamMedis(String id, String nimPasien, String namaPasien, 
                          String namaDokter, String keluhan) {
        this.id = id;
        this.nimPasien = nimPasien;
        this.namaPasien = namaPasien;
        this.tanggal = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.namaDokter = namaDokter;
        this.keluhan = keluhan;
        this.diagnosis = "";
        this.resep = "";
        this.status = "Menunggu";
    }
    
    // Getters
    public String getId() { return id; }
    public String getNimPasien() { return nimPasien; }
    public String getNamaPasien() { return namaPasien; }
    public String getTanggal() { return tanggal; }
    public String getNamaDokter() { return namaDokter; }
    public String getKeluhan() { return keluhan; }
    public String getDiagnosis() { return diagnosis; }
    public String getResep() { return resep; }
    public String getStatus() { return status; }
    
    // Setters
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }
    public void setResep(String resep) { this.resep = resep; }
    public void setStatus(String status) { this.status = status; }
    
    public String getRingkasan() {
        return namaPasien + " - " + keluhan + " (" + tanggal + ")";
    }
    
    @Override
    public String toString() {
        return "Rekam Medis: " + namaPasien + " | " + tanggal;
    }
}
