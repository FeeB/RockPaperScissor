package main.java.models;

public class Paper implements Item{
	public String name = "Paper";
	
	public String getName() {
		return this.name;
	}
	
	public int beatsItem(Item item) throws Exception {
		if (item.getName().equals("Scissor")){
			return -1;
		} else if (item.getName().equals("Paper")) {
			return 0;
		} else if (item.getName().equals("Rock")) {
			return 1;
		} else {
			throw new Exception("Unknown Item!");
		}
	}
}