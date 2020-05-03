package Menu;

import java.util.Scanner;

public abstract class HotNoodleAndCutlet extends Menu {

	public HotNoodleAndCutlet(MenuKind kind) {
		super(kind);
	}
	
	public abstract void getUserInput(Scanner input);
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind : "+ skind +" menu: "+ name + "  price: " + price + "  introduce : " + intro + "  ingredient: " + ing);
	}
		
	public void setMenuIntroWithYN(Scanner input) {
		char answer = 'x';
		while(answer!='Y'&&answer!='y'&&answer!='n'&&answer!='N') {
			System.out.print("Does this menu have an introduce? (Y/N)" );
			answer = input.next().charAt(0);
			input.nextLine();
			if (answer =='y'|| answer == 'Y') {
				setMenuIntro(input);
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
	
	public void setMenuOriginWithYN(Scanner input) {
		char answer2 = 'x';
		while(answer2!='Y'&&answer2!='y'&&answer2!='n'&&answer2!='N') {
			System.out.print("Does this menu have origin information? (Y/N)" );
			answer2 = input.next().charAt(0);
			input.nextLine();
			if (answer2 =='y'|| answer2 == 'Y') {
				setMenuOrigin(input);
				break;
			}
			else if (answer2 =='n'|| answer2 == 'N') {
				String origin ="X";
				this.setOrigin(origin);
				break;
			}
			else {
			}
		}
	}

}
