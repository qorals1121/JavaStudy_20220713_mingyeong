package j07_반복.랜덤;

import java.util.Random;

public class Random3 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int i = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int max = 0;
		
		while(i < 20) {
			a = random.nextInt(50);
			b = random.nextInt(50);
			c = random.nextInt(50);

			if(a > b && a > c) {
				max = a;
			}else if(b > a && b > c) {
				max = b;
			}else if(c > a && c > b){
				max = c;
			}
			
			System.out.println("현재 a 값 : " + a);
			System.out.println("현재 b 값 : " + b);
			System.out.println("현재 c 값 : " + c);
			System.out.println("현재 max 값 : " + max);
			System.out.println();
			
			i++;
			
			}
		
		
		System.out.println("최대값 : " + max);
	
		
		// 풀이
		
		if(a > b && max < a) {
				max = a;
		}else if(max < b) {
			max = b;
		}
		if(max < c) { //별도로 실행되어야함 (else로 묶여버리면 세개가 한꺼번에 실행이 되기 때문에 두개를 비교하고 하나는 따로 비교해야한다
			max = c;
		}
}
}