package Menu;

import java.util.Scanner;

import exception.IntroFormatException;

public interface MenuInput {
	
	public void getUserInput(Scanner input);
	
	public String getName();
	
	public String getPrice();
	
	public String getIntro();
	
	public String getIng();
	
	public void setName(String name);
	
	public void setPrice(String price);
	
	public void setIntro(String intro) throws IntroFormatException;
	
	public void setIng(String ing);
	
	public void printInfo();
	
	public void setMenuName(Scanner input);
	
	public void setMenuPrice(Scanner input);
	
	public void setMenuIntro(Scanner input);
	
	public void setMenuIng(Scanner input);
	
	public void setMenuOrigin(Scanner input);
}
