package j11_상속2;

public class ClassB extends ClassA {

	public ClassB() {
		super();
		System.out.println("첫번째(B) 자식 클래스 생성자 호출");
		System.out.println();
	}
	
	@Override
	public void printInfo() {
		System.out.print("첫번째 (B) 자식 ");
		super.printInfo();
	}
}
