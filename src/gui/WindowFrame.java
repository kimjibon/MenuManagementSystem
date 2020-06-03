package gui;

import javax.swing.*;

public class WindowFrame extends JFrame{

	MenuSelection menuselection ;
	MenuAdder menuadder ;
	MenuViewer menuviewer ;
			
	public WindowFrame() {	
		this.menuselection = new MenuSelection(this);
		this.menuadder = new MenuAdder(this);
		this.menuviewer = new MenuViewer(this);
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
