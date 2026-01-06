package FitTrackApplication;

public class Main {
	public static void main(String [] args) {
		UserProfile user=new UserProfile("Harsh Raj",21,56,2000.0);
		
		// starting the workout
		// Cardio
		Workout run=new CardioWorkout(120);
		run.calculateCalories();
		run.startWorkout();
		run.stopWorkout();
		
		// Strength
		Workout lift = new StrengthWorkout(60, 120); // 60 mins, 100kg
        lift.startWorkout();
        lift.calculateCalories();
        lift.stopWorkout();
        
        double totalBurned=run.getCaloriesBurned()+lift.getCaloriesBurned();
        double remaining=user.getDailyCalorieTarget()-totalBurned;
        
        System.out.println("==================================");
        System.out.println("-------Today's Workout log--------");
        System.out.println("===================================");
        System.out.println("User :  "+user.getName()+":");
        System.out.println("-----------------------------------");
        System.out.println("Total Burned calories : "+totalBurned);
        if(totalBurned>user.getDailyCalorieTarget()) {
        	System.out.println("Hurraayy!!! Target achieved!!!!!");
        }else {
        	System.out.println("OOPS!!! Target not achieved. \n Remaining calories:"+remaining);
        }
		
	}
}
