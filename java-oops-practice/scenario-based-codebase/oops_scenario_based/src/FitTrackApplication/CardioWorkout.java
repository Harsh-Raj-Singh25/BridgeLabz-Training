package FitTrackApplication;

public class CardioWorkout extends Workout{
	public CardioWorkout(double duration) {
        super("Cardio", duration);
    }

    @Override
    public void calculateCalories() {
        // LOGIC: Cardio burns roughly 10 calories per minute
        setCaloriesBurned(duration * 10.0);
    }
}
