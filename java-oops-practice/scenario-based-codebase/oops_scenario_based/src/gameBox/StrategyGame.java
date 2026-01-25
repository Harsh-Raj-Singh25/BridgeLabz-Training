package gameBox;

//Inheritance: Strategy Game
class StrategyGame extends Game implements IDownloadable {
	public StrategyGame(String title, double price, double rating) {
		super(title, "Strategy", price, rating);
	}

	@Override
	public void download() {
		System.out.println("Downloading " + title + " (Resource-heavy Strategy)...");
	}

	// Polymorphism: Strategy demo is level-limited
	@Override
	public void playDemo() {
		System.out.println("Demo: Playing the tutorial of " + title + " (Learn resource management).");
	}
}
