package Modul_10;

public class Student implements Learner {
    protected  final static int NUM_TESTS = 3;
    protected String name;
    protected  int [] test;
    protected String courseGrade;

    public Student(){
        this("NO NAME");
    }

    public Student(String studentName){
        name = studentName;
        test = new int[NUM_TESTS];
        courseGrade = "******";
    }

    @Override
    public String getCourseGrade() {
        return courseGrade;
    }

    public String getName(){
        return  name;
    }

    public int getTestScore(int index){
        return  test[index];
    }

    public void setName(String name){
        this.name = name;
    }

    public void setTestsScore(int index  , int score) {
        test[index]= score;
    }

}
