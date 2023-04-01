package Modull_5;
import java.util.*;
import Modul_2.Pegawai_Gaji;

public class KelolaPerusahaan {
    static  int p , status;
    static  String np , ap  , npp  ,  pemilik , namaPegawai;
    static  double gajii;
    static int golongan;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Perusahaan p1 = new Perusahaan("232424" , "Jl Mangga" ,"Sujiwo Teji");

        System.out.println("Input Jumlah Pegawai : ");
        int jp = input.nextInt();

        Pegawai_Gaji [] pg1 = new Pegawai_Gaji[jp];

        for(int i = 0; i < jp; i++){
            System.out.println("Nama Pegawai " + (i + 1));
            namaPegawai = input.next();

            System.out.println("NPP :");
            npp = input.next();

            System.out.println("Golongan  : ");
            golongan = input.nextInt();

            System.out.println("Status : ");
            status = input.nextInt();

            System.out.println("Jumlah Anak");
            int ja = input.nextInt();

            pg1[i] = new Pegawai_Gaji(namaPegawai, npp , status ,golongan,ja);
            pg1[i].setNamaPegawai(namaPegawai);
            pg1[i].setNpp(npp);
            pg1[i].setStatus(status);
            pg1[i].setGolongan(golongan);
            pg1[i].setJuumlahAnak(ja);
            pg1[i].hitungGajiPokok();
        }
        System.out.println("Daftar Pegawai di : " +  p1.getP());
        p1.setDaftar(pg1);


    }
    /*
    method for
     */

    }
