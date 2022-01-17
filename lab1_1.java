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