/*
Project : 다음과 같은 내용이 출력되도록 printMultTable(int high) 메소드를 구현하시오.
Author: Chang‐Hyeop LEE
Date of last update: Jan. 18, 2022
*/
package LAB2;

public class lab2_1 {
	
	static void printMultTable(int high) {
		int result;
		for(int i = 1; i < high+1; i+=1) {
			for(int j = 1; j < i+1; j+=1) {
				result = i * j;
				System.out.printf("%d ",result);
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		printMultTable(7);
	}

}
