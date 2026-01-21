package com.Generics.PersonalizedMealPlanner;

public class Meal <T extends MealPlan> {
	private String personName;
	private T mealType;
	
	public Meal(String name, T type) {
		this.mealType=type;
		this.personName=name;
	}
	
	void startMeal() {
		System.out.println(" All the best for your diet");
		System.out.println(" Stay Consistent");
		mealType.plan();
	}
}
