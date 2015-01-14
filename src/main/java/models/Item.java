package main.java.models;

public interface Item {
	String name = "";
	
	public String getName();
	public int beatsItem(Item item) throws Exception;
	
}
