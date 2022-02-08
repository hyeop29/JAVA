/*
Project : 두 개 뽑아서 더하기
- 정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
Author: Chang‐Hyeop LEE
Date of last update: Feb. 08, 2022
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
        public int[] solution(int[] numbers){
        int a;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
              a = numbers[i] + numbers[j];
              if(false == result.contains(a)){result.add(a);}
            }
        }
        Collections.sort(result);
        int[] answer = new int[result.size()];
        System.out.println(answer.length);
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}
