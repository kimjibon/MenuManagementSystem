
public class Menu {

	String menu;
	int price;
	String intro;
	String ing;


	public Menu() {

	}

	public Menu(String menu, int price) {
		this.menu= menu;
		this.price = price;

	}
	public Menu (String menu, int price, String intro, String ing) {
		super();
		this.menu = menu;
		this.price = price;
		this.intro = intro;
		this.ing = ing;

	}

	public void printInfo() {
		System.out.println("menu: "+ menu + "  price: " + price + "  intro: " + intro + "  ingredient: " + ing);
	}
}
