/*
Project : 추상 클래스 (도형 클래스들)
Author: Chang‐Hyeop LEE
Date of last update: Jan. 23, 2022
*/
package LAB8;
abstract class Figure  // Rectangle 과 Triangle class에 공통으로 들어가는 핃드, 메소드를 가지고 있는 추상 class Figure
{
    String figureName; // 이름

    void drawAt(int offset_x, int offset_y){  // drawAt은 공통적인 부분임으로 슈퍼 클래스에 구현
        for(int i = 1; i < offset_y + 1; i += 1){
            System.out.println(i);
        }
        for(int i = 1; i < offset_x + 1; i += 1){
            System.out.print(i);
        }
        System.out.print(figureName);
        System.out.println();
        drawHere(offset_x);

    };
    abstract void drawHere(int offset_x);

}
class Rectangle extends Figure{
    private int width; // 밑변 길이
    private int height; // 높이
    /* constructor */
    Rectangle(){

    }
    Rectangle(String figureName, int width, int height){
        this.figureName = figureName;
        this.width = width;
        this.height = height;
    }
    void drawHere(int offset_x){
        for(int i = 0; i < height; i += 1){
            for(int k = 0; k < offset_x; k += 1){  // x축 좌표만큼 공백
                System.out.print(" ");
            }
            for(int j  = 0; j < width; j += 1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Triangle extends Figure{
    private int base;
    /* constructor */
    Triangle(){

    }
    Triangle(String figureName, int base){
        this.figureName = figureName;
        this.base = base;
    }
    void drawHere(int offset_x){
        int i;
        for(i = 0; i < base; i += 1){   // x축 좌표만큼 공백 생성
            for(int k = 0; k < offset_x; k += 1){
                System.out.print(" ");
            }
            for(int j = 0; j < i + 1; j+= 1){ // 삼각형 그리기
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

public class lab8 {
    public static void main(String[] args){
        Figure f;
        f = new Rectangle("사각형", 3, 4); // upcasting 사용
        f.drawAt(5, 5);
        f= new Triangle("삼각형", 5); // upcasting 사용
        f.drawAt(2,3);
    }
}
