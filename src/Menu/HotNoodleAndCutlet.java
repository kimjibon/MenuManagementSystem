package Menu;

import java.util.Scanner;

public abstract class HotNoodleAndCutlet extends Menu {

	public HotNoodleAndCutlet(MenuKind kind) {
		super(kind);
	}
	
	public abstract void getUserInput(Scanner input);
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind : "+ skind +"menu: "+ name + "  price: " + price + "  intro: " + intro + "  ingredient: " + ing);
	}
		
	public void setMenuIntroWithYN(Scanner input) {
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
	}

}
