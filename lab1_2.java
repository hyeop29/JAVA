package LAB1;
import java.lang.Math;
import java.util.Scanner; 

public class lab1_2 {
	static double cal_int(Scanner in) {
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		double s = 0.0, area = 0.0;
		if ((a + b > c) || ((a + c) > b) || ((b + c) > a) ) {
			 s = (a+b+c)/2;
			 area = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
		}
		else {
			System.out.println("삼각형 구성을 할 수 없습니다.");
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
		if ((a + b > c) || ((a + c) > b) || ((b + c) > a) ) {
			 s = (a+b+c)/2;
			 area = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
		}
		else {
			System.out.println("삼각형 구성을 할 수 없습니다.");
		}
		return area;
	}
	public static void main(String[] arg) {
		double area = 0.0;
		Scanner in = new Scanner(System.in);
		System.out.print("삼각형 3변의 길이를 입력하시오 : ");
		area = cal_int(in);
		System.out.printf("삼각형 넓이 : %f\n", area);
		System.out.print("삼각형 3변의 길이를 입력하시오 : ");
		area = cal_str(in);
		System.out.printf("삼각형 넓이 : %f\n", area);
	}

}
