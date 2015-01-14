package main.java.models;

public class Scissor implements Item {
	private String name = "Scissor";
	
	public String getName() {
		return this.name;
	}
	
	public int beatsItem(Item item) throws Exception {
		if (item.getName().equals("Scissor")) {
			return 0;
		} else if (item.getName().equals("Rock")) {
			return -1;
		} else if (item.getName().equals("Paper")) {
			return 1;
		} else {
			throw new Exception("Unknown Item!");
		}
	}
}
