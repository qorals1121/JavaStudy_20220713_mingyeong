package j09_클래스2;

public class StudentMain {
	
	public static void main(String[] args) {
		int studentCount = 2;
		
		Student[] studentArray = new Student[studentCount];
		
		StudentService service = new StudentService(studentArray);
		
		while(service.showMainMenu()) {} //q를 넣어 프로그램 종료 전 무한반복을 주기 위해 while을 넣엇음
		System.out.println("프로그램 종료");
		
		
	}
	

}
