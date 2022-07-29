package j11_상속2;

public class ClassTestMain {

	public static void main(String[] args) {
		ClassB b = new ClassB();
		b.printInfo();
		b.showData();
		
		ClassB bb = new ClassB();
		ClassA aa = (ClassA) bb;
		
		ClassA aaa = new ClassB();
		
		aa.showData();
		aa.printInfo();
		
		ClassC c = new ClassC();
		c.printInfo(); 
		c.showData();
		
		
	}

}
