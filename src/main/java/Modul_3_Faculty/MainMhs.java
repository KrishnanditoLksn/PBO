package Modul_3_Faculty;

public class MainMhs {
    public static void main(String[]args){
        Dosen dsn1= new Dosen("312312" , "Pak Eko ");
        Mahasiswa mh1= new Mahasiswa("225314231" , "Michael");
        Mahasiswa mh2= new Mahasiswa("dwodawd"  , "Michaeleo");
        dsn1.setGelar("Ph.d");
        dsn1.setEmail("wadawdokawdkoaw @yahoo");
        mh1.setPembimbing(dsn1);
        Dosen dsnsem=mh1.getPembimbing();
        mh1.setEmail("dowkdawd@gmail");
        String nm = dsn1.getNama();
        System.out.println("Pembimbing  " + mh1.getNim() + " adalah " + nm);

    }
}
