package main.java.controller;

import main.java.models.Item;
import main.java.models.Player;

public class Controller {
	private Player playerOne = new Player();
	private Player playerTwo = new Player();
	
	public void setSelectedItem(Item itemPlayerOne, Item itemPlayerTwo) throws Exception {
		this.playerOne.selectItem(itemPlayerOne);
		
		if (this.playerTwo.getName().equals("Computer")) {
			this.playerTwo.selectItemRandomly();
		} else {
			this.playerTwo.selectItem(itemPlayerTwo);
		}
	}
	
	public Player calculateWinner() throws Exception{
		switch (this.playerOne.getSelectedItem().beatsItem(this.playerTwo.getSelectedItem())) {
		case 1:
			return this.playerOne;
			
		case 0:
			return null;
			
		case -1:
			return this.playerTwo;
			
		default:
			throw new Exception("Unknown winner!");
		}
	}
	
	public Player getPlayerOne() {
		return this.playerOne;
	}
	
	public Player getPlayerTwo() {
		return this.playerTwo;
	}
}
