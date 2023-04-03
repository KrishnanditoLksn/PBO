package Modul_4;
import java.util.*;
public class KelolaBuku {
    static int a;
    static int jumlah, usery;
    static String kode_buku;
    static String judul;
    static String nama_pengarang;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input amount of book that you stored");
        a = input.nextInt();
        Buku[] buku = new Buku[a];

        for (int i = 0; i < a; i++) {

            System.out.println("Input Kode Buku : " + " ke : " + (i + 1));
            kode_buku = input.next();

            System.out.println("Tittle : ");
            judul = input.nextLine();
            judul += input.nextLine();

            System.out.println("Input Author name :  ");
            nama_pengarang = input.next();

            System.out.println("Book Publication Year :");
            int tahun_terbit = input.nextInt();

            buku[i] = new Buku(judul, nama_pengarang, tahun_terbit, nama_pengarang);
            buku[i].setTahun_terbit(tahun_terbit);
            buku[i].setJudul(judul);
            buku[i].setNama_pengarang(nama_pengarang);
            buku[i].setKode_buku(kode_buku);

            /*buku[i].setAuthor_input(input);
            */
            //BUGGG
            // mencari tahun jalan terus
            //buku[i].userYear(input);
            //System.out.println(buku[i].getAuthor_input());
        }

        /*try {
            System.out.println("Masukkan pengarang yang ingin anda cari :");
            usera = input.nextLine();
            usera += input.nextLine();

            for (int i = 1; i < buku.length; i++) {

                if (Objects.equals(usera, buku[i].getNama_pengarang())) {
                    System.out.println("Nama pengarang" + buku[i].getJudul());
                }
            }
        } catch (Exception e) {
            System.out.println("Masukkan String yaaaaaaaaa");
                */

            //bug
            try {
                System.out.println("Input tahun yang akan dicari :");
                usery = input.nextInt();

                for (Buku b1 : buku) {

                    if (usery == b1.getTahun_terbit()) {
                        jumlah += 1;
                        System.out.println("Jumlah buku dengan tahun yang anda cari adalah : " + jumlah);
                    }
                    else  {
                        System.out.println("Not Found");
                    }

                }
            } catch (Exception E) {
                System.out.println("Input a Integer!!!!");
            }
        }
        }


