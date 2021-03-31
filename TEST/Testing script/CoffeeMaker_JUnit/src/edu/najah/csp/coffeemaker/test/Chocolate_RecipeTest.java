package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class Chocolate_RecipeTest {

	@Test
	public void testGetAmtChocolate() {
		int expected=0;
		int actual =0;
		Recipe objRecipe = new Recipe();
		actual=objRecipe.getAmtChocolate();
		assertTrue(expected==actual);
	}

	@Test
	public void testSetAmtChocolate() {
		int expected=5;
		int actual =0;
		String setChocolate="5";
		Recipe objRecipe = new Recipe();
		try {
			objRecipe.setAmtChocolate(setChocolate);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(RecipeException e) {
			e.printStackTrace();
		}
		actual=objRecipe.getAmtChocolate();
		assertTrue(expected==actual);	
		}

}
