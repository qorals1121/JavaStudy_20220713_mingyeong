package j09_클래스2.user;

import java.util.Scanner;

public class UserService {
	
	private User[] userArray;
	private Scanner scanner;
	
	public UserService(User[] userArray) {
		this.userArray = userArray;
		this.scanner = new Scanner(System.in);
	}
	
	public boolean userShowInfo() {
		String select = null;
		
		System.out.println("[ 메인 메뉴 ]");
		System.out.println("1. 회원 등록");
		System.out.println("2. 회원 리스트 조회");
		System.out.println("q. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		select = scanner.nextLine();
		
		if(select.equals("1")) {
			User user = addUser();
			
			if(user != null) {
				System.out.println(user.toString());
			}
			
		}else if(select.equals("2")) {
			while(showUserSearch()) {};
		}else if(select.equals("q")) {
			System.out.println("프로그램 종료중 . . .");
			return false;
		}else {
			System.out.println("해당 메뉴는 선택하실 수 없습니다.");
		}
		System.out.println();
		
		return true;
	}
	
	public User addUser() {
		for(int i = 0; i < userArray.length; i++) {
			if(userArray[i] != null) {
				continue;
			}
			userArray[i] = inputUser();
			System.out.println("[ " + userArray[i].getName() + " ] 학생 등록 완료");
			return userArray[i];
		}
		
		System.out.println("더 이상 사용자를 등록할 수 없습니다.");
		System.out.println();
		return null;
	}
	
	private User inputUser() {
		String username = null;
		String password = null;
		String name = null;
		String email = null;
		
		System.out.println("[ 학생 등록 ]");
		System.out.print("사용자 이름 : ");
		username = scanner.nextLine();
		
		System.out.print("비밀번호 : ");
		password = scanner.nextLine();
		
		System.out.print("이름 : ");
		name = scanner.nextLine();
		
		System.out.print("이메일 : ");
		email = scanner.nextLine();
		
		return new User(username, password, name, email);
	}
	
	private boolean showUserSearch() {
		String select = null;
		
		System.out.println("[회원 조회]");
		System.out.println("1. 회원 전체 조회");
		System.out.println("2. 회원 이름으로 검색");
		System.out.println("b. 뒤로 가기");
		
		System.out.print("메뉴 선택 >> ");
		select = scanner.nextLine();
		
		if(select.equals("1")) {
			showUserList();
		}else if(select.equals("2")) {
			showSearchUser();
		}else if(select.equals("b")) {
			System.out.println("이전 메뉴로 돌아갑니다.");
			return false;
		}else {
			System.out.println("해당 메뉴는 선택하실 수 없습니다.");
			System.out.println("다시 선택해주세요.");
		}
		System.out.println();
		return true;
	}
	
	private void showUserList() {
		System.out.println("[ 회원 전체 조회 ]");
		System.out.println("사용자 이름\t\t이름\t\t이메일");
		for(int i = 0; i < userArray.length; i++) {
			if(userArray[i] != null) {
				System.out.println(userArray[i].getUsername() + "\t\t"
						+userArray[i].getName() + "\t\t"
						+userArray[i].getEmail());
			}
		}
			System.out.println();
	}
	
	private void showSearchUser() {
		String searchUsername = null;
		
		System.out.println("[회원 아이디로 검색]");
		System.out.print("아이디 >> ");
		searchUsername = scanner.nextLine();
		
		User searchUser = searchUserByUsername(searchUsername);
		if(searchUser != null) {
			System.out.println(searchUser.toString());
		}
	}
	
	private User searchUserByUsername(String searchUsername) {
		for(int i = 0; i < userArray.length; i++) {
			if(userArray[i] != null) {
				String username = userArray[i].getUsername();
				if(searchUsername.equals(username)) {
					return userArray[i];					
				}
			}
		}
		System.out.println("해당 아이디는 존재하지 않습니다.");
		return null;
	}

}
