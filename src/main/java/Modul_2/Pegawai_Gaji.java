package Modul_2;

import java.util.Scanner;
public class Pegawai_Gaji {
    /*
    Membuat variabel untuk atribut Pegawai
     */
    String npp;
    String namaPegawai;
    int golongan , Child;
    int status;
    int JuumlahAnak;
    int gajiTotal;
    int gajipokok;
    int tunjanganKeluarga;
    String namaPerusahaan;

    /*
    Method untuk mengeset Npp
     */
    public void setNpp(String npp) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Name  : ");
        namaPegawai = input.next();
        this.npp = npp;
    }

    /*
    Method untuk konstruktor Pegawai Gaji
     */
    public Pegawai_Gaji(String nama, String npp , int golongan , int status ) {
        this.namaPegawai = nama;
        this.npp = npp;
        this.status = status;
        this.golongan = golongan;
        //this.JuumlahAnak = juumlahAnak;
    }
    /*
    Method untuk mengembalikan nilai di variabel npp
     */

    public String getNpp() {
        return npp;
    }
    /*
    Method untuk mengeset golongan
     */
    public void setGolongan() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Golongan Anda : ");
        this.golongan = input.nextInt();
    }

    /*
    Method untuk mengembalikan isi di variabel golongan
     */
    public int getGolongan() {
        return golongan;
    }

    /*
    Method untuk mengeset Status Pegawai
     */
    public void setStatus() {
        Scanner input = new Scanner(System.in);
        System.out.println("1.Menikah");
        System.out.println("2.Belum Menikah");
        System.out.println("==================");
        System.out.print("Input Status : ");
        this.status = input.nextInt();
    }

    /*
    Method untuk mengembalikan isi dari variabel status
     */
    public int getStatus() {
        return status;
    }

        /*
            Method untuk mengeset jumlah anak
         */
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

    /*
        Method untuk mengembalikan isi di variabel jumlahAnak
     */
    public int getJuumlahAnak() {
        return Child;
    }

    /*
    Method untuk  menghitung gajiPokok
     */
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
    /*
    method untuk menghitung tunjangan Keluarga
     */

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
    /*
    Method untuk menghitung Gaji Pokok
     */
    public double getGajiPokok(){
        return  gajipokok;
    }
    /*
    Method untuk menghitung gaji total pegawai
     */

    public void hitungGajiTotal() {
        gajiTotal = gajipokok + tunjanganKeluarga;
        System.out.println(gajiTotal);
    }
    /*
    method untuk mengembalikan isi dari variabel nama Perusahaan
     */
    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }
    /*
    method untuk mengeset nama perusahaan
     */
    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }
    /*
    method untuk mengeset nama pegawai
     */
    public void setNamaPegawai(String namaPegawai) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input NPP  : ");
        npp = input.next();
        this.namaPegawai = namaPegawai;
    }
    /*
    method untuk mengembalikan nilai dari variabel nama pegawai
     */
    public String getNamaPegawai(){
        return  namaPegawai;
    }
}