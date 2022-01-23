/*
Project : 상속의 이해(Employee, Manager class)
Author: Chang‐Hyeop LEE
Date of last update: Jan. 23, 2022
*/
package LAB6;

class Emplyoee{
    protected String name; // 사원의 이름
    private int salary; // 봉급
    protected String ID; // 사원의 사번
    /* constructor */
    Emplyoee(){
        this.name = "";
        this.salary = 0;
        this.ID = "";
    }
    Emplyoee(String name, int salary, String ID){
        this.name = name;
        this. salary = salary;
        this.ID = ID;
    }
    /* mutator */
    void setName(String name){
        this.name = name;
    }
    void setSalary(int salary){
        this.salary = salary;
    }
    void setID(String ID){
        this.ID = ID;
    }
    /* accessor */
    String getName(){
        return this.name;
    }
    int getSalary(){
        return this.salary;
    }
    String getID(){
        return this.ID;
    }
    public String toString()  //여기서 public을 앞에 해주는 이유: toString은 본래 최상의 class의 offer의 메소드이다. offer 메소드가 public 임으로, 선언에 public 사용
    {
        return name + "\t" + salary + "\t" + ID;
    }
}

class Manager extends Emplyoee{ // Employee class를 상속 받는 Manager class 생성
    private String department; // 책임 지고 있는 부서 이름
    /* constructor */
    Manager(){
        super();   // Employee의 default constructor
        this.department = "";
    }
    Manager(String name, int salary, String ID, String department){
        super(name, salary, ID);
        this.department = department;
    }
    /* mutator */
    void setDepartment(String department){
        this.department = department;
    }
    /* accessor */
    String getDepartment(){
        return this.department;
    }
    public String toString()  //여기서 public을 앞에 해주는 이유: toString은 본래 최상의 class의 offer의 메소드이다. offer 메소드가 public 임으로, 선언에 public 사용
    {
        return super.toString() + "\t" + "\t" + department;
    }
}
public class lab6 {
    Emplyoee e1, e2, e3;
    Manager m1, m2, m3;

    public lab6(){
        e1 = new Emplyoee("아이유", 30000000, "kd039482");
        e2 = new Emplyoee("에일리", 35000000, "ek8272593");
        e3 = new Emplyoee();
        m1 = new Manager("김건모", 70000000, "lg837593", "인사부");
        m2 = new Manager("서태지", 60000000, "je934827", "관리부");
        m3 = new Manager();
    }
    public void showlnfo(){
        String info = "이름       월급      사번              관리부서\n";
        info += "============================================================\n";
        info += e1 + "\n" + e2 +"\n" + e3 + "\n" + m1 +"\n" + m2 + "\n" +m3;
        System.out.println(info);
    }
    public static void main(String[] args){
        lab6 myTest = new lab6();
        myTest.showlnfo();
        System.exit(0);
    }
}
