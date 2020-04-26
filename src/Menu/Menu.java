package Menu;

import java.util.Scanner;

public class Menu {

	
	protected MenuKind kind= MenuKind.Coldnoodle;
	protected String name;
	protected int price;
	protected String intro;
	protected String ing;


	public Menu() {

	}
	
	public Menu(MenuKind kind) {
		this.kind=kind;

	}

	public Menu(String name, int price) {
		this.name= name;
		this.price = price;

	}
	public Menu (String name, int price, String intro, String ing) {
		this.name = name;
		this.price = price;
		this.intro = intro;
		this.ing = ing;
	}
	
	public Menu (MenuKind kind, String name, int price, String intro, String ing) {
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getIng() {
		return ing;
	}

	public void setIng(String ing) {
		this.ing = ing;
	}


	public void printInfo() {
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
		System.out.println("kind : "+ skind +"menu: "+ name + "  price: " + price + "  intro: " + intro + "  ingredient: " + ing);
	}
	
	public void getUserInput(Scanner input) {
		
		System.out.print("Menu Name : ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Menu Price : ");
		int price = input.nextInt();
		input.nextLine();
		this.setPrice(price);
		
		System.out.print("Menu Introduce : ");
		String intro = input.nextLine();
		this.setIntro(intro);
		
		System.out.print("ingredient : ");
		String ing = input.nextLine();
		this.setIng(ing);
		
	}
}
