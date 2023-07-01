package Modul_6_Remake;
import java.util.Scanner;

public class KelolaBukuu {
    static int  n ;
    static  String kode_book , judul_book,tahun_book , nama , nik,alamat;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Jumlah Buku :  ");
        n = input.nextInt();
        Book[]books;
        books = new Book[n];
        Pengarang[]pengarangs;
        pengarangs  = new  Pengarang[n];


        for(int i = 0 ; i <books.length; i++){
            System.out.println("Judul : " + (i + 1) + " : ");
            judul_book = input.next();
            judul_book += input.nextLine();

            System.out.println("Kode Buku : ");
            kode_book = input.next();

            System.out.println("Tahun Terbit : ");
            tahun_book = input.next();

            books[i] = new Book(judul_book , kode_book , tahun_book,pengarangs);
            books[i].setListP(pengarangs);
            books[i].tambahPengarang();
            pengarangs[i]= new Pengarang(nama , nik , alamat);
            pengarangs[i].setNama(nama);
            pengarangs[i].setNik(nik);
            pengarangs[i].setAlamat(alamat);

        }
        for (Book book:books) {
            System.out.println(book.getJudul());
        }
    }
}
