package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MenuViewer extends JPanel{
	WindowFrame frame;

	public MenuViewer(WindowFrame frame) {
		this.frame = frame;
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Price");
		model.addColumn("Information");
		model.addColumn("Ingredient");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}
