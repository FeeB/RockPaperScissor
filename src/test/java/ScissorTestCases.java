package test.java;

import static org.junit.Assert.*;
import junit.framework.Assert;
import main.java.Scissor;

import org.junit.Test;

public class ScissorTestCases {
	
	public Scissor scissor = new Scissor();
	
	@Test
	public void testBeatsRock() {
		assertEquals(-1, scissor.beatsRock());
	}
	
	@Test
	public void testBeatsPaper() {
		assertEquals(1, scissor.beatsPaper());
	}
	
	@Test
	public void testBeatsScissor() {
		assertEquals(0, scissor.beatsScissor());
	}

}
