package sp.Tests;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

import sp.model.Location;
import sp.model.Tile;

public class TestTile {

	@Test
	public void testgetUpPos() {
		Tile t = new Tile(1,4,false,new Location(0,0),Color.black);
		assertEquals(t.getUpPos(),1); 
	}
	
	@Test
	public void testgetDownPos() {
		Tile t = new Tile(1,4,false,new Location(0,0),Color.black);
		Tile i = new Tile(3,2,false,new Location(0,0),Color.black);
		assertEquals(t.getDownPos(),4);
		assertEquals(i.getDownPos(),2);
	}
	
	@Test
	public void testgetFlipped() {
		Tile t = new Tile(1,4,false,new Location(0,0),Color.black);
		assertEquals(t.getFlipped(),false);
	}
	
	@Test
	public void testsetLocation() {
		Tile t = new Tile(1,4,false,new Location(0,0),Color.black);
		Location newloc = new Location(1,1);
		t.setLocation(newloc);
		Location tester = t.getLocation();
		assertEquals(tester,newloc);
	}

	@Test 
	public void testsetColor() {
		Tile t = new Tile(1,4,false,new Location(0,0),Color.black);
		t.setColor(Color.gray);
		Color b = t.getColor();
		assertEquals(b,Color.gray);
	}
	
	@Test
	public void testvisibleDigit() {
		Tile t = new Tile(1,4,false,new Location(0,0),Color.black);
		assertEquals(t.visibleDigit(),1);
		Tile empty = new Tile (' ',' ',false, new Location(0,0),Color.black);
		assertEquals(empty.visibleDigit(),0);
	}
	
	@Test
	public void testdigitColor() {
		Tile t = new Tile(1,4,false,new Location(0,0),Color.black);
		assertEquals(t.digitColor(),Color.white);
		t.setColor(Color.gray);
		assertEquals(t.digitColor(),Color.black);
		t.setColor(Color.yellow);
		assertEquals(t.digitColor(),Color.yellow);
	}
	
	@Test
	public void testflipTile() {
		
		Tile t = new Tile(1,4,false,new Location(0,0),Color.black);
		t.flipTile(t);
		assertEquals(t.getUpPos(),4);
		assertEquals(t.getDownPos(),1);
		assertEquals(t.getFlipped(),true);
		assertEquals(t.getLocation().row,0);
		assertEquals(t.getLocation().col,0);
		assertEquals(t.getColor(),Color.gray);
		t.flipTile(t);
		assertEquals(t.getUpPos(),1);
		assertEquals(t.getDownPos(),4);
		assertEquals(t.getFlipped(),false);
		assertEquals(t.getLocation().row,0);
		assertEquals(t.getLocation().col,0);
		assertEquals(t.getColor(),Color.black);
		t.setColor(Color.yellow);
		t.flipTile(t);
		assertEquals(t.getColor(),Color.yellow);
	}
	
	@Test
	public void teststartSetter() {
		Location zeroloc = new Location (0,0);
		Tile t = new Tile (zeroloc,Color.black,1);
		t.startSetter(new Location(1,1), Color.yellow, 4);
		assertEquals(t.getLocation().row,1);
		assertEquals(t.getLocation().col,1);
		assertEquals(t.getColor(),Color.yellow);
		assertEquals(t.getUpPos(),4);
	}
}
