package Modul_10;

public class undergraduateStudent extends Student {
    @Override
    public String getCourseGrade(){
        double scores = 0;
        for(int i = 0 ;  i < NUM_TESTS; i++){
            scores += test[i];
        }
        double final_Score = scores/NUM_TESTS;
        if (final_Score >= 80) {
            courseGrade = "A";
        } else if (final_Score >= 70) {
            courseGrade= "B";
        } else if (final_Score >= 56) {
            courseGrade = "C";
        } else if (final_Score >= 45) {
            courseGrade= "D";
        } else {
            courseGrade= "E";
        }
        return courseGrade;
    }
}
