package j03_연산자;


public class Operation4 {

	public static void main(String[] args) {
		

		/*
		 * 윤년
		 * 해당 년도가 4의 배수이고 100의 배수가 아니거나, 400의 배수일 때 윤년이다.
		 */
		int year = 2000;
		
			String result = year % 4 == 0
					&& (year % 100 != 0 || year % 400 == 0) ? "윤년" 
							: "윤년 아님";
			
			System.out.println(result);
			
			System.out.println(year > 2000 ? "2000보다 큼" 
					: year > 1000 ? "1000보다 큼" 
							:year > 500 ? "500보다 큼"
									: "500이하");
			// 삼항 연산자는 중첩이 가능하다. (false 자리에 새로운 조건을 생성)
	
		}
	
	}

