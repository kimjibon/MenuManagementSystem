import java.util.Scanner;

public class MenuManager {
	public static void main(String[] arguments) {
		Scanner input = new Scanner(System.in);

		int num = 5;
		while (num !=6){
			System.out.println(" *** Menu Management System Menu *** ");
			System.out.println(" 1. Add Menu");
			System.out.println(" 2. Delete Menu");
			System.out.println(" 3. Edit Menu");
			System.out.println(" 4. View Menu");
			System.out.println(" 5. Show a Menu");
			System.out.println(" 5. Exit");
			System.out.println("Select on number between 1 - 5 ");
			num = input.nextInt();
			if (num==1) {
				addMenu();
			}
			else if (num==2) {
				deleteMenu();
			}
			else if (num==3) {
				editMenu();
			}
			else if (num==4) {
				viewMenu();
			}
			else {
				continue;
			}
		}
	}
	public static void addMenu() {
		Scanner input = new Scanner(System.in);
		System.out.print("Menu Name : ");
		String Menuname = input.next();
		System.out.print("Menu Price : ");
		int Menuprice = input.nextInt();
		System.out.print("Menu Description : ");
		String Enterdeleter1 = input.nextLine();
		String Menuintro = input.nextLine();
		System.out.print("ingredient : ");
		String ing = input.nextLine();

	}
	public static void deleteMenu() {
		Scanner input = new Scanner(System.in);
		System.out.print("Menu Name : ");
		String Menuname = input.next();

	}
	public static void editMenu() {
		Scanner input = new Scanner(System.in);
		System.out.print("Menu Name : ");
		String Menuname = input.next();

	}
	public static void viewMenu() {
		Scanner input = new Scanner(System.in);
		System.out.print("Menu Name : ");
		String Menuname = input.next();

	}
}
