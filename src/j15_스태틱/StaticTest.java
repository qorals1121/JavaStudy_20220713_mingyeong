package j15_스태틱;

public class StaticTest {
	
	public static String name;
	private int age;
	
	public static void printTest() {
		System.out.println("출력");
		System.out.println(name);

	}
	
	// static은 생성되면서 메모리를 할당하는 것이 아니라 스택에 포함되어 해당 클래스 파일 안에 메모리가 포함된다.
	// static에는 this가 없다.
	// 
}
