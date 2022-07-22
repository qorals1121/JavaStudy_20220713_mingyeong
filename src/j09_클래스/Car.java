package j09_클래스;

public class Car {
	String company;
	String color;
	String model;
	
	Car() { //constructor = 생성자, 생성자는 무조건 주소값을 리턴한다
		// 생성자는 무조건 클래스명과 동일해야함
		// TODO Auto-generated constructor stub
		System.out.println("생성자 호출?");
	}
	
	void showCarInfo() {
		System.out.println("회사명 : " + company);
		System.out.println("모델명 : " + model);
		System.out.println("색상   : " + color);
		System.out.println();
	}
}
