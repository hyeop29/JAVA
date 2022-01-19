/*
Project : ComplexNumber 클래스를 구현하고, 이를 통해 생성된 복소수 사이의 덧셈, 뺄셈 등의 연산을 수행하고자 한다.
Author: Chang‐Hyeop LEE
Date of last update: Jan. 19, 2022
*/
package LAB4;
import java.lang.Math;

class ComplexNumber{

    private double realPart, imagPart;
    void setReal(double realPart){
        this.realPart = realPart;
    }
    void setImag(double imagPart){
        this.imagPart = imagPart;
    }
    double getReal(){
        return this.realPart;
    }
    double getImag(){
        return this.imagPart;
    }
    double magnitude(){
        return Math.sqrt(realPart*realPart + imagPart*imagPart);
    }
    ComplexNumber add (ComplexNumber n ){
        ComplexNumber result = new ComplexNumber();
        result.realPart = this.realPart + n.realPart;
        result.imagPart = this.imagPart + n.imagPart;
        return result;
    }
    ComplexNumber sub (ComplexNumber n ){
        ComplexNumber result = new ComplexNumber();
        result.realPart = this.realPart - n.realPart;
        result.imagPart = this.imagPart - n.imagPart;
        return result;
    }
    void printNumber(){
        System.out.printf("%2.1f + %2.1f i\n",this.realPart,this.imagPart);
        System.out.printf("Magnitude : %f\n",this.magnitude());
    }
}
public class lab4_2 {

    public static void main(String[] args){
        ComplexNumber n1 = new ComplexNumber();
        ComplexNumber n2 = new ComplexNumber();
        n1.setReal(5);
        n1.setImag(7.2);
        n2.setReal(-3.1);
        n2.setImag(5.7);

        System.out.print("n1 is -> \t");
        n1.printNumber();
        System.out.print("n2 is -> \t");
        n2.printNumber();

        ComplexNumber n3 = n1.add(n2);
        System.out.print("n1 + n2 is -> \t");
        n3.printNumber();

        System.out.print("n1 - n2 is -> \t");
        (n1).sub(n2).printNumber();
    }
}
