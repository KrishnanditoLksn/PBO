package Modul_3.Universitas;

import Modul_3.Universitas.Dot;

public class Triangle {
    private final Dot titikA;
    private final Dot titikB;
    private final Dot titikC;
    private double sisiA, sisiB, sisiC;

    public Triangle(Dot satu, Dot dua,Dot tga){
        this.titikA=satu;
        this.titikB=dua;
        this.titikC=tga;
    }

    public double hitungSisi(Dot A , Dot B){
        int x1 , x2 , y1 , y2;
        x1=A.getX();
        x2=B.getX();
        y1=A.getY();
        y2=B.getY();
        return  Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
    }

    public double hitungKeliling(){
            sisiA = hitungSisi(titikA ,titikB );
            sisiB =hitungSisi(titikA , titikC);
            sisiC = hitungSisi(titikB , titikC);
        return  (sisiA + sisiB + sisiC);
    }

    public double hitungLuas(){
        double s = hitungKeliling()/2;

        return Math.sqrt(s * (s - sisiA)  *  (s  - sisiB)  * (s - sisiC));
    }


}
