package Modul_2_Test;

import java.util.Scanner;
public class Gaji_Pegawai {
    String namaPegawai;
    int golongan;
    int pilih;
    int tunjangan;
    int gajipokok;
    int anak;
    int c ;
    int BayaranTotal;
    void NamaPegawai(){
        Scanner input  = new Scanner(System.in);

        System.out.println("Masukkan nama pegawai : ");
        this.namaPegawai = input.next();
    }

    void setJumlahAnak(){
        Scanner input = new Scanner(System.in);
        if (pilih  == 1){
            System.out.println("Masukkan Jumlah anak : ");
            this.anak = input.nextInt();
        } else if (pilih == 2 ) {
            System.out.println("Anda tidak dapat Tunjangan Keluarga");
        }
        else {
            System.out.println("Invalid input ");
        }
    }

    void setstatus(){
        Scanner input  = new Scanner(System.in);
        System.out.println("1. Menikah ");
        System.out.println("2. Belum Menikah ");
        System.out.println("Pilih : ");
        pilih = input.nextInt();
    }

    void golongan(){
        Scanner input = new Scanner(System.in);
        System.out.println("DAFTAR GOLONGAN ");
        System.out.println(" 1 ");
        System.out.println(" 2 ");
        System.out.println(" 3 ");
        System.out.println("Pilih : ");
        this.golongan = input.nextInt();
    }

    void   hitungGajiPokok(){
        if (golongan == 1){
            gajipokok = 1300000;
            System.out.println("Anda dapat Gaji Pokok sebesar : " + gajipokok);

        } else if (golongan == 2 ) {
            gajipokok=1750000;
            System.out.println("Anda dapat Gaji Pokok sebesar : " + gajipokok);
        }
        else if ((golongan == 3)) {
            gajipokok=2000000;
            System.out.println("Anda dapat Gaji Pokok sebesar :" + gajipokok);
        }
        else {
            System.out.println("Invalid Input ");
        }
    }

    void setTunjangan(){
        if (pilih ==1 ) {
            tunjangan = 300000 + (anak * 100000);
            System.out.println("Anda dapat tunjangan sebesar : " + tunjangan);
        } else if (pilih == 2 ) {
            System.out.println("Anda tidak dapat tunjangan keluarga");
        }else {
            System.out.println("Invalid Input ");
        }
    }

   // int getBayaranTotal() {
       // BayaranTotal = hitungGajiPokok() + setTunjangan();
      //  return BayaranTotal;
   // }
}
