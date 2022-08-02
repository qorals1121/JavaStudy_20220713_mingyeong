package j15_스태틱.싱글톤;

/*
 * 싱글톤(Singleton)
 * 유일한 객체를 만들어서 공유하는 생성패턴
 * 
 * 1. 생성자는 접근지정자가 private이다. (= 외부에서 생성, 호출할 수 없다.)
 * 2. 자기 자신의 유일한 객체를 담을 수 있는 instance라는 변수명을 가진 스태틱변수가 필요하다.
 * 3. instance 변수를 리턴(공유)해줄 getInstance 스태틱 메소드가 필요하다.
 */

// 싱글톤을 사용하지 않으면 모두 스태틱을 사용해주어야함
public class KIA {
	private static KIA instance;
	
	private Car[] carArray;
	private int autoCode;
	
	private KIA() {
		carArray = new Car[10];
		autoCode = 20220000;
	}
	
	public static KIA getInstance() {
		if(instance == null) {
			instance = new KIA();
		}
		return instance;
	}

	public Car produceCar(String model) {
		int carNumber = ++autoCode;
		String company = getClass().getSimpleName();

//		Car car = new Car(++autoCode, company, model);
		
		Car car = car.builder()
				.carNumber(carNumber)
				.company(company)
				.model(model)
				.build();
		
		if(addCar(car)) {
			return car;
		}
		return null;
	}
	
	private boolean addCar(Car car) {
		for(int i = 0; i < carArray.length; i++) {
			if(carArray[i] == null) {
				carArray[i] = car;
				System.out.println("배열에 차량 추가 완료.");
				return true;
			}
		}
		System.out.println("배열에 공간이 없습니다.");
		return false;
	}

}
