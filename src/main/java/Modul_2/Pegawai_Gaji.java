package Modul_2;
import java.util.Scanner;
public class Pegawai_Gaji {

    int npp;
    String namaPegawai;
    int golongan;
    int  status;
    int JuumlahAnak;
    int gajiTotal;
    int gajipokok;
    int tunjanganKeluarga;

    void setNpp(Scanner scan){
        System.out.print("Input NPP  : ");
        npp = scan.nextInt();
    }

    void setnamaPegawai(Scanner scan){
        System.out.print("Input nama : ");
        namaPegawai = scan.next();
    }

    void setGolongan(Scanner scan){
        System.out.print("Input Golongan Anda : ");
        golongan = scan.nextInt();
    }

    int getGolongan(){
        return  golongan;
    }

    void setStatus(Scanner scan){
        System.out.println("1.Menikah");
        System.out.println("2.Belum Menikah");
        System.out.println("==================");
        System.out.print("Input Status : ");
        status = scan.nextInt();
    }

    int getStatus(){
        return  status;
    }

    void setJuumlahAnak(Scanner scan){
        if (getStatus() == 1 ){
            System.out.println("Jumlah anak : ");
            JuumlahAnak = scan.nextInt();
        }
        else if (getStatus() == 2){
            System.out.println("Anda tidak dapat tunjanngan");
        }
        else{
            System.out.println("Invalid");
        }
    }

    int getJuumlahAnak(){
        return JuumlahAnak;
    }

    void hitungGajiPokok(){
        if(getGolongan() == 1){
            gajipokok =1300000;
            System.out.println("Gaji Pokok : " + gajipokok);
        }
        else if (getGolongan() == 2 ){
            gajipokok = 1750000;
            System.out.println("Gaji Pokok : " + gajipokok);
        }
        else if (getGolongan() == 3 ){
            gajipokok = 2000000;
            System.out.println("Gaji Pokok :" + gajipokok);
        }
        else {
            System.out.println("Invalid ");
        }
    }

    void hitungTunjanganKeluarga(){
        if(status ==1 ){
            tunjanganKeluarga = 300000 + (getJuumlahAnak() * 100000);
            System.out.println("Tunjangan Keluarga : " + tunjanganKeluarga);
        }
        else if (status == 2 ){
            System.out.println("Tidak Dapat Tunjangan Keluarga ");
        }
        else{
            System.out.println("Invalid Option");
        }
    }

    void hitungGajiTotal(){
        gajiTotal = gajipokok + tunjanganKeluarga;
        System.out.println(gajiTotal);
    }
    }