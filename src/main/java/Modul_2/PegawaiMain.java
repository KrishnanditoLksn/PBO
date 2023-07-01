package Modul_2;

import java.util.Scanner;
public class PegawaiMain {
    static int Status ,Golongan, choice,npp;
    static String npegawai;
    public static void main(String[] args) {
        Scanner robot = new Scanner(System.in);


        Gaji_Pegawai g1 = new Gaji_Pegawai(npegawai, npp, Status,Golongan);

        do {
            System.out.println("============================================");
            System.out.println("Program Sederhana Pengelolaan Data Pegawai ");
            System.out.println("============================================");
            System.out.println("1 . Nama pegawai ");
            System.out.println("2 . Nomor npp  ");
            System.out.println("3 . Golongan ");
            System.out.println("4 . Status ");
            System.out.println("5 . Gaji Pokok Pegawai ");
            System.out.println("6 . Hitung Tunjangan Keluarga");
            System.out.println("7 . Hitung Gaji Total");
            System.out.println("Pilih : ");
            choice = robot.nextInt();

            switch (choice) {
                case (1) -> {
                    System.out.println("Memasukkan nama pegawai ");
                    System.out.println(" Nama Pegawai : ");
                    npegawai = robot.next();
                    npegawai = robot.nextLine();
                    g1.setNamaP(npegawai);
                }
                case (2) -> {
                    System.out.println("Memasukkan npp pegawai ");
                    System.out.println("NPP : ");
                    npp = robot.nextInt();
                    g1.setNik(npp);
                }
                case (3) -> {
                    System.out.println("Memasukkan golongan ");
                    System.out.println("Golongan:");
                    Golongan = robot.nextInt();
                    g1.setGolongan(Golongan);
                }
                case(4)->{
                    System.out.println("1. Menikah ");
                    System.out.println("2. Belum Menikah");
                    System.out.println("Status : ");
                    Status = robot.nextInt();
                    g1.setStatus(Status);
                    g1.StatusComparison();
                }
                case (5)->{
                    System.out.println("Hitung Gaji Pokok Pegawai :");
                    g1.hitungGajiPokok();
                }
                case(6) ->{
                    System.out.println("Hitung Tunjangan Keluarga");
                    g1.hitungTunjangan();
                }
                case(7)->{
                    System.out.println("Hitung gaji Total");
                    g1.gajiTotal();
                    /*g1.Display();*/
                }
                default -> System.out.println("END");
            }
        }while (choice <= 7);
    }
}