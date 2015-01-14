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
	public void testGameWithComputer() throws Exception {
		controller.setSelectedItem(rock);
		
		if (controller.getPlayerTwo().getSelectedItem() instanceof main.java.models.Scissor){
			assertEquals(controller.calculateWinner(), controller.getPlayerOne());
		} else if (controller.getPlayerTwo().getSelectedItem() instanceof main.java.models.Rock){
			assertEquals(controller.calculateWinner(), null);
		} else if (controller.getPlayerTwo().getSelectedItem() instanceof main.java.models.Paper){
			assertEquals(controller.calculateWinner(), controller.getPlayerTwo());
		}
	}
	
	@Test
	public void testGameWithTwoComputers() throws Exception {
		controller.getPlayerOne().setName("Computer");
		controller.setSelectedItem(rock);
		
		if (controller.getPlayerTwo().getSelectedItem() instanceof main.java.models.Scissor){
			if (controller.getPlayerOne().getSelectedItem() instanceof main.java.models.Scissor) {
				assertEquals(controller.calculateWinner(), null);
			} else if (controller.getPlayerOne().getSelectedItem() instanceof main.java.models.Rock){
				assertEquals(controller.calculateWinner(), controller.getPlayerOne());
			} else if (controller.getPlayerOne().getSelectedItem() instanceof main.java.models.Paper){
				assertEquals(controller.calculateWinner(), controller.getPlayerTwo());
			}
		} else if (controller.getPlayerTwo().getSelectedItem() instanceof main.java.models.Rock){
			if (controller.getPlayerOne().getSelectedItem() instanceof main.java.models.Scissor) {
				assertEquals(controller.calculateWinner(), controller.getPlayerTwo());
			} else if (controller.getPlayerOne().getSelectedItem() instanceof main.java.models.Rock){
				assertEquals(controller.calculateWinner(), null);
			} else if (controller.getPlayerOne().getSelectedItem() instanceof main.java.models.Paper){
				assertEquals(controller.calculateWinner(), controller.getPlayerOne());
			}
			
		} else if (controller.getPlayerTwo().getSelectedItem() instanceof main.java.models.Paper){
			if (controller.getPlayerOne().getSelectedItem() instanceof main.java.models.Scissor) {
				assertEquals(controller.calculateWinner(), controller.getPlayerOne());
			} else if (controller.getPlayerOne().getSelectedItem() instanceof main.java.models.Rock){
				assertEquals(controller.calculateWinner(), controller.getPlayerTwo());
			} else if (controller.getPlayerOne().getSelectedItem() instanceof main.java.models.Paper){
				assertEquals(controller.calculateWinner(), null);
			}
		}
	}

}
