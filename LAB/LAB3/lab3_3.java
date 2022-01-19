/*
Project : 키보드로부터 정수 3개를 입력 받고, 이 3개의 수로 삼각형을 만들 수 있는지 판별하시오. 만약 삼각형이 구성된다면, 넓이를 계산하여 출력하시오.
3개의 정수를 쉼표와 공백으로 구분하여 한 줄에 입력할 때 위 프로그램을 다시 작성해라.
Author: Chang‐Hyeop LEE
Date of last update: Jan. 18, 2022
*/
package LAB3;
import java.util.Scanner;

public class lab3_3 {
	static double cal_Area(Scanner in) {
		double s;
		double area = 0.0;
		int[] sideArr_int = new int[3];
		String str = in.nextLine();  // Scanner를 String 형으로
		String [] sideArr = str.split(",");  // String을 , 기준으로 나눈다
		for(int i = 0; i < sideArr.length; i+=1) { // 문자열 공백 제거
			sideArr[i] = sideArr[i].trim();
			sideArr_int[i] = Integer.parseInt(sideArr[i]); 
		}
		if((sideArr_int[0] + sideArr_int[1] <= sideArr_int[2]) || (sideArr_int[0] + sideArr_int[2] <= sideArr_int[1]) || (sideArr_int[2] + sideArr_int[1] <= sideArr_int[0])) {
			System.out.println("올바르지 않은 삼각형 정보입니다.");
		}
		else {
			s = (sideArr_int[0] + sideArr_int[1] + sideArr_int[2])/2.0;
			area = Math.sqrt((s*(s-sideArr_int[0])*(s-sideArr_int[1])*(s-sideArr_int[2])));
		}
		return area;
	}
	public static void main(String[] args) {
		double result;
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print("삼각형 3변의 길이를 입력하시오 : ");
			result = cal_Area(in);
			if(result == 0.0) {
				continue;
			}
			System.out.printf("삼각형 넓이는 : %f\n",result);
		}
		
	}
}
