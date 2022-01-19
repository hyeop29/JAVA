/*
Project : Rectangle 클래스
Author: Chang‐Hyeop LEE
Date of last update: Jan. 19, 2022
*/
package LAB4;

class Rectangle{    //Person 구조체
    int x1,y1,x2,y2;

    Rectangle(){
        this(0,0,0,0);
    }
    Rectangle(int x1,int y1,int x2,int y2){
        set(x1, y1, x2, y2);
    }
    void set(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    boolean check(){
        if((y2-y1 > 0 ) && (x2 - x1 > 0)){
            return true;
        }
        else{
            return false;
        }
    }
    int getArea(){
        if(check()){
            return (x2 - x1) * (y2 - y1);
        }
        else{
            return 0;
        }

    }
    void show(){
        if(getArea() != 0){
            System.out.printf("직사각형의 네 점의 좌표: (%d,%d),(%d,%d),(%d,%d),(%d,%d)\n",x1,y1,x2,y1,x2,y2,x1,y2);
            System.out.printf("직사각형의 넓이 : %d\n",getArea());
        }
        else{
            System.out.println("직사각형이 구성되지 않았습니다.");
        }
    }
    boolean equals(Rectangle r){
        if(((this.x2-this.x1) == (r.x2 - r.x1)) && ((this.y1-this.y2) == (r.y1-r.y2)) &&(this.getArea() == r.getArea())){
            return true;
        }
        else{
            return false;
        }
    }
}

public class lab4_1 {
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        Rectangle s = new Rectangle(1,1,2,3);

        r.show();
        s.show();

        r.set(1,2,3,4);
        r.show();
        if(r.equals(s)){
            System.out.println("두 사각형은 같은 사각형입니다.");
        }
        else{
            System.out.println("두 사각형은 다른 사각형입니다.");
        }
    }
}