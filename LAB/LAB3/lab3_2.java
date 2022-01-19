/*
Project : 로또 번호 생성기
Author: Chang‐Hyeop LEE
Date of last update: Jan. 18, 2022
*/
package LAB3;
import java.lang.Math;

public class lab3_2 {
	
	static void sort(int[] array) {
		int min, min_value;
		for(int i = 0; i < array.length-1; i+=1) {
			 min = i;
			 min_value = array[i];
			 for(int j = i+1; j< array.length; j+=1) {
				 if(min_value > array[j]) {
					 min = j;
					 min_value = array[j];
				 }
			 }
			 if(min != i) {
				 int tmp = array[i];
				 array[i] = min_value;
				 array[min] = tmp;
			 }
		 }
	}
	
	static int random(int a, int b) {
		int result = (int)(Math.random() * (b+1 - a + 1)) + a;
		return result;
	}
	
	static void lotto(int[][]  array) {
		int count = 0;
		
		for(int i = 0; i < array.length; i+=1) {
			for(int j = 0; j < array[i].length; j+=1) {
				int result = random(0,45);
				//System.out.printf("첫번째 번호 : %d", result);
				//System.out.println(" ");
				for(int k = 0; k<j; k+=1) {
					if(result == array[i][k]) {
						count += 1;
					}
					else if(count > 0) {
						result = random(0,45);
						//System.out.printf("두번째 번호 : %d", result);
						//System.out.println(" ");
						continue;
					}
					
				}
				array[i][j] = result;
				//System.out.print("등록된 번호");
				//System.out.print(array[i][j]);
			}
		}
		for(int i = 0; i < array.length; i+=1) {
			for(int j = 0; j < array[i].length; j+=1) {
				System.out.printf("%d ", array[i][j]);
				//System.out.print(i);
				//System.out.print("번째 행");
			}
			System.out.println(" ");
		}
	}
	
	
	public static void main(String[] args) {
		int[][] array = new int  [5][6];
		System.out.println("로또 복권 5 set 번호 :");
		lotto(array);
	}

}
