package pojos;
// Generated Nov 5, 2018 10:17:13 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Pesanan generated by hbm2java
 */
public class Pesanan  implements java.io.Serializable {


     private String idPemesanan;
     private String noKtp;
     private String nama;
     private String alamat;
     private String jenisPemesanan;
     private String jumlahBarang;
     private Date waktuAntar;

    public Pesanan() {
    }

    public Pesanan(String idPemesanan, String noKtp, String nama, String alamat, String jenisPemesanan, String jumlahBarang, Date waktuAntar) {
       this.idPemesanan = idPemesanan;
       this.noKtp = noKtp;
       this.nama = nama;
       this.alamat = alamat;
       this.jenisPemesanan = jenisPemesanan;
       this.jumlahBarang = jumlahBarang;
       this.waktuAntar = waktuAntar;
    }
   
    public String getIdPemesanan() {
        return this.idPemesanan;
    }
    
    public void setIdPemesanan(String idPemesanan) {
        this.idPemesanan = idPemesanan;
    }
    public String getNoKtp() {
        return this.noKtp;
    }
    
    public void setNoKtp(String noKtp) {
        this.noKtp = noKtp;
    }
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getAlamat() {
        return this.alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getJenisPemesanan() {
        return this.jenisPemesanan;
    }
    
    public void setJenisPemesanan(String jenisPemesanan) {
        this.jenisPemesanan = jenisPemesanan;
    }
    public String getJumlahBarang() {
        return this.jumlahBarang;
    }
    
    public void setJumlahBarang(String jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }
    public Date getWaktuAntar() {
        return this.waktuAntar;
    }
    
    public void setWaktuAntar(Date waktuAntar) {
        this.waktuAntar = waktuAntar;
    }




}

