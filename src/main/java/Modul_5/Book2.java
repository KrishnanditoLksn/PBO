package Modul_5;

public class Book2 {
    /*
    Membuat variabel untuk mengisi data buku
     */
    String AuthorName, BookCode, Tittle, nik, alamat, PubName;
    int PubDate, UserI, jumlah;

    Pengarang[] daftarP;

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

    Book2(String BookCode, String tittle, int PubDate, String AuthorName, Pengarang[] daftarP) {
        this.BookCode = BookCode;
        this.Tittle = tittle;
        this.PubDate = PubDate;
        this.AuthorName = AuthorName;
        this.daftarP = daftarP;
    }
    /*
    method untuk  mengembalika nilai dari nama pengarang
     */

    String getAuthorName() {
        return AuthorName;
    }
    /*
    method untuk mengembalikan isi dari variabel bookCode
     */

    public String getBookCode() {
        return BookCode;
    }
    /*
    method mengeset kode buku
     */

    public void setBookCode(String bookCode) {
        this.BookCode = bookCode;
    }
    /*
    method untuk mengembalikan isi dari variabel tanggal terbit bukuu
     */

    public int getPubDate() {
        return PubDate;
    }
    /*
    method untuk mengeset nilai di variabel PubDate
     */

    public void setPubDate(int pubDate) {
        this.PubDate = pubDate;
    }

    /*
    method   untuk mengembalikan  isi dari variabel judul buku
     */
    public String getTittle() {
        return Tittle;
    }
    /*
    method untuk  mengeset isi di variabel Tittle
     */

    public void setTittle(String tittle) {
        this.Tittle = tittle;
    }

    /*
    method untuk mengeset daftar buku pada kelas Book2
     */
    public void setDaftarP(Pengarang[] pengarangs) {
        this.daftarP = pengarangs;
    }

    public Pengarang[] getDaftarBuku() {
        return daftarP;
    }
    /*
    metode untuk menentukan jumlah Buku
     */

    public static int jumlahBuku(int tahun, Book2[] b1) {
        int sum = 0;
        for (Book2 book2 : b1) {
            if (book2.getPubDate() == tahun) {
                sum += 1;
            }
        }
        System.out.println("Jadi jumlah buku yang anda cari ada  : ");
        return sum;
    }
    /*
    metode untuk menentukan buku terbaru
     */

    public static Book2  bukuTerbaru(Book2[] b1) {
        Book2 tertinggi = b1[0];

        for (Book2 book2 : b1) {
            if (book2.getPubDate() > tertinggi.getPubDate()) {
                System.out.println("Buku dengan terbitan paling baru adalah " + book2.getTittle() + "  - " + book2.getBookCode() + "  - " + book2.getPubDate() + " - " + book2.getPubName());
                tertinggi = book2;
            }
        }
        return tertinggi;
    }
    /*
    metode untuk menentukan buku terlama
     */

    public static Book2 bukuTerlama(Book2 [] b1) {
        Book2 terlow = b1[0];

        for (Book2 book2 : b1) {
            if (book2.getPubDate() < terlow.getPubDate()) {
                System.out.println("Buku dengan terbitan paling lama adalah " + book2.getTittle() + "  - " + book2.getBookCode() + "  - " + book2.getPubDate() + " - " + book2.getPubName());
                terlow = book2;
            }
        }
        return terlow;
    }
}