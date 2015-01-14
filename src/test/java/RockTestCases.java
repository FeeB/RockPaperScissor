package test.java;

import static org.junit.Assert.*;
import main.java.models.Paper;
import main.java.models.Rock;
import main.java.models.Scissor;

import org.junit.Test;

public class RockTestCases {

public Rock rock = new Rock();
	
	@Test
	public void testBeatsRock() {
		Rock rock = new Rock();
		assertEquals(0, rock.beatsItem(rock));
	}
	
	@Test
	public void testBeatsPaper() {
		Paper paper = new Paper();
		assertEquals(-1, rock.beatsItem(paper));
	}
	
	@Test
	public void testBeatsScissor() {
		Scissor scissor = new Scissor();
		assertEquals(1, rock.beatsItem(scissor));
	}

}
