package gui;

import javax.swing.*;

import manager.Menumanager2;

public class WindowFrame extends JFrame{

	Menumanager2 menumanager2;
	MenuSelection menuselection ;
	MenuAdder menuadder ; 
	MenuViewer menuviewer ;

			
	public WindowFrame(Menumanager2 menumanager2) {	
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.menumanager2= menumanager2;
		menuselection = new MenuSelection(this);
		menuadder = new MenuAdder(this);
		menuviewer = new MenuViewer(this, this.menumanager2);

		
		
		this.setupPanel(menuselection);
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public MenuAdder getMenuadder() {
		return menuadder;
	}

	public void setMenuadder(MenuAdder menuadder) {
		this.menuadder = menuadder;
	}

	public MenuViewer getMenuviewer() {
		return menuviewer;
	}

	public void setMenuviewer(MenuViewer menuviewer) {
		this.menuviewer = menuviewer;
	}

	
}
