package Modul_6;

import Modul_2.Gaji_Pegawai;

import java.util.Scanner;

public class Perusahaan2 {
    String CompanyP, CompanyC, bos,namaP ,Np;
    int Status, Golongan,nik , Golo , Npp , Jm;
    Gaji_Pegawai[] g2;
    /*
    kelas konstruktor dari Perusahaan
     */

    Perusahaan2(String CompanyP, String CompanyC, String bos, Gaji_Pegawai[] g2) {
        this.CompanyP = CompanyP;
        this.CompanyC = CompanyC;
        this.bos = bos;
        this.g2 = g2;
    }

    /*
    metode setter dan getter untuk mengisi data Perusahaan
     */
    public void setG2(Gaji_Pegawai[] p1) {
        this.g2 = p1;
    }

    public Gaji_Pegawai[] getG2() {
        return g2;
    }

    public String getBos() {
        return bos;
    }

    public void setBos(String bos) {
        this.bos = bos;
    }

    public String getCompanyC() {
        return CompanyC;
    }

    public void setCompanyC(String companyC) {
        CompanyC = companyC;
    }

    public String getCompanyP() {
        return CompanyP;
    }

    public void setCompanyP(String companyP) {
        CompanyP = companyP;
    }

    /*
    metode untuk menghitung rerata gaji pegawai
     */
    public double rata_rata_dah(Gaji_Pegawai[] g2, int n) {
        int sum = 0;
        for (int i = 0; i < this.g2.length; i++) {
            sum = (int) (sum + g2[i].hitungGajiPokok());
        }
        int total = sum/n;
        System.out.println("Rerata : " + total);
        return total;
    }
    public void setTambahPegawai(Gaji_Pegawai employee){

    }

    /*
    metodde untuk mencari pegawai gaji tertinggi
     */

    Gaji_Pegawai  maks() {
        double min = this.g2[0].getGajipokok();

        int index = 0;

        for (int i = 1; i < this.g2.length; i++) {
            if (this.g2[i].getGajipokok() > min) {
                min = this.g2[i].getGajipokok();
                System.out.println("Gaji pokok gede : " + g2[i].getGajipokok() + "namaaaa : " + g2[i].getNamaP() + " - " + g2[i].getNik());
                index = i;
            }
        }
        return  g2[index];
    }

    /*
    Metode untuk tambah Pegawai
     */
    public void AddPegawai(){
        Scanner input = new Scanner(System.in);
        System.out.println("Jumlah Pegawai baru : ");
        Jm = input.nextInt();

        Gaji_Pegawai [] gajiBaru = new Gaji_Pegawai[Jm];
        for(int i = 0 ; i < gajiBaru.length; i++) {

            System.out.println("Nama Pegawai " + (i + 1) + ": ");
            Np = input.next();
            Np = input.nextLine();

            System.out.println("NPP : ");
            Npp = input.nextInt();

            System.out.println("Golongan : ");
            Golo = input.nextInt();

            System.out.println("Status : ");
            Status = input.nextInt();

            /*gajiBaru[i] = new Gaji_Pegawai(Np, Npp, Golo, Status);
            gajiBaru[i].setNamaP(Np);
            gajiBaru[i].setNik(Npp);
            gajiBaru[i].setGolongan(Golo);
            gajiBaru[i].setStatus(Status);*/

        }
    }
}