/*
Project : Prime Number 찾기
- 1부터 10,000 번째의 Prime number를 찾기
- 10,000개의 prime number를 가지는 array 생성함
- Thread를 10개 생성
    각각의 Thread는 Prime number를 찾음
    찾은 prime number를 array에 순차적으로  추가함
Author: Chang‐Hyeop LEE
Date of last update: Jan. 25, 2022
*/
package LAB11;

import groovy.transform.Synchronized;
import java.util.Vector;

class PrimeNumberFind extends Thread {   // Prime number를 찾는 thread 생성

    boolean checkPrime(int num){  // 소수인지 아닌지 판별해주는 boolean형 함수
        if(num < 2){
            return false;
        }
        else if(num == 2){
            return true;
        }
        for(int i = 2; i < num; i++){
            if(num % i == 0){  // 나누어 떨어지는게 있음으로 소수가 아니다
                return false;
            }
        }
        return true;
    }

    static Vector<Integer> PrimeNumberArray = new Vector<Integer>();   // 공유자원 Vector를 static으로 지정
    public void run() {
        int count = 0;
        while (true) {
            synchronized (this.PrimeNumberArray) {
                if (PrimeNumberArray.size() == 10000) {
                    System.out.println(PrimeNumberArray.size());
                    break;
                }
            }
            synchronized (this.PrimeNumberArray){
                if (checkPrime(count)) {

                    if(false == PrimeNumberArray.contains(count)){
                        //System.out.printf("삽입하는 수 : %d", count);
                        PrimeNumberArray.add(count);
                        //System.out.print("!!!!!:");
                        //System.out.println(PrimeNumberArray.size());
                    }

                }
                count += 1;
            }
            }
        }

    public String toString() {
        String str = "";
        for (int i = 0; i < PrimeNumberArray.size(); i += 1) {
            if ((i % 10) == 0) {
                 str += "\n";
            }
            str += PrimeNumberArray.get(i) + " ";
        }
        return str;
    }
}
public class lab11 {
    public static void main(String[] args){
        PrimeNumberFind t1 = new PrimeNumberFind();
        PrimeNumberFind t2 = new PrimeNumberFind();
        PrimeNumberFind t3 = new PrimeNumberFind();
        PrimeNumberFind t4 = new PrimeNumberFind();
        PrimeNumberFind t5 = new PrimeNumberFind();
        PrimeNumberFind t6 = new PrimeNumberFind();
        PrimeNumberFind t7 = new PrimeNumberFind();
        PrimeNumberFind t8 = new PrimeNumberFind();
        PrimeNumberFind t9 = new PrimeNumberFind();
        PrimeNumberFind t10 = new PrimeNumberFind();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();

        try{
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
            t7.join();
            t8.join();
            t9.join();
            t10.join();
            System.out.println(t1);
        }
        catch(InterruptedException e){

        }
    }
}
