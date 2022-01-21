/*
Project : 예외 처리 + 파일 입출력 + 문자열 처리
Author: Chang‐Hyeop LEE
Date of last update: Jan. 21, 2022
*/
package LAB9;

import java.io.*;

import static java.lang.System.in;

class Student{    // Student 클래스
    private int ID; // 학번
    private String name; // 이름
    private int score; // 점수

    Student(){

    }
    Student(int ID, String name, int score){
        this.ID = ID;
        this.name = name;
        this.score = score;
    }
    void setID(int ID){
        this.ID = ID;
    }
    void setName(String name){
        this.name = name;
    }
    void setScore(int score){
        this.score = score;
    }
    int getID(int ID){
        return ID;
    }
    String getName(String name){
        return name;
    }
    int getScore(int score){
        return score;
    }
    public String toString(){
        return name +"'s ID is " + ID + "and his/her score is " + score;
    }

}

class newException extends Exception{
    newException(){
        super("The score is under zero or upper 100");
    }
    newException(String message){
        super(message);
    }
    public String toString(){
        return "The score is under zero or upper 100";
    }
}

public class lab9 {
    public static void main (String[] args) throws IOException
    {
            FileReader in = null;  //예외 상황일 때 파일을 닫을 수 있도록 try문 밖에 선언
            FileWriter out = null;
        try{
            in  = new FileReader("D:/asasas/src/data.txt");
            out  = new FileWriter("D:/asasas/src/output.txt");

            BufferedReader bufreader = new BufferedReader(in); // 한 줄씩 일기 위해 BufferedReader 사용, Buffer 바가지 같은 존재

            Student[] st_array = new Student[10];   //Student array 선언

            int j = 0;
            String str;
            String[] info = new String[3];
            while((str = bufreader.readLine()) !=  null){
                info = str.split(",");
                for(int i = 0; i < info.length; i+=1){
                    info[i] = info[i].trim();
                }
                if(0 > Integer.parseInt(info[2]) || (100 < Integer.parseInt(info[2]))) {
                    throw new newException();
                }
                st_array[j] = new Student(Integer.parseInt(info[0]),info[1],Integer.parseInt(info[2]));
                System.out.println(st_array[j]);

                out.write(st_array[j].toString());
                out.write("\n");
                j+= 1;
            }
            in.close();
            out.close();

        }
        catch(FileNotFoundException e){
            System.out.println("해당 파일은 존재하지 않는 파일입니다.");
        }
        catch(IOException e){
            System.out.println("해당 파일을 작성할 수 없습니다.");
        }
        catch(NumberFormatException e){

        }
        catch(newException e){
            System.out.print(e);
            in.close();
            out.close();
        }

    }

}
