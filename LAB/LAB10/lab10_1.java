/*
Project : Vector, Collection을 활용한 프로그램
- Size가 20인 벡터에 100이상 1000 이하의 정수 20개를  각각 저장한 후, 가장 큰수와 가장 작은 수를 출력하는 프로그램을 작성하시오
Author: Chang‐Hyeop LEE
Date of last update: Jan. 24, 2022
*/

package LAB10;

import java.util.Collections;
import java.util.Vector;

public class lab10_1 {

    int findMax(Vector<Integer> v){
        int max = v.get(0);
        for(int i = 1; i < v.size(); i+= 1){
            if( max < v.get(i)){
                max = v.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args){
        Vector<Integer> v = new Vector<Integer>(20);  // Size가 20인 벡터 생성
        int i = 0;
        while(i < v.capacity()){
            int random = (int) (Math.random() * (1000 - 100+ 1)) + 100;  // 1000 미만 100 이상의 랜덤 정수 생성 방법
            v.add(random);
            i += 1;
        }
        System.out.print("벡터에 저장된 20개의 정수 : ");
        System.out.println(v);
        lab10_1 a = new lab10_1();  // static 으로 선언되지 않은 메소드를 사용하기 위해 객체 생성
        System.out.printf("최대값 : %d ", a.findMax(v));
        System.out.printf("최소값 : %d", Collections.min(v));
        System.out.println();
        System.out.print("벡터에 저장된 20개의 정렬된 정수 :");
        Collections.sort(v);
        System.out.print(v);
    }
}
