package Modul_4;
import javax.print.DocFlavor;
import java.util.Objects;
import java.util.Scanner;

public class Buku {
    String judul, kode_buku, nama_pengarang,userAu;
    int tahun_terbit;
    int usery;
    int jumlah;
    String author_input;
    static  int SumAu;

    Buku(String judul , String kode_buku , int tahun_terbit , String nama_pengarang){
        this.judul = judul;
        this.kode_buku = kode_buku;
        this.tahun_terbit = tahun_terbit;
        this.nama_pengarang = nama_pengarang;
    }

    void setTahun_terbit(int tahun_terbit){
        this .tahun_terbit = tahun_terbit;
    }


    int getTahun_terbit(){
        return  tahun_terbit;
    }

    void setJudul(String judul){
        this.judul = judul;
    }

    String getJudul(){
        return  judul;
    }

    void setKode_buku(String kode_buku){
        kode_buku = kode_buku;
    }

    String  getKode_buku(){
        return  kode_buku;
    }

    void setNama_pengarang(String nama_pengarang){
        this.nama_pengarang = nama_pengarang;
    }

    String getNama_pengarang(){
        return  nama_pengarang;
    }


    void setAuthor_input(Scanner scan){
        System.out.println("Input author that you  want : ");
        userAu = scan.next();

        if (Objects.equals(userAu, getNama_pengarang())){
            System.out.println(getJudul() + " - " +  getKode_buku());
        }
        else {
            System.out.println("Not Found ");
        }
    }

    String getAuthor_input(){
        return  userAu;
    }

}
