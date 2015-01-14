package test.java;

import static org.junit.Assert.*;
import main.java.models.Paper;
import main.java.models.Rock;
import main.java.models.Scissor;

import org.junit.Test;

public class RockTestCases {

public Rock rock = new Rock();
	
	@Test
	public void testBeatsRock() throws Exception{
		Rock rock = new Rock();
		assertEquals(0, rock.beatsItem(rock));
	}
	
	@Test
	public void testBeatsPaper() throws Exception{
		Paper paper = new Paper();
		assertEquals(-1, rock.beatsItem(paper));
	}
	
	@Test
	public void testBeatsScissor() throws Exception{
		Scissor scissor = new Scissor();
		assertEquals(1, rock.beatsItem(scissor));
	}

}
