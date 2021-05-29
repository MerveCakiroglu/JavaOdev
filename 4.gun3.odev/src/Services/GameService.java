package Services;

import entities.Game;

public interface GameService {
	void add(Game game);
	void update(Game game);
	void delete(Game game);
	void sell(Game game);
}
