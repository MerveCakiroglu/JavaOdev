package Managers;

import Services.OrderService;
import entities.Campaign;
import entities.Game;
import entities.User;

public class OrderManager implements OrderService{

	@Override
	public void order(User user, Game game, Campaign campaign) {
		System.out.println(user.getFirstName() + " bought " 
				+ game.getName() + " with the " + campaign.getCampaignName());
		
	}

}
