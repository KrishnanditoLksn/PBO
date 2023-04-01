package Modull_5;

import Modul_4.Buku;

public class Book2 {
    String AuthorName,BookCode,Tittle;
    int PubDate;
    Buku[]BookList;

    Book2(String Author , String BookCode ,String tittle , int PubDate , Buku[]bookList){
        this.AuthorName = Author;
        this.BookCode = BookCode;
        this.Tittle = tittle;
        this.BookList = bookList;
        this.PubDate = PubDate;
    }


    String getAuthorName(){
        return  AuthorName;
    }

    void setAuthorName(String authorName){
        this.AuthorName =authorName;
    }

    String getBookCode(){
        return BookCode;
    }
    void setBookCode(String bookCode){
        this.BookCode = bookCode;
    }

    int getPubDate(){
        return  PubDate;
    }

    void setPubDate(int pubDate){
        this.PubDate = pubDate;
    }

    String getTittle(){
        return  Tittle;
    }

    void setTittle(String tittle){
        this.Tittle = tittle;
    }

}
