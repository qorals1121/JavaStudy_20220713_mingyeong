package j13_최상위클래스;

public class ToString {
	
	private int a;
	private int b;

	public ToString(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
//		System.out.println(super.hashCode());
//		return super.toString();
		return "a : " + a + ", b : " + b;
	}
	
	public void showInfo() {
		
	}
	
	

}
