package Modul_3.BukuPerpus;//membuat package

public class MainBuku {//membuat class bernama MainBuku
    public static void main(String []args){//membuat metode main
        Penerbit penerbit = new Penerbit("Gramedia",1999,"Jl.Mangga Dua");//membuat konstruktor bernama penerbit yang didalamnya berisi nama ,alamat dan tahun terbit penerbit buku
        Buku book1  = new Buku(1997,"Si kancil" , "12312312");//membuat konstruktor dengan objek bernama Buku dengan parameter  tahun terbit , judul , dan kode isbn
        Buku book2  = new Buku(1945 ,"Si Sapi" , "1231231");
        System.out.println(book1.getJudul());// memanggil metode getjudul dengan objek book1
        System.out.println("Tahun Terbit : " + book1.getTahun_terbit());//memanggil metode tahun terbit dengan objek book1
        System.out.println("ISBN :  " + book1.getIsbn());//memanggil metode isbn dengan objek book1
        System.out.print("Kategori : " );//mencetak String kategori
        book1.getBook_comparison();//memanggil metode perbandingan buku
        String pb = Penerbit.getPub_name();//membuat variabel untuk menyimpan class Penerbit
        int tb =Penerbit.getTahunberdiri();//membuat variabel untuk  menyimpan class Penerbit
        String ap=Penerbit.getAlamat();//membuat variabel untuk menyimpan class Penerbit
        System.out.println("Penerbit : "  +pb + "\n"+ "Tahun Berdiri : " +  tb +"\n" + "Alamat Penerbit : " + ap );//mencetak Output
    }
}
