package j15_스태틱;

public class StaticMain {

	public static void main(String[] args) {

		StaticTest.name = "김준일";
		StaticTest.printTest(); // 글자가 기울어져있으면 스태틱
		
		StaticTest staticTest = new StaticTest();
//		staticTest.name = "김준일";
//		
		System.out.println(staticTest.name);
//		
//		StaticTest staticTest2 = new StaticTest();
//		staticTest2.name = "김준이";
//		System.out.println(staticTest2.name);
//
//		System.out.println(staticTest.name); // 이곳에서 staticTest.name은 김준이로 바뀌어져있다.

	}

}
