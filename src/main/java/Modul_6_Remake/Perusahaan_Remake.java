package Modul_6_Remake;
import Modul_2.Gaji_Pegawai;

import  java.util.Scanner;

public class Perusahaan_Remake {
    private String namaP , alamat , pemilik , npwp , npegawai;
    private  int npp , Golongan , Status;
    Gaji_Pegawai [] daftarP;
    Scanner robot = new Scanner(System.in);

    public void setStatus(int status){
        this.Status = status;
    }
    public int getStatus(){
        return  Status;
    }

    public void setNpegawai(String npegawai){
        this.npegawai = npegawai;
    }
    public String getNpegawai(){
        return  npegawai;
    }

    public void setNpp(int npp){
        this.npp = npp;
    }

    public int getNpp(){
        return  npp;}

    public void setGolongan(int Golongan){
        this.Golongan = Golongan;
    }

    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public int getGolongan(){
        return  Golongan;
    }


    /*
    metode setter dan getter untuk atribut pegawai
     */
    public  String getNamaP(){
        return  namaP;
    }
    public void setNamaP(String namaP){
        this.namaP = namaP;
    }

    public void setAlamat(String alamat){
        this.alamat  = alamat;
    }
    public String getAlamat(){
        return  alamat;
    }


    public Perusahaan_Remake(String nama , String alamat , String pemilik, String npwp, Gaji_Pegawai[]pegawaiL){
        this.namaP = nama;
        this.alamat = alamat;
        this.pemilik = pemilik;
        this.npwp = npwp;
        this.daftarP = pegawaiL;
    }


    public void addPegawai(){
        Scanner input = new Scanner(System.in);

        System.out.println(" Nama Pegawai : ");
        npegawai = robot.next();
        npegawai = robot.nextLine();

        System.out.println("NPP : ");
        npp = robot.nextInt();

        System.out.println("Golongan:");
        Golongan = robot.nextInt();

        System.out.println("1. MENIKAH");
        System.out.println("2  BELUM MENIKAH");
        System.out.println("Status : ");
        Status = robot.nextInt();
    }
}