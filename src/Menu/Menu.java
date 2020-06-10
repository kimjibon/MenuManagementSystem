package Menu;

import java.io.Serializable;
import java.util.Scanner;

import exception.IntroFormatException;

public abstract class Menu implements MenuInput, Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -3365367620358141360L;
	
	protected MenuKind kind= MenuKind.Coldnoodle;
	protected String name;
	protected String price;
	protected String intro;
	protected String ing;
	protected String origin;

	public Menu() {

	}

	public Menu(MenuKind kind) {
		this.kind=kind;

	}

	public Menu(String name, String price) {
		this.name= name;
		this.price = price;

	}
	public Menu (String name, String price, String intro, String ing) {
		this.name = name;
		this.price = price;
		this.intro = intro;
		this.ing = ing;
	}

	public Menu (MenuKind kind, String name, String price, String intro, String ing) {
		this.kind=kind;
		this.name = name;
		this.price = price;
		this.intro = intro;
		this.ing = ing;
	}
	public MenuKind getKind() {
		return kind;
	}

	public void setKind(MenuKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) throws IntroFormatException{
		if(!intro.contains("¸ÀÀÖ¾î¿ä")&& !intro.equals("")) {
			throw new IntroFormatException();
		}

		this.intro = intro;
	}

	public String getIng() {
		return ing;
	}

	public void setIng(String ing) {
		this.ing = ing;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin= origin;
	}

	public abstract void printInfo(); 

	public void setMenuName( Scanner input) {
		System.out.print("Menu Name : ");
		String name = input.next();
		this.setName(name);
	}

	public void setMenuPrice(Scanner input) {
		System.out.print("Menu Price : ");
		String price = input.next();
		this.setPrice(price);
	}

	public void setMenuIntro(Scanner input) {
		String intro = " ";
		while(!intro.contains("¸ÀÀÖ¾î¿ä")) {
			System.out.print("Menu Introduce : ");
			intro = input.next();
			try {
				this.setIntro(intro);
			}
			catch (IntroFormatException e) {
				System.out.println("Incorrect Intro Format. put the intro that contailns ¸ÀÀÖ¾î¿ä");	
			}
		}
	}

	public void setMenuIng(Scanner input) {
		System.out.print("ingredient : ");
		String ing = input.next();	
		this.setIng(ing);
	}

	public void setMenuOrigin(Scanner input) {
		System.out.print("ingredient Origin : ");
		String origin = input.nextLine();
		this.setOrigin(origin);
	}

	public String getKindString() {
		String skind = "none";
		switch(this.kind) {
		case Coldnoodle:
			skind = "Coldnoodle";
			break;
		case Hotnoodle:
			skind = "Hotnoodle";
			break;
		case Rice:
			skind = "Rice";
			break;
		case Cutlet:
			skind = "Cutlet";
			break;
		default:
		}
		return skind;
	}

}
