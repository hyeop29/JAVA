/*
Project : ArrayList를 활용한 프로그램
- 다음과 같은 내용이 저장된 "data.txt"에서 한 라인씩 정보를 read한 다음 학생 객체를 생성하고, 각 학생 객체를 ArrayList에 저장하는 main() 프로그램을 구현하시오.
Author: Chang‐Hyeop LEE
Date of last update: Jan. 24, 2022
*/
package LAB10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class Student{
    private int ID; // 학번
    private String name; // 이름
    private int score; // 점수

    /* constructor */
    Student(){

    }
    Student(int ID, String name, int score){
        this.ID = ID;
        this.name = name;
        this.score = score;
    }
    /* mutator */
    void setID(int ID){
        this.ID = ID;
    }
    void setName(String name){
        this.name = name;
    }
    void setScore(int score){
        this.score = score;
    }
    /* accessor */
    int getID(){
        return this.ID;
    }
    String getName(){
        return this.name;
    }
    int getScore(){
        return this.score;
    }
    public String toString(){
        return "학번 : " + ID + "\t이름 : " + name + "\t점수 : " + score;
    }

}
public class lab10_2 {
    public static void main(String[] args){
        try{
            FileReader data = new FileReader("D:/자바 특강 2022.01/src/LAB10/data.txt");
            BufferedReader bufreader = new BufferedReader(data); // 한 줄씩 일기 위해 BufferedReader 사용, Buffer 바가지 같은 존재

            ArrayList<Student> stu = new ArrayList<Student> ();

            String str; // 입력 받은 버퍼를 받을 문자열 선언
            String[] stu_array = new String[3]; // ID, name, Score  각 각 받을 문자열 준비

            while((str = bufreader.readLine()) != null){   // buffer로부터 한줄 씩 읽어서 str에 저장
                stu_array = str.split(",");
                for(int i = 0; i < 3; i += 1){  // , 끊어 읽은 후 앞 뒤 공백 제거
                    stu_array[i] = stu_array[i].trim();
                }
                Student s = new Student(Integer.parseInt(stu_array[0]), stu_array[1], Integer.parseInt(stu_array[2]));
                stu.add(s);
            }
            for(int i = 0; i < stu.size(); i+= 1){
                System.out.println(stu.get(i));
            }

        }
        catch(FileNotFoundException e){
            System.out.println("해당 파일을 찾을 수 없습니다.");
        }
        catch(IOException e){
            System.out.println("문자를 읽을 수 없습니다.");
        }


    }
}
