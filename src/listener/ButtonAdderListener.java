package listener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.MenuAdder;
import gui.MenuViewer;
import gui.WindowFrame;

public class ButtonAdderListener implements ActionListener {

	WindowFrame frame;
	public ButtonAdderListener(WindowFrame frame) {
		this.frame = frame;
		
	}

	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		MenuAdder adder = frame.getMenuadder();
		frame.setupPanel(adder);
	}

}
