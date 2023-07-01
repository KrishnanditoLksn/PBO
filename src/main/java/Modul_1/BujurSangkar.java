package Modul_1;
//mendeklarasikan class bernama BujurSangkar
public class BujurSangkar {


    //membuat variabel sisi  bertipe integer
    int sisi;
    //membuat vriabel luas  bertipe double
    double luas;
    //membuat metode luas bertipe double
    public double luas() {
        luas = sisi * sisi;
        //menghitung sisi dikali sisi untuk nilai luas balikan
        return luas;
    }
}
