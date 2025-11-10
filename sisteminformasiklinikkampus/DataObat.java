package com.sisteminformasiklinikkampus;

/**
 * 
 */
public class DataObat {
    private String id;
    private String nama;
    private String deskripsi;
    private int stok;
    private String tanggalKadaluarsa;
    
    // Constructor
    public DataObat(String id, String nama, String deskripsi, int stok, String tanggalKadaluarsa) {
        this.id = id;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.stok = stok;
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    // Getters
    public String getId() { return id; }
    public String getNama() { return nama; }
    public String getDeskripsi() { return deskripsi; }
    public int getStok() { return stok; }
    public String getTanggalKadaluarsa() { return tanggalKadaluarsa; }
    
    // Setters
    public void setNama(String nama) { this.nama = nama; }
    public void setDeskripsi(String deskripsi) { this.deskripsi = deskripsi; }
    public void setStok(int stok) { this.stok = stok; }
    public void setTanggalKadaluarsa(String tanggalKadaluarsa) { 
        this.tanggalKadaluarsa = tanggalKadaluarsa; 
    }
    
    public boolean kurangiStok(int jumlah) {
        if (stok >= jumlah) {
            stok -= jumlah;
            return true;
        }
        return false;
    }
  
    public void tambahStok(int jumlah) {
        stok += jumlah;
    }
    
    public boolean isStokRendah() {
        return stok < 10;
    }
    
    @Override
    public String toString() {
        return nama + " (Stok: " + stok + ")";
    }
}
