package Modul_2;

public class Segitiga_Remake {
    public double x1,y1,x2,y2,x3,y3;


    public void setX1(int x1){
        this.x1 = x1;
    }

    public double getX1() {
        return x1;
    }

    public void setX2(int x2){
        this.x2 = x2;
    }

    public double getX2(){
        return  x2;
    }

    public void  setX3(int x3){
        this.x3 = x3;
    }

    public double getX3(){
        return  x3;
    }

    public void setY1(int y1){
        this.y1 = y1;
    }

    public double getY1(){
        return  y1;
    }

    public void setY2(int y2){
        this.y2  = y2;
    }

    public double getY2(){
        return y2;
    }

    public void setY3(int y3){
        this.y3 = y3;
    }


    public double hitungSisi(double xa, double ya, double xb, double yb){
        return Math.sqrt( Math.pow(xa-xb, 2) + Math.pow(ya-yb,2));
    }

    public double hitungKeliling(){
        return  hitungSisi(x1 , y1 , x2 , y2 ) + hitungSisi(x2 , y2 ,x3 , y3) + hitungSisi(x3 , y3 , x1 , y1);
    }

    public double hitungLuas(){
        double s = hitungKeliling();
        return  Math.sqrt((s *(s - hitungSisi(x1 , y2 , x2 , y2 )))  * (s - hitungSisi(x2 , y2 , x3 , y3 ))    *  (s  - hitungSisi(x3 , y3 , x1 , y1 )));
    }
}
