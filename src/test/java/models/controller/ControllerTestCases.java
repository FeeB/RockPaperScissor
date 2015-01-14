package test.java.models.controller;

import static org.junit.Assert.*;
import main.java.controller.Controller;
import main.java.models.Paper;
import main.java.models.Rock;
import main.java.models.Scissor;

import org.junit.Before;
import org.junit.Test;

public class ControllerTestCases {
	
	public Controller controller = new Controller();
	public Scissor scissor = new Scissor();
	public Paper paper = new Paper();
	public Rock rock = new Rock();
	
	@Test
	public void testSetSelectedItem() throws Exception {
		controller.getPlayerTwo().setName("Player");
		controller.setSelectedItem(scissor, paper);

		assertEquals(controller.getPlayerOne().getSelectedItem(), scissor);
		assertEquals(controller.getPlayerTwo().getSelectedItem(), paper);
	}
	
	@Test
	public void testCalculateWinnerScissorPaper() throws Exception {
		controller.getPlayerTwo().setName("Player");
		controller.setSelectedItem(scissor, paper);

		assertEquals(controller.calculateWinner(), controller.getPlayerOne());
	}
	
	@Test
	public void testCalculateWinnerScissorRock() throws Exception {
		controller.getPlayerTwo().setName("Player");
		controller.setSelectedItem(scissor, rock);

		assertEquals(controller.calculateWinner(), controller.getPlayerTwo());
	}
	
	@Test
	public void testCalculateWinnerRockPaper() throws Exception {
		controller.getPlayerTwo().setName("Player");
		controller.setSelectedItem(rock, paper);

		assertEquals(controller.calculateWinner(), controller.getPlayerTwo());
	}
	
	@Test
	public void testGameWithComputer() throws Exception {
		controller.getPlayerTwo().setName("Computer");
		controller.setSelectedItem(rock, null);
		
		if (controller.getPlayerTwo().getSelectedItem() instanceof main.java.models.Scissor){
			assertEquals(controller.calculateWinner(), controller.getPlayerOne());
		} else if (controller.getPlayerTwo().getSelectedItem() instanceof main.java.models.Rock){
			assertEquals(controller.calculateWinner(), null);
		} else if (controller.getPlayerTwo().getSelectedItem() instanceof main.java.models.Paper){
			assertEquals(controller.calculateWinner(), controller.getPlayerTwo());
		}
	}

}
