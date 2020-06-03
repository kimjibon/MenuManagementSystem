package gui;

import java.awt.*;
import javax.swing.*;

import listener.ButtonAdderListener;
import listener.ButtonViewListener;

public class MenuSelection extends JPanel{
	
	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) {
		this.frame = frame;
		
		this.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		
		JButton button1 = new JButton("Add Menu");
		JButton button2 = new JButton("view Menu");
		JButton button3 = new JButton("Edit Menu");
		JButton button4 = new JButton("Delete Menu");
		JButton button5 = new JButton("Exit Program");
		
		button1.addActionListener(new ButtonAdderListener(frame));
		button2.addActionListener(new ButtonViewListener(frame));
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		this.add(panel1,BorderLayout.NORTH);
		this.add(panel2,BorderLayout.CENTER);

		
	}
	

}
