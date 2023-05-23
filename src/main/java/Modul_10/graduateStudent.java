package Modul_10;

public class graduateStudent extends Student{ @Override

public String getCourseGrade(){
    double scores =0;
    for(int i = 0 ;  i < NUM_TESTS; i++){
        scores += test[i];
    }
    double final_Score = scores/NUM_TESTS;
    if (final_Score >= 85) {
        courseGrade = "A";
    } else if (final_Score >= 80) {
        courseGrade = "B";
    } else if (final_Score >=70 ) {
        courseGrade = "C";
    } else if (final_Score >= 56) {
        courseGrade = "D";
    } else {
        courseGrade = "E";
    }
    return courseGrade;
}
}
