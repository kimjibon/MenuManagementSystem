package Menu;

import java.util.Scanner;

public class ColdNoodle extends Menu{
	
	public ColdNoodle(MenuKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		
		setMenuName(input);
		setMenuPrice(input);
		setMenuIntro(input);
		setMenuIng(input);	
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind : "+ skind +" menu: "+ name + "  price: " + price + "  introduce : " + intro + "  ingredient: " + ing);
	}

}
