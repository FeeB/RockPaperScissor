package main.java.controller;

import main.java.models.Item;
import main.java.models.Player;

public class Controller {
	private Player playerOne = new Player();
	private Player playerTwo = new Player();
	
	public void setSelectedItem (Item itemPlayerOne, Item itemPlayerTwo) {
		this.playerOne.selectItem(itemPlayerOne);
		this.playerTwo.selectItem(itemPlayerTwo);
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
	
	public void setPlayerOne(Player playerOne) {
		this.playerOne = playerOne;
	}
	
	public Player getPlayerTwo() {
		return this.playerTwo;
	}
	
	public void setPlayerTwo(Player playerTwo) {
		this.playerTwo = playerTwo;
	}
}
