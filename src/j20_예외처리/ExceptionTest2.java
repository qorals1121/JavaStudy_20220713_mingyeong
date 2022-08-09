package j20_예외처리;

public class ExceptionTest2 {
	
	public void printArray() throws Exception { // 예외가 일어날거라 예상시 throw Exception을 달아준다. (보험들어놓는 것)
		int[] numArray = new int[] { 1, 2, 3, 4, 5 };
		
		if(0 == 0) throw new CustomException(" 내가 만든 예외 강제로 발생");
		
		for(int i = 0; i < 6; i++) {
			System.out.println(numArray[i]);
		}
	}

}
