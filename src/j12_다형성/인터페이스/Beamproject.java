package j12_다형성.인터페이스;

public class Beamproject implements VGA {

	@Override
	public void connect() {
		System.out.println("VGA 케이블을 통해 빔프로젝트를 연결합니다.");
		
	}

	@Override
	public void disConnect() {
		System.out.println("VGA 케이블을 통해 연결된 빔프로젝트를 해제합니다.");
		
	}

	
}
