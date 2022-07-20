package j07_반복;

public class While4 {

	public static void main(String[] args) {
	/*
	 * 2 X 1 = 2
	 * 2 X 2 = 4
	 * ...
	 * 2 X 9 = 18
	 */
		
		int dan = 2;
		int i = 0;
		
		while(i < 9) {
		int num = i + 1;
		System.out.println(dan + " x " + num + " = " + (dan * num));
		i++;
		}
	
		int dan2 = 0;
		int num2 = 0;
		i = 0;
		
		while(i < 8) {
			dan2 = i + 2;
			System.out.println(dan2 + " x " + num2 + " = " + (dan2 * num2));
			int j = 0;

			while(j < 9) {
				num2 = j + 1;
				System.out.println(dan2 + " x " + num2 + " = " + (dan2 * num2));
				j++;
		}
			i++;
			}
	}
	

}
