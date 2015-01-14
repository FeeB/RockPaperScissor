package main.java.models;

public class Scissor implements Item {
	private String name;
	
	public String getName() {
		return this.name;
	}
	
	public void setName() {
		this.name = "Scissor";
	}
	
	public int beatsItem(Item item) {
		return 0;
	}
}
