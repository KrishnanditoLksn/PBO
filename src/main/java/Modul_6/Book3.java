package Modul_6;

import java.util.Scanner;

public class Book3 {
    String namaBuku , kodeBuku,TahunTerbit ,authorName ,nik,AuthorName , Alamat , PubName ;
    int Pubdate , PubDate , jumlah;
    Pengarang2[] pengarang2s;
     int UserI , jumlahBook;



    public Book3(String tittle, String bookCode, int PubDate,String Pubname,Pengarang2  []pengarang2s) {
        this.namaBuku = tittle;
        this.kodeBuku = bookCode;
        this.Pubdate =  PubDate;
        this.PubName = Pubname;
        this.pengarang2s = pengarang2s;
    }
    public String getNamaBuku(){
        return  namaBuku;
    }

    public void setBookList(Pengarang2 [] List){
        this.pengarang2s = List;
    }

    public String getKodeBuku(){
        return  kodeBuku;
    }

    public void setKodeBuku(String kodeBuku){
        this.kodeBuku = kodeBuku;
    }

    public void setPubName(String pubName){
        this.PubName = pubName;
    }

    public String getPubName(){
        return  PubName;
    }


    public int getPubdate(){
        return  Pubdate;
    }

    public void setPubdate(int pubdate){
        this.Pubdate = pubdate;
    }

    public String getAuthorName(){
        return  authorName;
    }


    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }
    public Pengarang2[] getPengarang2s(){
        return pengarang2s;
    }
    public void addPengarang() {
        Scanner input = new Scanner(System.in);
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


    }
    public Pengarang2[] getPengarang(){
        return  pengarang2s;
    }

    public static int cariBuku(int tahun  , Book3[]pengarang2s){
        int jumlah = 0;
        for (Book3 pengarang2 : pengarang2s) {
            if (tahun == pengarang2.getPubdate()) {
                jumlah++;
            }
        }
        System.out.println("Jadi jumlah Buku yang anda cari ada  : " );
        return jumlah;
    }
}