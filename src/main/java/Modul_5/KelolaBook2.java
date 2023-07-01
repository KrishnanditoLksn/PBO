package Modul_5;
/*
@Author : Emmanuel Krishnandito Laksana
@Github : KrishnanditoLksn
 */

import  java.util.*;
public class KelolaBook2 {
    static int jumlah, PubDate, jumlahP, UserI;
    static String AuthorName, BookCode, Tittle, nik, Alamat, PubName;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Jumlah Buku  : ");
        jumlahP = input.nextInt();

        if (jumlahP <= 0) {
            System.out.println("Invalid");
        } else {
            Book2[] b1 = new Book2[jumlahP];
            Pengarang[] x3 = new Pengarang[jumlahP];
            for (int x = 0; x < jumlahP; x++) {
            /*
            User diminta untuk menginput data buku beserta jumlahnya
             */
                System.out.println("==========================");
                System.out.println("Judul Buku : " + (x + 1));
                Tittle = input.next();
                Tittle += input.nextLine();
                System.out.println("==========================");

                System.out.println("==========================");
                System.out.println("Kode Buku : ");
                BookCode = input.next();
                BookCode += input.nextLine();
                System.out.println("==========================");
            /*
            User diminta untuk menginput data pengarang
             */

                System.out.println("===========================");
                System.out.println("Pengarang : ");
                AuthorName = input.next();
                AuthorName += input.nextLine();
                //AuthorName += input.next();
                System.out.println("===========================");

                System.out.println("===========================");
                System.out.println("NIK : ");
                nik = input.next();
                nik += input.nextLine();
                System.out.println("===========================");

                /*System.out.println("===========================");
                System.out.println("Alamat : ");
                Alamat = input.next();
                Alamat = input.nextLine();
                System.out.println("===========================");

                System.out.println("===========================");
                System.out.println("Tahun Terbit : ");
                PubDate = input.nextInt();
                System.out.println("===========================");

                System.out.println("===========================");
                System.out.println("Penerbit : ");
                PubName = input.next();
                PubName += input.nextLine();
                System.out.println("===========================");*/

                /*
                p1[x] = new Pengarang(AuthorName, nik, Alamat);
                */

                b1[x] = new Book2(Tittle, BookCode, PubDate, AuthorName, x3);
                x3[x] = new Pengarang(AuthorName, nik, Alamat);
                b1[x].setTittle(Tittle);
                b1[x].setBookCode(BookCode);
                b1[x].setPubDate(PubDate);
                x3[x].setNik(nik);
                x3[x].setAlamat(Alamat);
                x3[x].setNama(AuthorName);
                b1[x].setPubName(PubName);
                b1[x].setDaftarP(x3);
                //b1[x].
            }
        /*
        Metode untuk menampilkan daftar buku beserta pengarangnnya
         */

            for (Book2 book2 : b1) {
                System.out.println(book2.getTittle() + " - " + book2.getBookCode() + " - " + book2.getPubDate() + " - " + book2.getAuthorName() + " - " + book2.getPubName());
            }


        /*
        Menampilkan jumlah tahun terbit yang ingin dicari user lewat input keyboard


            System.out.println("Mencari Tahun : ");
            UserI = input.nextInt();

        /*
        Mengecek jika buku yang di input user ada*/


            System.out.println("Masukkan tahun : ");
            int searchYear = input.nextInt();
            int jumlahBuku = Book2.jumlahBuku(searchYear, b1);
            System.out.println(jumlahBuku);

            /*
             Menampilkan buku terbaru
            */

            System.out.println("======================================");
            Book2 baru = Book2.bukuTerbaru(b1);
            System.out.println("Judul : " + baru.getTittle());
            System.out.println("Nama Penerbit : " + baru.getAuthorName());
            System.out.println("Tahun Terbit : " + baru.getPubDate());
            System.out.println("=======================================");

            /*
            mencetak buku terlama
             */
            System.out.println("=======================================");
            Book2 lama = Book2.bukuTerlama(b1);
            System.out.println("Judul :  " +  lama.getTittle());
            System.out.println("Nama Penerbit : "  + lama.getAuthorName());
            System.out.println( "Tahun Terbit : "  + lama.getPubDate());
            System.out.println("========================================");
        }
    }
}