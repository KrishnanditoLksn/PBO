package Modul_7;
import java.util.Scanner;

public class Karyawan {
    private int npp, jumlahAnak;
    private String nama;

    public static double subsidiPerAnak;

    /*
    metode Kelas konstruktor untuk Karyawan
     */
    protected Karyawan(String nama, int npp, int jumlahAnak, double subsidiPerAnak) {
        this.nama = nama;
        this.npp = npp;
        this.jumlahAnak = jumlahAnak;
        Karyawan.subsidiPerAnak = subsidiPerAnak;
    }

    /*
    getter dan setter untuk atribut karyawan
     */

    public void setNpp(int npp) {
        this.npp = npp;
    }

    public  int getNpp() {
        return npp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


    public String getNama() {
        return nama;
    }


    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

   public int getJumlahAnak() {
        return jumlahAnak;
    }

    protected int tunjanganAnak() {
        subsidiPerAnak = 100000;
        double tunk = getJumlahAnak() * subsidiPerAnak;
        return (int) tunk;
    }

    /*
    metode yang akan di turunkan ke kelas anak
     */

    public void jumlahHari(Scanner scan){}

    protected String convertRupiah(int price){return null;}

}