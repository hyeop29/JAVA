package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
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
    public static void main(String args[]){
        int[] numbers = {2, 1, 3, 4, 1};
        Solution sl = new Solution();
        int[] answer = sl.solution(numbers);
        System.out.println(Arrays.toString(answer));
    }
}
