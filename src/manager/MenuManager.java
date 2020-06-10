package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] arguments) {

		Scanner input = new Scanner(System.in);
		Menumanager2 menumanager2 = getObject("menumanager.ser");
		if(menumanager2 == null) {
			menumanager2  = new Menumanager2(input);	
		}
		WindowFrame frame = new WindowFrame(menumanager2);
		selectMenu(input, menumanager2);
		putObject(menumanager2 , "menumanager.ser");
	}


	public static void selectMenu(Scanner input,Menumanager2 menumanager2){
		int num = -1;
		while (num !=5){
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					menumanager2.addMenu();
					logger.log("add a menu");
					break;
				case 2:
					menumanager2.deleteMenu();
					logger.log("delete a menu");
					break;
				case 3:
					menumanager2.editMenu();
					logger.log("edit a menu");
					break;
				case 4:
					menumanager2.viewMenu();
					logger.log("view a menu");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}

	public static void showMenu(){
		System.out.println(" *** Menu Management System Menu *** ");
		System.out.println(" 1. Add Menu");
		System.out.println(" 2. Delete Menu");
		System.out.println(" 3. Edit Menu");
		System.out.println(" 4. View Menu");
		System.out.println(" 5. Exit");
		System.out.println("Select on number between 1 - 5 ");
	}

	public static Menumanager2 getObject(String filename) {
		Menumanager2 menumanager2 = null;
		

		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			menumanager2 = (Menumanager2)in.readObject();

			in.close();
			file.close();
		} 

		catch (FileNotFoundException e) {
			return menumanager2;
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return menumanager2;
	}

	public static void putObject(Menumanager2 menumanager2,String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(menumanager2);

			out.close();
			file.close();
		} 

		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
