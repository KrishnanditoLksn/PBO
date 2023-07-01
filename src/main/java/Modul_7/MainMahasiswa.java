package Modul_7;
/*
mengimport dari modul 4

import Modul_4.Mhs;
import java.util.Objects;
import java.util.Scanner;

/*
membuat kelas bernama MainMahasiswa
 */
//public class MainMahasiswa {
    /*
    variabel width untuk  jumlah n sama dengan

    public static final int width = 70;

    /*
    membuat method untuk samadengan dan keyword repeat untuk mencetak = sebanyak n

    public static void samaDengan() {
        System.out.println("=".repeat(width));
    }

    /*
    membuat method main untuk memanggil method yang ada di kelas mahasiswa s1 maupun s2

    public static void main(String[] args) {
        /*
        membuat variabel pilih bertipe int
         */
        /*
        membuat variabel untuk menyimpan nilai uts1,uts2 , uas
         */

        /*
        membuat variabel untuk menyimpan nama , tanggal_lahir,nim
         */


        /*
        membuat scannr robot
         */

        /*
        method untuk samadengan

        samaDengan();
        System.out.println("Jumlah Mahasiswa ");
        samaDengan();

        int jumlahMahasiswa = robot.nextInt();
        Mhs[] mhs = new Mhs[jumlahMahasiswa];
        Mhs[] data = new Mhs[5];

        for (int i = 0; i < jumlahMahasiswa; i++)
            do {
                System.out.println("1 . MAHASISWA S1 ");
                System.out.println("2 . MAHASISWA S2 ");
                samaDengan();
                pilih = robot.nextInt();
                System.out.println("Nama Mahasiswa  : " + (i + 1));
                nama = robot.next();
                nama += robot.nextLine();

                System.out.println("NIM : ");
                nim = robot.next();
                nim += robot.nextLine();

                System.out.println("Tanggal Lahir : ");
                tanggal_lahir = robot.next();
                tanggal_lahir += robot.nextLine();

                System.out.println("UTS 1 :  ");
                uts1 = robot.nextInt();

                System.out.println("UTS 2 : ");
                uts2 = robot.nextInt();

                System.out.println("UAS : ");
                uas = robot.nextInt();

                if (pilih == 1) {
                    mhs[i] = new Mhs_S1(nama, nim, tanggal_lahir, uts1, uts2, uas);
                    mhs[i].setNama(nama);
                    mhs[i].setNim(nim);
                    mhs[i].setTanggal_lahir(tanggal_lahir);
                    mhs[i].setUts1(uts1);
                    mhs[i].setUts2(uts2);
                    mhs[i].setUas(uas);
                    mhs[i].setNilai_final(uts1, uts2, uas);
                    mhs[i].Comparison();

                } else if (pilih == 2) {

                    mhs[i] = new Mhs_S2(nama, nim, tanggal_lahir, uts1, uts2, uas);
                    mhs[i].setNama(nama);
                    mhs[i].setNim(nim);
                    mhs[i].setTanggal_lahir(tanggal_lahir);
                    mhs[i].setUts1(uts1);
                    mhs[i].setUts2(uts2);
                    mhs[i].setUas(uas);
                    mhs[i].setNilai_final(uts1, uts2, uas);
                    mhs[i].Comparison();
                }
            } while (pilih > 2 || pilih <= 0);
        /*
        menampilkan  nilai huruf


        for (Mhs mhs1 : mhs) {
            if (mhs1 instanceof Mhs_S1) {
                if (Objects.equals(mhs1.getComparison(), "C") || Objects.equals(mhs1.getComparison(), "B") || Objects.equals(mhs1.getComparison(), "A")) {
                    samaDengan();
                    System.out.println("NAMA MAHASISWA S1 ");
                    System.out.println("Lulus ");
                    samaDengan();
                    System.out.println("Nama : " + mhs1.getNama());
                    System.out.println("NIM  : "  + mhs1.getNim());
                    System.out.println("Nilai Final : " + mhs1.getNilai_final());
                    System.out.println("Skor Final : " + mhs1.getComparison());
                    samaDengan();
                }
            } else if (mhs1 instanceof Mhs_S2) {
                if (Objects.equals(mhs1.getComparison(), "C") || Objects.equals(mhs1.getComparison(), "B") || Objects.equals(mhs1.getComparison(), "A")) {
                    samaDengan();
                    System.out.println("NAMA MAHASISWA S2 : ");
                    System.out.println("Lulus ");
                    samaDengan();
                    System.out.println("Nama : " + mhs1.getNama());
                    System.out.println("NIM  : "  + mhs1.getNim());
                    System.out.println("Nilai Final : " + mhs1.getNilai_final());
                    System.out.println("Skor Final : " + mhs1.getComparison());
                    samaDengan();
                }
            }
        }
    }
}*/