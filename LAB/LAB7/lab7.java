/*
Project : 클래스 계층구조 설계 (상속과 다항성)
Author: Chang‐Hyeop LEE
Date of last update: Jan. 20, 2022
*/
package LAB7;
abstract class Student {
    String name;
    int id;
    Student(){

    }
    Student(String name, int id){
        this.name = name;
        this.id = id;
    }
    abstract int getAnnualSalary();

    String getName(){
        return this.name;
    }
    int getId(){
        return this.id;
    }
}
class Undergraduate extends  Student {  //Student class 를 상속받는 Undergraduate class 생성
    int semesterSalary;
    Undergraduate(){

    }
    Undergraduate(String name, int id, int semesterSalary){
        super(name, id);  //부모가 만든 생성자 사용
        this.semesterSalary = semesterSalary;
    }
    public String toString(){
        return name + "(" + id + ") : " +  this.getClass().getSimpleName() + ", semester Salary : " + semesterSalary + ", annual salary : " +getAnnualSalary() ;
    }
    int getAnnualSalary(){
        return 2*semesterSalary;
    }
}
class Graduate extends  Student {
    int monthSalary;
    Graduate(){

    }
    Graduate(String name, int id, int monthSalary){  //Student class 를 상속받는 Graduate class 생성
        super(name, id); //부모가 만든 생성자 사용
        this.monthSalary = monthSalary;
    }
    public String toString(){
        return name + "(" + id + ") : " +  this.getClass().getSimpleName() + ", month Salary : " + monthSalary + ", annual salary : " + getAnnualSalary();
    }
    int getAnnualSalary(){
        return 12*monthSalary;
    }
}
public class lab7 {
    public static void main(String[] args){
        Student[] s = new Student[8];
        s[0] = new Graduate("Giggs", 20163103, 400000);
        s[1] = new Graduate("Carrick", 20163003, 500000);
        s[2] = new Graduate("Evra", 20155511, 350000);
        s[3] = new Graduate("Saha", 20143323, 550000);

        s[4] = new Undergraduate("Crouch", 20170103, 1000000);
        s[5] = new Undergraduate("Nevile", 20170012, 1200000);
        s[6] = new Undergraduate("Ji-sung", 20160429, 1100000);
        s[7] = new Undergraduate("Rooney", 20150718, 900000);

        for (int i = 0; i < s.length; i+=1){
            System.out.println(s[i]);
        }
        int index = 0;
        for (int i = 0; i < s.length; i+=1){
            if(s[index].getAnnualSalary() < s[i].getAnnualSalary()){
                index = i;
            }
        }
        System.out.println("\nA student who receives the highest salary : " + s[index].getName() + "(" + s[index].getId() + ")" );
    }
}
