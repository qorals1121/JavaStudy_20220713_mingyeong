package menu;

import java.util.List;
import java.util.Scanner;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import menu.items.MenuItem;

@RequiredArgsConstructor
public class MenuIpl implements Menu {

	@NonNull
	private List<MenuItem> MenuList;
	
	@NonNull
	private List<MenuItem> MenuItems;
	
	private Scanner scanner = new Scanner(System.in);
	
	@Override
	public void setMenu(MenuItem menuItem) {
		int index = 0;
		int index2 = 0;
		
		System.out.println("[ 메뉴 설정 ]");
		
		showMenu();
		
		System.out.println("[ 사용할 수 있는 메뉴 리스트 ]");
		for(int i = 0; i < menuItems.size(); i++) {
			if(menuItems.get(i) == null) {
				continue;
			}
			System.out.println(i + 1 + ". " + menuItems.get(i).getMenuName());
		}
		
		System.out.println("사용 할 메뉴를 선택하세요 : ");
		index = scanner.nextInt();
		while(index > menuItems.size() || index < 1) {
			System.out.println("해당 번호는 존재하지 않는 메뉴입니다. \n 다시 입력하세요.");
			index = scanner.nextInt();
		}
		
		System.out.println("선택한 메뉴 : " + menuItems.get(index - 1).getMenuName());
		
		System.out.println("추가 할 위치를 선택하세요 : ");
		index2 = scanner.nextInt();
		scanner.nextLine();
		
		menuList.add(index2 -1, menuItems.get(index - 1))
		
	}

	@Override
	public void showMenu() {
		System.out.println("[ 메뉴 리스트 ] ");
		
		for(int i = 0; i < menuList.size(); i++) {
			if(menuList.get(i) == null) {
				continue;
			}
			System.out.println(i + 1 + ". " + menuList.get(i).getMenuName());
		}
		
	}
	
	@Override
	public void addMenu() {
		String menuName = null;
		
		System.out.println("[ 메뉴 추가 ]");
		
		System.out.println("메뉴 이름 : ");
		menuName = scanner.nextLine();
		
		MenuItem menuItem = new MenuItem() {
			
			private String menuName;
			
			@Override
			public void setMenuName() {
				this.menuName  = menuName;
				
			}
			
			@Override
			public String getMenuName() {
				return menuName;
			}
		};
		
		menuItem.setMenuName(menuName);
		menuItems.add(menuItem);
	}

}
