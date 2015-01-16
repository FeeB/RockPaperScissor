package test.java.models;

import static org.junit.Assert.*;
import main.java.models.Player;
import main.java.models.Rock;

import org.junit.Test;

public class PlayerTestCases {
	
	public Player player = new Player();
	
	@Test
	public void testSelectItem() {
		Rock rock = new Rock();
		
		player.setSelectedItem(rock);
		assertEquals(player.getSelectedItem(), rock);
	}
	
	@Test
	public void testSelectItemRandomly() throws Exception {
		player.selectItemRandomly();
		assertTrue(player.getSelectedItem() instanceof main.java.models.Item);
	}

}
