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
	
	
	}
	

}
