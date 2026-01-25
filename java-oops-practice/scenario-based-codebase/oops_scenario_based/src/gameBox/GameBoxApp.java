package gameBox;
/*
 * 
 * 24. "GameBox – Mobile Game Distribution Platform"
Story: GameBox offers mobile games for download and purchase with features like demos,
reviews, and leaderboards.
Requirements:
● Game class: title, genre, price, rating.
● User class with list of owned games.
● Interface IDownloadable: download(), playDemo().
● Constructors to set up free or paid games.
● Use operators to apply seasonal offers.
● Encapsulation: user-owned game data protected.
● Inheritance: ArcadeGame, StrategyGame from Game.
● Polymorphism: playDemo() behaves differently per genre.
 */
public class GameBoxApp {
	public static void main(String[] args) {
		//  Create Games
		ArcadeGame sonic = new ArcadeGame("Sonic Speed", 1500, 4.5);
		StrategyGame civ = new StrategyGame("Age of Empire", 2000, 4.8);

		// Applying Seasonal Offer (Requirement: Operators)
		civ.applyDiscount(20);

		//  Setup User
		User player1 = new User("GamerOne");

		//  Demonstrate Polymorphism
		IDownloadable[] storeFront = { sonic, civ };

		System.out.println("\n--- Testing Store Demos ---");
		for (IDownloadable item : storeFront) {
			item.playDemo(); // Polymorphic behavior: Arcade vs Strategy
		}

		// 5. Encapsulation Test
		player1.purchaseGame(sonic);
		player1.showOwnedGames();
	}
}
