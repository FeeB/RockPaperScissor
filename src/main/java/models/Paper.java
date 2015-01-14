package main.java.models;

public class Paper implements Item{
	private String name;
	
	public String getName() {
		return this.name;
	}
	
	public void setName() {
		this.name = "Paper";
	}
	
	public int beatsItem(Item item) {
		return 0;
	}
}
