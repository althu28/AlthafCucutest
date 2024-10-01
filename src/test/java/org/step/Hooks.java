package org.step;

import org.base.BaseClass;

import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	
	@Before(order = 1)
	public void method1() {
		
		
		launch();
		siteGet("https://www.amazon.in/?tag=googmantxtmob170-21&ascsubtag=_k_CjwKCAjw9eO3BhBNEiwAoc0-jR-I39RZCE42FaD0bYzLgLfQBJPJFVdF_HUTd9BKcqMIg7qRR-QhvRoCqS4QAvD_BwE_k_");

	}
	
	@Before(order = 2)
	public void md2() {
		
		toMax();
		toWait();

	}
	
	

}
