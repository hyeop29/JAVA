/*
Project : 올해 1월 1일이 어떤 요일인지 입력 받은 후, 달력을 출력하시오.각 달의 시작부에 빈 칸이 발생하면 *로 채우고, 2월은 28일이라고 가정한다.
Author: Chang‐Hyeop LEE
Date of last update: Jan. 18, 2022
*/
package LAB2;
import java.util.Scanner;

public class lab2_3 {
	
	public static void main(String[] args) {
		String[] weekArray = {"일요일", "월요일","화요일", "수요일", "목요일", "금요일", "토요일"}; //요일 배열
		int[] monthArray = {0,31,28,31,30,31,30,31,31,30,31,30,31};  // 각 달에 몇일이 있는지?
		
		Scanner in = new Scanner(System.in);
			System.out.print("올해 1월 1일은 어떤 요일인가요? ");
			String in_str = in.next();
			System.out.println(in_str);
			int weekday = 0;
			int linechange = 0;
			
			for(int i = 0 ; i < weekArray.length; i+=1) {  // 입력받은 요일이 배열의 몇 번째 인덱스인지 찾는다
				if(in_str.equals(weekArray[i])) {
					weekday = i;
				}
			}
		
			for(int i = 1; i < 13; i+=1) {
				
				for(int k = 0; k < weekday; k+=1) {
					linechange += 1;
					System.out.printf(" *");
					if(linechange == 7) {
						System.out.println(" ");
						linechange = 0;
					}
				}
				for(int j = 1; j < monthArray[i]+1; j+=1) {
					linechange += 1;
					System.out.printf(" %d", j);
					
					if(linechange == 7) {
						System.out.println(" ");
						linechange = 0;
					}
				}
				weekday += monthArray[i];
				weekday = weekday % 7;
			}
		}

}
