import Menu.HotNoodle;
import Menu.ColdNoodle;
import Menu.Cutlet;
import Menu.Menu;
import Menu.MenuInput;
import Menu.MenuKind;

import java.util.*;

public class Menumanager2 {	
	ArrayList<MenuInput> menus = new ArrayList<MenuInput>();
	Scanner input;

	Menumanager2(Scanner input){
		this.input = input;
	} 

	public void addMenu() {
		int kind = 0;
		MenuInput menuInput;
		while (kind!=1 && kind!=2) {
			System.out.println("1 for ColdNoodle");
			System.out.println("2 for HotNoodle");
			System.out.println("3 for Cutlet");
			System.out.print("Select num 1,2 or 3 for Menu Kind : ");
			kind = input.nextInt();
			if (kind==1) {
				menuInput = new ColdNoodle(MenuKind.Coldnoodle);
				menuInput.getUserInput(input);
				menus.add(menuInput);
				break;
			}
			else if(kind==2) {
				menuInput = new HotNoodle(MenuKind.Hotnoodle);
				menuInput.getUserInput(input);
				menus.add(menuInput);
				break;
			}
			else if(kind==3) {
				menuInput = new Cutlet(MenuKind.Cutlet);
				menuInput.getUserInput(input);
				menus.add(menuInput);
				break;
			}
			else {
				System.out.print("Select num for Menu Kind between 1 and 2: ");
			}
		}		
	}

	public void deleteMenu() {
		System.out.print("Menu Name : ");
		String Menuname = input.next();
		int index = findIndex(Menuname);
		removefromMenu(index, Menuname);
	}
	
	public int findIndex(String Menuname) {
		int index = -1;
		for(int i=0 ; i <menus.size();i++) {
			if (menus.get(i).getName().contentEquals(Menuname)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromMenu(int index, String Menuname) {
		if (index >=0) {
			menus.remove(index);
			System.out.println("the menu "+ Menuname + " is deleted");
			return 1;
		}
		else {
			System.out.println("the menu has not been registered");
			return -1;
		}		
	}

	public void editMenu() {
		System.out.print("Menu Name : ");
		String Menuname = input.next();
		for(int i=0 ; i <menus.size();i++) {
			MenuInput menu = menus.get(i);
			if (menu.getName().equals(Menuname)) {
				int num = 8;
				while (num !=5){
					showEditMenu();
					num = input.nextInt();
					input.nextLine();
					switch(num) {
					case 1:
						menu.setMenuName(input);
						break;
					case 2:
						menu.setMenuPrice(input);
						break;
					case 3:
						menu.setMenuIntro(input);
						break;
					case 4:
						menu.setMenuIng(input);
						break;
					default:
						continue;
					}
				}
				break;
			}
		}
	}

	public void viewMenu() {
		for(int i=0 ; i <menus.size();i++) {
			menus.get(i).printInfo();

		}
		System.out.println("Number of menu : "+ menus.size());
	}

	public void showEditMenu() {
		System.out.println(" ** Menu Info Edit Menu ** ");
		System.out.println(" 1. Edit Menuname");
		System.out.println(" 2. Edit price");
		System.out.println(" 3. Edit Introduce");
		System.out.println(" 4. Edit Ingredient");
		System.out.println(" 5. Exit");
		System.out.println("Select on number between 1 - 5 ");
	}
}
