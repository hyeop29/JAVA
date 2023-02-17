/* 2진수, 8진수, 16진수를 프로그램에서 사용하는 예제 */
package ch04;

public class BinaryTest {
	
	public static void main(String[] args) {
		
		int num = 10;
		int bNum = 0B1010; //0B를 사용하면 뒤에는 2진수로 나타내는 것을 의미
		int oNum = 012; // 0을 사용하면 뒤에 8진수로 나타내는 것을 의미 
		int xNum = 0XA; // 0X를 사용하면 뒤에 16진수로 나타내는 것을 의미
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
	
	}

}
