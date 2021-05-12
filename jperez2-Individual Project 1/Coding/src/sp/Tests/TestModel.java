package sp.Tests;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

import sp.model.Location;
import sp.model.Model;
import sp.model.Tile;

public class TestModel {

	@Test
	public void testPhase1_Getters() {
		Model m = new Model();
		assertEquals(m.getTile(0).getUpPos(),1);
		assertEquals(m.getTile(0).getDownPos(),4);
		assertEquals(m.getTile(0).getFlipped(),false);
		assertEquals(m.getRow(m.getTile(0)),0);
		assertEquals(m.getCol(m.getTile(0)),0);
		assertEquals(m.getTile(0).getColor(),Color.gray);
	}
	
	@Test
	public void testPhase2_Counters() {
		Model m = new Model();
		m.incrementMove();
		assertEquals(m.howManyMoves(),1);
		m.resetMove();
		assertEquals(m.howManyMoves(),0);
	}
	
	@Test
	public void testPhase3_CorrespondingEmpty() {
		Tile t = new Tile (new Location(0,0),Color.yellow,' ');
		Model emptycheck = new Model();
		assertEquals(emptycheck.emptyTile(t),true);
		t.setColor(Color.black);
		assertEquals(emptycheck.emptyTile(t),false);
		Location tile2 = new Location(1,0);
		assertEquals(emptycheck.getCorrespondingTile(tile2),1); // returns 1 bc of array position
	}

}
