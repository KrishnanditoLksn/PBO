package Modul_7;

public class Karyawan {
    int npp,jumlahAnak;
    String nama;
    static double subsidiPerAnak;

    protected   Karyawan(String nama,int npp,int jumlahAnak,double subsidiPerAnak){
        this.nama = nama;
        this.npp = npp;
        this.jumlahAnak = jumlahAnak;
        Karyawan.subsidiPerAnak = subsidiPerAnak;
    }

    protected void setNpp(int npp){
        this.npp = npp;
    }

    protected int getNpp(){
        return  npp;
    }

    protected void setNama(String nama){
        this.nama = nama;
    }

    protected String getNama(){
        return  nama;
    }

    protected void setJumlahAnak(int jumlahAnak){
        this.jumlahAnak = jumlahAnak;
    }

    protected int getJumlahAnak() {
        return jumlahAnak;
    }

    protected int tunjanganAnak(){
        subsidiPerAnak = 100000;
        double tunk = getJumlahAnak() * subsidiPerAnak;
        return (int) tunk;
    }
}
