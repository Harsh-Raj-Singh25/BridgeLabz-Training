package specialQues.exceptionHandling.fitnessTracker;

public class FitnessTrackerBackend {
	public static void displayActivities() {
		System.out.println("Activities Menu  :");
		System.out.println("1.Walking");
		System.out.println("2.Running");
		System.out.println("3.Cycling");
	}
	
	
	public static void validator(String [] details, double weight) throws InvalidInputException{
		//  Format Check
        if (details.length != 3) {
            throw new InvalidInputException("Error:Invalid activity data format.");
        }
        
        
		if(!(details[0].equalsIgnoreCase("walking") || details[0].equalsIgnoreCase("running") || details[0].equalsIgnoreCase("cycling"))) {
			throw new InvalidInputException("Error:Invalid activity name.");
		}
		// Duration and Intensity Check
        try {
            int duration = Integer.parseInt(details[1]);
            int intensity = Integer.parseInt(details[2]);
            if (duration <= 0 || intensity < 1 || intensity > 9) {
                throw new InvalidInputException("Error:Invalid duration or intensity.");
            }
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Error:Invalid duration or intensity.");
        }
		
		if(weight<=0) {
			throw new InvalidInputException("Error:User Weight is invalid.");
		}
	}
	public static double calculateCalories(String[] details, double weight) {
		double totalCalorie=0;
		double caloriePerMinute=0;
		if(details[0].equalsIgnoreCase("Walking")) {
			caloriePerMinute=3;
		}else if(details[0].equalsIgnoreCase("Running")) {
			caloriePerMinute=7;
		}else if(details[0].equalsIgnoreCase("cycling")) {
			caloriePerMinute=5;
		}else {
			caloriePerMinute=-1;
			System.err.println("Invalid activity !!!");
			System.exit(0);
		}
//		totalCalories = (Calories per minute × Duration in hours × Intensity × 60) / User Weight
		totalCalorie=( caloriePerMinute * Integer.parseInt(details[1]) * Integer.parseInt(details[2]) * 60) / weight;
		return totalCalorie;
	}
	
}
