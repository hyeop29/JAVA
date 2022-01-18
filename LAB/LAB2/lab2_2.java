/*
Project : 다음 조건에 따라 주어진 모양을 출력하시오
Author: Chang‐Hyeop LEE
Date of last update: Jan. 18, 2022
*/
package LAB2;
import java.util.Scanner;

public class lab2_2 {
	
	static void draw(int height) {
			int j, k, f;
			j = (height * 2) - 1; // 총  가로 길이
			for(k = j-2; k > 0; k -= 2) // 공백길이 
			{   
				for(f = 0; f < (j-k)/2; f+=1) { // 공백 전 * 출력
					System.out.print("*");
				}
				for(int q = 0; q < k ; q+=1) { // 공백출력 
					System.out.print(" ");
				}
				for(int w = 0; w < (j-k)/2; w+=1) {
					System.out.print("*"); // 공백 후 * 출력
				}	
				System.out.println(" "); // 뛰어쓰기
			}
			for(int i = 0; i < j; i+=1) {  // 마지막 행 출력
				System.out.print("*");
			}
			System.out.println(" ");
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print("Enter the hight : ");
			String in_str = in.next();
			int i = Integer.parseInt(in_str);
			if (i > 0) {
				draw(i);
			}
			else {
				System.out.println("양수를 입력하시오.");
			}
		}
		
	}

}
