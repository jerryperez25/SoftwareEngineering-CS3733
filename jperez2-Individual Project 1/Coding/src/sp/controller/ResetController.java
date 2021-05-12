package sp.controller;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import sp.model.Location;
import sp.model.Model;
import sp.model.Tile;
import sp.view.DoubleSlidedApp;
import sp.view.PuzzleView;

public class ResetController extends MouseAdapter {
	Model model;
	DoubleSlidedApp app;

	public ResetController(DoubleSlidedApp app, Model m) 
	{
		this.app = app;
		this.model = m;
	}
	
	@Override
	public void mousePressed(MouseEvent me) {
			
			model.getTile(0).startSetter(new Location(0,0), Color.gray, 1);
			model.getTile(1).startSetter(new Location(1,0), Color.gray, 4);
			model.getTile(2).startSetter(new Location(2,0), Color.yellow, ' ');
			model.getTile(3).startSetter(new Location(0,1), Color.black, 4);
			model.getTile(4).startSetter(new Location(1,1), Color.gray, 3);
			model.getTile(5).startSetter(new Location(2,1), Color.gray, 4);
			model.getTile(6).startSetter(new Location(0,2), Color.black, 3);
			model.getTile(7).startSetter(new Location(1,2), Color.gray, 2);
			model.getTile(8).startSetter(new Location(2,2), Color.gray, 3);
			model.resetMove();
			app.setMoveCount(Integer.toString(model.howManyMoves()));
			app.repaint();
		
		}

}
