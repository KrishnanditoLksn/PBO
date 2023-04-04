package Modull_5;

public class Book2 {
    /*
    Membuat variabel untuk mengisi data buku
     */
    String AuthorName,BookCode,Tittle, nik , alamat,PubName;
    int PubDate;
    Book2[] daftarP;

    /*
    Method untuk mengembalikan isi dari variabel nama Penerbit
     */
    public String getPubName() {
        return PubName;
    }
    /*
    Method untuk mengeset isi dari nama penerbit
     */

    public void setPubName(String pubName) {
        PubName = pubName;
    }
    /*
    membuat method konstruktor yang akan menjadi atribut pada buku
     */

    Book2(String BookCode , String tittle , int PubDate , String AuthorName){
        this.BookCode = BookCode;
        this.Tittle = tittle;
        this.PubDate = PubDate;
        this.AuthorName  =AuthorName;
    }
    /*
    method untuk  mengembalika nilai dari nama pengarang
     */

    String getAuthorName(){
        return  AuthorName;
    }
    /*
    method untuk mengembalikan isi dari variabel bookCode
     */

    String getBookCode(){
        return BookCode;
    }
    /*
    method mengeset kode buku
     */

    void setBookCode(String bookCode){
        this.BookCode = bookCode;
    }
    /*
    method untuk mengembalikan isi dari variabel tanggal terbit bukuu
     */

    int getPubDate(){
        return  PubDate;
    }
    /*
    method untuk mengeset nilai di variabel PubDate
     */

    void setPubDate(int pubDate){
        this.PubDate = pubDate;
    }

    /*
    method   untuk mengembalikan  isi dari variabel judul buku
     */
    String getTittle(){
        return  Tittle;
    }
    /*
    method untuk  mengeset isi di variabel Tittle
     */

    void setTittle(String tittle){
        this.Tittle = tittle;
    }

    /*
    method untuk mengeset daftar buku pada kelas Book2
     */
    void setDaftarP(Book2 [] pengarangs){
        for (Book2 book2:pengarangs) {
            System.out.println(book2.getAuthorName() + " - " + book2.getNik() + " - " + book2.getAlamat());
        }
        this.daftarP = pengarangs;
    }

    /*
    method untuk mengeset nama pengarang pada kelas Book2
     */
    void setNama(String nama){
        this.AuthorName = nama;
    }

    /*
    method untuk mengembalikan isi dari variabel nik
     */
    String getNik(){
        return  nik;
    }

    /*
    method untuk mengeset nilai dari variabel nik
     */
    void setNik(String nik){
        this.nik = nik;
    }

    /*
    method untuk  mengeset isi dari variabel di alamat
     */

    void setAlamat(String alamat){
        this.alamat =alamat;
    }

    /*
    method  untuk mengembalikan nilai dari variavel alamat
     */

    String getAlamat(){
        return  alamat;
    }
}