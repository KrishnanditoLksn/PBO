public class test1 {
    private String namaMatakuliah;
    public void setNamaMatakuliah(String nama){
        namaMatakuliah = nama;
    }
    public String getNamaMatakuliah(){
        return  namaMatakuliah;
    }

    public void tampilPesan(){
        System.out.printf( "Selamat datang di buku raport\n%s!\n" , getNamaMatakuliah());

    }




}
