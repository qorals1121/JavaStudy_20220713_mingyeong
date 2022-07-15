package j03_연산자;


public class Operation5 {

	public static void main(String[] args) {
		/*
		 * 시험 성적 결과 계산 프로그램
		 * score = 85
		 * 
		 * 1. score가 0보다 작거나 100보다 크면 계산 불가
		 * 89보다 크면 A학점
		 * 79보다 크면 B학점
		 * 69보다 크면 C학점
		 * 59보다 크면 D학점
		 * 나머지는 F 학점
		 * 
		 * 결과 : 계산불가 or 학점
		 */
		
		final int MIN_NUMBER = 0;
		final int MAX_NUMBER = 100;
		
		 int score = 85;
		 
		 String result = score < MIN_NUMBER || MAX_NUMBER < score ? "계산불가"
				: score > 89 ? "A학점"
				: score > 79 ? "B학점"
				: score > 69 ? "C학점"
				: score > 59 ? "D학점"
				: "F학점";
										 
		System.out.println(result);
		
		
		}
	
	}

