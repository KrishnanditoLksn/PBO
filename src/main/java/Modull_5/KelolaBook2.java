package Modull_5;
/*
@Author : Emmanuel Krishnandito Laksana
@Github : KrishnanditoLksn
 */

import  java.util.*;
public class KelolaBook2 {
    static int jumlah, PubDate, jumlahP, UserI;
    static String AuthorName, BookCode, Tittle, nik, Alamat;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Jumlah Buku  : ");
        jumlahP = input.nextInt();

        if (jumlahP <= 0) {
            System.out.println("Invalid");
        } else {
            Book2[] b1 = new Book2[jumlahP];
            Pengarang[] p1 = new Pengarang[jumlahP];

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

                System.out.println("===========================");
                System.out.println("Alamat : ");
                Alamat = input.next();
                Alamat = input.nextLine();
                System.out.println("===========================");

                System.out.println("===========================");
                System.out.println("Tahun Terbit : ");
                PubDate = input.nextInt();
                System.out.println("===========================");

                /*
                p1[x] = new Pengarang(AuthorName, nik, Alamat);
                */

                b1[x] = new Book2(Tittle, BookCode, PubDate,AuthorName);
                b1[x].setTittle(Tittle);
                b1[x].setBookCode(BookCode);
                b1[x].setPubDate(PubDate);
                b1[x].setNik(nik);
                b1[x].setAlamat(Alamat);
                b1[x].setNama(AuthorName);
                b1[x].setDaftarP(b1);
            }
        /*
        Metode untuk menampilkan daftar buku beserta pengarangnnya
         */

            for (Book2 book2 : b1) {
                System.out.println(book2.getTittle() + " - " + book2.getBookCode() + " - " + book2.getPubDate() + " - " + book2.getAuthorName());
            }

        /*
        Menampilkan jumlah tahun terbit yang ingin dicari user lewat input keyboard
         */

            System.out.println("Mencari Tahun : ");
            UserI = input.nextInt();

        /*
        Mengecek jika buku yang di input user ada
         */
            for (Book2 book2 : b1) {
                if (UserI == book2.getPubDate()) {
                    jumlah += 1;
                }

            }
            System.out.println("Jadi jumlah buku yang anda cari ada " + jumlah);
            /*
            Menampilkan buku terbitan paling akhir dan paling awal
            */

            Book2 tertinggi = b1[0];
            /*
            Book2 terendah  = b1[0];
            */

            for (Book2 book2 : b1) {
                //
                if (book2.getPubDate() > tertinggi.getPubDate()) {
                    System.out.println("Buku dengan terbitan paling baru adalah " + book2.getTittle() + "  - " + book2.getBookCode() + "  - " + book2.getPubDate());
                } else if (book2.getPubDate() < tertinggi.getPubDate()) {
                    System.out.println("Buku dengan terbit paling lama adalah " + book2.getTittle() + "  - " + book2.getBookCode() + "  - " + book2.getPubDate());
                }
            }
        }
    }
}
