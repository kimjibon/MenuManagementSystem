package Menu;

import java.util.Scanner;

public class Cutlet extends HotNoodleAndCutlet{



	public Cutlet(MenuKind kind) {
		super(kind);
	}


	public void getUserInput(Scanner input) {
		setMenuName(input);
		setMenuPrice(input);
		setMenuIntroWithYN(input);
		setMenuIng(input);
		setMenuOriginWithYN(input);
	}

	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind : "+ skind +" menu: "+ name + "  price: " + price +" introduce : "+ getIntro()+" ingreient : "+ ing + " ingredient Origin: "+ getOrigin());
	}
}
