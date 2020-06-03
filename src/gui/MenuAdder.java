package gui;

import java.awt.*;
import javax.swing.*;

public class MenuAdder extends JPanel {
	WindowFrame frame;
	
	public MenuAdder(WindowFrame frame) {
		this.frame = frame;
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelname = new JLabel("Name : ", JLabel.TRAILING);
		JTextField fieldname = new JTextField(10);
		labelname.setLabelFor(fieldname);
		panel.add(labelname);
		panel.add(fieldname);
		
		JLabel labelprice = new JLabel("Price : ", JLabel.TRAILING);
		JTextField fieldprice = new JTextField(10);
		labelprice.setLabelFor(fieldprice);
		panel.add(labelprice);
		panel.add(fieldprice);
		
		JLabel labelinfo = new JLabel("Information : ", JLabel.TRAILING);
		JTextField fieldinfo = new JTextField(10);
		labelinfo.setLabelFor(fieldinfo);
		panel.add(labelinfo);
		panel.add(fieldinfo);
		

		JLabel labeling = new JLabel("Ingredient : ", JLabel.TRAILING);
		JTextField fielding = new JTextField(10);
		labeling.setLabelFor(fielding);
		panel.add(labeling);
		panel.add(fielding);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		
		this.add(panel);
		this.setVisible(true);	
	}

}
