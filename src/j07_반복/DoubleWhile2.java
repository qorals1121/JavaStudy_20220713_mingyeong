package j07_반복;

public class DoubleWhile2 {

	public static void main(String[] args) {
		/*
		 * 1 교시 1분 ... 50분 10분 쉬는 시간 2 교시 1분 ... 50분 10분 쉬는 시간 3 교시 1분 ... 50분 10분 쉬는 시간
		 * 4 교시 1분 ... 50분 10분 쉬는 시간
		 */

		int i = 0;

		while (i < 4) {
			System.out.println("=================");
			System.out.println((i + 1) + "교시");

			int j = 0;
			int k = 0;

			while (j < 50) {
				System.out.println("\t" + (j + 1) + "분");
				j++;
			}

			System.out.println("===============");
			System.out.println("10분 쉬는 시간");

			while (k < 10) {
				System.out.println("\t" + (k + 1) + "분");
				k++;
			}
			i++;
		}

		// 풀이

		int i2 = 0;

		while (i2 < 4) {
			System.out.println((i + 1) + "교시");

			int j = 0;

			while (j < 60) {
				int time = 0;
				
				if (j < 50) {
					time = j + 1;
					System.out.println("\t" + time + "분");
					
				} else 
					if (j == 50) {
					System.out.println("10분 쉬는시간");
				}
				time = j - 50 + 1;
				System.out.println("\t" + time + "분");
			}
				
				j++;
				}
			i++;
			}
		
		}

	


