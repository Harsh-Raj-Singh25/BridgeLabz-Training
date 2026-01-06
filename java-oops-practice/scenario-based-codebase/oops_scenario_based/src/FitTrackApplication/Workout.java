package FitTrackApplication;

abstract  class Workout implements ITrackable {
	protected String type;
	protected double duration;
	private double caloriesBurned;
	
	public Workout(String type, double duration){
		this.duration=duration;
		this.type=type;
	}

	public double getCaloriesBurned() {
		return caloriesBurned;
	}

	public void setCaloriesBurned(double calories) {
		this.caloriesBurned = calories;
	}
	
	public abstract void calculateCalories( );
	
	@Override
    public void startWorkout() {
        System.out.println("Starting " + type + " session for " + duration + " minutes...");
    }

    @Override
    public void stopWorkout() {
        System.out.println(type + " session finished.");
    }
	
}
