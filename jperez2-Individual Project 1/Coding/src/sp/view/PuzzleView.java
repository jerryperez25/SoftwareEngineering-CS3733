package sp.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

import sp.model.Location;
import sp.model.Model;
import sp.model.Tile;

public class PuzzleView extends JPanel {
	
	Model model = new Model();
	
	public PuzzleView(Model model) {
		
		this.model = model;
		
	}
	public PuzzleView() {
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.setFont(new Font("Times New Roman",Font.PLAIN,48));
		if (model==null) {return;}
			for(int lister=0; lister<9;lister++) {
				Tile t = model.getTile(lister);
				//t.flipTile(model.getTile(lister)); // this can be toggled on and off as pleased for result
				int dig = t.visibleDigit();
				int newx = 100 * t.getLocation().row;
				int newy = 100 * t.getLocation().col ;
				g.setColor(t.getColor());
				g.fillRect(newx,newy, 99, 99);
				g.setColor(t.digitColor());
				g.drawString("" + dig, newx+35, newy+70);
			}
		
	}
	
}
