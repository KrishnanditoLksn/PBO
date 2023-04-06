package Modul_2;

import java.util.Scanner;

public class Gaji_Pegawai {
    String namaP , nik;
    int  Status ,jAnak, Golongan,tunjanganKeluarga;
    double gajipokok,gajiTotal;
    Gaji_Pegawai(String namaP , String nik, int status ,int Golongan){
        this.namaP = namaP;
        this.nik = nik;
        this.Status = status;
        this.Golongan = Golongan;
    }

    public int getStatus(){
        return  Status;
    }

    public void setStatus(int Status){
        this.Status = Status;
    }

    public String getNamaP(){
        return  namaP;
    }

    public void setNamaP(String  namaP){
        this.namaP = namaP;
    }

    public int getjAnak(){
        return  jAnak;
    }

    public void setNik(String nik){
        this.nik = nik;
    }

    public String getNik(){
        return  nik;
    }

    public int getGolongan() {
        return Golongan;
    }

    public void setGolongan(int golongan) {
        this.Golongan = golongan;
    }

    public void hitungGajiPokok(){
        if(getGolongan() ==1){
            gajipokok = 1300000;
            System.out.println("Gaji Anda sebesar : " +  gajipokok);
        } else if (getGolongan() == 2 ) {
            gajipokok =  1750000;
            System.out.println("Gaji Anda sebesar  : " + gajipokok);
        }
        else if(getGolongan() == 3){
            gajipokok = 2000000;
            System.out.println("Gaji Anda sebesar : " + gajipokok);
        }
        else {
            System.out.println("Invalid");
        }
    }

    public void StatusComparison(){
        Scanner robot = new Scanner(System.in);
        if(getStatus() == 1){
            System.out.println("Jumlah Anak : ");
            jAnak = robot.nextInt();
        } else if (getStatus() == 2 ) {
            System.out.println("Anda Belum Menikah");
        }
        else {
            System.out.println("Invalid Option");
        }
    }
    public void hitungTunjangan(){
        if (getStatus() == 1) {
            tunjanganKeluarga = 300000 + (getjAnak() * 100000);
            System.out.println("Tunjangan Keluarga : " + tunjanganKeluarga);
        } else if (getStatus()== 2) {
            System.out.println("Tidak Dapat Tunjangan Keluarga ");
        } else {
            System.out.println("Invalid Option");
        }
    }

    public  void gajiTotal(){
        gajiTotal = gajipokok + tunjanganKeluarga;
        System.out.println(gajiTotal);
    }

    public void Display(){
        System.out.println(getNamaP()  + " - " + getNik());
    }
}