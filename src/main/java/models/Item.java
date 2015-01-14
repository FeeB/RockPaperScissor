package main.java.models;

public interface Item {
	String name = "";
	
	public String getName();
	public void setName();
	public int beatsItem(Item item);
	
}
