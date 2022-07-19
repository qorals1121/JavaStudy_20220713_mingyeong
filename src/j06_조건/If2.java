package j06_조건;

public class If2 {

	public static void main(String[] args) {
		int score = 115;
		String result = null;

		if(score < 0 || score > 100) {
			System.out.println("점수는 0 ~ 100점 사이여야합니다.");
			result = "계산 불가";
		}else if(score > 89) {
			System.out.println("100점 혹은 90점대 입니다.");
			result = "A";
		}else if(score > 79) {
			System.out.println("80점대 입니다.");
			result = "B";
		}else if(score > 69) {
			System.out.println("80점대 입니다.");
			result = "C";
		}else if(score > 59) {
			System.out.println("80점대 입니다.");
			result = "D";
		}else {
			System.out.println("0 ~ 59점대 입니다.");
			result = "F";
		}

		System.out.println("결과 : " + result);
	}

}
