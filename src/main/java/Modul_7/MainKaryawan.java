package Modul_7;

import java.util.Scanner;

public class MainKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        Membuat  1 objek Karyawan tetap
         */

        KaryawanTetap karyawanTetap = new KaryawanTetap(null,0,0,0,0);

        karyawanTetap.setNama("Mikael");
        karyawanTetap.setNpp(421421);
        karyawanTetap.setJumlahAnak(2);
        karyawanTetap.setGajiPokok(1500000);


        System.out.println("================================================================================================");
        System.out.println("NAMA KARYAWAN TETAP : ");
        System.out.println("================================================================================================");

        System.out.println(karyawanTetap.getNama() + " - " + karyawanTetap.getNpp()+ " - "  + karyawanTetap.getJumlahAnak());
        karyawanTetap.gajiTotal();

        /*
        Membuat 1 objek Karyawan Kontrak
         */

        System.out.println("================================================================================================");
        System.out.println("NAMA KARYAWAN KONTRAK : ");
        System.out.println("================================================================================================");

        KaryawanKontrak karyawanKontrak  = new KaryawanKontrak(null,0,0,0,0);
        karyawanKontrak.setNama("Otid");
        karyawanKontrak.setNpp(23123);
        karyawanKontrak.setJumlahAnak(7);
        karyawanKontrak.setUpahHarian(50000);
        karyawanKontrak.jumlahHari(input);

        System.out.println("Nama : " + karyawanKontrak.getNama() + " - " + "Upah Harian : " +  karyawanKontrak.getUpahHarian() +  " - "  + karyawanKontrak.upahTotal);
    }
}
