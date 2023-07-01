package Modul_2;//membuat program di dalam  package Modul_2

public class Segitiga_Remake {//mendeklarasikan class Segitiga_Remake
    private double x1,y1,x2,y2,x3,y3;//memberi nama variabel dan untuk atribut

    public Segitiga_Remake(double x1, double y1, double x2, double y2, double x3, double y3){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.x3 = x3;
        this.y3 = y3;
    }


    public void setX1(int x1){//menambah metode set untuk nilai x1 segitiga bertipe void
        this.x1 = x1;
    }

    public double getX1() {//menambah metode get untuk mengembalikan nilai x1 segitiga bertipe double
        return x1;
    }

    public void setX2(int x2){//menambah  metode set untuk nilai x2 bertipe void
        this.x2 = x2;
    }

    public double getX2(){//menambah metode get untuk mengembalikan x2 segitiga  bertipe double
        return  x2;
    }

    public void  setX3(int x3){//menambah metode set untuk nilai x3 bertipe void
        this.x3 = x3;
    }

    public double getX3(){//menambah metode get untuk mengembalikan nilai x3 segitiga bertipe double
        return  x3;
    }

    public void setY1(int y1){//menambah metode set untuk nilai y1 bertipe void
        this.y1 = y1;
    }

    public double getY1(){//menambah metode get untuk mengembalikan nilai y1 segitiga bertipe double
        return  y1;
    }

    public void setY2(int y2){//menambah metode set untuk nilai y2 bertipe void
        this.y2  = y2;
    }

    public double getY2(){//menambah metode get untuk mengembalikan nilai y2 segitiga bertipe double
        return y2;
    }

    public void setY3(int y3){//menambah metode set untuk nilai y3 bertipe void
        this.y3 = y3;
    }

    public double getY3() {
        return y3;
    }

    public double hitungSisi(double xa, double ya, double xb, double yb){//metode untuk menghitung sisi segitiga
        return Math.sqrt( Math.pow(xa-xb, 2) + Math.pow(ya-yb,2));
    }

    public double hitungKeliling(){//mtode untuk nenghitung keliling segitiga
        return  hitungSisi(x1 , y1 , x2 , y2 ) + hitungSisi(x2 , y2 ,x3 , y3) + hitungSisi(x3 , y3 , x1 , y1);
    }

    public double hitungLuas(){//metode untuk menghitung luas segitiga
        double s = hitungKeliling();
        return  Math.sqrt((s *(s - hitungSisi(x1 , y2 , x2 , y2 )))  * (s - hitungSisi(x2 , y2 , x3 , y3 ))    *  (s  - hitungSisi(x3 , y3 , x1 , y1 )));
    }
}