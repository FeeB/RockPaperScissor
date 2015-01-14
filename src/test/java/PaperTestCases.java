package test.java;

import static org.junit.Assert.*;
import main.java.models.Paper;

import org.junit.Test;

public class PaperTestCases {

public Paper paper = new Paper();
	
	@Test
	public void testBeatsRock() {
		assertEquals(1, paper.beatsRock());
	}
	
	@Test
	public void testBeatsPaper() {
		assertEquals(0, paper.beatsPaper());
	}
	
	@Test
	public void testBeatsScissor() {
		assertEquals(-1, paper.beatsScissor());
	}

}
