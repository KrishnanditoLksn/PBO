package Modul_2;

import java.util.Scanner;

public class Main_Pegawai {
    public static void main(String[]args) {
        Pegawai_Gaji p1 = new Pegawai_Gaji();
        Scanner input = new Scanner(System.in);

        System.out.println("=============================");
        p1.setNpp(input);
        System.out.println("=============================");
        p1.setnamaPegawai(input);
        System.out.println("=============================");
        p1.setGolongan(input);
        System.out.println("=============================");
        p1.setStatus(input);
        System.out.println("=============================");
        p1.setJuumlahAnak(input);
        System.out.println("=============================");
        p1.hitungGajiPokok();
        System.out.println("=============================");
        p1.hitungTunjanganKeluarga();
        System.out.println("=============================");
        p1.hitungGajiTotal();
        System.out.println("=============================");
    }
}
