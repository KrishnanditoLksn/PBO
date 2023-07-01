package Modul_2;//package di class

public class Segitiga_Biasa {//mendeklarasikan class bersifat public
    public double x1,y1,x2,y2,x3,y3;//membuat variabel

    public double hitungSisi(double xa, double ya, double xb, double yb){//membuat method hitungSisi dengan parameter
        return Math.sqrt( Math.pow(xa-xb, 2) +//nilai balikan untuk method hitungSisi
                Math.pow(ya-yb,2));
    }

    public double hitungKeliling(){//membuat method hitungKeliling dengan parameter
        return hitungSisi(x1,y1,x2,y2) +//nilai balikan untuk method hitungSisi
                hitungSisi(x2,y2,x3,y3)+ hitungSisi(x3,y3,x1,y1);
    }

    public double hitungLuas(){//membuat method hitungLuas
        double s = hitungKeliling();
        return Math.sqrt(s * (s-hitungSisi(x1,y1,x2,y2)) *
                (s-hitungSisi(x2,y2,x3,y3)) *
                (s-hitungSisi(x3,y3,x1,y1)));//nilai balikan untuk method hitungSisi
    }
}
