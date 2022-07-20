package j07_반복;

public class For1 {

	public static void main(String[] args) {
		
		int num = 0;
			
//		for(int i = 0; i < 9; i++) {
//			int dan = i + 1;
//			System.out.println("=============");
//			System.out.println(dan + "단");
//			System.out.println(dan + " x " + num + " = " + (dan * num));
//			for(int j = 0; j < 9; j++) {
//				num = j + 1;
//				System.out.println(dan + " x " + num + " = " + (dan * num));
//			}
//		}
		// 풀이
		
		
		for(int i = 0; i < 8; i++) {
			int dan = i + 2;
			System.out.println(dan + "단");
			
			for(int j = 0; j < 9; j++) {
				int num2 = j + 1;
				System.out.println(dan + " x " + num2 + " = " + (dan * num2));
			}
			
			System.out.println();
		}
		
	}

}
