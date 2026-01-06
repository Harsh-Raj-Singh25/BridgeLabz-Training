package FitTrackApplication;

public class StrengthWorkout extends Workout{
	private double weightLifted;

    public StrengthWorkout(double duration, double weightLifted) {
        super("Strength", duration);
        this.weightLifted = weightLifted;
    }

    @Override
    public void calculateCalories() {
        // LOGIC: Strength burns based on duration and weight intensity
        setCaloriesBurned(duration * (weightLifted * 0.05));
    }
	

}