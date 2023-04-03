package Modull_5;

public class Book2 {
    String AuthorName,BookCode,Tittle, nik , alamat,PubName;
    int PubDate;
    Book2[] daftarP;

    public String getPubName() {
        return PubName;
    }

    public void setPubName(String pubName) {
        PubName = pubName;
    }

    Book2(String BookCode , String tittle , int PubDate , String AuthorName){
        this.BookCode = BookCode;
        this.Tittle = tittle;
        this.PubDate = PubDate;
        this.AuthorName  =AuthorName;
    }

    String getAuthorName(){
        return  AuthorName;
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

    void setDaftarP(Book2 [] pengarangs){
        for (Book2 book2:pengarangs) {
            System.out.println(book2.getAuthorName() + " - " + book2.getNik() + " - " + book2.getAlamat());
        }
        this.daftarP = pengarangs;
    }

    Book2[] getDaftarp(){
        return daftarP;
    }

    void setNama(String nama){
        this.AuthorName = nama;
    }

    String getNik(){
        return  nik;
    }

    void setNik(String nik){
        this.nik = nik;
    }

    void setAlamat(String alamat){
        this.alamat =alamat;
    }

    String getAlamat(){
        return  alamat;
    }
}