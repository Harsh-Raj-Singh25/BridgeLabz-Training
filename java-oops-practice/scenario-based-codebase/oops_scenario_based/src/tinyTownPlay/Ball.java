package tinyTownPlay;

//Ball Class
class Ball implements Storable {
	private String ballId;
	private String color;
	private String size;

	public Ball(String ballId, String color, String size) {
		this.ballId = ballId;
		this.color = color;
		this.size = size;
	}

	@Override
	public String getInfo() {
		return String.format("[Ball ID: %s, Color: %s, Size: %s]", ballId, color, size);
	}

	public String getBallId() {
		return ballId;
	}
}
