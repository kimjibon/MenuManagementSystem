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
			System.out.println("the menu to be edited is " + Menuname);
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
