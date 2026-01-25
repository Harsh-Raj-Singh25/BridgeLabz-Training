package gameBox;

import java.util.ArrayList;
import java.util.List;

//User Class with Encapsulation
class User {
	private String username;
	// Encapsulation: Protected list of owned games
	private List<Game> ownedGames;

	public User(String username) {
		this.username = username;
		this.ownedGames = new ArrayList<>();
	}

	// Secure purchase/addition method
	public void purchaseGame(Game game) {
		ownedGames.add(game);
		System.out.println(username + " successfully purchased " + game.getTitle());
	}

	// Controlled access to owned games data
	public void showOwnedGames() {
		System.out.println("\n--- " + username + "'s Library ---");
		for (Game g : ownedGames) {
			System.out.println("- " + g.getTitle() + " (" + g.genre + ")");
		}
	}
}
