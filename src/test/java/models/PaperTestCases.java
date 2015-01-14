package test.java.models;

import static org.junit.Assert.*;
import main.java.models.Paper;
import main.java.models.Rock;
import main.java.models.Scissor;

import org.junit.Test;

public class PaperTestCases {

public Paper paper = new Paper();
	
	@Test
	public void testBeatsRock() throws Exception {
		Rock rock = new Rock();
		assertEquals(1, paper.beatsItem(rock));
	}
	
	@Test
	public void testBeatsPaper() throws Exception {
		Paper paper = new Paper();
		assertEquals(0, paper.beatsItem(paper));
	}
	
	@Test
	public void testBeatsScissor() throws Exception {
		Scissor scissor = new Scissor();
		assertEquals(-1, paper.beatsItem(scissor));
	}

}
