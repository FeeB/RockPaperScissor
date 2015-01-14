package main.java.models;

public class Scissor implements Item {
	private String name = "Scissor";
	
	public String getName() {
		return this.name;
	}
	
	public int beatsItem(Item item) {
		return 0;
	}
}
