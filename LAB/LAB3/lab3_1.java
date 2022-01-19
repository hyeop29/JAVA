/*
Project : 키보드로부터 정수 10개를 입력 받아 배열에 저장하고, 오름차순으로 정렬한 후 출력하는 프로그램을 작성하시오.
Author: Chang‐Hyeop LEE
Date of last update: Jan. 18, 2022
*/
package LAB3;
import java.util.Scanner;

public class lab3_1 {
	
	static void sort(int[] array) { //선택 정렬
		int min = 0;
		int min_value = 0;
		for(int i = 0; i < array.length-1; i+=1) {
			min = i;
			min_value = array[i];
			for(int j = i+1; j < array.length; j+=1) {
				if(min_value > array[j]) {
					min_value = array[j];
					min = j;
				}
			}
			if(min != i) {
				int tmp = array[i];
				array[i] = min_value;
				array[min] = tmp;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int[] array = new int  [10];
		System.out.print("정수 10개를입력하시오: ");
		for(int i = 0; i < array.length; i+=1) {
			int a = in.nextInt();
			array[i] = a;	
		}
		System.out.print("정렬 전 배열 : ");
		for(int i = 0; i < array.length; i+=1) {
			System.out.print(array[i]);
		}
		sort(array);
		System.out.println("");
		
		System.out.print("정렬 후 배열 : ");
		for(int i = 0; i < array.length; i+=1) {
			System.out.print(array[i]);
		}
	}

}
