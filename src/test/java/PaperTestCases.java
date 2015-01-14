package test.java;

import static org.junit.Assert.*;
import main.java.models.Paper;
import main.java.models.Rock;
import main.java.models.Scissor;

import org.junit.Test;

public class PaperTestCases {

public Paper paper = new Paper();
	
	@Test
	public void testBeatsRock() {
		Rock rock = new Rock();
		assertEquals(1, paper.beatsItem(rock));
	}
	
	@Test
	public void testBeatsPaper() {
		Paper paper = new Paper();
		assertEquals(0, paper.beatsItem(paper));
	}
	
	@Test
	public void testBeatsScissor() {
		Scissor scissor = new Scissor();
		assertEquals(-1, paper.beatsItem(scissor));
	}

}
