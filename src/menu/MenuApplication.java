package menu;

import java.util.ArrayList;

import menu.items.MenuItem;

public class MenuApplication {

	public static void main(String[] args) {


		Menu menu = new MenuImpl(new ArrayList<MenuItem>(), new ArrayList<MenuItem>());
		
		menu.showMenu();

	}

}
