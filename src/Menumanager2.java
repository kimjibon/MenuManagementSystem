import java.util.Scanner;

public class Menumanager2 {	
	Menu menu;
	Scanner input;

	Menumanager2(Scanner input){
		this.input = input;
	}

	public void addMenu() {
		menu = new Menu();
		System.out.print("Menu Name : ");
		menu.menu = input.next();
		System.out.print("Menu Price : ");
		menu.price = input.nextInt();
		input.nextLine();
		System.out.print("Menu Introduce : ");
		menu.intro = input.nextLine();
		System.out.print("ingredient : ");
		menu.ing = input.nextLine();

	}
	public void deleteMenu() {
		System.out.print("Menu Name : ");
		String Menuname = input.next();
		if (menu ==null) {
			System.out.println("the menu has not been registered");
			return;
		}
		if (menu.menu.contentEquals(Menuname)) {
			menu = null;
			System.out.println("the menu is deleted");

		}
	}
	public void editMenu() {
		System.out.print("Menu Name : ");
		String Menuname = input.next();
		if (menu.menu.contentEquals(Menuname)) {
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
		}
	}
	public void viewMenu() {
		System.out.print("Menu Name : ");
		String Menuname = input.next();
		if (menu.menu.contentEquals(Menuname)) {
			menu.printInfo();
		}

	}

}
