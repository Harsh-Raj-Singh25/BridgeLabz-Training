package gameBox;

//Inheritance: Arcade Game
class ArcadeGame extends Game implements IDownloadable {
	public ArcadeGame(String title, double price, double rating) {
		super(title, "Arcade", price, rating);
	}

	@Override
	public void download() {
		System.out.println("Downloading " + title + " (Fast-paced Arcade)...");
	}

	// Polymorphism: Arcade demo is time-limited
	@Override
	public void playDemo() {
		System.out.println("Demo: Playing 5 minutes of " + title + " (High-score challenge mode).");
	}
}
