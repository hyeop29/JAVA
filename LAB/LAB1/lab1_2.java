/*
Project : 키보드로부터 정수 3개를 입력 받고, 이 3개의 수로 삼각형을 만들 수 있는지 판별하시오. 만약 삼각형이 구성된다면, 넓이를 계산하여 출력하시오.
Author: Chang‐Hyeop LEE
Date of last update: Jan. 17, 2022
*/
package LAB1;
import java.lang.Math;
import java.util.Scanner; 

public class lab1_2 {
	static double cal_int(Scanner in) {
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		double s = 0.0, area = 0.0;
		if ((a + b <= c) || ((a + c) <= b) || ((b + c) <= a) ) {
			System.out.println("삼각형 구성을 할 수 없습니다.");
		}
		else {
			s = (a+b+c)/2;
			area = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
		}
		return area;
	}
	static double cal_str(Scanner in) {
		String a_str = in.next();
		String b_str = in.next();
		String c_str = in.next();
		int a = Integer.parseInt(a_str);
		int b = Integer.parseInt(b_str);
		int c = Integer.parseInt(c_str);
		double s = 0.0, area = 0.0;
		if ((a + b <= c) || ((a + c) <= b) || ((b + c) <= a) ) {
			System.out.println("삼각형 구성을 할 수 없습니다.");
		}
		else {
			s = (a+b+c)/2;
			area = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
		}
		return area;
	}
	public static void main(String[] arg) {
		double area = 0.0;
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print("삼각형 3변의 길이를 입력하시오 : ");
			area = cal_int(in);
			if(area == 0.0) {
				continue;
			}
			System.out.printf("삼각형 넓이 : %f\n", area);
			System.out.print("삼각형 3변의 길이를 입력하시오 : ");
			area = cal_str(in);
			if(area == 0.0) {
				continue;
			}
			System.out.printf("삼각형 넓이 : %f\n", area);
		}
	}
}