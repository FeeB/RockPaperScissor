package test.java;

import static org.junit.Assert.*;
import main.java.Rock;

import org.junit.Test;

public class RockTestCases {

public Rock rock = new Rock();
	
	@Test
	public void testBeatsRock() {
		assertEquals(0, rock.beatsRock());
	}
	
	@Test
	public void testBeatsPaper() {
		assertEquals(-1, rock.beatsPaper());
	}
	
	@Test
	public void testBeatsScissor() {
		assertEquals(1, rock.beatsScissor());
	}

}
