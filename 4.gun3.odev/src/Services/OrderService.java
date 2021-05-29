package Services;

import entities.Campaign;
import entities.Game;
import entities.User;

public interface OrderService {
	void order(User user, Game game, Campaign campaign);
}
