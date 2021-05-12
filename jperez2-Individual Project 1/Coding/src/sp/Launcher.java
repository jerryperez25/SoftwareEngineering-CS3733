package sp;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import sp.controller.ExitController;
import sp.model.Model;
import sp.view.DoubleSlidedApp;


public class Launcher {

	public static void main(String[] args) {
		Model m = new Model();
		
		DoubleSlidedApp dsa = new DoubleSlidedApp(m);
		
		dsa.addWindowListener (new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				new ExitController(dsa).process();
			}
		});
		
		dsa.setVisible(true);

	}

}
