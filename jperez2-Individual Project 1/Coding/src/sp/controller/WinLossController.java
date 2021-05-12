package sp.controller;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import sp.model.Location;
import sp.model.Model;
import sp.model.Tile;
import sp.view.DoubleSlidedApp;
import sp.view.PuzzleView;

public class WinLossController extends MouseAdapter{
	
	DoubleSlidedApp app;
	Model model;
	PuzzleView panel;
	Tile win[] = new Tile[9];
	
	public WinLossController(DoubleSlidedApp a, Model m) {
		this.app = a;
		this.model = m;
		
		win[0] = new Tile(new Location (0,0), Color.gray,1);
		win[1] = new Tile(new Location (1,0), Color.gray,2);
		win[2] = new Tile(new Location (2,0), Color.gray,3);
		win[3] = new Tile(new Location (0,1), Color.black,4);
		win[4] = new Tile(new Location (1,1), Color.yellow,' ');
		win[5] = new Tile(new Location (2,1), Color.gray,4);
		win[6] = new Tile(new Location (0,2), Color.black,3);
		win[7] = new Tile(new Location (1,2), Color.black,2);
		win[8] = new Tile(new Location (2,2), Color.black,1);
		
	}
	
	public void mousePressed(MouseEvent me) {
		Tile [] currentstate = new Tile[9];
		currentstate[0] = model.getTile(model.getCorrespondingTile(new Location(0,0)));
		currentstate[1] = model.getTile(model.getCorrespondingTile(new Location(1,0)));
		currentstate[2] = model.getTile(model.getCorrespondingTile(new Location(2,0)));
		currentstate[3] = model.getTile(model.getCorrespondingTile(new Location(0,1)));
		currentstate[4] = model.getTile(model.getCorrespondingTile(new Location(1,1)));
		currentstate[5] = model.getTile(model.getCorrespondingTile(new Location(2,1)));
		currentstate[6] = model.getTile(model.getCorrespondingTile(new Location(0,2)));
		currentstate[7] = model.getTile(model.getCorrespondingTile(new Location(1,2)));
		currentstate[8] = model.getTile(model.getCorrespondingTile(new Location(2,2)));
		
		if (winChecker(currentstate,0) && winChecker(currentstate,1)
				&& winChecker(currentstate,2) && winChecker(currentstate,3)
				&& winChecker(currentstate,4) && winChecker(currentstate,5)
				&& winChecker(currentstate,6) && winChecker(currentstate,7)
				&& winChecker(currentstate,8)) {
			System.out.println("Winner Winner, Chicken Dinner!");
			app.freezePanel(); //freeze panel
			//app.setEnabled(false); // this functions but youd have to close out of the entire game to play again
		}
		else if (loseConfig(currentstate)) {
			System.out.println("You have lost, reset the gameboard and try again!");
			app.freezePanel(); //freeze panel
			//app.setEnabled(false);
		}
		else {
		}
				
	}
	public boolean winChecker(Tile [] check, int num) {
		
		if (win[num].getUpPos()==check[num].getUpPos()&& win[num].getColor() == check[num].getColor()){
			return true;
		}
		else {
			return false;
		}	
	}
	
	public boolean loseConfig(Tile [] current) {
		
		int countOnes = 0;
		int countTwos = 0;
		int countThrees = 0;
		int countFours = 0;
		
		for(int count = 0; count < 9 ; count++) {
			if(current[count].up == 1) {
				countOnes = countOnes+1;
			}
			else if (current[count].up == 2) {
				countTwos = countTwos+1;
			}
			else if (current[count].up == 3) {
				countThrees = countThrees+1;
			}
			else if (current[count].up == 4){
				countFours = countFours+1;
			}
			
		}
		if(countOnes > 3 || countTwos > 3 || countThrees > 3 || countFours > 3) {
			return true;
		}
		else {
			return false;
		}
	}
}
