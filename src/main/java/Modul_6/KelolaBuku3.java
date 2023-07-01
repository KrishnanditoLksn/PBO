package Modul_6;

import java.util.Scanner;

public class KelolaBuku3 {

    static int jumlah, PubDate, jumlahP, UserI;
    static String AuthorName, BookCode, Tittle, nik, Alamat, PubName;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Jumlah Buku  : ");
        jumlahP = input.nextInt();

        if (jumlahP <= 0) {
            System.out.println("Invalid");
        } else {
            Book3[] b1 = new Book3[jumlahP];
            Pengarang2[] x3 = new Pengarang2[jumlahP];
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
                System.out.println("===========================");
                System.out.println("Tahun Terbit : ");
                PubDate = input.nextInt();
                System.out.println("===========================");

                System.out.println("===========================");
                System.out.println("Penerbit : ");
                PubName = input.next();
                PubName += input.nextLine();
                System.out.println("===========================");

                b1[x] = new Book3(Tittle, BookCode, PubDate,PubName , x3);
                b1[x].setAuthorName(Tittle);
                b1[x].setKodeBuku(BookCode);
                b1[x].setPubdate(PubDate);
                b1[x].setPubName(PubName);
                b1[x].addPengarang();
            /*
            User diminta untuk menginput data pengarang
             */
                /*
                p1[x] = new Pengarang(AuthorName, nik, Alamat);
                */


            }

        /*
        Metode untuk menampilkan daftar buku beserta pengarangnnya
         */
        for(Book3 book3 : b1){

        }

        /*
        Menampilkan jumlah tahun terbit yang ingin dicari user lewat input keyboard
         */


        /*
        Mengecek jika buku yang di input user ada
         */
            System.out.println("Anda cari tahun berapa : ");
            int baca = input.nextInt();
            int bacabuku = Book3.cariBuku(baca,b1);
            System.out.println(bacabuku);


            /*for (Book3 book2 : b1) {
                if (UserI == book2.getPubdate()) {
                    jumlah += 1;
                }
            }*/
            //System.out.println("Jadi jumlah buku yang anda cari ada " + jumlah);
            /*


            Menampilkan buku terbitan paling akhir dan paling awal
            */

                /*Book3 tertinggi = b1[0];

               /* for (Book2 book2 : b1) {
                    //
                    if (book2.getPubDate() > tertinggi.getPubDate()) {
                        System.out.println("Buku dengan terbitan paling baru adalah " + book2.getTittle() + "  - " + book2.getBookCode() + "  - " + book2.getPubDate() + " - " + book2.getPubName());
                    } else if (book2.getPubDate() < tertinggi.getPubDate()) {
                          System.out.println("Buku dengan terbit paling lama adalah " + book2.getTittle() + "  - " + book2.getBookCode() + "  - " + book2.getPubDate() + " - " + book2.getPubName());
                    }
                }
            }*/
        }
    }
}

