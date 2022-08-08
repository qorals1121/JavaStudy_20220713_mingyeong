package j19_익명클래스.람다식;

public class Main {

	public static void main(String[] args) {
		
		// Math<T1, T2> 자리에 Integer을 넣어 새로 생성
		Math<Integer, Integer> pulsMath = new Math<Integer, Integer>() {
			
			// 익명클래스로 calc 메소드에 value1 + value2 공식을 넣음
			@Override
			public double calc(Integer value1, Integer value2) {
				return value1 + value2;
			}
		};
		
		System.out.println(pulsMath.calc(10, 20));
		
		Math<Double, Double> pulsMath2 = new Math<Double, Double>() {
			
			@Override
			public double calc(Double value1, Double value2) {
				System.out.println("value1 : " + value1);
				System.out.println("value2 : " + value2);
				return value1 + value2;
			}
		};
		
		System.out.println(pulsMath2.calc(100.5, 200.5));
		
		
		Math<Double, Double> plusMath3 = (v1, v2) -> {
			System.out.println("v1 : " + v1);
			System.out.println("v2 : " + v2);
			return v1 + v2;
					}; // 익명클래스 정의
		// Math<Double, Double> -> 인터페이스. 자바에서 찾아줌
		// (v1, v2) -> 매개변수 정의
		// -> -> calc 메소드
		// v1 + v2 -> return
		// (v1, v2) -> v1 + v2 로 쓰는 경우에는 return이 필요없지만, 중괄호를 열어 다른 수식을 넣을 때는 반드시 return이 필요하다.
		
		System.out.println(plusMath3.calc(50.5, 10.1));
		

	}

}
