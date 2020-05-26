package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MenuViewer extends JFrame{

	public MenuViewer() {
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Price");
		model.addColumn("Information");
		model.addColumn("Ingredient");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		
		
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
