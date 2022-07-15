package j03_연산자;

/*
 * 논리연산
 * 
 * False = 0, True = 0이 아닌 것
 * 
 * 1. AND연산(&&) - 곱 
 * true && true => true
 * true && false => false
 * false && false => false
 * 
 * 2. OR연산(||) - 합
 * true || true => true
 * true || false => true
 * false || false => false
 * 
 * 3. NOT연산(!) - 부정
 * !true => false
 * !false => true
 * 
 * !(true && false) => true
 * 
 */

public class Operation3 {

	public static void main(String[] args) {
		boolean result = 10 != 5;
		boolean result2 = 10 == 10;
		
		System.out.println("" + result + result2); // boolean끼리는 산술연산이 되지 않는다.
		
		System.out.println(2000 % 4 == 0 && 2000% 100 != 0 && 2000 % 5 == 0);
	
	}

}
