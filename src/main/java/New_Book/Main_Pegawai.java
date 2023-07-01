package New_Book;

import java.util.Scanner;

public class Main_Pegawai {
    public static void main(String[]args) {
        Pegawai_Gaji p1 = new Pegawai_Gaji("Dito" , "2312312" , 1,1);
        Scanner input = new Scanner(System.in);
        System.out.println("=============================");


        System.out.println("=============================");
        p1.setNamaPegawai(p1.namaPegawai);
        System.out.println("=============================");
        p1.setGolongan();
        System.out.println("=============================");
        p1.setStatus();
        System.out.println("=============================");
        p1.setJuumlahAnak(p1.JuumlahAnak);
        System.out.println("=============================");
        p1.hitungGajiPokok();
        System.out.println("=============================");
        p1.hitungTunjanganKeluarga();
        System.out.println("=============================");
        p1.hitungGajiTotal();
        System.out.println("=============================");
    }
}
