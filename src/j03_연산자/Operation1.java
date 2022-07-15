package j03_연산자;

/*
 * Ctrl + space = 자동완성
 * Ctrl + Alt + 화살표 = 코드복사
 */
public class Operation1 {

	public static void main(String[] args) {
		int num = 50; 
		System.out.println(++num);
		System.out.println(num);
		System.out.println(num++);
		System.out.println(num);
		// ++가 앞에 붙으면 선증가, 뒤에 붙으면 후증가
		
		System.out.println(--num);
		System.out.println(num);
		System.out.println(num--);
		System.out.println(num);
	}

}
