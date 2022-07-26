package j09_클래스2.user;

public class UserMain {
	
	/*
	 * 사용자 정보 시스템
	 * username(사용자이름)
	 * password(비밀번호)
	 * name(이름)
	 * email(이메일)
	 * 
	 * User
	 * UserService
	 */

	public static void main(String[] args) {
		
		int userCount = 10;
		User[] userArray = new User[userCount];
		UserService service = new UserService(userArray);
		
		while(service.userShowInfo()) {};
		System.out.println("프로그램 종료");
		
		
		
	
	}

}
