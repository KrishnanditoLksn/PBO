package Modul_2;
import Modul_2_Test.Gaji_Pegawai;

import java.util.Scanner;
public class Pegawai_Gaji {
    String npp;
    String namaPegawai;
    int golongan , Child;
    int status;
    int JuumlahAnak;
    int gajiTotal;
    int gajipokok;
    int tunjanganKeluarga;

    public void setNpp(String npp) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Name  : ");
        namaPegawai = input.next();
        this.npp = npp;
    }

    public Pegawai_Gaji(String nama, String npp , int golongan , int status ) {
        this.namaPegawai = nama;
        this.npp = npp;
        this.status = status;
        this.golongan = golongan;
        //this.JuumlahAnak = juumlahAnak;
    }

    public String getNpp() {
        return npp;
    }


    public void setGolongan(int golongan) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Golongan Anda : ");
        golongan = input.nextInt();
        this.golongan = golongan;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setStatus(int status) {
        Scanner input = new Scanner(System.in);
        System.out.println("1.Menikah");
        System.out.println("2.Belum Menikah");
        System.out.println("==================");
        System.out.print("Input Status : ");
        status = input.nextInt();
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setJuumlahAnak(int juumlahAnak) {
        Scanner input = new Scanner(System.in);
        if (getStatus() == 1) {
            System.out.println("Jumlah anak : ");
            Child = input.nextInt();
        } else if (getStatus() == 2) {
            System.out.println("Anda tidak dapat tunjanngan");
        } else {
            System.out.println("Invalid");
        }
        this.JuumlahAnak = juumlahAnak;
    }

    public int getJuumlahAnak() {
        return Child;
    }

    public void hitungGajiPokok() {
        if (getGolongan() == 1) {
            gajipokok = 1300000;
            System.out.println("Gaji Pokok : " + gajipokok);
        } else if (getGolongan() == 2) {
            gajipokok = 1750000;
            System.out.println("Gaji Pokok : " + gajipokok);
        } else if (getGolongan() == 3) {
            gajipokok = 2000000;
            System.out.println("Gaji Pokok :" + gajipokok);
        } else {
            System.out.println("Invalid ");
        }
    }

    public void hitungTunjanganKeluarga() {
        if (status == 1) {
            tunjanganKeluarga = 300000 + (getJuumlahAnak() * 100000);
            System.out.println("Tunjangan Keluarga : " + tunjanganKeluarga);
        } else if (status == 2) {
            System.out.println("Tidak Dapat Tunjangan Keluarga ");
        } else {
            System.out.println("Invalid Option");
        }
    }

    public void hitungGajiTotal() {
        gajiTotal = gajipokok + tunjanganKeluarga;
        System.out.println(gajiTotal);
    }

    public void setNamaPegawai(String namaPegawai) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input NPP  : ");
        npp = input.next();
        this.namaPegawai = namaPegawai;
    }

    public String getNamaPegawai(){
        return  namaPegawai;
    }
}