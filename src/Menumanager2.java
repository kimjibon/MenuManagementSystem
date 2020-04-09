import java.util.Scanner;
import java.util.ArrayList;

public class Menumanager2 {	
	ArrayList<Menu> menus = new ArrayList<Menu>();
	Scanner input;

	Menumanager2(Scanner input){
		this.input = input;
	}

	public void addMenu() {
		Menu menu = new Menu();
		System.out.print("Menu Name : ");
		menu.menu = input.next();
		System.out.print("Menu Price : ");
		menu.price = input.nextInt();
		input.nextLine();
		System.out.print("Menu Introduce : ");
		menu.intro = input.nextLine();
		System.out.print("ingredient : ");
		menu.ing = input.nextLine();
		menus.add(menu);

	}
	public void deleteMenu() {
		System.out.print("Menu Name : ");
		String Menuname = input.next();
		int index = -1;
		for(int i=0 ; i <menus.size();i++) {
			if (menus.get(i).menu.contentEquals(Menuname)) {
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
			if (menu.menu.equals(Menuname)) {
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
						menu.menu = input.next();		
					}
					else if (num==2) {
						System.out.print("Menu Price : ");
						menu.price = input.nextInt();
					}
					else if (num==3) {		
						System.out.print("Menu Introduce : ");
						menu.intro = input.nextLine();
					}
					else if (num==4) {
						System.out.print("ingredient : ");
						menu.ing = input.nextLine();	
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
