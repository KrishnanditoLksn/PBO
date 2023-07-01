package Modul_6;
import Modul_2.Gaji_Pegawai;

import java.util.Scanner;
public class KelolaPerusahaan {
    /*
    inisiasi variabel
     */
    static int jp, npp, status, golongan, choice, gajiPokok, jAnak, tunjanganK, gajiTotal;
    static String Np;

    public static void main(String[] args) {
        /*
        tambah pegawai baru
         */
        Gaji_Pegawai[] gjp;
        Scanner input = new Scanner(System.in);


        System.out.println("Jumlah Pegawai : ");
        jp = input.nextInt();
        gjp = new Gaji_Pegawai[jp];

        for (int i = 0; i < jp; i++) {
            Perusahaan2[] p1 = new Perusahaan2[jp];
            System.out.print((i + 1) + " . " + "Nama Pegawai :");
            Np = input.next();
            Np = input.nextLine();

            System.out.print("NPP : ");
            npp = input.nextInt();

            System.out.println("1. MENIKAH");
            System.out.println("2. BELUM MENIKAH");
            System.out.print("Status : ");
            status = input.nextInt();

            System.out.print("Golongan : ");
            golongan = input.nextInt();

            gjp[i] = new Gaji_Pegawai(Np, npp, status, golongan);
            gjp[i].setNamaP(Np);
            gjp[i].setNik(npp);
            gjp[i].setStatus(status);
            gjp[i].setGolongan(golongan);

            //Gaji_Pegawai []tampung =p1[i].getG2();
            /*
            tambah pegawai
             */
        }
        /*
        MENAMBAH SEORANG PEGAWAI KE ARRAY DAFTAR PEGAWAI
         */

        Perusahaan2 perusahaan2 = new Perusahaan2("Mayora" , "23123213","Messi",gjp);
        //perusahaan2.addPegawai(jp,gjp);
        //perusahaan2.
        //perusahaan2.tambahPegawai_lah(pegawaibaruuu);
        double yasudahlah = perusahaan2.rata_rata_dah(gjp ,jp);
       // perusahaan2.AddPegawai();
        //Gaji_Pegawai gajiPegawaiBaru = new Gaji_Pegawai(perusahaan2.Np, perusahaan2.nik, perusahaan2.Status, perusahaan2.Golo);
        System.out.println(yasudahlah);
        System.out.println("Ketambahan  Pegawai lagi ");
        perusahaan2.AddPegawai();

        /*
        menghitung gaji Pokok
         */
        for (Gaji_Pegawai gajiPegawai : gjp) {
            if (gajiPegawai.getGolongan() == 1) {
                gajiPokok = 1300000;
                System.out.println("Gaji Anda sebesar : " + gajiPokok);
            } else if (gajiPegawai.getGolongan() == 2) {
                gajiPokok = 1750000;
                System.out.println("Gaji Anda sebesar  : " + gajiPokok);
            } else if (gajiPegawai.getGolongan() == 3) {
                gajiPokok = 2000000;
                System.out.println("Gaji Anda sebesar : " + gajiPokok);
            } else {
                System.out.println("Invalid");
            }
        }


        /*
        jika pegawai sudah berkeluarga
         */
        for (Gaji_Pegawai pegawai : gjp) {
            if (pegawai.getStatus() == 1) {
                System.out.print("Jumlah Anak ");
                jAnak = input.nextInt();
                System.out.println(pegawai.getNamaP() + " Memiliki Anak : " + jAnak);
            } else if (pegawai.getStatus() == 2) {
                System.out.println(pegawai.getNamaP() + " Anda Belum Menikah");
            } else {
                System.out.println("Invalid Option");
            }
        }
        /*
        menghitung Tunjangan Keluarga
         */

        for (Gaji_Pegawai pegawai : gjp) {
            tunjanganK = 0;
            if (pegawai.getStatus() == 1) {
                tunjanganK = 300000 + (pegawai.getjAnak() * 100000);
                System.out.println( " Hai " +  pegawai.getNamaP() + " Anda Mendapat Tunjangan Sebesar : " + tunjanganK);
            } else if (pegawai.getStatus() == 2) {
                System.out.println( " Hai " + pegawai.getNamaP() + " Anda tidak Mendapatkan Tunjangan Keluarga");
            } else {
                System.out.println("Invalid ");
            }
        }

        /*
        gaji Pokok
         */

        for(Gaji_Pegawai pegawai : gjp){
            gajiTotal = gajiPokok + tunjanganK;
            pegawai.gajiTotal();
            System.out.println("Gaji Total Anda sebesar : " + pegawai.getGajiTotal());

        }
        /*
        Menampilkan Pegawai dengan Gaji tertinggi
         */

        System.out.println("==================================================================================================");
        System.out.println("MENAMPILKAN PEGAWAI DENGAN GAJI TERTINGGIII");
        Gaji_Pegawai [] g1 = perusahaan2.getG2();
        Gaji_Pegawai pegawai = perusahaan2.maks();
        System.out.println("Nama : " + pegawai.getNamaP());
        System.out.println("NIK  : " + pegawai.getNik());
        System.out.println("GOLONGAN : " + pegawai.getGolongan());
        System.out.println("STATUS : " + pegawai.getStatus());
        System.out.println("GAJI POKOK : " + pegawai.hitungGajiPokok());
        System.out.println("===================================================================================================");
        System.out.println("Daftar Pegawai di Perusahaan : " + perusahaan2.getCompanyP());
        System.out.println("==================================================================================================");

        /*
        nama Pegawai di Perusahaan yang tanpa Pegawai Baru
         */
        for (Gaji_Pegawai gajiPegawai : gjp) {

            System.out.println("Nama Pegawai : " + gajiPegawai.getNamaP() + " - " + gajiPegawai.getNik() + " - " + gajiPegawai.hitungGajiPokok());
        }
    }
}
