package Modul_3.BukuPerpus;

public class MainBuku {
    public static void main(String []args){
        Penerbit penerbit = new Penerbit("Gramedia",1999,"Jl.Mangga Dua");
        Buku book1  = new Buku(1997,"Si kancil" , "12312312");
        System.out.println(book1.getJudul());
        System.out.println("Tahun Terbit : " + book1.getTahun_terbit());
        System.out.println("ISBN :  " + book1.getIsbn());
        System.out.print("Kategori : " );
        book1.getBook_comparison();
        String pb = Penerbit.getPub_name();
        int tb =Penerbit.getTahunberdiri();
        String ap=Penerbit.getAlamat();
        System.out.println("Penerbit : "  +pb + "\n"+ "Tahun Berdiri : " +  tb +"\n" + "Alamat Penerbit : " + ap );
    }
}
