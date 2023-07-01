package Modul_9;

public class Segitiga extends  bangundatar{
    double kel , a , b , c ;
/*
Method getSet
 */
    public double getC() {
        return c;
    }

    public void setC(double c){
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    Segitiga(){}


    /*
    menggunakan method keliling  dan hitungLuas
     */
    @Override
    double hitungKeliling() {
        kel = getA() + getB() + getC();
        return kel;
    }

    @Override
    String nama() {
        return "Segitiga";
    }

    @Override
    double hitungLuas() {
        double s = 0.5 * (getA() + getB() + getC());
        return Math.sqrt(s *(s - getA()) *(s -getB()) * (s - getC()));
    }
}
