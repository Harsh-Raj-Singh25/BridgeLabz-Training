package com.Generics.PersonalizedMealPlanner;

import java.util.ArrayList;
import java.util.List;

/*
 * 4. Personalized Meal Plan Generator
Concepts: Generic Methods, Type Parameters, Bounded Type Parameters
Problem Statement:
Design a Personalized Meal Plan Generator where users can choose different meal categories 
like Vegetarian, Vegan, Keto, or High-Protein. The system should ensure only valid meal plans are generated.
Hints:
Define an interface MealPlan with subtypes (VegetarianMeal, VeganMeal, etc.).
Implement a generic class Meal<T extends MealPlan> to handle different meal plans.
Use a generic method to validate and generate a personalized meal plan dynamically.

 */
public class MealPlanner {
	
	public static void generatePlan(List<Meal<? extends MealPlan>> meals) {
		System.out.println("---- Meal Loading----");
		for(Meal<? extends MealPlan> meal:meals) {
			meal.startMeal();
			System.out.println("--------------------------------");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Meal<VegetarianMeal> veggy=new Meal<>("Harsh",new VegetarianMeal()) ;
		Meal <VeganMeal> vegan=new Meal<>("Namrata",new VeganMeal());
		
		// Put different generic types into one master list using Wildcards
		List<Meal<? extends MealPlan>> meals = new ArrayList<>();
		
		
		meals.add(vegan);
		meals.add(veggy);
		
		generatePlan(meals);
	}
	
}
