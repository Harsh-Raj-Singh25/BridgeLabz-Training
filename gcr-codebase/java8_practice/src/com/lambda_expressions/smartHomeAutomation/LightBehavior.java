package com.lambda_expressions.smartHomeAutomation;

@FunctionalInterface
interface LightBehavior{
	void activate(int intensity, String color);
}