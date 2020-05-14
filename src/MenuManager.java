import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	public static void main(String[] arguments) {

		Scanner input = new Scanner(System.in);
		Menumanager2 menumanager2 = new Menumanager2(input);	

		selectMenu(input, menumanager2);
	}


	public static void selectMenu(Scanner input,Menumanager2 menumanager2){
		int num = -1;
		while (num !=5){
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					menumanager2.addMenu();
					break;
				case 2:
					menumanager2.deleteMenu();
					break;
				case 3:
					menumanager2.editMenu();
					break;
				case 4:
					menumanager2.viewMenu();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}

	public static void showMenu(){
		System.out.println(" *** Menu Management System Menu *** ");
		System.out.println(" 1. Add Menu");
		System.out.println(" 2. Delete Menu");
		System.out.println(" 3. Edit Menu");
		System.out.println(" 4. View Menu");
		System.out.println(" 5. Exit");
		System.out.println("Select on number between 1 - 5 ");
	}
}
