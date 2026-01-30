package com.lambda_expressions.smartHomeAutomation;

public class SmartHomeController {

	public static void executeTrigger(String triggerName, int intensity, String color, LightBehavior behavior) {
		System.out.println(" Trigger :" + triggerName + "  ");
		behavior.activate(intensity, color);
	}

	public static void main(String[] args) {

//		Scenario A
		LightBehavior motionBehavior = (intensity, color) -> {
			System.out.println("Motion Detected! Fading lights in to " + intensity + "% " + color);
		};
		// Scenario B: Voice Command "Movie Night"
		LightBehavior movieNight = (intensity, color) -> {
			System.out.println("Activating Cinema Mode...");
			System.out.println("Dimming main lights to 10%. Setting accent lights to " + color);
		};

		// Scenario C: Time of Day (Bedtime)
		LightBehavior bedtime = (intensity, color) -> {
			System.out.println("Bedtime mode: Warming color temperature to " + color + " and reducing intensity to "
					+ intensity + "%");
		};

		// Executing the triggers dynamically
		executeTrigger("SENSING MOTION", 80, "Neutral White", motionBehavior);
		executeTrigger("VOICE: 'Watch Movie'", 10, "Deep Blue", movieNight);
		executeTrigger("TIME: 11:00 PM", 5, "Soft Amber", bedtime);
	}
}
