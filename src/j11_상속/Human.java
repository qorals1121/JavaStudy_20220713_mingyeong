package j11_상속;

public class Human extends Animal {
	
	public Human() {
		super(); //생략되어있음. (부모의 주소, 생성자 호출)
		// 부모가 생성이 먼저 되고 자식이 생성될 수 있다 = 순서가 바뀔 수 없음!
		System.out.println("Human 객체 생성");
	}
	
	@Override // 오버라이드 : 재정의 @ -> 어노테이션
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	
	}
}
