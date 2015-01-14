package main.java.models;

import java.util.Random;

public class Player {
	private Item selectedItem;
	
	public void selectItem(Item item) {
		this.selectedItem = item;
	}
	
	public void selectItemRandomly() throws Exception {
		Random random = new Random();
		int randomNumber = random.nextInt(3);
		
		switch (randomNumber) {
		case 0:
			this.selectedItem = new Rock();
			break;
			
		case 1:
			this.selectedItem = new Paper();
			break;
		
		case 2:
			this.selectedItem = new Scissor();
			break;
		
		default:
			throw new Exception("Unknown number" + randomNumber);
		}
	}
	
	public Item getSelectedItem() {
		return this.selectedItem;
	}
}
