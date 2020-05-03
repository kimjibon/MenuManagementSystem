package Menu;

import java.util.Scanner;

public interface MenuInput {
	
	public void getUserInput(Scanner input);
	
	public String getName();
	
	public void setName(String name);
	
	public void setPrice(int price);
	
	public void setIntro(String intro);
	
	public void setIng(String ing);
	
	public void printInfo();
	
	public void setMenuName(Scanner input);
	
	public void setMenuPrice(Scanner input);
	
	public void setMenuIntro(Scanner input);
	
	public void setMenuIng(Scanner input);
	
	public void setMenuOrigin(Scanner input);
}
