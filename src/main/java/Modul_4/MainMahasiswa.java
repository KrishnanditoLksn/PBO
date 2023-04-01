package Modul_4;//membuat program di package
import java.util.Scanner;//menambahkan scanner

public class MainMahasiswa {//membuat class Mahasiswa
    static  int na;//membuat variabel na
    static String nama , nim  , tanggal_lahir;//membuat variabel nama , nim dan tanggal lahir
    static double uts1, uts2, uas;//membuat variabel uts1 , uts2,uas


    public static void main(String[]args){//membuat metode main

        Scanner input = new Scanner(System.in);//membuat class scanner bernama input
        System.out.println("INPUT JUMLAH MAHASISWA : ");//meminta user untuk memasukkan jumlah mahasiswa
        na = input.nextInt();

        Mhs [] mhs = new Mhs[na];//membuat objek mhs bertipe data array sejumlah na


        for ( int i = 0 ; i <mhs.length; i++){//melakukan perulangan untuk memasukkan data
            System.out.println("NO  : " + (i + 1)+"  " + "INPUT NIM :");//meminta user memasukkan NIM
            nim = input.next();

            System.out.println("INPUT NAMA : ");//meminta user memasukkan Nama
            nama = input.nextLine();
            nama +=input.nextLine();

            System.out.println("INPUT TANGGAL LAHIR :");//meminta user memasukkan tanggal lahir
            tanggal_lahir = input.next();

            System.out.println("Input Nilai UTS 1");//meminta user memasukkan Nilai UTS1
            uts1 = input.nextDouble();

            System.out.println("Inpt Nilai UTS 2 ");//meminta user memasukkan nilai UTS2
            uts2 = input.nextDouble();

            System.out.println("Input Nilai Uas ");//meminta user memasukkan nilai UAS
            uas = input.nextDouble();

            System.out.println("========================================================================");

            mhs[i] = new Mhs(nim , nama , tanggal_lahir , uts1 , uts2,uas);//mengisi objek mhs dengan berbagai data untuk mahasiswa
            mhs[i].setNama(nama);
            mhs[i].setNim(nim);
            mhs[i].setTanggal_lahir(tanggal_lahir);
            mhs[i].setUts1(uts1);
            mhs[i].setUts2(uts2);
            mhs[i].setUas(uas);
            mhs[i].setNilai_final(uts1 , uts2 , uas);
            System.out.println(mhs[i].getNilai_final());//mencetak  nilai final mahasiswa
            mhs[i].Comparison(mhs[i].getNilai_final());
            System.out.println(mhs[i].getComparison());//mencetak skor mahasiswa

        }


        //menghitung nilai mhs tertingi
        Mhs tinggi =  mhs[0];//membuat variabel tinggi dengan mhs sebagai objek untuk melakukan looping
        Mhs terendah = mhs[0];

        for(int i = 1 ; i < mhs.length; i++){//melakukan looping sebanyak panjang array dari mhs

            if (mhs[i].getNilai_final() > tinggi.getNilai_final()){
                tinggi = mhs[i];
            } else if ( mhs[i].getNilai_final() < tinggi.getNilai_final()) {
                terendah = mhs[i];
            }
        }
        //Mencetak Output
        System.out.println("===============================================================================");
        System.out.println("Nilai Tertinggi  : " + tinggi.getNama() + "\n"+"NIM : " + tinggi.getNim() + "\n" + "Tanggal Lahir : " +tinggi.getTanggal_lahir() + "\n" +"Nilai Final: " +  tinggi.getNilai_final());
        System.out.println(tinggi.getComparison());
    }
}
