package sp.model;

import java.awt.Color;

public class Tile {
	
	public int up;
	int down;
	boolean flipped;
	public Location location;
	Color tilecolor;
	
	public Tile(int up, int down, boolean flipped, Location location, Color tilecolor) {
		
		this.up = up;
		this.down = down;
		this.flipped = flipped;
		this.location = location;
		this.tilecolor = tilecolor;
		
	}
	
	public Tile (Location loc, Color c, int num ) {
		this.location = loc;
		this.tilecolor = c;
		this.up = num;
	}
	
	
	public int getUpPos() {return up;}
	
	public int getDownPos() {return down;}	//not used
	
	public boolean getFlipped() {return flipped;} // not used
	
	public void setLocation (Location loc) {
		
		location = loc;
	}
	
	public void setColor (Color c) {tilecolor =c;}
	
	public void setUpVal(int seeval) {up = seeval;}
	
	public Location getLocation() { return location;} // this returns the row and column combo for a tile
	
	public int visibleDigit() {  // this determines which digit will be visible on the board 
		if (up == ' ' || down == ' ') {
			return 0;
		}
		return up; // we always want to show the top digit 
	}
	
	public Color getColor() {  // this obtains the tile color to know which color to set the board space to
		return this.tilecolor;
	}
	
	public Color digitColor() {  // this is to set our digit color in contrast with the game board
		if (tilecolor == Color.black) {
			return Color.white;
		}
		else if(tilecolor == Color.gray) {
			return Color.black;
		}
		return Color.yellow;
	}
	
	public Tile flipTile(Tile t) // if the tile is flipped then we swap up with down and down with up, as well as color
	{	
			
			int origup = t.up;
			int origdown = t.down;
			t.up = 5-origup;
			t.down = 5-origdown;
			t.flipped = !t.flipped;
			t.location = t.location;
			if (t.tilecolor == Color.black) {
				t.tilecolor = Color.gray;
			} 
			else if (t.tilecolor == Color.gray) {
				t.tilecolor = Color.black;
			}
			else {
				t.tilecolor = Color.yellow;
			}
			return t;
		}
	
	
	public void startSetter(Location loc, Color c, int num ) {
		this.setLocation(loc);
		this.setColor(c);
		this.setUpVal(num);
	}
	}
	
