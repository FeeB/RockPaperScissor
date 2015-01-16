package main.java.controller;

import main.java.models.Item;
import main.java.models.Player;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RpsController {
	private Player playerOne = new Player();
	private Player playerTwo = new Player();
	
	public void setSelectedItem(Item itemPlayerOne) throws Exception {
		this.playerTwo.selectItemRandomly();
		
		if ((this.playerOne.getName() != null) && (this.playerOne.getName().equals("Computer"))) {
			try {
				this.playerOne.selectItemRandomly();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else {
			this.playerOne.setSelectedItem(itemPlayerOne);
		}
	}
	
	public Player calculateWinner() throws Exception{
		switch (this.playerOne.getSelectedItem().beatsItem(this.playerTwo.getSelectedItem())) {
		case 1:
			return this.playerOne;
			
		case 0:
			return null;
			
		case -1:
			return this.playerTwo;
			
		default:
			throw new Exception("Unknown winner!");
		}
	}
	
	public Player getPlayerOne() {
		return this.playerOne;
	}
	
	public Player getPlayerTwo() {
		return this.playerTwo;
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
    public String playerForm(Model model) {
        model.addAttribute("player", new Player());
        return "index";
    }
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String playTheGame(@ModelAttribute Player player, Model model) {
        model.addAttribute("player", player);
        return "winner";
    }
}
