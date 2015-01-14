package main.java.models;

public class Rock implements Item{
	private String name;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int beatsScissor() {
		return 1;
	}
	
	public int beatsRock() {
		return 0;
	}
	
	public int beatsPaper() {
		return -1;
	}
}
