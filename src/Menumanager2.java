import Menu.HotNoodle;
import Menu.Cutlet;
import Menu.Menu;
import Menu.MenuKind;

import java.util.*;

public class Menumanager2 {	
	ArrayList<Menu> menus = new ArrayList<Menu>();
	Scanner input;

	
	Menumanager2(Scanner input){
		this.input = input;
	} 

	public void addMenu() {
		int kind = 0;
		Menu menu;
		while (kind!=1 && kind!=2) {
			System.out.println("1 for ColdNoodle");
			System.out.println("2 for HotNoodle");
			System.out.println("3 for Cutlet");
			System.out.print("Select num 1,2 or 3 for Menu Kind : ");
			kind = input.nextInt();
			if (kind==1) {
				menu = new Menu(MenuKind.Coldnoodle);
				menu.getUserInput(input);
				menus.add(menu);
				break;

			}
			else if(kind==2) {
				menu = new HotNoodle(MenuKind.Hotnoodle);
				menu.getUserInput(input);
				menus.add(menu);
				break;
			}
			else if(kind==3) {
				menu = new Cutlet(MenuKind.Cutlet);
				menu.getUserInput(input);
				menus.add(menu);
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
		int index = -1;
		for(int i=0 ; i <menus.size();i++) {
			if (menus.get(i).getName().contentEquals(Menuname)) {
				index = i;
				break;
			}
		}

		if (index >=0) {
			menus.remove(index);
			System.out.println("the menu "+ Menuname + " is deleted");
		}
		else {
			System.out.println("the menu has not been registered");
			return;
		}


	}
	public void editMenu() {
		System.out.print("Menu Name : ");
		String Menuname = input.next();
		for(int i=0 ; i <menus.size();i++) {
			Menu menu = menus.get(i);
			if (menu.getName().equals(Menuname)) {
				int num = 8;
				while (num !=5){
					System.out.println(" ** Menu Info Edit Menu ** ");
					System.out.println(" 1. Edit Menuname");
					System.out.println(" 2. Edit price");
					System.out.println(" 3. Edit Introduce");
					System.out.println(" 4. Edit Ingredient");
					System.out.println(" 5. Exit");
					System.out.println("Select on number between 1 - 5 ");
					num = input.nextInt();
					input.nextLine();
					if (num==1) {
						System.out.print("Menu Name : ");
						String name = input.next();
						menu.setName(name);
					}
					else if (num==2) {
						System.out.print("Menu Price : ");
						int price = input.nextInt();
						menu.setPrice(price);
					}
					else if (num==3) {		
						System.out.print("Menu Introduce : ");
						String intro = input.nextLine();
						menu.setIntro(intro);
					}
					else if (num==4) {
						System.out.print("ingredient : ");
						String ing = input.nextLine();	
						menu.setIng(ing);
					}
					else {
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

}
