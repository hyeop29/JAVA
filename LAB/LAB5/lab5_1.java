/*
Project : Student class
Author: Chang‐Hyeop LEE
Date of last update: Jan. 20, 2022
*/
package LAB5;

class Student{
    private static int staticID = 2017000; //초기에 지정된 값(첫 번째 학생의 학번)
    private int studentID;
    private String studentName;
    private double midScore, finalScore;

    public Student(){

    }
    public Student(String studentName, double midScore, double finalScore ){
        this.studentName = studentName;
        this.midScore = midScore;
        this.finalScore = finalScore;
        this.studentID  = staticID;
        this.staticID += 1;
    }

    public double getAvgScore(){
        return (midScore+ finalScore)/2;
    }
    public String toString(){
        return "(" + studentID + ")" + studentName + ": " + midScore + ", " + finalScore + ", " + getAvgScore();
    }
    static Student findBestStudent(Student[] st_arr){
        int index = 0;
        for(int i = 1; i < st_arr.length; i+=1){
            if(st_arr[index].getAvgScore() < st_arr[i].getAvgScore()){
                index = i;
            }
        }
        return st_arr[index];
    }
    static Student findWorstStudent(Student[] st_arr){
        int index = 0;
        for(int i = 1; i < st_arr.length; i+=1){
            if(st_arr[index].getAvgScore() > st_arr[i].getAvgScore()){
                index = i;
            }
        }
        return st_arr[index];
    }

}
public class lab5_1 {
    public static void main(String[] args){
        Student[] st = new Student[10];
        st[0] = new Student("A", 57.8, 79.25);
        st[1] = new Student("B", 68.7, 77.0);
        st[2] = new Student("C", 34.8, 56.0);
        st[3] = new Student("D", 69.2, 60.7);
        st[4] = new Student("E", 10.8, 100.0);
        st[5] = new Student("F", 45.8, 45.25);
        st[6] = new Student("G", 95.8, 53.25);
        st[7] = new Student("H", 92.8, 91.25);
        st[8] = new Student("I", 80.8, 78.25);
        st[9] = new Student("LEE", 100.0, 100.0);

        System.out.println("----Student LIST ((StudentID) Name, MidScore,  FinalScore, AvgScore) ----");
        for(int i = 0; i<st.length; i++){
            System.out.println(st[i]);
        }
        System.out.println();
        System.out.println("The best student : " + Student.findBestStudent(st));
        System.out.println("The worst student : " + Student.findWorstStudent(st));
    }
}
