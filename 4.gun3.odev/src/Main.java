import java.util.Date;

import Managers.CampaignManager;
import Managers.GameManager;
import Managers.OrderManager;
import Managers.UserManager;
import Managers.UserValidationManager;
import entities.Campaign;
import entities.Game;
import entities.User;

public class Main {

	public static void main(String[] args) {
		User merve = new User(1, "Merve", "Çakıroğlu", new Date(1995-7-15), "merve@merve.com");
		UserManager userManager = new UserManager(new UserValidationManager());
		userManager.register(merve);
		
		
		Game Oyun = new Game(1, "Oyun", 120);
		GameManager gameManager = new GameManager();
		gameManager.add(Oyun);
		
		Campaign campaign = new Campaign(1, "Black Friday", 20);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		
		OrderManager orderManager = new OrderManager() ;
		orderManager.order(merve, Oyun, campaign);

		
	}

}
