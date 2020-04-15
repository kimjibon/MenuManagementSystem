import java.util.Scanner;

public class MenuManager {
	public static void main(String[] arguments) {

		
		Scanner input = new Scanner(System.in);
		Menumanager2 menumanager2 = new Menumanager2(input);	

		int num = 8;
		while (num !=5){
			System.out.println(" *** Menu Management System Menu *** ");
			System.out.println(" 1. Add Menu");
			System.out.println(" 2. Delete Menu");
			System.out.println(" 3. Edit Menu");
			System.out.println(" 4. View Menu");
			System.out.println(" 5. Exit");
			System.out.println("Select on number between 1 - 5 ");
			num = input.nextInt();
			if (num==1) {
				menumanager2.addMenu();
			}
			else if (num==2) {
				menumanager2.deleteMenu();
			}
			else if (num==3) {
				menumanager2.editMenu();
			}
			else if (num==4) {
				menumanager2.viewMenu();
			}
			else {
				continue;
			}
		}
	}}
