package Modul_7;
public class MainMahasiswa {


    public static void main(String[] args) {
        Mhs_S1 mahasiswaS1 = new Mhs_S1(null,null,null,0.0,0.0,0.0);
        Mhs_S2 mahasiswaS2 = new Mhs_S2(null,null,null,0.0,0.0,0.0);

        System.out.println("===============================================");
        System.out.println("NAMA MAHASISWA S1");
        System.out.println("===============================================");

        mahasiswaS1.setNama("Albertus");
        mahasiswaS1.setNim("31231232");
        mahasiswaS1.setUts1(84);
        mahasiswaS1.setUts2(84);
        mahasiswaS1.setUas(84);
        mahasiswaS1.setNilai_final(mahasiswaS1.getUts1(), mahasiswaS1.getUts2() ,mahasiswaS1.getUas());
        mahasiswaS1.Comparison(mahasiswaS1.getNilai_final());
        System.out.println(mahasiswaS1.getNama());
        System.out.println("Skor Final  : " +  mahasiswaS1.getNilai_final());
        System.out.println("Nilai Final : " + mahasiswaS1.getComparison());

        System.out.println("===============================================");
        System.out.println("NAMA MAHASISWA S2");
        System.out.println("===============================================");

        mahasiswaS2.setNama("Mikael Andre");
        mahasiswaS2.setNim("225314001");
        mahasiswaS2.setUts1(84);
        mahasiswaS2.setUts2(84);
        mahasiswaS2.setUas(84);
        mahasiswaS2.setNilai_final(mahasiswaS2.getUts1(), mahasiswaS2.getUts2(), mahasiswaS2.getUas());
        mahasiswaS2.Comparison(mahasiswaS2.getNilai_final());
        System.out.println(mahasiswaS2.getNama());
        System.out.println("Skor Final  : "  + mahasiswaS2.getNilai_final());
        System.out.println("Nilai Final : " + mahasiswaS2.getComparison());
    }
}
