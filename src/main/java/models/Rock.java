package main.java.models;

public class Rock implements Item{
	private String name = "Rock";
	
	public String getName() {
		return this.name;
	}
	
	public int beatsItem(Item item) {
		return 0;
	}
}
