package New_Book;

import Modul_1.Buku;



public class mainBook {
    public static void main(String[]args){
        Buku book1 = new Buku("Introduction to Algorithms, 3rd Edition (The MIT Press),3rd Edition", "9780262033848");
        Buku book2 = new Buku("Introductory Statistics 10th Tenth Edition By Neil A Weiss , 10 " , "978-0321989178");

        System.out.println(book1.pinjam("The MIT Press","Thomas H.Cormen  & Charles E.Leiserson","Data Structure and Algorithms"));
        System.out.println("========================================================================================");
        System.out.println(book2.kembali("Pearson","Neil A. Weiss","Data Structure and Algorithms"));
    }
}
