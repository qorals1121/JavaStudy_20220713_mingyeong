package j15_스태틱;

public class MainStaticTest {

	public void printTest() { //생성이 되어야지만 사용가능
		System.out.println("출력");
	}
	
	public static void main(String[] args) {
		MainStaticTest mainStaticTest = new MainStaticTest();
	}

}
