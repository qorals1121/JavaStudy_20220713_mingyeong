package j11_상속.factory;

public class FactoryMain3 {

	public static void main(String[] args) {
		//업캐스팅 
		
		Factory[] factories = new Factory[4];
		factories[0] = new SamsungFactory(1);
		factories[1] = new LGFactory(1);
		factories[2] = new SamsungFactory(2);
		factories[3] = new LGFactory(2);

		int num = 10;
		double dNum = num; // 업캐스팅은 묵시적 형변환이 가능하다
		
		System.out.println((double) num);
		
		int n = (int) dNum;
		
		double d = 3.14; //Factory
		int i = (int) d; //Factory -> SamsungFactory
		
		SamsungFactory sFactory = new SamsungFactory(1);
		Factory f = sFactory;
		
		System.out.println(f);
		
		SamsungFactory sf = (SamsungFactory) f; // 다운캐스팅은 앞에 무조건 변환하고자하는 형을 붙여주어야한다. (명시적 형변환)
		
		Factory factory = new Factory(1);
		SamsungFactory samsungFactory = (SamsungFactory) factory; // 실행시 오류남.
		
		// 꼭 삼성팩토리였던 것을 업캐스팅 한 것을, 다시 삼성팩토리로 다운캐스팅하는 것은 가능하지만 원래 팩토리였던 것은 삼성팩토리로 다운캐스팅 하지 못한다.
		
		
	}
}
