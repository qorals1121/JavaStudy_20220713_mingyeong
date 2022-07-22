package j09_클래스.생성자;

public class ConstuctorEx2 {
	
	String name;
	int age;

	// 기본생성자는 기본적으로 생략할 수 있지만 다른 생성자를 오버로딩하게 되면 생략되어있던 기본생성자는 비활성화된다.
	// 즉, 기본생성자를 사용하려면 따로 입력해주어야한다.
	
	public ConstuctorEx2() {}

	public ConstuctorEx2(String name) {
		this.name = name;
	}

	public ConstuctorEx2(int age) {
		this.age = age;
	}

	public ConstuctorEx2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	

	}
