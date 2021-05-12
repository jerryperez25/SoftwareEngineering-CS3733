package sp.Tests;

import static org.junit.Assert.*;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

import org.junit.Test;

import sp.controller.ExitController;
import sp.controller.FlipController;
import sp.model.Model;
import sp.view.DoubleSlidedApp;

public class TestFlipController {
		
	@Test
	public void testBox1() {
		Model m = new Model();
		DoubleSlidedApp app = new DoubleSlidedApp(m);
		FlipController thisone = new FlipController(app,m);
		
		MouseEvent clicker = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 150, 50, 0, false);
		thisone.mousePressed(clicker);
		assertEquals(m.getTile(2).getLocation().row, 1);
		assertEquals(m.getTile(2).getLocation().col, 0);
		
		MouseEvent clicker2 = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 10, 10, 0, false);
		thisone.mousePressed(clicker2);
		assertEquals(m.getTile(2).getLocation().row, 0);
		assertEquals(m.getTile(2).getLocation().col, 0);
		
		MouseEvent clicker3 = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 50, 150, 0, false);
		thisone.mousePressed(clicker3);
		assertEquals(m.getTile(2).getLocation().row, 0);
		assertEquals(m.getTile(2).getLocation().col, 1);
		
		MouseEvent clicker4 = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 50, 250, 0, false);
		thisone.mousePressed(clicker4);
		assertEquals(m.getTile(2).getLocation().row, 0);
		assertEquals(m.getTile(2).getLocation().col, 2);
		
		MouseEvent clicker5 = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 150, 250, 0, false);
		thisone.mousePressed(clicker5);
		assertEquals(m.getTile(2).getLocation().row, 1);
		assertEquals(m.getTile(2).getLocation().col, 2);
		
		MouseEvent clicker6 = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 250, 250, 0, false);
		thisone.mousePressed(clicker6);
		assertEquals(m.getTile(2).getLocation().row, 2);
		assertEquals(m.getTile(2).getLocation().col, 2);
		
		MouseEvent clicker7 = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 250, 150, 0, false);
		thisone.mousePressed(clicker7);
		assertEquals(m.getTile(2).getLocation().row, 2);
		assertEquals(m.getTile(2).getLocation().col, 1);
		
		MouseEvent clicker8 = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 150, 150, 0, false);
		thisone.mousePressed(clicker8);
		assertEquals(m.getTile(2).getLocation().row, 1);
		assertEquals(m.getTile(2).getLocation().col, 1);
		
		MouseEvent clicker9 = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 150, 50, 0, false);
		thisone.mousePressed(clicker9);
		assertEquals(m.getTile(2).getLocation().row, 1);
		assertEquals(m.getTile(2).getLocation().col, 0);
		
		MouseEvent clicker10 = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 250, 50, 0, false);
		thisone.mousePressed(clicker10);
		assertEquals(m.getTile(2).getLocation().row, 2);
		assertEquals(m.getTile(2).getLocation().col, 0);
		
		MouseEvent clicker11 = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 250, 150, 0, false);
		thisone.mousePressed(clicker11);
		assertEquals(m.getTile(2).getLocation().row, 2);
		assertEquals(m.getTile(2).getLocation().col, 1);
		
		MouseEvent clicker12 = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 250, 250, 0, false);
		thisone.mousePressed(clicker12);
		assertEquals(m.getTile(2).getLocation().row, 2);
		assertEquals(m.getTile(2).getLocation().col, 2);
		
		MouseEvent clicker13 = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 150, 250, 0, false);
		thisone.mousePressed(clicker13);
		assertEquals(m.getTile(2).getLocation().row, 1);
		assertEquals(m.getTile(2).getLocation().col, 2);
		
		MouseEvent clicker14 = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 50, 250, 0, false);
		thisone.mousePressed(clicker14);
		assertEquals(m.getTile(2).getLocation().row, 0);
		assertEquals(m.getTile(2).getLocation().col, 2);
		
		MouseEvent clicker15 = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 50 , 150, 0, false);
		thisone.mousePressed(clicker15);
		assertEquals(m.getTile(2).getLocation().row, 0);
		assertEquals(m.getTile(2).getLocation().col, 1);
		
		MouseEvent clicker16 = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 150, 150, 0, false);
		thisone.mousePressed(clicker16);
		assertEquals(m.getTile(2).getLocation().row, 1);
		assertEquals(m.getTile(2).getLocation().col, 1);
		
		MouseEvent clicker17 = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 150, 50, 0, false);
		thisone.mousePressed(clicker17);
		assertEquals(m.getTile(2).getLocation().row, 1);
		assertEquals(m.getTile(2).getLocation().col, 0);
		
		MouseEvent clicker18 = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 50, 50, 0, false);
		thisone.mousePressed(clicker18);
		assertEquals(m.getTile(2).getLocation().row, 0);
		assertEquals(m.getTile(2).getLocation().col, 0);
		
		
	}
	
	@Test
	public void testWin() {
		
		Model m = new Model();
		DoubleSlidedApp app = new DoubleSlidedApp(m);
		FlipController thisone = new FlipController(app,m);
		
		MouseEvent clicker = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 150, 50, 0, false);
		thisone.mousePressed(clicker);
		assertEquals(m.getTile(2).getLocation().row, 1);
		assertEquals(m.getTile(2).getLocation().col, 0);
		
		MouseEvent clicker1 = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 150, 150, 0, false);
		thisone.mousePressed(clicker1);
		assertEquals(m.getTile(2).getLocation().row, 1);
		assertEquals(m.getTile(2).getLocation().col, 1);
		
		MouseEvent clicker3 = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 250, 150, 0, false);
		thisone.mousePressed(clicker3);
		assertEquals(m.getTile(2).getLocation().row, 2);
		assertEquals(m.getTile(2).getLocation().col, 1);
		
		MouseEvent clicker4 = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 250, 250, 0, false);
		thisone.mousePressed(clicker4);
		assertEquals(m.getTile(2).getLocation().row, 2);
		assertEquals(m.getTile(2).getLocation().col, 2);
		
		MouseEvent clicker5 = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 250, 150, 0, false);
		thisone.mousePressed(clicker5);
		assertEquals(m.getTile(2).getLocation().row, 2);
		assertEquals(m.getTile(2).getLocation().col, 1);
		
		MouseEvent clicker6 = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 250, 50, 0, false);
		thisone.mousePressed(clicker6);
		assertEquals(m.getTile(2).getLocation().row, 2);
		assertEquals(m.getTile(2).getLocation().col, 0);
		
		MouseEvent clicker7 = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 150, 50, 0, false);
		thisone.mousePressed(clicker7);
		assertEquals(m.getTile(2).getLocation().row, 1);
		assertEquals(m.getTile(2).getLocation().col, 0);
		
		MouseEvent clicker8 = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 150, 150, 0, false);
		thisone.mousePressed(clicker8);
		assertEquals(m.getTile(2).getLocation().row, 1);
		assertEquals(m.getTile(2).getLocation().col, 1);
		
		
	}
	
	@Test
	public void testLoss() {
		Model m = new Model();
		DoubleSlidedApp app = new DoubleSlidedApp(m);
		FlipController thisone = new FlipController(app,m);
		
		MouseEvent clicker = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 150, 50, 0, false);
		thisone.mousePressed(clicker);
		assertEquals(m.getTile(2).getLocation().row, 1);
		assertEquals(m.getTile(2).getLocation().col, 0);
		
		MouseEvent clicker1 = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 150, 150, 0, false);
		thisone.mousePressed(clicker1);
		assertEquals(m.getTile(2).getLocation().row, 1);
		assertEquals(m.getTile(2).getLocation().col, 1);
		
		MouseEvent clicker2 = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 50, 150, 0, false);
		thisone.mousePressed(clicker2);
		assertEquals(m.getTile(2).getLocation().row, 0);
		assertEquals(m.getTile(2).getLocation().col, 1);
		
		MouseEvent clicker3 = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 50, 250, 0, false);
		thisone.mousePressed(clicker3);
		assertEquals(m.getTile(2).getLocation().row, 0);
		assertEquals(m.getTile(2).getLocation().col, 2);
		
		MouseEvent clicker4 = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 150, 250, 0, false);
		thisone.mousePressed(clicker4);
		assertEquals(m.getTile(2).getLocation().row, 1);
		assertEquals(m.getTile(2).getLocation().col, 2);
		
		MouseEvent clicker5 = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 250, 250, 0, false);
		thisone.mousePressed(clicker5);
		assertEquals(m.getTile(2).getLocation().row, 2);
		assertEquals(m.getTile(2).getLocation().col, 2);
		
		MouseEvent clicker6 = new MouseEvent(app, MouseEvent.MOUSE_PRESSED, 
				System.currentTimeMillis(), 0, 250, 150, 0, false);
		thisone.mousePressed(clicker6);
		assertEquals(m.getTile(2).getLocation().row, 2);
		assertEquals(m.getTile(2).getLocation().col, 1);
	}
	
	@Test
	public void testExitController() {
		
		JFrame app= new JFrame();
		ExitController tester = new ExitController(app);
		
	}

}
