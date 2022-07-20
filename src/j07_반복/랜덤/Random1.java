package j07_반복.랜덤;

public class Random1 {

	public static void main(String[] args) {
		
		/*
		 * random 메소드
		 * 0 ~ 1 사이의 숫자를 실수 형태로 랜덤하게 값을 만들어줌
		 * 
		 */
		
		int i = 0;
		
		while(i < 10) {
			double rNum = Math.random();
			System.out.println((int) (rNum * 10)); //1의 자리로 랜덤하게 출력하고 싶을 경우 10을 곱하고 다운캐스팅
			i++;
		}
		
		
	}

}
