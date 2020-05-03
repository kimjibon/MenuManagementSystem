package Menu;

import java.util.Scanner;

public class Cutlet extends HotNoodleAndCutlet{

	protected String origin;

	public Cutlet(MenuKind kind) {
		super(kind);
	}

	public String getOrigin() {
		return origin;
	}

	public void setKind(MenuKind kind) {
		this.origin = origin;
	}

	public void getUserInput(Scanner input) {
		setMenuName(input);
		setMenuPrice(input);
		setMenuIntroWithYN(input);
		
		input.nextLine();
		setMenuIng(input);
		 setMenuOriginWithYN(input);

		input.nextLine();
	}

	public void setMenuOriginWithYN(Scanner input) {
		char answer2 = 'x';
		while(answer2!='Y'&&answer2!='y'&&answer2!='n'&&answer2!='N') {
			System.out.print("Does this menu have origin information? (Y/N)" );
			answer2 = input.next().charAt(0);
			if (answer2 =='y'|| answer2 == 'Y') {
				System.out.print("Menu Origin : ");
				String origin = input.nextLine();
				this.setIntro(origin);
				break;
			}
			else if (answer2 =='n'|| answer2 == 'N') {
				this.setIntro("X");
				break;
			}
			else {
			}
		}
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind : "+ skind +" menu: "+ name + "  price: " + price + "  ingredient: " + ing + "ingredient Origin: "+ intro);
	}
}
