package bekasmodul;
import Modul_7.Karyawan;
import Modul_7.KaryawanKontrak;
import Modul_7.KaryawanTetap;
import Modul_7.MainKaryawan;

import  java.util.Scanner;
public class MainKaryawann extends MainKaryawan {

    public static Scanner robot = new Scanner(System.in);
    static Karyawan[]karyawans;
    static int n;

    public static void printMenu() {
        System.out.println("1. INPUT DATA KARYAWAN TETAP");
        System.out.println("2. INPUT DATA KARYAWAN KONTRAK");
        System.out.println("3. CETAK DAFTAR KARYAWAN TETAP  dan  KARYAWAN KONTRAK");
        System.out.println("4. KELUAR");
    }

    public static void main(String[] args) {
        int choice,jumlahAnak, npp;
        String nama;
        double gajiPokok, upahHarian;
        divide();

        System.out.println("JUMLAH KARYAWAN : ");
        n = robot.nextInt();
        karyawans = new Karyawan[n];

        for (int i = 0; i < karyawans.length; i++) {
            do {
                printMenu();
                System.out.println("PILIH : ");
                choice = robot.nextInt();

                switch (choice) {
                    case (1) -> {
                        System.out.println("NAMA KARYAWAN TETAP : ");
                        nama = robot.next();
                        nama += robot.nextLine();

                        System.out.println("NPP : ");
                        npp = robot.nextInt();

                        System.out.println("JUMLAH ANAK : ");
                        jumlahAnak = robot.nextInt();

                        System.out.println("GAJI POKOK  : ");
                        gajiPokok = robot.nextDouble();

                        karyawans[i] = new KaryawanTetap(nama, npp, jumlahAnak, Subsidi);
                        //karyawans[i].setGajiPokok(gajiPokok);
                        karyawans[i].setNama(nama);
                        karyawans[i].setNpp(npp);
                        karyawans[i].setJumlahAnak(jumlahAnak);
                    }
                    case (2) -> {
                        System.out.println("NAMA KARYAWAN KONTRAK : ");
                        nama = robot.next();
                        nama += robot.nextLine();

                        System.out.println("NPP : ");
                        npp = robot.nextInt();

                        System.out.println("JUMLAH ANAK : ");
                        jumlahAnak = robot.nextInt();


                        System.out.println(" UPAH HARIAN : ");
                        upahHarian = robot.nextDouble();


                        karyawans[i] = new KaryawanKontrak(nama, npp, jumlahAnak, Subsidi, upahHarian);
                        //karyawans[i].setUpahHarian(upahHarian);
                        karyawans[i].setNama(nama);
                        karyawans[i].setNpp(npp);
                        karyawans[i].setJumlahAnak(jumlahAnak);
                    }
                    case (3)->{
                        display();
                    }
                    case (4)->{
                        System.exit(0);
                    }
                }
            } while (choice <= 4);
        }
    }
    public static void display(){
        for(Karyawan karyawan : karyawans){
            if (karyawan instanceof KaryawanTetap){
                System.out.println(karyawan.getNama() + "  -   " + karyawan.getNpp() + " -  " + ((KaryawanTetap) karyawan).getGajiPokok());
                }
        }
    }

}