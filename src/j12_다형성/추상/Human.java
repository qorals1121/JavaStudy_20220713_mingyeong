package j12_다형성.추상;

public class Human extends Animal {

	@Override // 상속받은 클래스에서 추상메소드를 가지고 있으면 override는 무조건 필요하다
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
