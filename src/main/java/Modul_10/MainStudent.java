package Modul_10;
import java.util.Scanner;

import static Modul_7.MainKaryawan.divide;

public class MainStudent {

    public static void main(String[] args) {
        int choice;
        String name;
        Scanner kanazuka = new Scanner(System.in);
        Student [] students;
        /*
        memesan n array
         */
        System.out.println("Amount of Students : ");
        int n  = kanazuka.nextInt();

        students = new Student[n];

        /*
        memasukkan data siswa
         */
        for(int i = 0; i < students.length;i++){
            do {
                System.out.println("1. UNDERGRADUATE STUDENT");
                System.out.println("2. GRADUATE STUDENTT");
                choice  = kanazuka.nextInt();

                if (choice == 1 ){
                    students[i] = new undergraduateStudent();
                }
                else if (choice ==  2 ) {
                    students[i] = new graduateStudent();
                }
                else {
                    System.out.println("INVALID");
                }
                System.out.println((i + 1 ) +" . " + "STUDENT NAME : ");
                name = kanazuka.next();
                name += kanazuka.nextLine();

                students[i].setName(name);

                for(int k = 0 ; k < Student.NUM_TESTS; k++) {
                    System.out.print("TEST SCORE : " );
                    students[i].setTestsScore(k, kanazuka.nextInt());
                }
            }while (choice < 1 || choice > 2);
        }
        /*
        menampilkan semua siswa graduate dan undergraduate
         */
        divide();
        System.out.println("ALL UNDERGRADUATE AND GRADUATE STUDENTS");
        divide();
        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getCourseGrade());
        }
    }
}
