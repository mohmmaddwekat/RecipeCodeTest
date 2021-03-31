package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;

public class testName_RecipeTest {

	@Test
	public void testGetName() {
		String expected="";
		String actual ="";
		Recipe objRecipe = new Recipe();
		actual=objRecipe.getName();
		assertTrue(expected==actual);
	}

	@Test
	public void testSetName() {
		String expected="cake";
		String actual ="";
		Recipe objRecipe = new Recipe();
		objRecipe.setName(expected);
		actual=objRecipe.getName();
		assertTrue(expected==actual);
	}
	
	@Test
	public void testSetNameNull() {
		String expected="";
		String actual ="";
		Recipe objRecipe = new Recipe();
		objRecipe.setName(expected);
		actual=objRecipe.getName();
		assertTrue(expected==actual);
	}

}
