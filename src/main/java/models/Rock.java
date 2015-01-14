package main.java.models;

public class Rock implements Item{
	private String name;
	
	public String getName() {
		return this.name;
	}
	
	public void setName() {
		this.name = "Rock";
	}
	
	public int beatsItem(Item item) {
		return 0;
	}
}
