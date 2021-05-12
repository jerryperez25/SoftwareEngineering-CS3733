package sp.controller;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ExitController {
	
	JFrame app;

	public ExitController(JFrame app) {
		
		this.app = app;
		
	}
	
	public void process() {
		int c = JOptionPane.showConfirmDialog(app, "Would you like to exit the application?");
		if (c == JOptionPane.OK_OPTION) {
			app.setVisible(false);
			app.dispose();
		}
		else if (c==JOptionPane.NO_OPTION) {
			app.setVisible(true);
		}
		else {
			app.setVisible(true);
		}
	}
	
}
