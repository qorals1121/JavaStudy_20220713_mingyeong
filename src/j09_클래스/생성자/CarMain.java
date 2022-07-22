package j09_클래스.생성자;

public class CarMain {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		car1.showCarInfo("현대자동차", "쏘나타", "화이트");
		car2.showCarInfo("기아", "k5", "블랙");
		car3.showCarInfo("현대자동차", "아반떼", "그레이");

	}

}
