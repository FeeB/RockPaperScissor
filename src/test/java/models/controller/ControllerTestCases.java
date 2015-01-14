package test.java.models.controller;

import static org.junit.Assert.*;
import main.java.controller.Controller;
import main.java.models.Paper;
import main.java.models.Scissor;

import org.junit.Before;
import org.junit.Test;

public class ControllerTestCases {
	
	public Controller controller = new Controller();
	public Scissor scissor = new Scissor();
	public Paper paper = new Paper();
	
	@Before
	public void beforeTestCase() {
		controller.setSelectedItem(scissor, paper);
	}
	
	@Test
	public void testSetSelectedItem() {
		assertEquals(controller.getPlayerOne().getSelectedItem(), scissor);
		assertEquals(controller.getPlayerTwo().getSelectedItem(), paper);
	}
	
	@Test
	public void testCalculateWinner() {
		assertEquals(controller.calculateWinner(), controller.getPlayerOne());
	}

}
