package test.java;

import static org.junit.Assert.*;
import junit.framework.Assert;
import main.java.models.Paper;
import main.java.models.Rock;
import main.java.models.Scissor;

import org.junit.Test;

public class ScissorTestCases {
	
	public Scissor scissor = new Scissor();
	
	@Test
	public void testBeatsRock() throws Exception{
		Rock rock = new Rock();
		assertEquals(-1, scissor.beatsItem(rock));
	}
	
	@Test
	public void testBeatsPaper() throws Exception {
		Paper paper = new Paper();
		assertEquals(1, scissor.beatsItem(paper));
	}
	
	@Test
	public void testBeatsScissor() throws Exception{
		Scissor scissor = new Scissor();
		assertEquals(0, scissor.beatsItem(scissor));
	}

}
