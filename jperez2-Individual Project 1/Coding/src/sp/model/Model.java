package sp.model;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import sp.view.PuzzleView;

public class Model {

	Tile initialconfig [] = new Tile[9];
	Tile wintile [] = new Tile[9];
	int moveCount = 0;
	
	public Model() {
		
		initialconfig[0] = new Tile(1,4,false, new Location (0,0),Color.gray); //for location, first dig is col second is row
		initialconfig[1] = new Tile(4,1,false, new Location (1,0),Color.gray);
		initialconfig[2] = new Tile(' ',' ',false, new Location (2,0),Color.yellow); // this will be our empty tile
		initialconfig[3] = new Tile(4,1,false, new Location (0,1),Color.black);
		initialconfig[4] = new Tile(3,2,false, new Location (1,1),Color.gray);
		initialconfig[5] = new Tile(4,1,false, new Location (2,1),Color.gray);
		initialconfig[6] = new Tile(3,2,false, new Location (0,2),Color.black);
		initialconfig[7] = new Tile(2,3,false, new Location (1,2),Color.gray);
		initialconfig[8] = new Tile(3,2,false, new Location (2,2),Color.gray);
		
		
	}
	
	public Tile getTile(int x) { // this gets a specific tile 
		
		return initialconfig[x];
	
	}
	
	public int getCorrespondingTile (Location thisone) {
		
		for (int everytile = 0; everytile < 9;everytile++) {
			if (initialconfig[everytile].location.row == thisone.row && initialconfig[everytile].location.col == thisone.col) {
				return everytile;
			}
		}
		return 999;
	}
	
	public int getRow(Tile t) {
		return t.location.row; // this is actually getting the col
	}
	
	public int getCol(Tile t) {
		return t.location.col; // this is getting the row because of the inverse relationship of placement ^
	}
	
	public boolean emptyTile (Tile t) {
		if (t.getColor()== Color.yellow) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public void incrementMove() {
		 moveCount++;
	}
	public int howManyMoves() {
		return moveCount;
	}
	public void resetMove() {
		moveCount = 0; 
	}
}
