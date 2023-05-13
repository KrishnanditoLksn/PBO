package Modul_9;

public abstract class Pegawai {
    private int npp;
    private String nama;
    private double gajiPokok;

    int getNpp(){
        return  npp;
    }

    String getNama(){
        return  nama;
    }

    double getGapok(){
        return  gajiPokok;
    }

    void setNpp(int nopeg){
        npp = nopeg;
    }

    void setNama(String nampeg ){
        nama = nampeg;
    }

    void setGapok(double upah){
        gajiPokok = upah;
    }
    abstract String getStatus();
    abstract double getTunjangan();
    abstract  double hitungGatot();
}
