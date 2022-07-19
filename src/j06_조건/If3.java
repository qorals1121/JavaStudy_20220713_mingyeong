package j06_조건;

import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = 0;
		int y = 0;
		String result = null;
		
		System.out.print("x의 값 : ");
		x = scanner.nextInt();
		System.out.print("y의 값 : ");
		y = scanner.nextInt();
		
		if(x > 0 && y > 0) {
			result = "1사분면";
		}else if(x < 0 && y > 0) {
			result = "2사분면";
		}else if(x < 0 && y < 0) {
			result = "3사분면";
		}else if(x > 0 && y < 0) {
			result = "4사분면";
		}else {
			result = "계산 불가";
		}
		
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("결과 : " + result);

	}

}
