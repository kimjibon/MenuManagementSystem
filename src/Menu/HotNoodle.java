package Menu;

import java.util.Scanner;

public class HotNoodle extends HotNoodleAndCutlet{
	
	public HotNoodle(MenuKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setMenuName(input);
		setMenuPrice(input);
		setMenuIntroWithYN(input);
		setMenuIng(input);
	}
}
