package Modul_6_Remake;
import Modul_2.Gaji_Pegawai;

import java.util.Scanner;
public class Kelola_Perusahaann {
    static int jumlah , npp , status , golongan;
    static  String np, alamat;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Perusahaan_Remake[]perusahaanRemakes;
        Gaji_Pegawai[] gajiPegawais;

        System.out.println("Jumlah Pegawai : ");
        jumlah = input.nextInt();

        gajiPegawais = new Gaji_Pegawai[jumlah];
        perusahaanRemakes = new Perusahaan_Remake[jumlah];

        for(int i = 0 ; i < gajiPegawais.length;i++){
            gajiPegawais[i]  = new Gaji_Pegawai(np , npp , status , golongan);
            perusahaanRemakes[i].addPegawai();
            gajiPegawais[i].setNamaP(np);
            gajiPegawais[i].setNik(npp);
            gajiPegawais[i].setStatus(status);
            gajiPegawais[i].setGolongan(golongan);
        }
    }
}