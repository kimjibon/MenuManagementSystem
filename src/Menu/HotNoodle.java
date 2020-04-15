package Menu;

import java.util.Scanner;

public class HotNoodle extends Menu {

	public void getUserInput(Scanner input) {

		System.out.print("Menu Name : ");
		String name = input.next();
		this.setName(name);

		System.out.print("Menu Price : ");
		int price = input.nextInt();
		input.nextLine();
		this.setPrice(price);

		char answer = 'x';
		while(answer!='Y'&&answer!='y'&&answer!='n'&&answer!='N') {
			System.out.print("Does this menu have an introduce? (Y/N)" );
			answer = input.next().charAt(0);
			if (answer =='y'|| answer == 'Y') {
				System.out.print("Menu Introduce : ");
				String intro = input.nextLine();
				this.setIntro(intro);
				break;
			}
			else if (answer =='n'|| answer == 'N') {
				this.setIntro("X");
				break;
			}
			else {
			}
		}
		input.nextLine();
		System.out.print("ingredient : ");
		String ing = input.nextLine();
		this.setIng(ing);

	}

}
