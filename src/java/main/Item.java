package java.main;

public interface Item {
	String name = "";
	
	public String getName();
	public void setName(String name);
	public int beatsScissor();
	public int beatsRock();
	public int beatsPaper();
	
}
