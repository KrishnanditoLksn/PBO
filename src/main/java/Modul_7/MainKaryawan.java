package Modul_7;
import java.util.Scanner;

public class MainKaryawan {
    public static final int WIDTH = 70;
    protected static final double Subsidi = 1000000;
    private static double gajiPokok, upahHarian;

    /*
    method untuk membuat sama dengan
     */
    public static void divide() {
        System.out.println("=".repeat(WIDTH));
    }

    /*
    method untuk mencetak pilihan karyawan
     */
    public static void info() {
        System.out.println("Pilihan : ");
        System.out.println("1 . KARYAWAN TETAP  ");
        System.out.println("2 . KARYAWAN KONTRAK ");
    }

    public static void main(String[] args) {
        /*
        membuat variabel untuk menyimpan hasil dari input an user yang berisi data data karyawan
         */

        int jumlahKaryawan, userChoose, jumlahAnak, npp;
        String nama;

        Scanner robot = new Scanner(System.in);

        System.out.println("Jumlah Karyawan : ");
        jumlahKaryawan = robot.nextInt();
        Karyawan[] karyawans = new Karyawan[jumlahKaryawan];

        for (int i = 0; i < karyawans.length; i++) {
            do {
                info();
                System.out.println("PILIH : ");
                userChoose = robot.nextInt();
                divide();

                System.out.println("NAMA KARYAWAN : ");
                nama = robot.next();
                nama += robot.nextLine();

                System.out.println("NPP : ");
                npp = robot.nextInt();

                System.out.println("JUMLAH ANAK : ");
                jumlahAnak = robot.nextInt();


                if (userChoose == 1) {
                    System.out.println("GAJI POKOK : ");
                    gajiPokok = robot.nextDouble();
                    karyawans[i] = new KaryawanTetap(nama, npp, jumlahAnak, Subsidi);
                    karyawans[i].setNama(nama);
                    karyawans[i].setNpp(npp);
                    karyawans[i].setJumlahAnak(jumlahAnak);

                } else if (userChoose == 2) {
                    System.out.println("UPAH HARIAN : ");
                    upahHarian = robot.nextDouble();
                    karyawans[i] = new KaryawanKontrak(nama, npp, jumlahAnak, Subsidi, upahHarian);
                    karyawans[i].setNama(nama);
                    karyawans[i].setNpp(npp);
                    karyawans[i].setJumlahAnak(jumlahAnak);
                    karyawans[i].jumlahHari(robot);
                } else {
                    System.out.println("Input 1 atau 2 yaa");
                }
            } while (userChoose > 2 || userChoose <= 0);
        }

        for (Karyawan karyawan : karyawans) {
            if (karyawan instanceof KaryawanTetap) {
                KaryawanTetap karyawanTetap;
                karyawanTetap = (KaryawanTetap) karyawan;
                ((KaryawanTetap) karyawan).setGajiPokok(gajiPokok);
                divide();
                System.out.println("KARYAWAN TETAP ");
                divide();
                System.out.println("NAMA KARYAWAN : " + karyawanTetap.getNama());
                System.out.println("GAJI POKOK   :" + karyawanTetap.getGajiPokok());
                System.out.println("GAJI TOTAL   : " + karyawanTetap.convertRupiah((int) karyawanTetap.gajiTotal()));
            } else if (karyawan instanceof KaryawanKontrak) {
                if (((KaryawanKontrak) karyawan).getUpahTotal() < 1000000) {
                    KaryawanKontrak karyawanKontrak;
                    karyawanKontrak = (KaryawanKontrak) karyawan;
                    ((KaryawanKontrak) karyawan).setUpahHarian(upahHarian);
                    divide();
                    System.out.println("KARYAWAN KONTRAK ");
                    divide();
                    System.out.println("NAMA KARYAWAN : " + karyawanKontrak.getNama());
                    System.out.println("UPAH HARIAN : " + karyawanKontrak.getUpahHarian());
                    System.out.println("UPAH TOTAL  : " + karyawanKontrak.convertRupiah((int) karyawanKontrak.getUpahHarian()));
                }
            }
        }
    }
}