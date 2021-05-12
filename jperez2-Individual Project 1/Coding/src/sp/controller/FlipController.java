package sp.controller;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import sp.model.Location;
import sp.model.Model;
import sp.model.Tile;
import sp.view.DoubleSlidedApp;
import sp.view.PuzzleView;

public class FlipController extends MouseAdapter {

	Model model;
	DoubleSlidedApp app;
	WinLossController winner = new WinLossController(app, model);
	

	public FlipController(DoubleSlidedApp app, Model m) {
		this.app = app;
		this.model = m;
	}

	
	
	@Override
	public void mousePressed(MouseEvent me) {
		
		if (me.getX() >= 0 && me.getX() <= 100 && me.getY() >= 0 && me.getY() <= 100) { 		//done
			int tile1x = (me.getX()+100) / 100;
			int tile1y = me.getY()/100;
			int tile2x = me.getX()/100;
			int tile2y = (me.getY()+100)/100;			
		
			Tile thistile = model.getTile(model.getCorrespondingTile(new Location (me.getX()/100,me.getY()/100))); // this is tile number 0 originally
			Tile neighbortileright = model.getTile(model.getCorrespondingTile(new Location(tile1x,tile1y)));
			Tile neighbortilebelow = model.getTile(model.getCorrespondingTile(new Location(tile2x,tile2y)));
			
			if(neighbortileright.getColor()==Color.yellow) {
				thistile.flipTile(thistile);				
				model.incrementMove();
				app.setMoveCount(Integer.toString(model.howManyMoves()));
				neighbortileright.setLocation(thistile.getLocation());
				thistile.setLocation(new Location (tile1x,tile1y));
				
				app.repaint();
				
			}
			else if(neighbortilebelow.getColor()==Color.yellow)
			{
				thistile.flipTile(thistile);				
				model.incrementMove();
				app.setMoveCount(Integer.toString(model.howManyMoves()));
				neighbortilebelow.setLocation(thistile.getLocation());
				thistile.setLocation(new Location (tile2x,tile2y));
				
				app.repaint();
				
			}
			else {
				
			}
			app.repaint();
		}
		if (me.getX() >= 0 && me.getX() <= 100 && me.getY() >= 101 && me.getY() <= 200) {		//done
			
			int tile1x = me.getX()/100;
			int tile1y = (me.getY()-100)/100;
			int tile2x = (me.getX()+100)/100;
			int tile2y = me.getY()/100;
			int tile3x = me.getX()/100;
			int tile3y = (me.getY()+100)/100;
			Tile thistile = model.getTile(model.getCorrespondingTile(new Location (me.getX()/100,me.getY()/100))); // this is tile number 3 originally
			Tile toptile = model.getTile(model.getCorrespondingTile(new Location (tile1x,tile1y)));
			Tile righttile = model.getTile(model.getCorrespondingTile(new Location (tile2x,tile2y)));
			Tile bottomtile = model.getTile(model.getCorrespondingTile(new Location (tile3x,tile3y)));
			if (toptile.getColor()==Color.yellow) {
				
				thistile.flipTile(thistile);				
				model.incrementMove();
				app.setMoveCount(Integer.toString(model.howManyMoves()));
				toptile.setLocation(thistile.getLocation());
				thistile.setLocation(new Location (tile1x,tile1y));
				app.repaint();
				
				
				
			}
			else if(righttile.getColor()==Color.yellow) {
				
				thistile.flipTile(thistile);
				model.incrementMove();
				app.setMoveCount(Integer.toString(model.howManyMoves()));
				righttile.setLocation(thistile.getLocation());
				thistile.setLocation(new Location (tile2x,tile2y));
				app.repaint();
				
				
				
			}
			else if(bottomtile.getColor()==Color.yellow) {
				
				thistile.flipTile(thistile);
				model.incrementMove();
				app.setMoveCount(Integer.toString(model.howManyMoves()));
				bottomtile.setLocation(thistile.getLocation());
				thistile.setLocation(new Location (tile3x,tile3y));
				app.repaint();
				
				
				
			}
			else {
				
			}
			app.repaint();
		}
		if (me.getX() >= 0 && me.getX() <= 100 && me.getY() >= 201 && me.getY() <= 300) {	//done
			int tile1x = me.getX()/100;
			int tile1y = (me.getY()-100)/100;
			int tile2x = (me.getX()+100)/100;
			int tile2y = me.getY()/100;
			Tile thistile = model.getTile(model.getCorrespondingTile(new Location (me.getX()/100,me.getY()/100))); // this is tile 6 originally
			Tile toptile = model.getTile(model.getCorrespondingTile(new Location (tile1x,tile1y)));
			Tile righttile = model.getTile(model.getCorrespondingTile(new Location (tile2x,tile2y)));
			if(toptile.getColor()== Color.yellow) {
				thistile.flipTile(thistile);	
				model.incrementMove();
				app.setMoveCount(Integer.toString(model.howManyMoves()));
				toptile.setLocation(thistile.getLocation());
				thistile.setLocation(new Location (tile1x,tile1y));
				app.repaint();
				
				
				
			}
			else if(righttile.getColor() == Color.yellow) {
				thistile.flipTile(thistile);
				model.incrementMove();
				app.setMoveCount(Integer.toString(model.howManyMoves()));
				righttile.setLocation(thistile.getLocation());
				thistile.setLocation(new Location (tile2x,tile2y));
				app.repaint();
				
				}
			else {
				
			}
			
			app.repaint();
		}
		
		if(me.getX()>=101&&me.getX()<=200&&me.getY()>=0&&me.getY()<=100){ 		// done

		int tile1x = (me.getX() + 100) / 100;
		int tile1y = me.getY() / 100;
		int tile2x = (me.getX() - 100) / 100;
		int tile2y = (me.getY() - 100) / 100;
		int tile3x = me.getX() / 100;
		int tile3y = (me.getY() + 100) / 100;
		Tile thistile = model.getTile(model.getCorrespondingTile(new Location (me.getX()/100,me.getY()/100))); // this is tile 1 originally 
		Tile neighborrighttile = model.getTile(model.getCorrespondingTile(new Location(tile1x, tile1y)));
		Tile neighborlefttile = model.getTile(model.getCorrespondingTile(new Location(tile2x, tile2y)));
		Tile neighborbottomtile = model.getTile(model.getCorrespondingTile(new Location(tile3x, tile3y)));

		if (neighborrighttile.getColor() == Color.yellow) {
			thistile.flipTile(thistile);
			model.incrementMove();
			app.setMoveCount(Integer.toString(model.howManyMoves()));
			neighborrighttile.setLocation(thistile.getLocation());
			thistile.setLocation(new Location(tile1x, tile1y));
			app.repaint();
		} else if (neighborlefttile.getColor() == Color.yellow) {
			thistile.flipTile(thistile);
			model.incrementMove();
			app.setMoveCount(Integer.toString(model.howManyMoves()));
			neighborlefttile.setLocation(thistile.getLocation());
			thistile.setLocation(new Location(tile2x, tile2y));
			app.repaint();
		} else if (neighborbottomtile.getColor() == Color.yellow) {
			thistile.flipTile(thistile);
			model.incrementMove();
			app.setMoveCount(Integer.toString(model.howManyMoves()));
			neighborbottomtile.setLocation(thistile.getLocation());
			thistile.setLocation(new Location(tile3x, tile3y));
			app.repaint();
		} else {
			
		}
		app.repaint();
	}
		if(me.getX()>=101&&me.getX()<=200&&me.getY()>=101&&me.getY()<=200){ 	//done
		
		int tile1x = me.getX()/100;
		int tile1y = (me.getY()-100)/100;
		int tile2x = (me.getX()-100)/100;
		int tile2y = me.getY()/100;
		int tile3x = (me.getX()+100)/100;
		int tile3y = me.getY()/100;
		int tile4x = me.getX()/100;
		int tile4y = (me.getY()+100)/100;
		Tile thistile = model.getTile(model.getCorrespondingTile(new Location (me.getX()/100,me.getY()/100))); // this is tile 4 originally
		Tile toptile = model.getTile(model.getCorrespondingTile(new Location (tile1x,tile1y)));
		Tile lefttile = model.getTile(model.getCorrespondingTile(new Location (tile2x,tile2y)));
		Tile righttile = model.getTile(model.getCorrespondingTile(new Location (tile3x,tile3y)));
		Tile bottomtile = model.getTile(model.getCorrespondingTile(new Location (tile4x,tile4y)));
		if(toptile.getColor()==Color.yellow) {
			thistile.flipTile(thistile);
			model.incrementMove();
			app.setMoveCount(Integer.toString(model.howManyMoves()));
			toptile.setLocation(thistile.getLocation());
			thistile.setLocation(new Location(tile1x,tile1y));
			app.repaint();
		}
		else if(lefttile.getColor()==Color.yellow) {
			thistile.flipTile(thistile);
			model.incrementMove();
			app.setMoveCount(Integer.toString(model.howManyMoves()));
			lefttile.setLocation(thistile.getLocation());
			thistile.setLocation(new Location(tile2x,tile2y));
			app.repaint();
		}
		else if(righttile.getColor()==Color.yellow) {
			thistile.flipTile(thistile);
			model.incrementMove();
			app.setMoveCount(Integer.toString(model.howManyMoves()));
			righttile.setLocation(thistile.getLocation());
			thistile.setLocation(new Location(tile3x,tile3y));
			app.repaint();
		}
		else if(bottomtile.getColor()==Color.yellow) {
			thistile.flipTile(thistile);
			model.incrementMove();
			app.setMoveCount(Integer.toString(model.howManyMoves()));
			bottomtile.setLocation(thistile.getLocation());
			thistile.setLocation(new Location(tile4x,tile4y));
			app.repaint();
		}
		else {
			
		}
		app.repaint();
		
	}
		if(me.getX()>=101&&me.getX()<=200&&me.getY()>=201&&me.getY()<=300){			// done
		int tile1x = me.getX()/100;
		int tile1y = (me.getY()-100)/100;
		int tile2x = (me.getX()-100)/100;
		int tile2y = me.getY()/100;
		int tile3x = (me.getX()+100)/100;
		int tile3y = me.getY()/100;
		Tile thistile = model.getTile(model.getCorrespondingTile(new Location (me.getX()/100,me.getY()/100))); // this is tile 7 originally
		Tile toptile = model.getTile(model.getCorrespondingTile(new Location(tile1x,tile1y)));
		Tile lefttile = model.getTile(model.getCorrespondingTile(new Location(tile2x,tile2y)));
		Tile righttile = model.getTile(model.getCorrespondingTile(new Location(tile3x,tile3y)));
		if(toptile.getColor()==Color.yellow) {
			thistile.flipTile(thistile);
			model.incrementMove();
			app.setMoveCount(Integer.toString(model.howManyMoves()));
			toptile.setLocation(thistile.getLocation());
			thistile.setLocation(new Location(tile1x,tile1y));
			app.repaint();
		}
		else if(lefttile.getColor()==Color.yellow) {
			thistile.flipTile(thistile);
			model.incrementMove();
			app.setMoveCount(Integer.toString(model.howManyMoves()));
			lefttile.setLocation(thistile.getLocation());
			thistile.setLocation(new Location(tile2x,tile2y));
			app.repaint();
		}
		else if(righttile.getColor()==Color.yellow) {
			thistile.flipTile(thistile);
			model.incrementMove();
			app.setMoveCount(Integer.toString(model.howManyMoves()));
			righttile.setLocation(thistile.getLocation());
			thistile.setLocation(new Location(tile3x,tile3y));
			app.repaint();
		}
		else {
			
		}
		app.repaint();
	}
		if(me.getX()>=201&&me.getX()<=300&&me.getY()>=0&&me.getY()<=100){		// DONE: this is our empty tile
		int tile1x = (me.getX()-100)/100;
		int tile1y = me.getY()/100;
		int tile2x = me.getX()/100;
		int tile2y = (me.getY()+100)/100;
		Tile thistile = model.getTile(model.getCorrespondingTile(new Location (me.getX()/100,me.getY()/100))); // this is tile 2 originally
		Tile lefttile = model.getTile(model.getCorrespondingTile(new Location(tile1x,tile1y)));
		Tile bottomtile = model.getTile(model.getCorrespondingTile(new Location(tile2x,tile2y)));
		if(lefttile.getColor() == Color.yellow) {
			thistile.flipTile(thistile);
			model.incrementMove();
			app.setMoveCount(Integer.toString(model.howManyMoves()));
			lefttile.setLocation(thistile.getLocation());
			thistile.setLocation(new Location(tile1x,tile1y));
			app.repaint();
		}
		if(bottomtile.getColor() == Color.yellow) {
			thistile.flipTile(thistile);
			model.incrementMove();
			app.setMoveCount(Integer.toString(model.howManyMoves()));
			bottomtile.setLocation(thistile.getLocation());
			thistile.setLocation(new Location(tile2x,tile2y));
			app.repaint();
		}
		else {
			
		}
		app.repaint();
	}
		if(me.getX()>=201&&me.getX()<=300&&me.getY()>=101&&me.getY()<=200){		//done
		int tile1x = me.getX()/100;
		int tile1y = (me.getY()-100)/100;
		int tile2x = (me.getX()-100)/100;
		int tile2y = me.getY()/100;
		int tile3x = me.getX()/100;
		int tile3y = (me.getY()+100)/100;
		Tile thistile = model.getTile(model.getCorrespondingTile(new Location (me.getX()/100,me.getY()/100))); // this is tile 5 originally 
		Tile toptile = model.getTile(model.getCorrespondingTile(new Location (tile1x,tile1y)));
		Tile lefttile = model.getTile(model.getCorrespondingTile(new Location (tile2x,tile2y)));
		Tile bottomtile = model.getTile(model.getCorrespondingTile(new Location (tile3x,tile3y))); 
		if (toptile.getColor()==Color.yellow) {
			thistile.flipTile(thistile);
			model.incrementMove();
			app.setMoveCount(Integer.toString(model.howManyMoves()));
			toptile.setLocation(thistile.getLocation());
			thistile.setLocation(new Location(tile1x,tile1y));
			app.repaint();
		}
		else if(lefttile.getColor()== Color.yellow) {
			thistile.flipTile(thistile);
			model.incrementMove();
			app.setMoveCount(Integer.toString(model.howManyMoves()));
			lefttile.setLocation(thistile.getLocation());
			thistile.setLocation(new Location(tile2x,tile2y));
			app.repaint();
		}
		else if(bottomtile.getColor()== Color.yellow) {
			thistile.flipTile(thistile);
			model.incrementMove();
			app.setMoveCount(Integer.toString(model.howManyMoves()));
			bottomtile.setLocation(thistile.getLocation());
			thistile.setLocation(new Location(tile3x,tile3y));
			app.repaint();
		}
		else {
			
		}
		
		app.repaint();
	}
		if(me.getX()>=201&&me.getX()<=300&&me.getY()>=201&&me.getY()<=300){
		int tile1x = me.getX()/100;
		int tile1y = (me.getY()-100)/100;
		int tile2x = (me.getX()-100)/100;
		int tile2y = me.getY()/100;
		Tile thistile = model.getTile(model.getCorrespondingTile(new Location (me.getX()/100,me.getY()/100))); // this is tile 8 originally
		Tile toptile = model.getTile(model.getCorrespondingTile(new Location (tile1x,tile1y)));
		Tile lefttile = model.getTile(model.getCorrespondingTile(new Location (tile2x,tile2y)));
		if (toptile.getColor()==Color.yellow) {
			thistile.flipTile(thistile);
			model.incrementMove();
			app.setMoveCount(Integer.toString(model.howManyMoves()));
			toptile.setLocation(thistile.getLocation());
			thistile.setLocation(new Location (tile1x,tile1y));
			app.repaint();
		}
		else if (lefttile.getColor()==Color.yellow){
			thistile.flipTile(thistile);
			model.incrementMove();
			app.setMoveCount(Integer.toString(model.howManyMoves()));
			lefttile.setLocation(thistile.getLocation());
			thistile.setLocation(new Location (tile2x,tile2y));
			app.repaint();
		}
		else {
			
		}
		app.repaint();
	}
	}
}
