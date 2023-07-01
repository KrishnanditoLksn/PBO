package New_Book;
import Modul_2.Segitiga_Remake;
import java.util.Scanner;
public class KumpulanSegitiga {
    static int jS;
    static double x1, y1, x2, y2, x3, y3 ,Sisi ,HasilLuas;
    static KumpulanSegitiga[] jumlahS;
    static Segitiga_Remake[] DaftarS;

    public void setDaftarS(Segitiga_Remake[] list) {
        DaftarS = list;
    }

    public KumpulanSegitiga(KumpulanSegitiga[] jumlahS, Segitiga_Remake[] list) {
        KumpulanSegitiga.jumlahS = jumlahS;
        DaftarS = list;
    }

    public void setJumlahS(KumpulanSegitiga[] jumlahS) {
        KumpulanSegitiga.jumlahS = jumlahS;
    }

        /*  Metode untuk
            a. menghitung rata-rata luas semua segitiga yang ada dalam kumpulan segitiga
         */

    public static double HitungSisi(double xa, double ya, double xb, double yb) {

        return Math.sqrt(Math.pow(xa - xb, 2) + Math.pow(ya - yb, 2));
    }

    public static double hitungKeliing() {
        for (Segitiga_Remake daftar : DaftarS) {
            if (daftar == null) {
                return 0;
            } else {
                Sisi = HitungSisi(daftar.getX1(), daftar.getY1(), daftar.getX2(), daftar.getY2() + HitungSisi(daftar.getX2(), daftar.getY2(), daftar.getX3(), daftar.getY3()) + HitungSisi(daftar.getX3(), daftar.getY3(), daftar.getX1(), daftar.getY1()));
            }
        }
        return Sisi;
    }


        public static  double HitungLuas () {
            double HasilL = 0;
            double s = hitungKeliing();
            for (int i = 0 ; i < jumlahS.length; i++) {

                 HasilL = Math.sqrt((s *(s - HitungSisi(DaftarS[i].getX1() , DaftarS[i].getY2() , DaftarS[i].getX2() , DaftarS[i].getY2() )))  * (s - HitungSisi(DaftarS[i].getX2() , DaftarS[i].getY2() , DaftarS[i].getX3() , DaftarS[i].getY3()))    *  (s  - HitungSisi(DaftarS[i].getX3(), DaftarS[i].getY3(), DaftarS[i].getX1(), DaftarS[i].getY1() )));
            }
            System.out.println(HasilL);
            return  HasilL;
        }


        public  static  double rataS() {
            int sum =0;
            int total = 0;
            for(int i = 0 ; i < DaftarS.length; i++) {
                sum+=DaftarS[i].hitungLuas();
            }
            total = sum/DaftarS.length;
            System.out.println("Rerata " + total);
            return total;
        }

        public static double segitigaBesar(){
        Segitiga_Remake besar = DaftarS[0];
        double LuasTerbesar  = besar.hitungLuas();

            for (Segitiga_Remake daftar : DaftarS) {
                if (daftar.hitungLuas() > LuasTerbesar) {
                    besar = daftar;
                    LuasTerbesar = besar.hitungLuas();
                }


            }
        return LuasTerbesar;
        }

        public static double segitigaKecil(){
        Segitiga_Remake kecil = DaftarS[0];
        double LuasKecil = kecil.hitungLuas();

            for(Segitiga_Remake daftarK : DaftarS){
                if(daftarK.hitungLuas() > LuasKecil){
                    kecil = daftarK;
                    LuasKecil = kecil.hitungLuas();
                }
            }
            return  LuasKecil;
        }
    }
