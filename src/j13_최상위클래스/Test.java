package j13_최상위클래스;

public class Test extends Object { // 모든 클래스에는 extends Object 생략중 (자바 특징)

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Test [hashCode()=" + hashCode() + "]";
	}
	
	public void testMethod() {
		System.out.println("테스트 메소드");
	}
	

}
