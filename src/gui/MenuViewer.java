package gui;

import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Menu.MenuInput;
import manager.Menumanager2;

public class MenuViewer extends JPanel{
	WindowFrame frame;
	
	Menumanager2 menumanager2;

	public MenuViewer(WindowFrame frame, Menumanager2 menumanager2) {
		this.frame = frame;
		this.menumanager2 = menumanager2;
		
		System.out.println("****" + menumanager2.size() + "****");
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Price");
		model.addColumn("Information");
		model.addColumn("Ingredient");
		
		for(int i=0;i<menumanager2.size();i++) {
			Vector row = new Vector();
			MenuInput mi = menumanager2.get(i);
			row.add(mi.getName());
			row.add(mi.getPrice());
			row.add(mi.getIntro());
			row.add(mi.getIng());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}
