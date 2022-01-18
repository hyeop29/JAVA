/*
Project : 키보드에서 영문자를 입력 받아 소문자이면 대문자로, 대문자이면 소문자로 변환하여 출력하는 프로그램을 작성하시오.
Author: Chang‐Hyeop LEE
Date of last update: Jan. 17, 2022
*/
package LAB1;
import java.util.Scanner;

public class lab1_1 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String str;
		while(true)
		{
			System.out.println("");
			System.out.print("영문자를 입력하시오 :");
			str = in.nextLine();
			for(int i = 0; i < str.length(); i += 1) {
				 char ch = str.charAt(i);
				 if(('a'<= ch) && (ch <='z')) {
					 ch -= 32;
					 System.out.print(ch);
			}
				 else if(('A'<= ch) && (ch <='Z')) {
					 ch += 32;
					 System.out.print(ch);
				 }
				 else {
					 System.out.println("영문자가 아닙니다.");
					 break;
				 }
			}
		}
	}
}