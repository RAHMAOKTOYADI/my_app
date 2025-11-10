package com.sisteminformasiklinikkampus;

/**
 * 
 */
public class DataDokter {
    private String id;
    private String nama;
    private String spesialisasi;
    private String hari; 
    private String jamMulai; 
    private String jamSelesai; 
    
    // Constructor
    public DataDokter(String id, String nama, String spesialisasi, String hari, 
                      String jamMulai, String jamSelesai) {
        this.id = id;
        this.nama = nama;
        this.spesialisasi = spesialisasi;
        this.hari = hari;
        this.jamMulai = jamMulai;
        this.jamSelesai = jamSelesai;
    }
    
    // Getters
    public String getId() { return id; }
    public String getNama() { return nama; }
    public String getSpesialisasi() { return spesialisasi; }
    public String getHari() { return hari; }
    public String getJamMulai() { return jamMulai; }
    public String getJamSelesai() { return jamSelesai; }
    
    // Setters
    public void setNama(String nama) { this.nama = nama; }
    public void setSpesialisasi(String spesialisasi) { this.spesialisasi = spesialisasi; }
    public void setHari(String hari) { this.hari = hari; }
    public void setJamMulai(String jamMulai) { this.jamMulai = jamMulai; }
    public void setJamSelesai(String jamSelesai) { this.jamSelesai = jamSelesai; }
    
    public String getJadwalLengkap() {
        return hari + " • " + jamMulai + " - " + jamSelesai;
    }
    
    @Override
    public String toString() {
        return nama + " - " + spesialisasi;
    }
}
